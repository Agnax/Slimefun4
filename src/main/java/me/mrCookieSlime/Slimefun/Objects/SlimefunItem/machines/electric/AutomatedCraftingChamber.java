package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.machines.electric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.cscorelib2.protection.ProtectableAction;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.AdvancedMenuClickHandler;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.InvUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItemSerializer;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItemSerializer.ItemFlag;
import me.mrCookieSlime.Slimefun.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunBlockHandler;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.UnregisterReason;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.interfaces.InventoryBlock;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.energy.ChargableBlock;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import me.mrCookieSlime.Slimefun.api.item_transport.RecipeSorter;

public abstract class AutomatedCraftingChamber extends SlimefunItem implements InventoryBlock {
	
	private static final int[] border = {0, 1, 3, 4, 5, 7, 8, 13, 14, 15, 16, 17, 50, 51, 52, 53};
	private static final int[] border_in = {9, 10, 11, 12, 13, 18, 22, 27, 31, 36, 40, 45, 46, 47, 48, 49};
	private static final int[] border_out = {23, 24, 25, 26, 32, 35, 41, 42, 43, 44};

	public AutomatedCraftingChamber(Category category, ItemStack item, String name, RecipeType recipeType, ItemStack[] recipe) {
		super(category, item, name, recipeType, recipe);
		
		new BlockMenuPreset(name, "&6Cámara automática de crafteo") {
			
			@Override
			public void init() {
				constructMenu(this);
			}

			@Override
			public void newInstance(final BlockMenu menu, final Block b) {
				if (!BlockStorage.hasBlockInfo(b) || BlockStorage.getLocationInfo(b.getLocation(), "enabled") == null || BlockStorage.getLocationInfo(b.getLocation(), "enabled").equals("false")) {
					menu.replaceExistingItem(6, new CustomItem(new ItemStack(Material.GUNPOWDER), "&7Activado: &4\u2718", "", "&e> Click para activar esta maquina"));
					menu.addMenuClickHandler(6, (p, slot, item, action) -> {
						BlockStorage.addBlockInfo(b, "enabled", "true");
						newInstance(menu, b);
						return false;
					});
				}
				else {
					menu.replaceExistingItem(6, new CustomItem(new ItemStack(Material.REDSTONE), "&7Activado: &2\u2714", "", "&e> Click para desactivar esta maquina"));
					menu.addMenuClickHandler(6, (p, slot, item, action) -> {
						BlockStorage.addBlockInfo(b, "enabled", "false");
						newInstance(menu, b);
						return false;
					});
				}
			}

			@Override
			public boolean canOpen(Block b, Player p) {
				return p.hasPermission("slimefun.inventory.bypass") || SlimefunPlugin.getProtectionManager().hasPermission(p, b.getLocation(), ProtectableAction.ACCESS_INVENTORIES);
			}

			@Override
			public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
				return new int[0];
			}

			@Override
			public int[] getSlotsAccessedByItemTransport(BlockMenu menu, ItemTransportFlow flow, ItemStack item) {
				if (flow == ItemTransportFlow.WITHDRAW) return getOutputSlots();
				
				List<Integer> slots = new ArrayList<>();
				for (int slot : getInputSlots()) {
					if (menu.getItemInSlot(slot) != null) slots.add(slot);
				}
				Collections.sort(slots, new RecipeSorter(menu));
				
				int[] array = new int[slots.size()];
				
				for (int i = 0; i < slots.size(); i++) {
					array[i] = slots.get(i);
				}
				
				return array;
			}
		};
		
		registerBlockHandler(name, new SlimefunBlockHandler() {
			
			@Override
			public void onPlace(Player p, Block b, SlimefunItem item) {
				BlockStorage.addBlockInfo(b, "enabled", "false");
			}
			
			@Override
			public boolean onBreak(Player p, Block b, SlimefunItem item, UnregisterReason reason) {
				BlockMenu inv = BlockStorage.getInventory(b);
				if (inv != null) {
					for (int slot : getInputSlots()) {
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
			}
		});
	}
	
	protected void constructMenu(BlockMenuPreset preset) {
		for (int i : border) {
			preset.addItem(i, new CustomItem(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "), (p, slot, item, action) -> false);
		}
		
		for (int i : border_in) {
			preset.addItem(i, new CustomItem(new ItemStack(Material.BLUE_STAINED_GLASS_PANE), " "), (p, slot, item, action) -> false);
		}
		
		for (int i : border_out) {
			preset.addItem(i, new CustomItem(new ItemStack(Material.ORANGE_STAINED_GLASS_PANE), " "), (p, slot, item, action) -> false);
		}
		
		for (int i : getOutputSlots()) {
			preset.addMenuClickHandler(i, new AdvancedMenuClickHandler() {
				
				@Override
				public boolean onClick(Player p, int slot, ItemStack cursor, ClickAction action) {
					return false;
				}

				@Override
				public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor, ClickAction action) {
					return cursor == null || cursor.getType() == null || cursor.getType() == Material.AIR;
				}
			});
		}

		preset.addItem(2, new CustomItem(new ItemStack(Material.CRAFTING_TABLE), "&eReceta", "", "&bPIngrese la receta que desee auto-fabricar", "&4SOLO recetas de la mesa de crafteo mejorada"), (p, slot, item, action) -> false);
	}
	
	public abstract int getEnergyConsumption();

	@Override
	public int[] getInputSlots() {
		return new int[] {19, 20, 21, 28, 29, 30, 37, 38, 39};
	}
	
	@Override
	public int[] getOutputSlots() {
		return new int[] {33, 34};
	}
	
	@Override
	public void preRegister() {
		addItemHandler(new BlockTicker() {
			
			@Override
			public void tick(Block b, SlimefunItem sf, Config data) {
				AutomatedCraftingChamber.this.tick(b);
			}

			@Override
			public boolean isSynchronized() {
				return false;
			}
		});
	}
	
	protected void tick(Block b) {
		if (BlockStorage.getLocationInfo(b.getLocation(), "enabled").equals("false")) return;
		if (ChargableBlock.getCharge(b) < getEnergyConsumption()) return;
		
		BlockMenu menu = BlockStorage.getInventory(b);
		
		StringBuilder builder = new StringBuilder();
		int i = 0;
		for (int j = 0; j < 9; j++) {
			if (i > 0) {
				builder.append(" </slot> ");
			}
			
			ItemStack item = menu.getItemInSlot(getInputSlots()[j]);
			if (item != null && item.getAmount() == 1) return;
			builder.append(CustomItemSerializer.serialize(item, ItemFlag.MATERIAL, ItemFlag.ITEMMETA_DISPLAY_NAME, ItemFlag.ITEMMETA_LORE));
			
			i++;
		}
		
		String input = builder.toString();
		
		if (SlimefunPlugin.getUtilities().automatedCraftingChamberRecipes.containsKey(input)) {
			ItemStack output = SlimefunPlugin.getUtilities().automatedCraftingChamberRecipes.get(input).clone();
			
			if (menu.fits(output, getOutputSlots())) {
				menu.pushItem(output, getOutputSlots());
				ChargableBlock.addCharge(b, -getEnergyConsumption());
				for (int j = 0; j < 9; j++) {
					if (menu.getItemInSlot(getInputSlots()[j]) != null) menu.replaceExistingItem(getInputSlots()[j], InvUtils.decreaseItem(menu.getItemInSlot(getInputSlots()[j]), 1));
				}
			}
		}
	}

}
