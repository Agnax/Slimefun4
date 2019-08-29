package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.machines;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;

public class TrashCan extends SlimefunItem {
	
	private static final int[] border = {0, 1, 2, 3, 5, 4, 6, 7, 8, 9, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};

	public TrashCan(Category category, ItemStack item, String name, RecipeType recipeType, ItemStack[] recipe) {
		super(category, item, name, recipeType, recipe);
		
		new BlockMenuPreset(name, getInventoryTitle()) {
			
			@Override
			public void init() {
				constructMenu(this);
			}

			@Override
			public void newInstance(final BlockMenu menu, final Block b) {
			}

			@Override
			public boolean canOpen(Block b, Player p) {
				return true;
			}

			@Override
			public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
				if (flow == ItemTransportFlow.INSERT) return getInputSlots();
				return new int[0];
			}
		};
	}
	
	private void constructMenu(BlockMenuPreset preset) {
		for (int i : border) {
			preset.addItem(i, new CustomItem(new ItemStack(Material.RED_STAINED_GLASS_PANE), " "),
				(p, slot, item, action) -> false
			);
		}
	}
	
	public String getInventoryTitle() {
		return "&4Basurero";
	}

	public int[] getInputSlots() {
		return new int[] {10, 11, 12, 13, 14, 15, 16};
	}
	
	@Override
	public void register(boolean slimefun) {
		addItemHandler(new BlockTicker() {
			
			@Override
			public void uniqueTick() {
			}
			
			@Override
			public void tick(Block b, SlimefunItem item, Config data) {
				BlockMenu menu = BlockStorage.getInventory(b);
				for (int slot: getInputSlots()) {
					menu.replaceExistingItem(slot, null);
				}
			}
			
			@Override
			public boolean isSynchronized() {
				return false;
			}
		});

		super.register(slimefun);
	}

}
