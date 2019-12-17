package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.machines;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.cscorelib2.protection.ProtectableAction;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AReactor;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;

public class ReactorAccessPort extends SlimefunItem {

	private static final int[] border = {0, 1, 2, 3, 4, 5, 6, 7, 8, 12, 13, 14, 21, 23};
	private static final int[] border_1 = {9, 10, 11, 18, 20, 27, 29, 36, 38, 45, 46, 47};
	private static final int[] border_2 = {15, 16, 17, 24, 26, 33, 35, 42, 44, 51, 52, 53};
	private static final int[] border_3 = {30, 31, 32, 39, 41, 48, 50};
	
	private static final int INFO_SLOT = 49;

	public ReactorAccessPort(Category category, ItemStack item, String name, RecipeType recipeType, ItemStack[] recipe) {
		super(category, item, name, recipeType, recipe);

		new BlockMenuPreset(name, "&2Puerto de acceso al reactor") {

			@Override
			public void init() {
				constructMenu(this);
			}

			@Override
			public boolean canOpen(Block b, Player p) {
				return p.hasPermission("slimefun.inventory.bypass") || SlimefunPlugin.getProtectionManager().hasPermission(p, b.getLocation(), ProtectableAction.ACCESS_INVENTORIES);
			}
			
			@Override
			public void newInstance(final BlockMenu menu, final Block b) {
				BlockMenu reactor = getReactorMenu(b.getLocation());
				if (reactor != null) {
					menu.replaceExistingItem(INFO_SLOT, new CustomItem(new ItemStack(Material.GREEN_WOOL), "&7Reactor", "", "&6Detectado", "", "&7> Click para ve el Reactor"));
					menu.addMenuClickHandler(INFO_SLOT, (p, slot, item, action) -> {
						if (reactor != null) {
							reactor.open(p);
						}
						newInstance(menu, b);

						return false;
					});
				} 
				else {
					menu.replaceExistingItem(INFO_SLOT, new CustomItem(new ItemStack(Material.RED_WOOL), "&7Reactor", "", "&cNo detectado", "", "&7¡El Reactor debería estar", "&7puesto 3 bloques debajo", "&7del puerto de acceso!"));
					menu.addMenuClickHandler(INFO_SLOT, (p, slot, item, action) -> {
						newInstance(menu, b);
						return false;
					});
				}
			}

			@Override
			public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
				if (flow == ItemTransportFlow.INSERT) return getInputSlots();
				else return getOutputSlots();
			}

			@Override
			public int[] getSlotsAccessedByItemTransport(BlockMenu menu, ItemTransportFlow flow, ItemStack item) {
				if (flow == ItemTransportFlow.INSERT) {
					if (SlimefunManager.isItemSimilar(item, SlimefunItems.REACTOR_COOLANT_CELL, true)) return getCoolantSlots();
					else if (SlimefunManager.isItemSimilar(item, SlimefunItems.NETHER_ICE_COOLANT_CELL, true)) return getCoolantSlots();
					else return getFuelSlots();
				}
				else return getOutputSlots();
			}
		};

		registerBlockHandler(name, (p, b, tool, reason) -> {
			BlockMenu inv = BlockStorage.getInventory(b);
			
			if (inv != null) {
				for (int slot : getFuelSlots()) {
					if (inv.getItemInSlot(slot) != null) {
						b.getWorld().dropItemNaturally(b.getLocation(), inv.getItemInSlot(slot));
						inv.replaceExistingItem(slot, null);
					}
				}
				
				for (int slot : getCoolantSlots()) {
					if (inv.getItemInSlot(slot) != null) {
						b.getWorld().dropItemNaturally(b.getLocation(), inv.getItemInSlot(slot));
						inv.replaceExistingItem(slot, null);
					}
				}
				
				for (int slot : getOutputSlots()) {
					if (inv.getItemInSlot(slot) != null) {
						b.getWorld().dropItemNaturally(b.getLocation(), inv.getItemInSlot(slot));
						inv.replaceExistingItem(slot, null);
					}
				}
			}
			return true;
		});
	}

	private void constructMenu(BlockMenuPreset preset) {
		for (int i : border) {
			preset.addItem(i, new CustomItem(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "), (p, slot, item, action) -> false);
		}

		for (int i : border_1) {
			preset.addItem(i, new CustomItem(new ItemStack(Material.LIME_STAINED_GLASS_PANE), " "), (p, slot, item, action) -> false);
		}

		for (int i : border_2) {
			preset.addItem(i, new CustomItem(new ItemStack(Material.CYAN_STAINED_GLASS_PANE), " "), (p, slot, item, action) -> false);
		}

		for (int i : border_3) {
			preset.addItem(i, new CustomItem(new ItemStack(Material.GREEN_STAINED_GLASS_PANE), " "), (p, slot, item, action) -> false);
		}
		
		preset.addItem(1, new CustomItem(SlimefunItems.URANIUM, "&7Ranura de combustible", "", "&rEsta ranura acepta combustible radioactivo como el:", "&2Uranium &ro &aNeptunium"), (p, slot, item, action) -> false);
		preset.addItem(22, new CustomItem(SlimefunItems.PLUTONIUM, "&7Ranura de subproducto", "", "&rEsta ranura contiene el subproducto del reactor", "&rtales como el &aNeptunium &ro &7Plutonium"), (p, slot, item, action) -> false);
		preset.addItem(7, new CustomItem(SlimefunItems.REACTOR_COOLANT_CELL, "&bRanura de refrigerante", "", "&rEsta ranura acepta celdas de refrigerante", "&4Si no hay refrigerante, su reactor", "&4podría explotar"), (p, slot, item, action) -> false);
	}

	public int[] getInputSlots() {
		return new int[] {19, 28, 37, 25, 34, 43};
	}

	public int[] getFuelSlots() {
		return new int[] {19, 28, 37};
	}

	public int[] getCoolantSlots() {
		return new int[] {25, 34, 43};
	}

	public static int[] getOutputSlots() {
		return new int[] {40};
	}

	public AReactor getReactor(Location l) {
		Location reactorL = new Location(l.getWorld(), l.getX(), l.getY() - 3, l.getZ());

		SlimefunItem item = BlockStorage.check(reactorL.getBlock());
		if (item instanceof AReactor) return (AReactor) item;

		return null;
	}

	public BlockMenu getReactorMenu(Location l) {
		Location reactorL = new Location(l.getWorld(), l.getX(), l.getY() - 3, l.getZ());

		SlimefunItem item = BlockStorage.check(reactorL.getBlock());
		if (item instanceof AReactor) return BlockStorage.getInventory(reactorL);

		return null;
	}

}
