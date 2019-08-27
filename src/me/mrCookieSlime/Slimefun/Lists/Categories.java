package me.mrCookieSlime.Slimefun.Lists;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomArmor;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.MenuItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.LockedCategory;
import me.mrCookieSlime.Slimefun.Objects.SeasonCategory;

/**
 * Built-in categories.
 * 
 * @author TheBusyBiscuit
 * @since 4.0
 * @see Category
 */
public final class Categories {
	
	private Categories() {}
	
	public static Category WEAPONS = new Category(new MenuItem(Material.GOLDEN_SWORD, "&7Armas", 0, "open"), 1);
	public static Category PORTABLE = null;
	public static Category FOOD = new Category(new MenuItem(Material.APPLE, "&7Comida", 0, "open"), 2);
	public static Category MACHINES_1 = null;
	public static LockedCategory ELECTRICITY = null;
	public static LockedCategory GPS = null;
	public static Category ARMOR = new Category(new MenuItem(Material.IRON_CHESTPLATE, "&7Armadura", 0, "open"), 2);
	public static Category LUMPS_AND_MAGIC = new Category(new MenuItem(Material.FIRE_CHARGE, "&7Items mágicos", 0, "open"), 2);
	public static Category MAGIC = new Category(new MenuItem(Material.BLAZE_POWDER, "&7Gadgets Mágicos", 0, "open"), 3);
	public static Category MISC = null;
	public static Category TECH = new Category(new CustomArmor(new MenuItem(Material.LEATHER_CHESTPLATE, "&7Gadgets Tecnicos", 0, "open"), Color.SILVER), 3);
	public static Category RESOURCES = null;
	public static Category CARGO = null;
	public static Category TECH_MISC = new Category(new MenuItem(Material.COMPARATOR, "&7Componentes tecnicos", 0, "open"), 2);
	public static Category MAGIC_ARMOR = new Category(new MenuItem(Material.GOLDEN_CHESTPLATE, "&7Armaduras magicas", 0, "open"), 2);
	public static Category TALISMANS_1 = new Category(new MenuItem(Material.EMERALD, "&7Talismanes - &aTier I", 0, "open"), 2);
	public static LockedCategory TALISMANS_2 = new LockedCategory(new MenuItem(Material.EMERALD, "&7Talismanes - &aTier II", 0, "open"), 3, TALISMANS_1);
	public static Category TOOLS = new Category(new MenuItem(Material.GOLDEN_PICKAXE, "&7Herramientas", 0, "open"), 1);
	public static SeasonCategory CHRISTMAS = new SeasonCategory(12, 1, new MenuItem(Material.NETHER_STAR, "&aN&ca&av&ci&ad&ca&ad", 0, ChatColor.translateAlternateColorCodes('&', "&cAyuda &aSanta")));
	public static SeasonCategory VALENTINES_DAY = new SeasonCategory(2, 2, new MenuItem(Material.POPPY, "&dDía de San Valentín", 0, ChatColor.translateAlternateColorCodes('&', "&dCelebrar el amor")));
	public static SeasonCategory EASTER = new SeasonCategory(4, 2, new MenuItem(Material.EGG, "&6Easter", 0, ChatColor.translateAlternateColorCodes('&', "&aPinta unos huevos")));
	public static SeasonCategory BIRTHDAY = new SeasonCategory(10, 1, new MenuItem(Material.FIREWORK_ROCKET, "&a&lCumpleaños de TheBusyBiscuit &7(26 de Octubre)", 0, ChatColor.translateAlternateColorCodes('&', "&aCelebra conmigo")));
	
	static {
		try {
			MISC = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRkYTk3ZjA4MGUzOTViODQyYzRjYzgyYTg0MDgyM2Q0ZGJkOGNhNjg4YTIwNjg1M2U1NzgzZTRiZmRjMDEyIn19fQ=="), "&7Diversos", "", "&a> Click para abrir"), 2);
			PORTABLE = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&7Items", "", "&a> Click para abrir"), 1);
			MACHINES_1 = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&7Máquinas básicas", "", "&a> Click para abrir"), 1);
			ELECTRICITY = new LockedCategory(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTU4NDQzMmFmNmYzODIxNjcxMjAyNThkMWVlZThjODdjNmU3NWQ5ZTQ3OWU3YjBkNGM3YjZhZDQ4Y2ZlZWYifX19"), "&bEnergia y electricidad", "", "&a> Click para abrir"), 4, MACHINES_1);
			GPS = new LockedCategory(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&bMáquinas basadas en GPS", "", "&a> Click para abrir"), 4, MACHINES_1);
			RESOURCES = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U4ZjVhZGIxNGQ2YzlmNmI4MTBkMDI3NTQzZjFhOGMxZjQxN2UyZmVkOTkzYzk3YmNkODljNzRmNWUyZTgifX19"), "&7Recursos", "", "&a> Click para abrir"), 1);
			CARGO = new LockedCategory(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUxMGJjODUzNjJhMTMwYTZmZjlkOTFmZjExZDZmYTQ2ZDdkMTkxMmEzNDMxZjc1MTU1OGVmM2M0ZDljMiJ9fX0="), "&cGestion de carga", "", "&a> Click para abrir"), 4, MACHINES_1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
