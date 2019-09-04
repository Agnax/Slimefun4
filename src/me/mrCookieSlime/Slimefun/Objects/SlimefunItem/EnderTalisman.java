package me.mrCookieSlime.Slimefun.Objects.SlimefunItem;

import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.Slimefun.Lists.Categories;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.api.Slimefun;

/**
 * @since 4.0
 */
public class EnderTalisman extends Talisman {

	public EnderTalisman(Talisman parent) {
		super(Categories.TALISMANS_2, parent.upgrade(), "ENDER_" + parent.getID(), new ItemStack[] {SlimefunItems.ENDER_LUMP_3, null, SlimefunItems.ENDER_LUMP_3, null, parent.getItem(), null, SlimefunItems.ENDER_LUMP_3, null, SlimefunItems.ENDER_LUMP_3});
		
		consumable = parent.isConsumable();
        cancel = parent.isEventCancelled();
        suffix = parent.getSuffix();
        effects = parent.getEffects();
        chance = parent.getChance();
		
		Slimefun.addHint("ENDER_" + parent.getID(), "&eLos talismanes de ender tiene la ventaja de", "&eseguir funcionando cuando están", "&edentro de tu Ender Chest");
	}
	
	@Override
	public ItemStack upgrade() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void install() {
		// Let's override that, otherwise we would be creating Ender Talismans
		// for every Ender Talisman
	}
	
	@Override
	public void create() {
		// Let's override that, otherwise we would be creating Ender Talismans
		// for every Ender Talisman
	}
}
