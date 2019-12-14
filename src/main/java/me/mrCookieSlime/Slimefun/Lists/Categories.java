package me.mrCookieSlime.Slimefun.Lists;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.core.utils.ChatUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.LockedCategory;
import me.mrCookieSlime.Slimefun.Objects.SeasonalCategory;

/**
 * Built-in categories.
 * 
 * @author TheBusyBiscuit
 * @since 4.0
 * @see Category
 */
public final class Categories {
	
	private Categories() {}
	
	private static final String LORE = "&a> Click para abrir";
	
	public static final Category WEAPONS = new Category(new CustomItem(SlimefunItems.BLADE_OF_VAMPIRES, "&7Armas", "", LORE), 1);
	public static final Category TOOLS = new Category(new CustomItem(SlimefunItems.AUTO_SMELT_PICKAXE, "&7Herramientas", "", LORE), 1);
	public static final Category PORTABLE = new Category(new CustomItem(SlimefunItems.BACKPACK_MEDIUM, "&7Objetos", "", LORE), 1);
	public static final Category FOOD = new Category(new CustomItem(SlimefunItems.FORTUNE_COOKIE, "&7Comida", "", LORE), 2);
	public static final Category MACHINES_1 = new Category(new CustomItem(Material.SMITHING_TABLE, "&7Máquinas básicas", "", LORE), 1);
	public static final LockedCategory ELECTRICITY = new LockedCategory(new CustomItem(SlimefunItems.NUCLEAR_REACTOR, "&bEnergía y electricidad", "", LORE), 4, MACHINES_1);
	public static final LockedCategory GPS = new LockedCategory(new CustomItem(SlimefunItems.GPS_TRANSMITTER, "&bMáquinas basadas en GPS", "", LORE), 4, MACHINES_1);
	public static final Category ARMOR = new Category(new CustomItem(SlimefunItems.DAMASCUS_STEEL_CHESTPLATE, "&7Armadura", "", LORE), 2);
	public static final Category LUMPS_AND_MAGIC = new Category(new CustomItem(SlimefunItems.RUNE_ENDER, "&7Items Mágicos", "", LORE), 2);
	public static final Category MAGIC = new Category(new CustomItem(SlimefunItems.INFUSED_ELYTRA, "&7Gadgets Mágicos", "", LORE), 3);
	public static final Category MISC = new Category(new CustomItem(SlimefunItems.CAN, "&7Miscelánea", "", LORE), 2);
	public static final Category TECH = new Category(new CustomItem(SlimefunItems.STEEL_JETPACK, "&7Gádgets Tecnológicos", "", LORE), 3);
	public static final Category RESOURCES = new Category(new CustomItem(SlimefunItems.SYNTHETIC_SAPPHIRE, "&7Recursos", "", LORE), 1);
	public static final Category CARGO = new LockedCategory(new CustomItem(SlimefunItems.CARGO_MANAGER, "&cManejo de carga", "", LORE), 4, MACHINES_1);
	public static final Category TECH_MISC = new Category(new CustomItem(SlimefunItems.HEATING_COIL, "&7Componentes Tecnológicos", "", LORE), 2);
	public static final Category MAGIC_ARMOR = new Category(new CustomItem(SlimefunItems.ENDER_HELMET, "&7Armadura Mágica", "", LORE), 2);
	public static final Category TALISMANS_1 = new Category(new CustomItem(SlimefunItems.TALISMAN, "&7Talismanes - &aTier I", "", LORE), 2);
	public static final LockedCategory TALISMANS_2 = new LockedCategory(new CustomItem(SlimefunItems.ENDER_TALISMAN, "&7Talismanes - &aTier II", "", LORE), 3, TALISMANS_1);
	
	// Seasonal Categories
	public static final SeasonalCategory CHRISTMAS = new SeasonalCategory(12, 1, new CustomItem(Material.NETHER_STAR, ChatUtils.christmas("Navidad") + " &7(Diciembre)", "", "&c> Click para ayudar a &aSanta"));
	public static final SeasonalCategory VALENTINES_DAY = new SeasonalCategory(2, 2, new CustomItem(Material.POPPY, "&dDía de San Valentín" + " &7(Febrero)", "", "&d> Click para celebrar amor"));
	public static final SeasonalCategory EASTER = new SeasonalCategory(4, 2, new CustomItem(Material.EGG, "&6Pascua" + " &7(Abril)", "", "&a> Click para pintar huevos"));
	public static final SeasonalCategory BIRTHDAY = new SeasonalCategory(10, 1, new CustomItem(Material.FIREWORK_ROCKET, "&a&lCumpleaños TheBusyBiscuit &7(26t de Octubre)", "", "&a> Click para celebrar al creador del plugin"));
	
}
