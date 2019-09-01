package me.mrCookieSlime.Slimefun.Lists;

import java.util.logging.Level;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomArmor;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.LockedCategory;
import me.mrCookieSlime.Slimefun.Objects.SeasonalCategory;
import me.mrCookieSlime.Slimefun.api.Slimefun;

/**
 * Built-in categories.
 * 
 * @author TheBusyBiscuit
 * @since 4.0
 * @see Category
 */
public final class Categories {
	
	private Categories() {}
	
	private static final String lore = "&a> Click para abrir";

	public static final Category WEAPONS = new Category(new CustomItem(Material.GOLDEN_SWORD, "&7Armas", "", lore), 1);
	public static final Category PORTABLE = new Category(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&7Items", "", lore), 1);
	public static final Category FOOD = new Category(new CustomItem(Material.APPLE, "&7Comida", "", lore), 2);
	public static final Category MACHINES_1 = new Category(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&7Máquinas básicas", "", lore), 1);
	public static final LockedCategory ELECTRICITY = new LockedCategory(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTU4NDQzMmFmNmYzODIxNjcxMjAyNThkMWVlZThjODdjNmU3NWQ5ZTQ3OWU3YjBkNGM3YjZhZDQ4Y2ZlZWYifX19"), "&bEnergía y electricidad", "", lore), 4, MACHINES_1);
	public static final LockedCategory GPS = new LockedCategory(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&bMáquinas basadas en GPS", "", lore), 4, MACHINES_1);
	public static final Category ARMOR = new Category(new CustomItem(Material.IRON_CHESTPLATE, "&7Armaduras", "", lore), 2);
	public static final Category LUMPS_AND_MAGIC = new Category(new CustomItem(SlimefunItems.RUNE_ENDER, "&7Items mágicos", "", lore), 2);
	public static final Category MAGIC = new Category(new CustomItem(SlimefunItems.ENDER_BACKPACK, "&7Gadgets Mágicos", "", lore), 3);
	public static final Category MISC = new Category(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRkYTk3ZjA4MGUzOTViODQyYzRjYzgyYTg0MDgyM2Q0ZGJkOGNhNjg4YTIwNjg1M2U1NzgzZTRiZmRjMDEyIn19fQ=="), "&7Miscelánea", "", lore), 2);
	public static final Category TECH = new Category(new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&7Gadgets Técnicos", "", lore), Color.SILVER), 3);
	public static final Category RESOURCES = new Category(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U4ZjVhZGIxNGQ2YzlmNmI4MTBkMDI3NTQzZjFhOGMxZjQxN2UyZmVkOTkzYzk3YmNkODljNzRmNWUyZTgifX19"), "&7Recursos", "", lore), 1);
	public static final Category CARGO = new LockedCategory(new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUxMGJjODUzNjJhMTMwYTZmZjlkOTFmZjExZDZmYTQ2ZDdkMTkxMmEzNDMxZjc1MTU1OGVmM2M0ZDljMiJ9fX0="), "&cManejo de carga", "", lore), 4, MACHINES_1);
	public static final Category TECH_MISC = new Category(new CustomItem(SlimefunItems.HEATING_COIL, "&7Componentes técnicos", "", lore), 2);
	public static final Category MAGIC_ARMOR = new Category(new CustomItem(SlimefunItems.ENDER_HELMET, "&7Armaduras mágicas", "", lore), 2);
	public static final Category TALISMANS_1 = new Category(new CustomItem(Material.EMERALD, "&7Talismanes - &aTier I", "", lore), 2);
	public static final LockedCategory TALISMANS_2 = new LockedCategory(new CustomItem(Material.EMERALD, "&7Talismanes - &aTier II", "", lore), 3, TALISMANS_1);
	public static final Category TOOLS = new Category(new CustomItem(Material.GOLDEN_PICKAXE, "&7Herramientas", "", lore), 1);
	public static final SeasonalCategory CHRISTMAS = new SeasonalCategory(12, 1, new CustomItem(Material.NETHER_STAR, "&aN&ca&av&ci&ad&ca&ad", "", "&c> Click para ayudar a &aSanta"));
	public static final SeasonalCategory VALENTINES_DAY = new SeasonalCategory(2, 2, new CustomItem(Material.POPPY, "&dDía de san valentín", "", "&d> Click para celebrar el amor"));
	public static final SeasonalCategory EASTER = new SeasonalCategory(4, 2, new CustomItem(Material.EGG, "&6Pascua", "", "&a> Click para pintar unos huevos"));
	public static final SeasonalCategory BIRTHDAY = new SeasonalCategory(10, 1, new CustomItem(Material.FIREWORK_ROCKET, "&a&lCumpleaños de TheBusyBiscuit &7(26 de Octubre)", "", "&a> Click para celebrarlo con el"));
	
	private static ItemStack getSkull(String texture) {
		try {
			return CustomSkull.getItem(texture);
		}
		catch(Exception x) {
			Slimefun.getLogger().log(Level.SEVERE, "An Error occured while initializing the Categories for Slimefun " + Slimefun.getVersion(), x);
			
			return new ItemStack(Material.PLAYER_HEAD);
		}
	}
}
