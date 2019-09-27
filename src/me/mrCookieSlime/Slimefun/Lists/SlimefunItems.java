package me.mrCookieSlime.Slimefun.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomArmor;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomPotion;
import me.mrCookieSlime.CSCoreLibPlugin.general.String.Christmas;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.items.StormStaff;
import me.mrCookieSlime.Slimefun.api.Slimefun;
import me.mrCookieSlime.Slimefun.utils.MachineTier;
import me.mrCookieSlime.Slimefun.utils.MachineType;

import me.mrCookieSlime.Slimefun.Lists.InsanityItem;

public class SlimefunItems {

	private SlimefunItems() {}
	
	/*		 Items 		*/
	public static final ItemStack PORTABLE_CRAFTER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzJlYzRhNGJkOGE1OGY4MzYxZjhhMDMwM2UyMTk5ZDMzZDYyNGVhNWY5MmY3Y2IzNDE0ZmVlOTVlMmQ4NjEifX19"), "&6Crafter portátil", "&a&oUn Crafter portátil", "", "&eClick Derecho&7 para abrir");
	public static final ItemStack PORTABLE_DUSTBIN = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ=="), "&6Cubo de basura portátil", "&rTu basurero portátil", "", "&eClick Derecho&7 para abrir");
	public static final ItemStack ENDER_BACKPACK = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&6Mochila Ender","&a&oUn cofre del ender portátil", "", "&eClick Derecho&7 para abrir");
	public static final ItemStack MAGIC_EYE_OF_ENDER = new CustomItem(Material.ENDER_EYE, "&6&lOjo mágico de ender", "&4&lRequiere armadura completa de Ender", "", "&7&eClick derecho&7 para disparar una enderpearl");
	public static final ItemStack BROKEN_SPAWNER = new CustomItem(Material.SPAWNER, "&cSpawner roto", "&7Tipo: &b<Tipo>", "", "&cFracturado, debe ser reparado en un Altar Antiguo");
	public static final ItemStack REPAIRED_SPAWNER = new CustomItem(Material.SPAWNER, "&bSpawner Reforzado", "&7Tipo: &b<Tipo>");
	public static final ItemStack INFERNAL_BONEMEAL = new CustomItem(Material.BONE_MEAL, "&4Polvo de hueso infernal", "", "&cAcelera el crecimiento del", "&cNether Wart");
	
	/*		 Gadgets 		*/
	public static final ItemStack GOLD_PAN = new CustomItem(Material.BOWL, "&6Charola de oro", "&a&oObtienes varios recursos...", "", "&7&eClick Derecho&7 para obtener varias cosas de la grava");
	public static final ItemStack PARACHUTE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&r&lParachute", "", "&7Mantén &eShift&7 para usar"), Color.WHITE);
	public static final ItemStack GRAPPLING_HOOK = new CustomItem(Material.LEAD, "&6Gancho corto", "", "&7&eClick &7Derecho para usar");
	public static final ItemStack SOLAR_HELMET = new CustomItem(Material.IRON_HELMET, "&bCasco Solar", "", "&a&oCarga tus items y armaduras");
	public static final ItemStack CLOTH = new InsanityItem(Material.PAPER, "&bTela",2);
	public static final ItemStack CAN = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRkYTk3ZjA4MGUzOTViODQyYzRjYzgyYTg0MDgyM2Q0ZGJkOGNhNjg4YTIwNjg1M2U1NzgzZTRiZmRjMDEyIn19fQ=="), "&rLata");
	public static final ItemStack NIGHT_VISION_GOGGLES = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&aGafas de visión nocturna", "", "&9+ Visión nocturna"), Color.BLACK);
	public static final ItemStack FARMER_SHOES = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&eZapatos de granjero", "", "&6&oEvita que puedas pisotear tus cultivos."), Color.YELLOW);
	public static final ItemStack INFUSED_MAGNET = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&aImán infundido" , "", "&rImanes mágicos infundidos", "&ratraer artículos cercanos", "&rsiempre y cuando haya lugar en", "&rtu inventario", "", "&7Mantén &eShift&7 para recoger objetos cercanos.");
	public static final ItemStack FLASK_OF_KNOWLEDGE = new CustomItem(Material.GLASS_BOTTLE, "&cFrasco de conocimiento", "", "&rte permite guardar un poco", "&rde tu XP en una botella", "&7Cuesta: &un nivel");
	public static final ItemStack RAG = new CustomItem(Material.PAPER, "&cParche", "", "&aNivel I - Medicamento", "", "&rRecupera 2 corazones", "&rExtingue el fuego", "", "&7&eClick Derecho&7 para usar");
	public static final ItemStack BANDAGE = new CustomItem(Material.PAPER, "&cBenda", "", "&aNivel II - Medicamento", "", "&rRecupera 4 corazones", "&rExtingue el fuego", "", "&7&eClick Derecho&7 para usar");
	public static final ItemStack SPLINT = new CustomItem(Material.STICK, "&cSplint", "", "&aLevel I - Medicamento", "", "&rRecupera 2 corazones", "", "&7&eClick Derecho&7&7 para usar");
	public static final ItemStack VITAMINS = new CustomItem(Material.NETHER_WART, "&cVitaminas", "", "&aNivel III - Medicamento", "", "&rRecupera 4 corazones", "&rExtingue el fuego", "&rCura Veneno/Wither/Radiacion", "", "&7&eClick Derecho&7 para usar");
	public static final ItemStack MEDICINE = new CustomPotion("&cMedicine", Color.RED, new PotionEffect(PotionEffectType.HEAL, 0, 0), "", "&aNivel III - Medicamento", "", "&rRecupera 4 corazones", "&rExtingue el fuego", "&rCura Veneno/Wither/Radiacion");
	
	/*		Backpacks		*/
	public static final ItemStack BACKPACK_SMALL = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eMochila pequeña","", "&7Tamaño: &e9", "&7ID: <ID>", "", "&7&eClick Derecho&7 para abrir");
	public static final ItemStack BACKPACK_MEDIUM = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eMochila","", "&7Tamaño: &e18", "&7ID: <ID>", "", "&7&eClick Derecho&7 para abrir");
	public static final ItemStack BACKPACK_LARGE = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eMochila grande","", "&7Tamaño: &e27", "&7ID: <ID>", "", "&7&eClick Derecho&7 para abrir");
	public static final ItemStack WOVEN_BACKPACK = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eMochila tejida","", "&7Tamaño: &e36", "&7ID: <ID>", "", "&7&eClick Derecho&7 para abrir");
	public static final ItemStack GILDED_BACKPACK = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eMochila dorada","", "&7Tamaño: &e45", "&7ID: <ID>", "", "&7&eClick Derecho&7 para abrir");
	public static final ItemStack RADIANT_BACKPACK = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eMochila radiante","", "&7Tamaño: &e54 (Double chest)", "&7ID: <ID>", "", "&7&eClick Derecho&7 para abrir");
	public static final ItemStack BOUND_BACKPACK = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&cSoulbound Backpack","", "&7Tamaño: &e36", "&7ID: <ID>", "", "&7&eClick Derecho&7 para abrir");
	public static final ItemStack COOLER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDRjMTU3MjU4NGViNWRlMjI5ZGU5ZjVhNGY3NzlkMGFhY2JhZmZkMzNiY2IzM2ViNDUzNmE2YTJiYzZhMSJ9fX0="), "&bEnfriadora","&rLe permite almacenar jugos / batidos", "&rY los consume automáticamente cuando tienes hambre.", "", "&7Tamaño: &e27", "&7ID: <ID>", "", "&7&eClick Derecho&7 para abrir");
	
	public static final ItemStack VOIDBAG_SMALL = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4Small Void Bag","", "&7Tamaño: &e9", "&7ID: <ID>", "", "&7&eClick izquierdo&7 para succionar items cercanos", "&7&eClick Derecho&7 para abrir");
	public static final ItemStack VOIDBAG_MEDIUM = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4Void Bag","", "&7Tamaño: &e18", "&7ID: <ID>", "", "&7&eClick izquierdo&7 para succionar items cercanos", "&7&eClick Derecho&7 para abrir");
	public static final ItemStack VOIDBAG_BIG = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4Big Void Bag","", "&7Tamaño: &e27", "&7ID: <ID>", "", "&7&eClick izquierdo&7 para succionar items cercanos", "&7&eClick Derecho&7 para abrir");
	public static final ItemStack VOIDBAG_LARGE = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4Large Void Bag","", "&7Tamaño: &e36", "&7ID: <ID>", "", "&7&eClick izquierdo&7 para succionar items cercanos", "&7&eClick Derecho&7 para abrir");
	public static final ItemStack BOUND_VOIDBAG = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4Soulbound Void Bag","", "&7Tamaño: &e36", "&7ID: <ID>", "", "&7&eClick izquierdo&7 para succionar items cercanos", "&7&eClick Derecho&7 para abrir");
	

	/*		 Jetpacks		*/
	public static final ItemStack DURALUMIN_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9Jetpack eléctrico &7- &eI", "", "&8\u21E8 &7Material: &bDuralumin", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "&8\u21E8 &7Empuje: &c0.35", "", "&7Mantén &eShift&7 para usar"), Color.SILVER);
	public static final ItemStack SOLDER_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9Jetpack eléctrico &7- &eII", "", "&8\u21E8 &7Material: &bSolder", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "&8\u21E8 &7Empuje: &c0.4", "", "&7Mantén &eShift&7 para usar"), Color.SILVER);
	public static final ItemStack BILLON_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9Jetpack eléctrico &7- &eIII", "", "&8\u21E8 &7Material: &bBillon", "&c&o&8\u21E8 &e\u26A1 &70 / 45 J", "&8\u21E8 &7Empuje: &c0.45", "", "&7Mantén &eShift&7 para usar"), Color.SILVER);
	public static final ItemStack STEEL_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9Jetpack eléctrico &7- &eIV", "", "&8\u21E8 &7Material: &bSteel", "&c&o&8\u21E8 &e\u26A1 &70 / 60 J", "&8\u21E8 &7Empuje: &c0.5", "", "&7Mantén &eShift&7 para usar"), Color.SILVER);
	public static final ItemStack DAMASCUS_STEEL_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9Jetpack eléctrico &7- &eV", "", "&8\u21E8 &7Material: &bDamascus Steel", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "&8\u21E8 &7Empuje: &c0.55", "", "&7Mantén &eShift&7 para usar"), Color.SILVER);
	public static final ItemStack REINFORCED_ALLOY_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9Jetpack eléctrico &7- &eVI", "", "&8\u21E8 &7Material: &bAlloy", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "&8\u21E8 &7Empuje: &c0.6", "", "&7Mantén &eShift&7 para usar"), Color.SILVER);
	public static final ItemStack CARBONADO_JETPACK = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9Jetpack eléctrico &7- &eVII", "", "&8\u21E8 &7Material: &bCarbonado", "&c&o&8\u21E8 &e\u26A1 &70 / 150 J", "&8\u21E8 &7Empuje: &c0.7", "", "&7Mantén &eShift&7 para usar"), Color.BLACK);
	public static final ItemStack ARMORED_JETPACK = new CustomItem(Material.IRON_CHESTPLATE, "&9Jetpack Blindado", "&8\u21E8 &7Material: &bSteel", "", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7Empuje: &c0.45", "", "&7Mantén &eShift&7 para usar");
	
	/*		 JetBotas		*/
	public static final ItemStack DURALUMIN_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9Botas Jet &7- &eI", "", "&8\u21E8 &7Material: &bDuralumin", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "&8\u21E8 &7Velocidad: &a0.35", "&8\u21E8 &7Accuracy: &c50%", "", "&7Mantén &eShift&7 para usar"), Color.SILVER);
	public static final ItemStack SOLDER_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9Botas Jet &7- &eII", "", "&8\u21E8 &7Material: &bSolder", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "&8\u21E8 &7Velocidad: &a0.4", "&8\u21E8 &7Accuracy: &660%", "", "&7Mantén &eShift&7 para usar"), Color.SILVER);
	public static final ItemStack BILLON_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9Botas Jet &7- &eIII", "", "&8\u21E8 &7Material: &bBillon", "&c&o&8\u21E8 &e\u26A1 &70 / 40 J", "&8\u21E8 &7Velocidad: &a0.45", "&8\u21E8 &7Accuracy: &665%", "", "&7Mantén &eShift&7 para usar"), Color.SILVER);
	public static final ItemStack STEEL_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9Botas Jet &7- &eIV", "", "&8\u21E8 &7Material: &bSteel", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7Velocidad: &a0.5", "&8\u21E8 &7Accuracy: &e70%", "", "&7Mantén &eShift&7 para usar"), Color.SILVER);
	public static final ItemStack DAMASCUS_STEEL_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9Botas Jet &7- &eV", "", "&8\u21E8 &7Material: &bDamascus Steel", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "&8\u21E8 &7Velocidad: &a0.55", "&8\u21E8 &7Accuracy: &a75%", "", "&7Mantén &eShift&7 para usar"), Color.SILVER);
	public static final ItemStack REINFORCED_ALLOY_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9Botas Jet &7- &eVI", "", "&8\u21E8 &7Material: &bAlloy", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "&8\u21E8 &7Velocidad: &a0.6", "&8\u21E8 &7Accuracy: &c80%", "", "&7Mantén &eShift&7 para usar"), Color.SILVER);
	public static final ItemStack CARBONADO_JETBOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&9Botas Jet &7- &eVII", "", "&8\u21E8 &7Material: &bCarbonado", "&c&o&8\u21E8 &e\u26A1 &70 / 125 J", "&8\u21E8 &7Velocidad: &a0.7", "&8\u21E8 &7Accuracy: &c99.9%", "", "&7Mantén &eShift&7 para usar"), Color.BLACK);
	public static final ItemStack ARMORED_JETBOOTS = new CustomItem(Material.IRON_BOOTS, "&9Botas Jet Blindadas", "", "&8\u21E8 &7Material: &bSteel", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7Velocidad: &a0.45", "&8\u21E8 &7Accuracy: &e70%", "", "&7Mantén &eShift&7 para usar");
	
	/*		 Multi Tools		*/
	public static final ItemStack DURALUMIN_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9Multi Tool &7- &eI", "", "&8\u21E8 &7Material: &bDuralumin", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "", "&7&eClick Derecho&7 para usar", "&7Mantén &eShift + Click derecho&7 para cambiar el modo");
	public static final ItemStack SOLDER_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9Multi Tool &7- &eII", "", "&8\u21E8 &7Material: &bSolder", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "", "&7&eClick Derecho&7 para usar", "&7Mantén &eShift + Click derecho&7 para cambiar el modo");
	public static final ItemStack BILLON_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9Multi Tool &7- &eIII", "", "&8\u21E8 &7Material: &bBillon", "&c&o&8\u21E8 &e\u26A1 &70 / 40 J", "", "&7&eClick Derecho&7 para usar", "&7Mantén &eShift + Click derecho&7 para cambiar el modo");
	public static final ItemStack STEEL_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9Multi Tool &7- &eIV", "", "&8\u21E8 &7Material: &bSteel", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "", "&7&eClick Derecho&7 para usar", "&7Mantén &eShift + Click derecho&7 para cambiar el modo");
	public static final ItemStack DAMASCUS_STEEL_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9Multi Tool &7- &eV", "", "&8\u21E8 &7Material: &bDamascus Steel", "&c&o&8\u21E8 &e\u26A1 &70 / 60 J", "", "&7&eClick Derecho&7 para usar", "&7Mantén &eShift + Click derecho&7 para cambiar el modo");
	public static final ItemStack REINFORCED_ALLOY_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9Multi Tool &7- &eVI", "", "&8\u21E8 &7Material: &bAlloy", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "", "&7&eClick Derecho&7 para usar", "&7Mantén &eShift + Click derecho&7 para cambiar el modo");
	public static final ItemStack CARBONADO_MULTI_TOOL = new CustomItem(Material.SHEARS, "&9Multi Tool &7- &eVII", "", "&8\u21E8 &7Material: &bCarbonado", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "", "&7&eClick Derecho&7 para usar", "&7Mantén &eShift + Click derecho&7 para cambiar el modo");
	
	/*		 Food 		*/
	public static final ItemStack FORTUNE_COOKIE = new CustomItem(Material.COOKIE, "&6Galleta del futuro", "", "&a&oTe habla sobre tu futuro :o");
	public static final ItemStack DIET_COOKIE = new CustomItem(Material.COOKIE, "&6Galleta dietetica", "", "&aUna galleta muy ligera.");
	public static final ItemStack BEEF_JERKY = new CustomItem(Material.COOKED_BEEF, "&6Carne chida", "", "&a&oSaturandote");
	public static final ItemStack MAGIC_SUGAR = new CustomItem(Material.SUGAR, "&6Azucar magica", "", "&a&oSiente el poder de la diabetes!");
	public static final ItemStack MONSTER_JERKY = new CustomItem(Material.ROTTEN_FLESH, "&6Carne mounstruosa", "", "&a&oNo más hambre por un buen tiempo");
	public static final ItemStack APPLE_JUICE = new CustomPotion("&cJugo de Manzana", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&oRecupera &b&o" + "3.0" + " &7&oDe hambre");
	public static final ItemStack MELON_JUICE = new CustomPotion("&cJugo de Melón", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&oRecupera &b&o" + "3.0" + " &7&oDe hambre");
	public static final ItemStack CARROT_JUICE = new CustomPotion("&6Jugo de Zanahoria", Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&oRecupera &b&o" + "3.0" + " &7&oDe hambre");
	public static final ItemStack PUMPKIN_JUICE = new CustomPotion("&6Jugo de calabaza", Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&oRecupera &b&o" + "3.0" + " &7&oDe hambre");
	public static final ItemStack GOLDEN_APPLE_JUICE = new CustomPotion("&bJugo de Manzana dorada", Color.YELLOW, new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0));
	
	/*		Christmas		*/
	public static final ItemStack CHRISTMAS_MILK = new CustomPotion("&6Vaso de leche", Color.WHITE, new PotionEffect(PotionEffectType.SATURATION, 5, 0), "", "&7&oRecupera &b&o" + "2.5" + " &7&oDe hambre");
	public static final ItemStack CHRISTMAS_CHOCOLATE_MILK = new CustomPotion("&6Leche con chocolate", Color.MAROON, new PotionEffect(PotionEffectType.SATURATION, 12, 0), "", "&7&oRecupera &b&o" + "6.0" + " &7&oDe hambre");
	public static final ItemStack CHRISTMAS_EGG_NOG = new CustomPotion("&aPonche de huevo", Color.GRAY, new PotionEffect(PotionEffectType.SATURATION, 7, 0), "", "&7&oRecupera &b&o" + "3.5" + " &7&oDe hambre");
	public static final ItemStack CHRISTMAS_APPLE_CIDER = new CustomPotion("&cSidra de manzana", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 14, 0), "", "&7&oRecupera &b&o" + "7.0" + " &7&oDe hambre");
	public static final ItemStack CHRISTMAS_COOKIE = new CustomItem(Material.COOKIE, Christmas.color("Galleta de navidad"));
	public static final ItemStack CHRISTMAS_FRUIT_CAKE = new CustomItem(Material.PUMPKIN_PIE, Christmas.color("Pastel de frutas"));
	public static final ItemStack CHRISTMAS_APPLE_PIE = new CustomItem(Material.PUMPKIN_PIE, "&rTarta de Manzana");
	public static final ItemStack CHRISTMAS_HOT_CHOCOLATE = new CustomPotion("&6Chocolate caliente", Color.MAROON, new PotionEffect(PotionEffectType.SATURATION, 14, 0), "", "&7&oRecupera &b&o" + "7.0" + " &7&oDe hambre");
	public static final ItemStack CHRISTMAS_CAKE = new CustomItem(Material.PUMPKIN_PIE, Christmas.color("Pastel de navidad"));
	public static final ItemStack CHRISTMAS_CARAMEL = new CustomItem(Material.BRICKS, "&6Caramelo");
	public static final ItemStack CHRISTMAS_CARAMEL_APPLE = new CustomItem(Material.APPLE, "&6Caramelo de manzana");
	public static final ItemStack CHRISTMAS_CHOCOLATE_APPLE = new CustomItem(Material.APPLE, "&6Manzana con chocolate");
	public static final ItemStack CHRISTMAS_PRESENT = new CustomItem(Material.CHEST, Christmas.color("Regalo de  navidad"), "&7De: &eAgnax", "&Para: &eTí", "", "&eClick Derecho&7 para abrir");
	
	/*		Easter			*/
	public static final ItemStack EASTER_EGG = new CustomItem(Material.EGG, "&rEaster Egg", "&bSurprise! Surprise!");
	public static final ItemStack EASTER_CARROT_PIE = new CustomItem(Material.PUMPKIN_PIE, "&6Carrot Pie");
	
	/*		 Weapons 		*/
	public static final ItemStack GRANDMAS_WALKING_STICK = new CustomItem(Material.STICK, "&7Bastón de la abuela");
	public static final ItemStack GRANDPAS_WALKING_STICK = new CustomItem(Material.STICK, "&7Bastón del abuelo");
	public static final ItemStack SWORD_OF_BEHEADING = new CustomItem(Material.IRON_SWORD, "&6Espada de decapitación", "&7Beheading II", "", "&rTiene la oportunidad de decapitar a los mobs", "&r(incluso una mayor probabilidad de esqueletos de Wither)");
	public static final ItemStack BLADE_OF_VAMPIRES = new CustomItem(Material.GOLDEN_SWORD, "&cEspada vampírica");
	public static final ItemStack SEISMIC_AXE = new CustomItem(Material.IRON_AXE, "&aHacha sísmica", "", "&7&oUn terremoto portable...", "", "&7&eClick Derecho&7 para usar");
	
	static {
		GRANDMAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
		GRANDPAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);
		
		BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
		BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
		BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
	}
	
	/*		Bows		*/
	public static final ItemStack EXPLOSIVE_BOW = new CustomItem(Material.BOW, "&cArco explosivo", "&rCualquier flecha disparada usando este arco", "&rlanzará a los enemigos golpeados al aire");
	public static final ItemStack ICY_BOW = new CustomItem(Material.BOW, "&bArco helado", "&rCualquier flecha disparada usando este arco", "&revitará que los enemigos golpeados se muevan", "&rpor 2 segundos");
	
	/*		 Tools		*/
	public static final ItemStack AUTO_SMELT_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&6Pico de fundición", "&c&lAuto-Smelting", "", "&9Funciona con fortuna");
	public static final ItemStack LUMBER_AXE = new CustomItem(Material.DIAMOND_AXE, "&6Hacha deforástica", "&a&oCorta todo el árbol...");
	public static final ItemStack PICKAXE_OF_CONTAINMENT = new CustomItem(Material.GOLDEN_PICKAXE, "&cPico de contención", "", "&9Te permite picar spawners...");
	public static final ItemStack HERCULES_PICKAXE = new CustomItem(Material.IRON_PICKAXE, "&9Pico de Hércules","", "&rTan poderoso que", "&raplasta todos los minerales extraídos", "&ren polvo...");
	public static final ItemStack EXPLOSIVE_SHOVEL = new CustomItem(Material.DIAMOND_SHOVEL, "&ePala explosiva", "", "&rTe permite minar un poco", "&rde bloques a la vez...");
	public static final ItemStack EXPLOSIVE_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&ePico Explosivo", "", "&rTe permite minar un poco", "&rde bloques a la vez...", "", "&9Funciona con fortuna");
	public static final ItemStack PICKAXE_OF_THE_SEEKER = new CustomItem(Material.DIAMOND_PICKAXE, "&aPico del buscador", "&rSiempre te indicará el mineral más cercano", "&rpero podría dañarse al hacerlo", "", "&7&eClick Derecho&7 ser señalado al mineral más cercano");
	public static final ItemStack COBALT_PICKAXE = new CustomItem(Material.IRON_PICKAXE, "&9Pico de cobalto");
	public static final ItemStack PICKAXE_OF_VEIN_MINING = new CustomItem(Material.DIAMOND_PICKAXE, "&ePico de vetas minerales", "", "&rEste pico se cavará", "&rtoda la veta del mineral...");
	
	static {
		HERCULES_PICKAXE.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
		HERCULES_PICKAXE.addUnsafeEnchantment(Enchantment.DIG_SPEED, 3);
		
		COBALT_PICKAXE.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		COBALT_PICKAXE.addUnsafeEnchantment(Enchantment.DIG_SPEED, 6);
	}
	
	/*		 Armor 		*/
	public static final ItemStack GLOWSTONE_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&e&lCasco de glowstone", "", "&a&o¡Brilla como el sol!", "", "&9+ Visión Nocturna"), Color.YELLOW);
	public static final ItemStack GLOWSTONE_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&e&lPechera de glowstone", "", "&a&o¡Brilla como el sol!", "", "&9+ Visión Nocturna"), Color.YELLOW);
	public static final ItemStack GLOWSTONE_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&e&lPantalones de glowstone", "", "&a&o¡Brilla como el sol!", "", "&9+ Visión Nocturna"), Color.YELLOW);
	public static final ItemStack GLOWSTONE_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&e&lBotas de glowstone", "", "&a&o¡Brilla como el sol!", "", "&9+ Visión Nocturna"), Color.YELLOW);
	
	public static final ItemStack ENDER_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&5&lCasco del ender", "", "&a&o¡A veces está aquí, a veces allá!"), Color.fromRGB(28, 25, 112));
	public static final ItemStack ENDER_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&5&lPechera del ender", "", "&a&o¡A veces está aquí, a veces allá!"), Color.fromRGB(28, 25, 112));
	public static final ItemStack ENDER_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&5&lPantalones del ender", "", "&a&o¡A veces está aquí, a veces allá!"), Color.fromRGB(28, 25, 112));
	public static final ItemStack ENDER_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&5&lBotas del ender", "", "&a&o¡A veces está aquí, a veces allá!", "" , "&9+ No Enderpearl Damage"), Color.fromRGB(28, 25, 112));
	
	public static final ItemStack SLIME_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&a&lCasco de Slime", "", "&a&oSe siente rebotable"), Color.LIME);
	public static final ItemStack SLIME_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&a&lPechera de Slime", "", "&a&oSe siente rebotable"), Color.LIME);
	public static final ItemStack SLIME_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&a&lPantalones de Slime", "", "&a&oSe siente rebotable", "", "&9+ Speed"), Color.LIME);
	public static final ItemStack SLIME_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&a&lBotas de Slime", "", "&a&oSe siente rebotable", "", "&9+ Jump Boost", "&9+ No Fall Damage"), Color.LIME);
	
	public static final ItemStack CACTUS_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&2Casco de cactus"), Color.GREEN);
	public static final ItemStack CACTUS_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&2Pechera de cactus"), Color.GREEN);
	public static final ItemStack CACTUS_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&2Pantalones de cactus"), Color.GREEN);
	public static final ItemStack CACTUS_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&2Botas de cactus"), Color.GREEN);
	
	public static final ItemStack DAMASCUS_STEEL_HELMET = new CustomItem(Material.IRON_HELMET, "&7Casco de Acero damasco");
	public static final ItemStack DAMASCUS_STEEL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&7Pechera de Acero damasco");
	public static final ItemStack DAMASCUS_STEEL_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&7Pantalones de Acero damasco");
	public static final ItemStack DAMASCUS_STEEL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&7Botas de Acero damasco");
	
	public static final ItemStack REINFORCED_ALLOY_HELMET = new CustomItem(Material.IRON_HELMET, "&bCasco reforzado");
	public static final ItemStack REINFORCED_ALLOY_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&bPechera reforzado");
	public static final ItemStack REINFORCED_ALLOY_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&bPantalones reforzado");
	public static final ItemStack REINFORCED_ALLOY_BOOTS = new CustomItem(Material.IRON_BOOTS, "&bBotas reforzado");
	
	public static final ItemStack SCUBA_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&cCasco de buceo", "", "&bTe permite respirar bajo el agua", "&4&oParte de traje de materiales peligrosos"), Color.ORANGE);
	public static final ItemStack HAZMATSUIT_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&cTraje de materiales peligrosos", "", "&bTe permite caminar a través del fuego", "&4&oParte de traje de materiales peligrosos"), Color.ORANGE);
	public static final ItemStack HAZMATSUIT_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&cPantalones del traje de materiales peligrosos", "", "&4&oParte de traje de materiales peligrosos"), Color.ORANGE);
	public static final ItemStack RUBBER_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&cRubber Botas", "", "&4&oParte de traje de materiales peligrosos"), Color.BLACK);
	
	public static final ItemStack GILDED_IRON_HELMET = new CustomItem(Material.GOLDEN_HELMET, "&6Casco de Hierro dorado");
	public static final ItemStack GILDED_IRON_CHESTPLATE = new CustomItem(Material.GOLDEN_CHESTPLATE, "&6Pechera de Hierro dorado");
	public static final ItemStack GILDED_IRON_LEGGINGS = new CustomItem(Material.GOLDEN_LEGGINGS, "&6Pantalones de Hierro dorado");
	public static final ItemStack GILDED_IRON_BOOTS = new CustomItem(Material.GOLDEN_BOOTS, "&6Botas de Hierro dorado");
	
	public static final ItemStack GOLD_HELMET = new CustomItem(Material.GOLDEN_HELMET, "&6Casco de oro puro");
	public static final ItemStack GOLD_CHESTPLATE = new CustomItem(Material.GOLDEN_CHESTPLATE, "&6Pechera de oro puro");
	public static final ItemStack GOLD_LEGGINGS = new CustomItem(Material.GOLDEN_LEGGINGS, "&6Pantalones de oro puro");
	public static final ItemStack GOLD_BOOTS = new CustomItem(Material.GOLDEN_BOOTS, "&6Botas de oro puro");
	
	public static final ItemStack SLIME_HELMET_STEEL = new CustomItem(Material.IRON_HELMET, "&a&lCasco de slime","&7&oReforzado", "", "&a&oSe siente rebotable");
	public static final ItemStack SLIME_CHESTPLATE_STEEL = new CustomItem(Material.IRON_CHESTPLATE, "&a&lPechera de slime", "&7&oReforzado", "", "&a&oSe siente rebotable");
	public static final ItemStack SLIME_LEGGINGS_STEEL = new CustomItem(Material.IRON_LEGGINGS, "&a&lPantalones de slime","&7&oReforzado", "", "&a&oSe siente rebotable", "", "&9+ Speed");
	public static final ItemStack SLIME_BOOTS_STEEL = new CustomItem(Material.IRON_BOOTS, "&a&lBotas de slime", "&7&oReforzado", "", "&a&oSe siente rebotable", "", "&9+ Jump Boost", "&9+ Sin daño de caída");
		
	public static final ItemStack HEAVY_METAL_HELMET = new CustomItem(Material.IRON_HELMET, "&cCasco pesado", "", "&9+ Fuerza", "&9+ Lentitud");
	public static final ItemStack HEAVY_METAL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&cPechera pesada", "", "&9+ Fuerza", "&9+ Lentitud");
	public static final ItemStack HEAVY_METAL_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&cPantalones pesados", "", "&9+ Fuerza", "&9+ Lentitud");
	public static final ItemStack HEAVY_METAL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&cBotas pesadas", "", "&9+ Fuerza", "&9+ Lentitud");

	public static final ItemStack BOOTS_OF_THE_STOMPER = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&bBotas del pisotón", "", "&9Todo el daño de caida que recibes", "&9se aplicará a los mobs/jugadores cercanos", "", "&9+ Sin daño de caída"), Color.AQUA);

	static {
		Map<Enchantment, Integer> cactus = new HashMap<>();
		cactus.put(Enchantment.THORNS, 3);
		cactus.put(Enchantment.DURABILITY, 6);
		
		CACTUS_HELMET.addUnsafeEnchantments(cactus);
		CACTUS_CHESTPLATE.addUnsafeEnchantments(cactus);
		CACTUS_LEGGINGS.addUnsafeEnchantments(cactus);
		CACTUS_BOOTS.addUnsafeEnchantments(cactus);
		
		Map<Enchantment, Integer> damascus = new HashMap<>();
		damascus.put(Enchantment.DURABILITY, 5);
		damascus.put(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		
		DAMASCUS_STEEL_HELMET.addUnsafeEnchantments(damascus);
		DAMASCUS_STEEL_CHESTPLATE.addUnsafeEnchantments(damascus);
		DAMASCUS_STEEL_LEGGINGS.addUnsafeEnchantments(damascus);
		DAMASCUS_STEEL_BOOTS.addUnsafeEnchantments(damascus);
		
		Map<Enchantment, Integer> reinforced = new HashMap<>();
		reinforced.put(Enchantment.DURABILITY, 9);
		reinforced.put(Enchantment.PROTECTION_ENVIRONMENTAL, 9);
		
		REINFORCED_ALLOY_HELMET.addUnsafeEnchantments(reinforced);
		REINFORCED_ALLOY_CHESTPLATE.addUnsafeEnchantments(reinforced);
		REINFORCED_ALLOY_LEGGINGS.addUnsafeEnchantments(reinforced);
		REINFORCED_ALLOY_BOOTS.addUnsafeEnchantments(reinforced);
		
		Map<Enchantment, Integer> gilded = new HashMap<>();
		gilded.put(Enchantment.DURABILITY, 6);
		gilded.put(Enchantment.PROTECTION_ENVIRONMENTAL, 8);
		
		GILDED_IRON_HELMET.addUnsafeEnchantments(gilded);
		GILDED_IRON_CHESTPLATE.addUnsafeEnchantments(gilded);
		GILDED_IRON_LEGGINGS.addUnsafeEnchantments(gilded);
		GILDED_IRON_BOOTS.addUnsafeEnchantments(gilded);
		
		GOLD_HELMET.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		GOLD_CHESTPLATE.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		GOLD_LEGGINGS.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		GOLD_BOOTS.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		
		Map<Enchantment, Integer> slime = new HashMap<>();
		slime.put(Enchantment.DURABILITY, 4);
		slime.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		
		SLIME_HELMET_STEEL.addUnsafeEnchantments(slime);
		SLIME_CHESTPLATE_STEEL.addUnsafeEnchantments(slime);
		SLIME_LEGGINGS_STEEL.addUnsafeEnchantments(slime);
		SLIME_BOOTS_STEEL.addUnsafeEnchantments(slime);
		
		Map<Enchantment, Integer> heavy = new HashMap<>();
		heavy.put(Enchantment.DURABILITY, 10);
		heavy.put(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
		
		HEAVY_METAL_HELMET.addUnsafeEnchantments(heavy);
		HEAVY_METAL_CHESTPLATE.addUnsafeEnchantments(heavy);
		HEAVY_METAL_LEGGINGS.addUnsafeEnchantments(heavy);
		HEAVY_METAL_BOOTS.addUnsafeEnchantments(heavy);
	}

/*		 Misc 		*/
	public static final ItemStack MAGIC_LUMP_1 = new CustomItem(Material.GOLD_NUGGET, "&6Bulto magico &7- &eI", "", "&c&oNivel: I");
	public static final ItemStack MAGIC_LUMP_2 = new CustomItem(Material.GOLD_NUGGET, "&6Bulto magico &7- &eII", "", "&c&oNivel: II");
	public static final ItemStack MAGIC_LUMP_3 = new CustomItem(Material.GOLD_NUGGET, "&6Bulto magico &7- &eIII", "", "&c&oNivel: III");
	public static final ItemStack ENDER_LUMP_1 = new CustomItem(Material.GOLD_NUGGET, "&5Bulto de ender &7- &eI", "", "&c&oNivel: I");
	public static final ItemStack ENDER_LUMP_2 = new CustomItem(Material.GOLD_NUGGET, "&5Bulto de ender &7- &eII", "", "&c&oNivel: II");
	public static final ItemStack ENDER_LUMP_3 = new CustomItem(Material.GOLD_NUGGET, "&5Bulto de ender &7- &eIII", "", "&c&oNivel: III");
	public static final ItemStack MAGICAL_BOOK_COVER = new CustomItem(Material.PAPER, "&6Portada magica", "", "&a&oUsada para varios libros mágicos");
	public static final ItemStack BASIC_CIRCUIT_BOARD = new CustomItem(Material.ACTIVATOR_RAIL, "&bTabla de circuitos basica");
	public static final ItemStack ADVANCED_CIRCUIT_BOARD = new CustomItem(Material.POWERED_RAIL, "&bTabla de circuitos avanzada");
	public static final ItemStack WHEAT_FLOUR = new CustomItem(Material.SUGAR, "&rHarina de trigo");
	public static final ItemStack STEEL_PLATE = new InsanityItem(Material.PAPER, "&7&lPlaca de acero",1);
	public static final ItemStack BATTERY = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmUyZGRhNmVmNjE4NWQ0ZGQ2ZWE4Njg0ZTk3ZDM5YmE4YWIwMzdlMjVmNzVjZGVhNmJkMjlkZjhlYjM0ZWUifX19"), "&6Batería");
	public static final ItemStack CARBON = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGIzYTA5NWI2YjgxZTZiOTg1M2ExOTMyNGVlZGYwYmI5MzQ5NDE3MjU4ZGQxNzNiOGVmZjg3YTA4N2FhIn19fQ=="), "&eCarbono");
	public static final ItemStack COMPRESSED_CARBON = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0="), "&cCarbono comprimido");
	public static final ItemStack CARBON_CHUNK = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0="), "&4Trozo de carbono");
	public static final ItemStack STEEL_THRUSTER = new CustomItem(Material.BUCKET, "&7&lPropulsor de acero");
	public static final ItemStack POWER_CRYSTAL = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTNjMWIwMzZiNmUwMzUxN2IyODVhODExYmQ4NWU3M2Y1YWJmZGFjYzFkZGY5MGRmZjk2MmUxODA5MzRlMyJ9fX0="), "&c&lCristal de poder");
	public static final ItemStack CHAIN = new InsanityItem(Material.STRING, "&bCadena",1);
	public static final ItemStack HOOK = new InsanityItem(Material.FLINT, "&bGancho",1);
	public static final ItemStack SIFTED_ORE = new CustomItem(Material.GUNPOWDER, "&6Mineral tamizado");
	public static final ItemStack STONE_CHUNK = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U4ZjVhZGIxNGQ2YzlmNmI4MTBkMDI3NTQzZjFhOGMxZjQxN2UyZmVkOTkzYzk3YmNkODljNzRmNWUyZTgifX19"), "&6Trozo de piedra");
	public static final ItemStack LAVA_CRYSTAL = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTNhZDhlZTg0OWVkZjA0ZWQ5YTI2Y2EzMzQxZjYwMzNiZDc2ZGNjNDIzMWVkMWVhNjNiNzU2NTc1MWIyN2FjIn19fQ=="), "&4Cristal de lava");
	public static final ItemStack SALT = new CustomItem(Material.SUGAR, "&rSal");
	public static final ItemStack CHEESE = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzRmZWJiYzE1ZDFkNGNjNjJiZWRjNWQ3YTJiNmYwZjQ2Y2Q1YjA2OTZhODg0ZGU3NWUyODllMzVjYmI1M2EwIn19fQ=="), "&rQueso");
	public static final ItemStack BUTTER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY2YjE5ZjdkNjM1ZDAzNDczODkxZGYzMzAxN2M1NDkzNjMyMDlhOGY2MzI4YTg1NDJjMjEzZDA4NTI1ZSJ9fX0="), "&rMantequilla");
	public static final ItemStack DUCT_TAPE = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjJmYWFjZWFiNjM4NGZmZjVlZDI0YmI0NGE0YWYyZjU4NGViMTM4MjcyOWVjZDkzYTUzNjlhY2ZkNjY1NCJ9fX0="), "&8Cinta adhesiva", "", "&rPuede reparar los artículos utilizando esto", "&ren un auto-yunque");
	public static final ItemStack HEAVY_CREAM = new CustomItem(Material.SNOWBALL, "&rCrema espesa");
	public static final ItemStack CRUSHED_ORE = new CustomItem(Material.GUNPOWDER, "&6Mineral aplastado");
	public static final ItemStack PULVERIZED_ORE = new CustomItem(Material.GUNPOWDER, "&6Mineral pulverizado");
	public static final ItemStack PURE_ORE_CLUSTER = new CustomItem(Material.GUNPOWDER, "&6Pedazo de mineral puro");
	public static final ItemStack SMALL_URANIUM = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&cPequeño trozo de Uranium", "", "&eNivel de radiación: MODERADO", "&4&oTraje de materiales peligrosos requerido");
	public static final ItemStack TINY_URANIUM = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&cPequeña pila de Uranium", "", "&cNivel de radiación: LOW", "&4&oTraje de materiales peligrosos sin requerir");

	public static final ItemStack MAGNET = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&cMagneto");
	public static final ItemStack NECROTIC_SKULL = new CustomItem(Material.WITHER_SKELETON_SKULL, "&cCabeza necrótica");
	public static final ItemStack ESSENCE_OF_AFTERLIFE = new CustomItem(Material.GUNPOWDER, "&4Escencia de la próxima vida");
	public static final ItemStack ELECTRO_MAGNET = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&cElectromagneto");
	public static final ItemStack HEATING_COIL = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2UzYmM0ODkzYmE0MWEzZjczZWUyODE3NGNkZjRmZWY2YjE0NWU0MWZlNmM4MmNiN2JlOGQ4ZTk3NzFhNSJ9fX0="), "&cBobina de calentamiento");
	public static final ItemStack COOLING_UNIT = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzU0YmFkODZjOTlkZjc4MGM4ODlhMTA5OGY3NzY0OGVhZDczODVjYzFkZGIwOTNkYTVhN2Q4YzRjMmFlNTRkIn19fQ=="), "&bUnidad de enfriamiento");
	public static final ItemStack ELECTRIC_MOTOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ=="), "&cMotor eléctrico");
	public static final ItemStack CARGO_MOTOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ=="), "&3Motor de carga");
	public static final ItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new CustomItem(Material.PAPER, "&6Pergamino de teletransportación dimensional", "", "&cEste pergamino es capaz", "&c de crear un vacio temporal", "&cenviando a las entidades cercanas", "&ca otra dimensión lejana", "&cdonde todo se vuelve lo contrario", "", "&rEn otras palabras: Hace que las entidades cambien su vista");
	public static final ItemStack TOME_OF_KNOWLEDGE_SHARING = new CustomItem(Material.BOOK, "&6Tomo de la sabiduria", "&7Dueño: &bNinguno", "", "&eClick Derecho&7 para vincularte a este tomo", "", "", "&eClick Derecho&7 para obtener todos los conocimientos de", "&7el dueño anterior");
	public static final ItemStack HARDENED_GLASS = new CustomItem(Material.LIGHT_GRAY_STAINED_GLASS, "&7Cristal", "", "&rResistente a explosiones");
	public static final ItemStack WITHER_PROOF_OBSIDIAN = new CustomItem(Material.OBSIDIAN, "&5Obsidiana contra withers", "", "&rResistente a explosiones", "&rResistente a explosiones de wither");
	public static final ItemStack WITHER_PROOF_GLASS = new CustomItem(Material.PURPLE_STAINED_GLASS, "&5Cristal contra withers", "", "&rResistente a explosiones", "&rResistente a explosiones de wither");
	public static final ItemStack REINFORCED_PLATE = new InsanityItem(Material.PAPER, "&7Placa reforzada",3);
	public static final ItemStack ANCIENT_PEDESTAL = new CustomItem(Material.DISPENSER, "&dPedestal ancestral", "", "&5Parte del altar antiguo");
	public static final ItemStack ANCIENT_ALTAR = new CustomItem(Material.ENCHANTING_TABLE, "&dAltar antiguo", "", "&5Bloque para el", "&5proceso de crafteos magicos");
	public static final ItemStack COPPER_WIRE = new InsanityItem(Material.STRING, "&6Alambre de cobre", 2, "", "&6Componente crucial en módulos eléctricos.");

	public static final ItemStack RAINBOW_WOOL = new CustomItem(Material.WHITE_WOOL, "&5Lana arcoíris", "", "&d¡Cambia de colores infinitamente!");
	public static final ItemStack RAINBOW_GLASS = new CustomItem(Material.WHITE_STAINED_GLASS, "&5Cristal arcoíris", "", "&d¡Cambia de colores infinitamente!");
	public static final ItemStack RAINBOW_CLAY = new CustomItem(Material.WHITE_TERRACOTTA, "&5Arcilla arcoíris", "", "&d¡Cambia de colores infinitamente!");
	public static final ItemStack RAINBOW_GLASS_PANE = new CustomItem(Material.WHITE_STAINED_GLASS_PANE, "&5Panel de cristal arcoíris", "", "&d¡Cambia de colores infinitamente!");
	
	public static final ItemStack RAINBOW_WOOL_XMAS = new CustomItem(Material.WHITE_WOOL, "&5Lana arcoíris &7(Navidad)", "", Christmas.color("< Edición Navidad >"));
	public static final ItemStack RAINBOW_GLASS_XMAS = new CustomItem(Material.WHITE_STAINED_GLASS, "&5Cristal arcoíris &7(Navidad)", "", Christmas.color("< Edición Navidad >"));
	public static final ItemStack RAINBOW_CLAY_XMAS = new CustomItem(Material.WHITE_TERRACOTTA, "&5Arcilla arcoíris &7(Navidad)", "", Christmas.color("< Edición Navidad >"));
	public static final ItemStack RAINBOW_GLASS_PANE_XMAS = new CustomItem(Material.WHITE_STAINED_GLASS_PANE, "&5Panel de cristal arcoíris &7(Navidad)", "", Christmas.color("< Edición Navidad >"));
	
	public static final ItemStack RAINBOW_WOOL_VALENTINE = new CustomItem(Material.PINK_WOOL, "&5Lana arcoíris &7(Día de San Valentín)", "", "&d< Edición Día de San Valentín >");
	public static final ItemStack RAINBOW_GLASS_VALENTINE = new CustomItem(Material.PINK_STAINED_GLASS, "&5Cristal arcoíris &7(Día de San Valentín)", "", "&d< Edición Día de San Valentín >");
	public static final ItemStack RAINBOW_CLAY_VALENTINE = new CustomItem(Material.PINK_TERRACOTTA, "&5Arcilla arcoíris &7(Día de San Valentín)", "", "&d< Edición Día de San Valentín >");
	public static final ItemStack RAINBOW_GLASS_PANE_VALENTINE = new CustomItem(Material.PINK_STAINED_GLASS_PANE, "&5Panel de cristal arcoíris &7(Día de San Valentín)", "", "&d< Edición Día de San Valentín >");
    
	/*		 Ingots 		*/
	public static final ItemStack COPPER_INGOT = new InsanityItem(Material.BRICK, "&bLingote de Cobre",3);
	public static final ItemStack TIN_INGOT = new InsanityItem(Material.IRON_INGOT, "&bLingote de Estaño",5);
	public static final ItemStack SILVER_INGOT = new InsanityItem(Material.IRON_INGOT, "&bLingote de Plata",6);
	public static final ItemStack ALUMINUM_INGOT = new InsanityItem(Material.IRON_INGOT, "&bLingote de Aluminio",7);
	public static final ItemStack LEAD_INGOT = new InsanityItem(Material.IRON_INGOT, "&bLingote de Plomo",8);
	public static final ItemStack ZINC_INGOT = new InsanityItem(Material.IRON_INGOT, "&bLingote de Zinc",9);
	public static final ItemStack MAGNESIUM_INGOT = new InsanityItem(Material.IRON_INGOT, "&bLingote de Magnesio",10);
	
	/*		Alloy (Carbon + Iron)	*/
	public static final ItemStack STEEL_INGOT = new InsanityItem(Material.IRON_INGOT, "&bLingote de Acero", 1);
	/*		Alloy (Copper + Tin)	*/
	public static final ItemStack BRONZE_INGOT = new InsanityItem(Material.BRICK, "&bLingote de Bronce", 2);
	/*		Alloy (Copper + Aluminum)	*/
	public static final ItemStack DURALUMIN_INGOT = new InsanityItem(Material.IRON_INGOT, "&bLingote de Duralumínio",3);
	/*		Alloy (Copper + Silver)	*/
	public static final ItemStack BILLON_INGOT = new InsanityItem(Material.IRON_INGOT, "&bLingote de Vellón",4);
	/*		Alloy (Copper + Zinc)	*/
	public static final ItemStack BRASS_INGOT = new InsanityItem(Material.GOLD_INGOT, "&bLingote de Latón",5);
	/*		Alloy (Aluminum + Brass)	*/
	public static final ItemStack ALUMINUM_BRASS_INGOT = new InsanityItem(Material.GOLD_INGOT, "&bLingote de latón de aluminio",6);
	/*		Alloy (Aluminum + Bronze)	*/
	public static final ItemStack ALUMINUM_BRONZE_INGOT = new InsanityItem(Material.GOLD_INGOT, "&bLingote De Aluminio/Bronce",7);
	/*		Alloy (Gold + Silver + Copper)	*/
	public static final ItemStack CORINTHIAN_BRONZE_INGOT = new InsanityItem(Material.GOLD_INGOT, "&bLingote de bronce corintico",8);
	/*		Alloy (Lead + Tin)	*/
	public static final ItemStack SOLDER_INGOT = new InsanityItem(Material.IRON_INGOT, "&bLingote de soldadura",11);
	/*		Alloy (Steel + Iron + Carbon)	*/
	public static final ItemStack DAMASCUS_STEEL_INGOT = new InsanityItem(Material.IRON_INGOT, "&bLingote de acero damasco", 2);
	/*		Alloy (Damascus Steel + Duralumin + Compressed Carbon + Aluminium Bronze)	*/
	public static final ItemStack HARDENED_METAL_INGOT = new InsanityItem(Material.IRON_INGOT, "&b&lMetal endurecido",12);
	/*		Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + Damascus Steel)	*/
	public static final ItemStack REINFORCED_ALLOY_INGOT = new InsanityItem(Material.IRON_INGOT, "&b&lAleación metal reforzada",13);
	/*		Alloy (Iron + Silicon)		*/
	public static final ItemStack FERROSILICON = new InsanityItem(Material.IRON_INGOT, "&bFerrosilicón",14);
	/*		Alloy (Iron + Gold)			*/
	public static final ItemStack GILDED_IRON = new InsanityItem(Material.GOLD_INGOT, "&6&lHierro dorado",9);
	/*		Alloy (Redston + Ferrosilicon)	*/
	public static final ItemStack REDSTONE_ALLOY = new InsanityItem(Material.BRICK, "&cLingote de Aleación de Redstone",4);
	/*		Alloy (Iron + Copper)		*/
	public static final ItemStack NICKEL_INGOT = new InsanityItem(Material.IRON_INGOT, "&bLingote de níquel",15);
	/*		Alloy (Nickel + Iron + Copper)		*/
	public static final ItemStack COBALT_INGOT = new InsanityItem(Material.IRON_INGOT, "&9Lingote de cobalto",16);
	
	/*		Gold		*/
	public static final ItemStack GOLD_4K = new CustomItem(Material.GOLD_INGOT, "&rLingote de Oro &7(4-Quilates)");
	public static final ItemStack GOLD_6K = new CustomItem(Material.GOLD_INGOT, "&rLingote de Oro &7(6-Quilates)");
	public static final ItemStack GOLD_8K = new CustomItem(Material.GOLD_INGOT, "&rLingote de Oro &7(8-Quilates)");
	public static final ItemStack GOLD_10K = new CustomItem(Material.GOLD_INGOT, "&rLingote de Oro &7(10-Quilates)");
	public static final ItemStack GOLD_12K = new CustomItem(Material.GOLD_INGOT, "&rLingote de Oro &7(12-Quilates)");
	public static final ItemStack GOLD_14K = new CustomItem(Material.GOLD_INGOT, "&rLingote de Oro &7(14-Quilates)");
	public static final ItemStack GOLD_16K = new CustomItem(Material.GOLD_INGOT, "&rLingote de Oro &7(16-Quilates)");
	public static final ItemStack GOLD_18K = new CustomItem(Material.GOLD_INGOT, "&rLingote de Oro &7(18-Quilates)");
	public static final ItemStack GOLD_20K = new CustomItem(Material.GOLD_INGOT, "&rLingote de Oro &7(20-Quilates)");
	public static final ItemStack GOLD_22K = new CustomItem(Material.GOLD_INGOT, "&rLingote de Oro &7(22-Quilates)");
	public static final ItemStack GOLD_24K = new CustomItem(Material.GOLD_INGOT, "&rLingote de Oro &7(24-Quilates)");
	
	/*		 Dusts 		*/
	public static final ItemStack IRON_DUST = new InsanityItem(Material.GUNPOWDER, "&6Polvo de Hierro",1);
	public static final ItemStack GOLD_DUST = new InsanityItem(Material.GLOWSTONE_DUST, "&6Polvo de Oro",1);
	public static final ItemStack TIN_DUST = new InsanityItem(Material.SUGAR, "&6Polvo de Estaño",1);
	public static final ItemStack COPPER_DUST = new InsanityItem(Material.GLOWSTONE_DUST, "&6Polvo de Cobre",2);
	public static final ItemStack SILVER_DUST = new InsanityItem(Material.SUGAR, "&6Polvo de Plata",2);
	public static final ItemStack ALUMINUM_DUST = new InsanityItem(Material.SUGAR, "&6Polvo de Aluminio",3);
	public static final ItemStack LEAD_DUST = new InsanityItem(Material.GUNPOWDER, "&6Polvo de Plomo",2);
	public static final ItemStack SULFATE = new InsanityItem(Material.GLOWSTONE_DUST, "&6Sulfato",3);
	public static final ItemStack ZINC_DUST = new InsanityItem(Material.SUGAR, "&6Polvo de Zinc",4);
	public static final ItemStack MAGNESIUM_DUST = new InsanityItem(Material.SUGAR, "&6Polvo de Magnesio",5);
	public static final ItemStack SILICON = new CustomItem(Material.FIREWORK_STAR, "&6Silicón");
	public static final ItemStack GOLD_24K_BLOCK = new CustomItem(Material.GOLD_BLOCK, "&rBloque de Oro &7(24-Quilates)");
	
	/*		 Gems 		*/
	public static final ItemStack SYNTHETIC_DIAMOND = new CustomItem(Material.DIAMOND, "&bDiamante sintético");
	public static final ItemStack SYNTHETIC_EMERALD = new CustomItem(Material.EMERALD, "&bEsmeralda sintética");
	public static final ItemStack SYNTHETIC_SAPPHIRE = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTM1MDMyZjRkN2QwMWRlOGVjOTlkODlmODcyMzAxMmQ0ZTc0ZmE3MzAyMmM0ZmFjZjFiNTdjN2ZmNmZmMCJ9fX0="), "&bZafiro sintético");
	public static final ItemStack CARBONADO = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTJmNGIxNTc3ZjUxNjBjNjg5MzE3MjU3MWM0YTcxZDhiMzIxY2RjZWFhMDMyYzZlMGUzYjYwZTBiMzI4ZmEifX19"), "&b&lCarbonado", "", "&7&o\"Diamante negro\"");
	public static final ItemStack RAW_CARBONADO = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWI0OWU2ZWMxMDc3MWU4OTkyMjVhZWE3M2NkOGNmMDM2ODRmNDExZDE0MTVjNzMyM2M5M2NiOTQ3NjIzMCJ9fX0="), "&bCarbonado crudo");
	
	public static final ItemStack URANIUM = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&4Uranium", "", "&2Nivel de radiación: ALTO", "&4&oTraje de materiales peligrosos requerido");
	public static final ItemStack NEPTUNIUM = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGVkZWE2YmZkMzdlNDlkZTQzZjE1NGZlNmZjYTYxN2Q0MTI5ZTYxYjk1NzU5YTNkNDlhMTU5MzVhMWMyZGNmMCJ9fX0="), "&aNeptunium", "", "&2Nivel de radiación: ALTO", "&4&oTraje de materiales peligrosos requerido");
	public static final ItemStack PLUTONIUM = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjVjZjkxYjczODg2NjVhNmQ3YzFiNjAyNmJkYjIzMjJjNmQyNzg5OTdhNDQ0Nzg2NzdjYmNjMTVmNzYxMjRmIn19fQ=="), "&7Plutonium", "", "&2Nivel de radiación: ALTO", "&4&oTraje de materiales peligrosos requerido");
	public static final ItemStack BOOSTED_URANIUM = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjgzN2NhMTJmMjIyZjQ3ODcxOTZhMTdiOGFiNjU2OTg1Zjg0MDRjNTA3NjdhZGJjYjZlN2YxNDI1NGZlZSJ9fX0="), "&2Uranio potenciado", "", "&2Nivel de radiación: ALTO", "&4&oTraje de materiales peligrosos requerido");
	
	/*		Talisman		*/
	public static final ItemStack TALISMAN = new CustomItem(Material.EMERALD, "&6Talismanes comunes");
	public static final ItemStack TALISMAN_ANVIL = new CustomItem(Material.EMERALD, "&aTalismán del Yunque", "", "&rEl talismán previene que", "&r1 herramienta se rompa, pero este será", "&rconsumida.", "", "&4&lAdvertencia:", "&4Este talismán no funcionará en", "&4herramientas muy poderosas", "&4Por su complejidad.");
	public static final ItemStack TALISMAN_MINER = new CustomItem(Material.EMERALD, "&aTalismán del Minero", "", "&rMientras tenga este Talismán", "&ren tu inventario tendrá un", "&rchance del 20% de duplicar", "&rtodos los ores que tu piques.");
	public static final ItemStack TALISMAN_HUNTER = new CustomItem(Material.EMERALD, "&aTalismán del Cazador", "", "&rMientras tenga este Talismán", "&ren tu inventario tendrá un", "&rchance del 20% de duplicar", "&rlos drops de los mobs asesinados.");
	public static final ItemStack TALISMAN_LAVA = new CustomItem(Material.EMERALD, "&aTalismán del Caminante de fuego", "", "&rMientras tenga este Talismán", "&ren tu inventario obtendrá", "&rresistencia contra el fuego", "&rapenas toques la lava");
	public static final ItemStack TALISMAN_WATER = new CustomItem(Material.EMERALD, "&aTalismán del Buceador", "", "&rMientras tenga este Talismán", "&ren tu inventario obtendrá", "&rla habilidad de respirar bajo", "&rel agua cuando empieces", "&rahogarte.");
	public static final ItemStack TALISMAN_ANGEL = new CustomItem(Material.EMERALD, "&aTalismán del Angel", "", "&rMientras tenga este Talismán", "&ren tu inventario tendrá un", "&rchance del 75% de evitar el", "&rdaño por caída.");
	public static final ItemStack TALISMAN_FIRE = new CustomItem(Material.EMERALD, "&aTalismán del Bombero", "", "&rMientras tenga este Talismán", "&ren tu inventario obtendrá", "&rresistencia contra el fuego", "&rapenas empieces a quemarte");
	public static final ItemStack TALISMAN_MAGICIAN = new CustomItem(Material.EMERALD, "&aTalismán del Mago", "", "&rMientras tenga este Talismán", "&ren tu inventario obtendrá", "&run chance del 80% de suerte al encantar", "&rA veces obtendrás un encantamiento extra");
	public static final ItemStack TALISMAN_TRAVELLER = new CustomItem(Material.EMERALD, "&aTalismán del Viajero", "", "&rMientras tenga este Talismán", "&ren tu inventario obtendrá", "&run chance del 60% por un decent", "&rBuff de velocidad al comenzar a correr");
	public static final ItemStack TALISMAN_WARRIOR = new CustomItem(Material.EMERALD, "&aTalismán del Guerrero", "", "&rMientras tenga este Talismán", "&ren tu inventario obtendrá", "&rFuerza III cada vez que seas golpeado", "&rpero luego será consumido.");
	public static final ItemStack TALISMAN_KNIGHT = new CustomItem(Material.EMERALD, "&aTalismán del Caballero", "", "&rMientras tenga este Talismán", "&ren tu inventario tendrá la probabilidad del", "&r30% para obtener 5 segundos de regeneración", "&rcuando seas golpeado");
	public static final ItemStack TALISMAN_WHIRLWIND = new CustomItem(Material.EMERALD, "&aTalismán del Torbellino", "", "&rMientras tenga este Talismán", "&ren tu inventario tendrá la probabilidad del", "&r60% de reflejar todos los proyectiles");
	public static final ItemStack TALISMAN_WIZARD = new CustomItem(Material.EMERALD, "&aTalismán del Hechicero", "", "&rMientras tenga este Talismán", "&ren tu inventario permitirá", "&robtener Fortuna de nivel 4/5 sin embargo", "&rTambién tiene la posibilidad de bajar el", "&rnivel de algunos encantamientos en tu item.");
	
	/*		Staves		*/
public static final ItemStack STAFF_ELEMENTAL = new CustomItem(Material.STICK, "&6Cetro Elemental");
public static final ItemStack STAFF_WIND = new CustomItem(Material.STICK, "&6Cetro Elemental &7- &b&oViento", "", "&7Elemento: &b&oViento", "", "&7&eClick Derecho&7 para lanzarse hacia adelante");
public static final ItemStack STAFF_FIRE = new CustomItem(Material.STICK, "&6Cetro Elemental &7- &c&oFuego", "", "&7Elemento: &c&oFuego");
public static final ItemStack STAFF_WATER = new CustomItem(Material.STICK, "&6Cetro Elemental &7- &1&oAgua", "", "&7Elemento: &1&oAgua", "", "&7&eClick Derecho&7 para extinguirte");
	public static final ItemStack STAFF_STORM = new CustomItem(Material.STICK, "&6Cetro Elemental &7- &8&oTormenta", "",
		"&7Elemento: &8&oTormenta", "", "&eClick Derecho&7 para invocar un rayo",
		"&e" + StormStaff.MAX_USES + " Usos &7restantes");
	
	static {
		STAFF_WIND.addUnsafeEnchantment(Enchantment.LUCK, 1);
		STAFF_FIRE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);
		STAFF_WATER.addUnsafeEnchantment(Enchantment.WATER_WORKER, 1);
		STAFF_STORM.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
	}
	
	/*		 Machines 		*/
	public static final ItemStack GRIND_STONE = new CustomItem(Material.DISPENSER, "&bPiedra de amolar", "", "&a&oMuela los artículos para una mayor eficiencia");
	public static final ItemStack ARMOR_FORGE = new CustomItem(Material.ANVIL, "&6Forja de armadura", "", "&a&oTe da la habilidad de crear una armadura poderosa.");
	public static final ItemStack SMELTERY = new CustomItem(Material.FURNACE, "&6Fundición", "", "&a&oActúa como un horno de alta temperatura para metales.");
	public static final ItemStack IGNITION_CHAMBER = new CustomItem(Material.HOPPER, "&4Cámara de encendido automático", "&rEvita que la Fundición consuma el fuego.", "&rRequiere pedernal y acero.", "&rDebe colocarse adyacente al dispensador de la fundición");
	public static final ItemStack ORE_CRUSHER = new CustomItem(Material.DISPENSER, "&bTrituradora de minerales", "", "&a&oMachacan los minerales para duplicarlos");
	public static final ItemStack COMPRESSOR = new CustomItem(Material.PISTON, "&bCompresor", "", "&a&oComprime items");
	public static final ItemStack PRESSURE_CHAMBER = new CustomItem(Material.GLASS, "&bCámara de presión", "", "&a&oComprime los artículos aún más");
	public static final ItemStack MAGIC_WORKBENCH = new CustomItem(Material.CRAFTING_TABLE, "&6Mesa de trabajo mágica", "Infunde artículos con energía mágica.");
	public static final ItemStack ORE_WASHER = new CustomItem(Material.CAULDRON, "&6Lavadora de minerales", "", "&a&oLava el mineral tamizado para filtrar los minerales", "&a&oy te da pequeños trozos de piedra");
	public static final ItemStack TABLE_SAW = new CustomItem(Material.STONECUTTER, "&6Tabla de Aserradero", "", "&a&oLe permite obtener 8 tablones de 1 tronco de madera.", "&a&o(Works with all log types)");
	public static final ItemStack SAW_MILL = new CustomItem(Material.IRON_BARS, "&6Aserradero", "", "&a&oObsoleto! ¡Mejor usa la tabla de aserradero!");
	public static final ItemStack COMPOSTER = new CustomItem(Material.CAULDRON, "&aCompostador", "", "&a&oPuede convertir varios materiales a lo largo del tiempo ...");
	public static final ItemStack ENHANCED_CRAFTING_TABLE = new CustomItem(Material.CRAFTING_TABLE, "&eMesa de crafteo mejorada", "", "&a&oUna mesa de crafteo regular no puede", "&a&omantener esta cantidad de poder...");
	public static final ItemStack CRUCIBLE = new CustomItem(Material.CAULDRON, "&cCrisol", "", "&a&oSe utiliza para fundir artículos en líquidos.");
	public static final ItemStack JUICER = new CustomItem(Material.GLASS_BOTTLE, "&aExprimidor", "", "&a&oTe permite crear jugos deliciosos.");
	
	public static final ItemStack SOLAR_PANEL = new CustomItem(Material.DAYLIGHT_DETECTOR, "&bPanel solar", "", "&a&oTransforma la luz solar en energía");
	public static final ItemStack SOLAR_ARRAY = new CustomItem(Material.DAYLIGHT_DETECTOR, "&bMatriz solar", "", "&a&oTransforma la luz solar en energía");
	
	@Deprecated
	public static final ItemStack DIGITAL_MINER = new CustomItem(Material.IRON_PICKAXE, "&bQuarry digital", "", "&a&o¡Lo mina todo!");
	
	@Deprecated
	public static final ItemStack ADVANCED_DIGITAL_MINER = new CustomItem(Material.DIAMOND_PICKAXE, "&6Quarry digital avanzado", "", "&a&o¡Lo mina todo!", "&a&oDuplica automáticamente tus minerales");
	
	public static final ItemStack AUTOMATED_PANNING_MACHINE = new CustomItem(Material.BOWL, "&aPaneo automatizada", "", "&a&oUna versión MultiBlock de la charola de oro");
	public static final ItemStack OUTPUT_CHEST = new CustomItem(Material.CHEST, "&4Cofre de salida", "", "&c&oUna máquina básica tratará de ingresar", "&c&olos items si el cofre está de forma", "&c&oadyacente al dispenser.");
	public static final ItemStack HOLOGRAM_PROJECTOR = new CustomItem(Material.QUARTZ_SLAB, "&bProyector holografico", "", "&rProyecta un holograma editable");

	/*		 Enhanced Furnaces 		*/
	public static final ItemStack ENHANCED_FURNACE = new CustomItem(Material.FURNACE, "&7Horno mejorado - &eI", "", "&7Velocidad de proceso: &e1x", "&7Eficiencia del combustible: &e1x", "&7Multiplicador: &e1x");
	public static final ItemStack ENHANCED_FURNACE_2 = new CustomItem(Material.FURNACE, "&7Horno mejorado - &eII", "", "&7Velocidad de proceso: &e2x", "&7Eficiencia del combustible: &e1x", "&7Multiplicador: &e1x");
	public static final ItemStack ENHANCED_FURNACE_3 = new CustomItem(Material.FURNACE, "&7Horno mejorado - &eIII", "", "&7Velocidad de proceso: &e2x", "&7Eficiencia del combustible: &e2x", "&7Multiplicador: &e1x");
	public static final ItemStack ENHANCED_FURNACE_4 = new CustomItem(Material.FURNACE, "&7Horno mejorado - &eIV", "", "&7Velocidad de proceso: &e3x", "&7Eficiencia del combustible: &e2x", "&7Multiplicador: &e1x");
	public static final ItemStack ENHANCED_FURNACE_5 = new CustomItem(Material.FURNACE, "&7Horno mejorado - &eV", "", "&7Velocidad de proceso: &e3x", "&7Eficiencia del combustible: &e2x", "&7Multiplicador: &e2x");
	public static final ItemStack ENHANCED_FURNACE_6 = new CustomItem(Material.FURNACE, "&7Horno mejorado - &eVI", "", "&7Velocidad de proceso: &e3x", "&7Eficiencia del combustible: &e3x", "&7Multiplicador: &e2x");
	public static final ItemStack ENHANCED_FURNACE_7 = new CustomItem(Material.FURNACE, "&7Horno mejorado - &eVII", "", "&7Velocidad de proceso: &e4x", "&7Eficiencia del combustible: &e3x", "&7Multiplicador: &e2x");
	public static final ItemStack ENHANCED_FURNACE_8 = new CustomItem(Material.FURNACE, "&7Horno mejorado - &eVIII", "", "&7Velocidad de proceso: &e4x", "&7Eficiencia del combustible: &e4x", "&7Multiplicador: &e2x");
	public static final ItemStack ENHANCED_FURNACE_9 = new CustomItem(Material.FURNACE, "&7Horno mejorado - &eIX", "", "&7Velocidad de proceso: &e5x", "&7Eficiencia del combustible: &e4x", "&7Multiplicador: &e2x");
	public static final ItemStack ENHANCED_FURNACE_10 = new CustomItem(Material.FURNACE, "&7Horno mejorado - &eX", "", "&7Velocidad de proceso: &e5x", "&7Eficiencia del combustible: &e5x", "&7Multiplicador: &e2x");
	public static final ItemStack ENHANCED_FURNACE_11 = new CustomItem(Material.FURNACE, "&7Horno mejorado - &eXI", "", "&7Velocidad de proceso: &e5x", "&7Eficiencia del combustible: &e5x", "&7Multiplicador: &e3x");
	public static final ItemStack REINFORCED_FURNACE = new CustomItem(Material.FURNACE, "&7Horno Reforzado", "", "&7Velocidad de proceso: &e10x", "&7Eficiencia del combustible: &e10x", "&7Multiplicador: &e3x");
	public static final ItemStack CARBONADO_EDGED_FURNACE = new CustomItem(Material.FURNACE, "&7Horno de filo carbonado", "", "&7Velocidad de proceso: &e20x", "&7Eficiencia del combustible: &e10x", "&7Multiplicador: &e3x");
	
	public static final ItemStack BLOCK_PLACER = new CustomItem(Material.DISPENSER, "&aColocador de bloques", "", "&rTodos los bloques en este dispensador", "&rse colocará automáticamente");
	
	/*		Soulbound Items		*/
	public static final ItemStack SOULBOUND_SWORD = new CustomItem(Material.DIAMOND_SWORD, "&cEspada unión de almas");
	public static final ItemStack SOULBOUND_BOW = new CustomItem(Material.BOW, "&cArco unión de almas");
	public static final ItemStack SOULBOUND_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&cPico unión de almas");
	public static final ItemStack SOULBOUND_AXE = new CustomItem(Material.DIAMOND_AXE, "&cHacha unión de almas");
	public static final ItemStack SOULBOUND_SHOVEL = new CustomItem(Material.DIAMOND_SHOVEL, "&cpala unión de almas");
	public static final ItemStack SOULBOUND_HOE = new CustomItem(Material.DIAMOND_HOE, "&cAzada unión de almas");
	
	public static final ItemStack SOULBOUND_HELMET = new CustomItem(Material.DIAMOND_HELMET, "&cCasco unión de almas");
	public static final ItemStack SOULBOUND_CHESTPLATE = new CustomItem(Material.DIAMOND_CHESTPLATE, "&cPechera unión de almas");
	public static final ItemStack SOULBOUND_LEGGINGS = new CustomItem(Material.DIAMOND_LEGGINGS, "&cPantalones unión de almas");
	public static final ItemStack SOULBOUND_BOOTS = new CustomItem(Material.DIAMOND_BOOTS, "&cBotas unión de almas");
	
	/*		Runes				*/
	public static final ItemStack BLANK_RUNE;
	public static final ItemStack RUNE_AIR;
	public static final ItemStack RUNE_WATER;
	public static final ItemStack RUNE_FIRE;
	public static final ItemStack RUNE_EARTH;
	public static final ItemStack RUNE_ENDER;
	public static final ItemStack RUNE_RAINBOW;
	public static final ItemStack RUNE_LIGHTNING;
	public static final ItemStack RUNE_SOULBOUND;
	
	static {
		ItemStack itemB = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imB = (FireworkEffectMeta) itemB.getItemMeta();
		imB.setEffect(FireworkEffect.builder().with(Type.BURST).with(Type.BURST).withColor(Color.BLACK).build());
		imB.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8Runa en blanco"));
		itemB.setItemMeta(imB);
		BLANK_RUNE = itemB;
		
		ItemStack itemA = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imA = (FireworkEffectMeta) itemA.getItemMeta();
		imA.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.AQUA).build());
		imA.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&b&lAire&8&l]"));
		itemA.setItemMeta(imA);
		RUNE_AIR = itemA;
		
		ItemStack itemW = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imW = (FireworkEffectMeta) itemW.getItemMeta();
		imW.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.BLUE).build());
		imW.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&1&lAgua&8&l]"));
		itemW.setItemMeta(imW);
		RUNE_WATER = itemW;
		
		ItemStack itemF = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imF = (FireworkEffectMeta) itemF.getItemMeta();
		imF.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.RED).build());
		imF.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&4&lFuego&8&l]"));
		itemF.setItemMeta(imF);
		RUNE_FIRE = itemF;
		
		ItemStack itemE = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imE = (FireworkEffectMeta) itemE.getItemMeta();
		imE.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.fromRGB(112, 47, 7)).build());
		imE.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&c&lTierra&8&l]"));
		itemE.setItemMeta(imE);
		RUNE_EARTH = itemE;
		
		ItemStack itemN = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imN = (FireworkEffectMeta) itemN.getItemMeta();
		imN.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.PURPLE).build());
		imN.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&5&lEnder&8&l]"));
		itemN.setItemMeta(imN);
		RUNE_ENDER = itemN;
		
		ItemStack itemR = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imR = (FireworkEffectMeta) itemR.getItemMeta();
		imR.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.FUCHSIA).build());
		imR.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&d&lArcoiris&8&l]"));
		itemR.setItemMeta(imR);
		RUNE_RAINBOW = itemR;
		
		ItemStack itemL = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imL = (FireworkEffectMeta) itemL.getItemMeta();
		imL.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.fromRGB(255, 255, 95)).build());
		imL.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&e&lRayo&8&l]"));
		itemL.setItemMeta(imL);
		RUNE_LIGHTNING = itemL;

		ItemStack itemS = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imS = (FireworkEffectMeta) itemS.getItemMeta();
		imS.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.fromRGB(47, 0, 117)).build());
		imS.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Ancient Rune &8&l[&5&lSoulbound&8&l]"));
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.YELLOW + "Drop this rune onto a dropped item to");
		lore.add(ChatColor.DARK_PURPLE + "bind " + ChatColor.YELLOW + "that item to your soul.");
		lore.add(" ");
		lore.add(ChatColor.YELLOW + "It is advised that you only use this rune");
		lore.add(ChatColor.YELLOW + "on " + ChatColor.GOLD + "important " + ChatColor.YELLOW + "items.");
		lore.add(" ");
		lore.add(ChatColor.YELLOW + "Items bound to your soul won't drop on death.");
		imS.setLore(lore);
		itemS.setItemMeta(imS);
		RUNE_SOULBOUND = itemS;
	}
	
	/*		Electricity			*/
	public static final ItemStack SOLAR_GENERATOR = new CustomItem(Material.DAYLIGHT_DETECTOR, "&bGenerador solar", "", MachineTier.BASIC.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &70 J Buffer", "&8\u21E8 &e\u26A1 &74 J/s");
	public static final ItemStack SOLAR_GENERATOR_2 = new CustomItem(Material.DAYLIGHT_DETECTOR, "&cGenerador solar avanzado", "", MachineTier.MEDIUM.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &70 J Buffer", "&8\u21E8 &e\u26A1 &716 J/s");
	public static final ItemStack SOLAR_GENERATOR_3 = new CustomItem(Material.DAYLIGHT_DETECTOR, "&4Generador solar Carbonado", "", MachineTier.END_GAME.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &70 J Buffer", "&8\u21E8 &e\u26A1 &764 J/s");
	public static final ItemStack SOLAR_GENERATOR_4 = new CustomItem(Material.DAYLIGHT_DETECTOR, "&eGenerador solar Energizado", "", "&9Funciona en la noche", "", MachineTier.END_GAME.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &70 J Buffer", "&8\u21E8 &e\u26A1 &7256 J/s (Day)", "&8\u21E8 &e\u26A1 &7128 J/s (Noche)");
	
	public static final ItemStack COAL_GENERATOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTBkNTNjNzIxMGQwNDVhYjU0Y2Q4OGQyOWNkM2VlYmNjYzY2M2IwNzM5MjI4ZDhjMzZhOTk4ZGJlOGRmNjEyZiJ9fX0="), "&cGenerador de carbón", "", MachineTier.AVERAGE.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &764 J Buffer", "&8\u21E8 &e\u26A1 &716 J/s");
	public static final ItemStack COAL_GENERATOR_2 = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTBkNTNjNzIxMGQwNDVhYjU0Y2Q4OGQyOWNkM2VlYmNjYzY2M2IwNzM5MjI4ZDhjMzZhOTk4ZGJlOGRmNjEyZiJ9fX0="), "&cGenerador de carbón &7(&eII&7)", "", MachineTier.ADVANCED.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7256 J Buffer", "&8\u21E8 &e\u26A1 &730 J/s");
	
	public static final ItemStack LAVA_GENERATOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2NiOTQyNjNmNzEyZDkwMmRkMTM2MjUxZmQ0ZDhkMDA1ODkwYzY1N2FiNWVlNDkwY2NjOWJmNmVjMDliOGY1NyJ9fX0="), "&4Generador de lava", "", MachineTier.AVERAGE.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7512 J Buffer", "&8\u21E8 &e\u26A1 &720 J/s");
	public static final ItemStack LAVA_GENERATOR_2 = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2NiOTQyNjNmNzEyZDkwMmRkMTM2MjUxZmQ0ZDhkMDA1ODkwYzY1N2FiNWVlNDkwY2NjOWJmNmVjMDliOGY1NyJ9fX0="), "&4Generador de lava &7(&eII&7)", "", MachineTier.ADVANCED.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &71024 J Buffer", "&8\u21E8 &e\u26A1 &740 J/s");
	
	public static final ItemStack ELECTRIC_FURNACE = new CustomItem(Material.FURNACE, "&cHorno eléctrico", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &74 J/s");
	public static final ItemStack ELECTRIC_FURNACE_2 = new CustomItem(Material.FURNACE, "&cHorno eléctrico &7- &eII", "", MachineTier.MEDIUM.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 2x", "&8\u21E8 &e\u26A1 &76 J/s");
	public static final ItemStack ELECTRIC_FURNACE_3 = new CustomItem(Material.FURNACE, "&cHorno eléctrico &7- &eIII", "", MachineTier.MEDIUM.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 4x", "&8\u21E8 &e\u26A1 &710 J/s");
	
	public static final ItemStack ELECTRIC_ORE_GRINDER = new CustomItem(Material.FURNACE, "&cAmoladora de mineral eléctrica", "","&rFunciona como una trituradora de mineral y piedra amoladora", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &712 J/s");
	public static final ItemStack ELECTRIC_ORE_GRINDER_2 = new CustomItem(Material.FURNACE, "&cAmoladora de mineral eléctrica &7(&eII&7)", "","&rFunciona como una trituradora de mineral y piedra amoladora", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 4x", "&8\u21E8 &e\u26A1 &730 J/s");
	public static final ItemStack ELECTRIC_INGOT_PULVERIZER = new CustomItem(Material.FURNACE, "&cPulverizador de lingotes eléctrico", "", "&rPulveriza lingotes en polvo", "", MachineTier.MEDIUM.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &714 J/s");
	public static final ItemStack AUTO_DRIER = new CustomItem(Material.SMOKER, "&eSecadora automática", "", MachineTier.MEDIUM.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &710 J/s");
	public static final ItemStack AUTO_ENCHANTER = new CustomItem(Material.ENCHANTING_TABLE, "&5Encantador automático", "", MachineTier.MEDIUM.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &718 J/s");
	public static final ItemStack AUTO_DISENCHANTER = new CustomItem(Material.ENCHANTING_TABLE, "&5Desencantador automático", "", MachineTier.MEDIUM.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &718 J/s");
	public static final ItemStack AUTO_ANVIL = new CustomItem(Material.GRINDSTONE, "&7Auto Yunque", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &7Factor de reparación: 10%", "&8\u21E8 &e\u26A1 &724 J/s");
	public static final ItemStack AUTO_ANVIL_2 = new CustomItem(Material.GRINDSTONE, "&7Auto Yunque Mk.II", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Factor de reparación: 25%", "&8\u21E8 &e\u26A1 &732 J/s");
	
	public static final ItemStack BIO_REACTOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjNhNThiZWM2NTY2OGI2ODJhYmFiMzYxMzAwYTljNDEzM2JiNmMwNmRiODg0NzIxMGE2MmI4ODRlZTZmYmM3ZCJ9fX0="), "&2Bio Reactor", "", MachineTier.AVERAGE.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7128 J Buffer", "&8\u21E8 &e\u26A1 &78 J/s");
	public static final ItemStack MULTIMETER = new InsanityItem(Material.CLOCK, "&eMultimetro",1, "", "&rMide la cantidad de almacenado", "&rde energía del bloque");
	
	public static final ItemStack SMALL_CAPACITOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aCapacitador de energía pequeña", "", MachineTier.BASIC.and(MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &7128 J de Capacidad");
	public static final ItemStack MEDIUM_CAPACITOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aCapacitador de energía media", "", MachineTier.AVERAGE.and(MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &7512 J de Capacidad");
	public static final ItemStack BIG_CAPACITOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aCapacitador de gran energía", "", MachineTier.MEDIUM.and(MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &71024 J de Capacidad");
	public static final ItemStack LARGE_CAPACITOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aCapacitador de gran energía +", "", MachineTier.GOOD.and(MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &78192 J de Capacidad");
	public static final ItemStack CARBONADO_EDGED_CAPACITOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aCapacitador de energía con bordes carbonados", "", MachineTier.END_GAME.and(MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &765536 J de Capacidad");
	
	/*		Robots				*/
	public static final ItemStack PROGRAMMABLE_ANDROID = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&cAndroid programable &7(Normal)", "", "&8\u21E8 &7Función: Ninguna", "&8\u21E8 &7Eficiencia de combustible: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_FARMER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19"), "&cAndroid programable &7(Granjero)", "", "&8\u21E8 &7Función: Agricultura", "&8\u21E8 &7Eficiencia de combustible: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_MINER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTYzOGEyODU0MWFiM2FlMGE3MjNkNTU3ODczOGUwODc1ODM4OGVjNGMzMzI0N2JkNGNhMTM0ODJhZWYzMzQifX19"), "&cAndroid programable &7(Minero)", "", "&8\u21E8 &7Función: Minería", "&8\u21E8 &7Eficiencia de combustible: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDMyYTgxNDUxMDE0MjIwNTE2OWExYWQzMmYwYTc0NWYxOGU5Y2I2YzY2ZWU2NGVjYTJlNjViYWJkZWY5ZmYifX19"), "&cAndroid programable &7(Leñador)", "", "&8\u21E8 &7Función: Xilografía", "&8\u21E8 &7Eficiencia de combustible: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_BUTCHER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&cAndroid programable &7(Carnicero)", "", "&8\u21E8 &7Función: Matanza", "&8\u21E8 &7Daño: 4", "&8\u21E8 &7Eficiencia de combustible: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_FISHERMAN = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&cAndroid programable &7(Pescador)", "", "&8\u21E8 &7Función: Pescar", "&8\u21E8 &7Probabilidad de éxito: 10%", "&8\u21E8 &7Eficiencia de combustible: 1.0x");
	
	public static final ItemStack PROGRAMMABLE_ANDROID_2 = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&cAndroid programable avanzado &7(Normal)", "", "&8\u21E8 &7Función: Ninguna", "&8\u21E8 &7Eficiencia de combustible: 1.5x");
	public static final ItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&cAndroid programable avanzado &7(Pescador)", "", "&8\u21E8 &7Función: Pescar", "&8\u21E8 &7Probabilidad de éxito: 20%", "&8\u21E8 &7Eficiencia de combustible: 1.5x");
	public static final ItemStack PROGRAMMABLE_ANDROID_2_FARMER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19"), "&cAndroid programable avanzado &7(Granjero)", "", "&8\u21E8 &7Función: Agricultura", "&8\u21E8 &7Eficiencia de combustible: 1.5x", "&8\u21E8 &7Can also harvest Plants from ExoticGarden");
	public static final ItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&cAndroid programable avanzado &7(Carnicero)", "", "&8\u21E8 &7Función: Matanza", "&8\u21E8 &7Daño: 8", "&8\u21E8 &7Eficiencia de combustible: 1.5x");

	public static final ItemStack PROGRAMMABLE_ANDROID_3 = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&cAndroid programable Empoderado &7(Normal)", "", "&8\u21E8 &7Función: Ninguna", "&8\u21E8 &7Eficiencia de combustible: 3.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&cAndroid programable Empoderado &7(Pescador)", "", "&8\u21E8 &7Función: Pescar", "&8\u21E8 &7Probabilidad de éxito: 30%", "&8\u21E8 &7Eficiencia de combustible: 8.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&cAndroid programable Empoderado &7(Carnicero)", "", "&8\u21E8 &7Función: Matanza", "&8\u21E8 &7Daño: 20", "&8\u21E8 &7Eficiencia de combustible: 8.0x");
	
	/*		GPS					*/
	public static final ItemStack GPS_TRANSMITTER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&bTransmisor de GPS", "", "&8\u21E8 &e\u26A1 &716 J Buffer", "&8\u21E8 &e\u26A1 &72 J/s");
	public static final ItemStack GPS_TRANSMITTER_2 = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&cTransmisor GPS avanzado", "", "&8\u21E8 &e\u26A1 &764 J Buffer", "&8\u21E8 &e\u26A1 &76 J/s");
	public static final ItemStack GPS_TRANSMITTER_3 = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&4Transmisor GPS Carbonado", "", "&8\u21E8 &e\u26A1 &7256 J Buffer", "&8\u21E8 &e\u26A1 &722 J/s");
	public static final ItemStack GPS_TRANSMITTER_4 = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&eTransmisor GPS Energizado", "", "&8\u21E8 &e\u26A1 &71024 J Buffer", "&8\u21E8 &e\u26A1 &792 J/s");
	
	public static final ItemStack GPS_MARKER_TOOL = new CustomItem(Material.REDSTONE_TORCH, "&bMarcadora GPS", "", "&rLe permite establecer un punto de referencia en", "&rla ubicación donde lo coloque.");
	public static final ItemStack GPS_CONTROL_PANEL = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGRjZmJhNThmYWYxZjY0ODQ3ODg0MTExODIyYjY0YWZhMjFkN2ZjNjJkNDQ4MWYxNGYzZjNiY2I2MzMwIn19fQ=="), "&bPanel de control GPS", "", "&rTe permite mostrar tus satélites", "&ry gestiona tus putos de referencia.");
	public static final ItemStack GPS_EMERGENCY_TRANSMITTER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&cTransmisor de emergencia GPS", "", "&rLlevando esto en tu inventario", "&restablece automáticamente un punto de ruta", "&ren tu ubicación cuando mueras.");
	
	public static final ItemStack ANDROID_INTERFACE_FUEL = new CustomItem(Material.DISPENSER, "&7Interfaz de Android &c(Combustible)", "", "&rElementos almacenados en esta interfaz", "&rse insertará en una ranura de combustible del Androide", "&rcuando su Script le diga que lo haga");
	public static final ItemStack ANDROID_INTERFACE_ITEMS = new CustomItem(Material.DISPENSER, "&7Interfaz de Android &9(Items)", "", "&rLos items almacenados en el inventario del Androide", "&rse insertará en esta interfaz", "&rcuando su Script le diga que lo haga");
	
	public static final ItemStack GPS_GEO_SCANNER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmFkOGNmZWIzODdhNTZlM2U1YmNmODUzNDVkNmE0MTdiMjQyMjkzODg3ZGIzY2UzYmE5MWZhNDA5YjI1NGI4NiJ9fX0="), "&bGPS Geo-escáner", "", "&rEscanea un chunk en busca de recursos naturales", "&rtales como el &8Petroleo");
	public static final ItemStack PORTABLE_GEO_SCANNER = new CustomItem(Material.CLOCK, "&bGeo-Escáner Portable", "", "&rEscanea un chunk en busca de recursos naturales", "", "&eClick derecho&7 para escanear");
	public static final ItemStack GEO_MINER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTM3NzQxZjc2NGRkM2RkN2FkYWViNDNiNjNkMzk1OWViNzBlNWViMjhmMTVkNmIzNGNhYjM0YTFkMWY2MDM4NyJ9fX0="), "&6GEO Miner", "", "&eExtrae recursos del chunk", "&eEstos recursos no se pueden extraer con un pico", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", "&8\u21E8 &e\u26A1 &748 J/s", "", "&c&l! &cMake sure to Geo-Scan the Chunk first");
	public static final ItemStack OIL_PUMP = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWZlMWEwNDBhNDI1ZTMxYTQ2ZDRmOWE5Yjk4MDZmYTJmMGM0N2VlODQ3MTFjYzE5MzJmZDhhYjMyYjJkMDM4In19fQ=="), "&rBomba de Petroleo", "", "&7Bombea aceite y lo llena en cubos", "", "&c&l! &cAsegúrate de Geo-Escanear el chunk primero");
	public static final ItemStack BUCKET_OF_OIL = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNlMDRiNDFkMTllYzc5MjdmOTgyYTYzYTk0YTNkNzlmNzhlY2VjMzMzNjMwNTFmZGUwODMxYmZhYmRiZCJ9fX0="), "&rCubo de petroleo");
	public static final ItemStack BUCKET_OF_FUEL = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTg0ZGRjYTc2NjcyNWI4Yjk3NDEzZjI1OWMzZjc2NjgwNzBmNmFlNTU0ODNhOTBjOGU1NTI1Mzk0ZjljMDk5In19fQ=="), "&rCubo de combustible");

	public static final ItemStack REFINERY = new CustomItem(Material.SMOKER, "&cRefinería", "", "&rRefina el petroleo para crear combustible");
	public static final ItemStack COMBUSTION_REACTOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNlZGVjMDRkMjM4MGNkNzcwMjdmOWQ0NDQ1NWM5OGI3ZWRjNWY2NjRjYTBkZDMwYTYxMDY5MDM5MTUzOTFkYiJ9fX0="), "&cGenerador de combustión", "", MachineTier.ADVANCED.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7256 J Buffer", "&8\u21E8 &e\u26A1 &724 J/s");
	public static final ItemStack ANDROID_MEMORY_CORE = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&bNúcleo de memoría del Androide");
	
	public static final ItemStack GPS_TELEPORTER_PYLON = new CustomItem(Material.PURPLE_STAINED_GLASS, "&5GPS teletransportador Pilón", "", "&7Componente Teletransportador");
	public static final ItemStack GPS_TELEPORTATION_MATRIX = new CustomItem(Material.IRON_BLOCK, "&bGPS teletransportador Matrix", "", "&rEste es el componente principal de su teletransportador", "&rEsta matriz permite a los jugadores elegir entre todos", "&rlos puntos de referencia realizados por el Jugador que ha colocado", "&reste dispositivo.");
	public static final ItemStack GPS_ACTIVATION_DEVICE_SHARED = new CustomItem(Material.STONE_PRESSURE_PLATE, "&rDispositivo de activación GPS &3(Compartido)", "", "&rColoque esto en un Matrix de Teletransportación", "&ry pisar esta placa para activar", "&rel proceso de teletransportación.");
	public static final ItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new CustomItem(Material.STONE_PRESSURE_PLATE, "&rDispositivo de activación GPS &a(Personal)", "", "&rColoque esto en un Matrix de Teletransportación", "&ry pisar esta placa para activar", "&rel proceso de teletransportación.", "", "&rEsta versión solo permite a la persona que", "&rhaya colocado este dispositivo lo use.");

	public static final ItemStack ELEVATOR = new CustomItem(Material.STONE_PRESSURE_PLATE, "&bPlaca elevadora", "", "&rColoque una placa de ascensor en cada piso", "&ry podrás teletransportarte entre ellos.", "", "&eHaga clic en Derecho este bloque &7para nombrarlo.");
	
	public static final ItemStack INFUSED_HOPPER = new CustomItem(Material.HOPPER, "&5Tolva infundida", "", "&rRecoge automáticamente los items cercanos", "&ren un radio de 7x7x7.");

	public static final ItemStack PLASTIC_SHEET = new InsanityItem(Material.PAPER, "&rLámina de plástico",4);
	public static final ItemStack HEATED_PRESSURE_CHAMBER = new CustomItem(Material.LIGHT_GRAY_STAINED_GLASS, "&cCámara de presión climatizada", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &710 J/s");
	public static final ItemStack HEATED_PRESSURE_CHAMBER_2 = new CustomItem(Material.LIGHT_GRAY_STAINED_GLASS, "&cCámara de presión climatizada &7- &eII", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 5x", "&8\u21E8 &e\u26A1 &744 J/s");
	
	public static final ItemStack ELECTRIC_SMELTERY = new CustomItem(Material.FURNACE, "&cFundicion electrica", "", "&4Solo aleaciones, no funden polvo en lingotes", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &720 J/s");
	public static final ItemStack ELECTRIC_SMELTERY_2 = new CustomItem(Material.FURNACE, "&cFundicion electrica &7- &eII", "", "&4Solo aleaciones, no funden polvo en lingotes", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 3x", "&8\u21E8 &e\u26A1 &740 J/s");
	
	public static final ItemStack ELECTRIFIED_CRUCIBLE = new CustomItem(Material.RED_TERRACOTTA, "&cCrisol electrificado", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &748 J/s");
	public static final ItemStack ELECTRIFIED_CRUCIBLE_2 = new CustomItem(Material.RED_TERRACOTTA, "&cCrisol electrificado &7- &eII", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 2x", "&8\u21E8 &e\u26A1 &780 J/s");
	public static final ItemStack ELECTRIFIED_CRUCIBLE_3 = new CustomItem(Material.RED_TERRACOTTA, "&cCrisol electrificado &7- &eIII", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 4x", "&8\u21E8 &e\u26A1 &7120 J/s");

	public static final ItemStack CARBON_PRESS = new CustomItem(Material.BLACK_STAINED_GLASS, "&cPrensa de carbono", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &720 J/s");
	public static final ItemStack CARBON_PRESS_2 = new CustomItem(Material.BLACK_STAINED_GLASS, "&cPrensa de carbono &7- &eII", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 3x", "&8\u21E8 &e\u26A1 &750 J/s");
	public static final ItemStack CARBON_PRESS_3 = new CustomItem(Material.BLACK_STAINED_GLASS, "&cPrensa de carbono &7- &eIII", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 15x", "&8\u21E8 &e\u26A1 &7180 J/s");
	
	public static final ItemStack BLISTERING_INGOT = new InsanityItem(Material.GOLD_INGOT, "&6Lingote radioactivo &7(33%)",1, "", "&2Nivel de radiación: ALTO", "&4&oTraje de materiales peligrosos requerido");
	public static final ItemStack BLISTERING_INGOT_2 = new InsanityItem(Material.GOLD_INGOT, "&6Lingote radioactivo &7(66%)",2, "", "&2Nivel de radiación: ALTO", "&4&oTraje de materiales peligrosos requerido");
	public static final ItemStack BLISTERING_INGOT_3 = new InsanityItem(Material.GOLD_INGOT, "&6Lingote radioactivo",3, "", "&2Nivel de radiación: ALTO", "&4&oTraje de materiales peligrosos requerido");
	
	public static final ItemStack ENERGY_REGULATOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjk0NTg4NmZjNDBkZmQ3ZGNiMDk1MzFmMTNhN2I1NWRhZTkyZGU1MjI1NGRhM2Q1MzYzNmVmOTNiZGM1NzEifX19"), "&6Regulador de energia", "", "&rComponente central de una red de energía");
	public static final ItemStack DEBUG_FISH = new CustomItem(Material.PUFFERFISH, "&3How much is the Fish?", "", "&eRight Click &rany Block to view it's BlockData", "&eLeft Click &rto break a Block", "&eShift + Left Click &rany Block to erase it's BlockData", "&eShift + Right Click &rto place a Placeholder Block");
	
	public static final ItemStack NETHER_ICE = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2NlMmRhZDliYWY3ZWFiYTdlODBkNGQwZjlmYWMwYWFiMDFhNzZiMTJmYjcxYzNkMmFmMmExNmZkZDRjNzM4MyJ9fX0="), "&eHielo del nether", "", "&eNivel de radiación: MODERADO", "&4&oTraje de materiales peligrosos requerido");
	public static final ItemStack ENRICHED_NETHER_ICE = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2M4MThhYTEzYWFiYzcyOTQ4MzhkMjFjYWFjMDU3ZTk3YmQ4Yzg5NjQxYTBjMGY4YTU1NDQyZmY0ZTI3In19fQ=="), "&eHielo del nether enriquesido", "", "&2Nivel de radiación: EXTREMADAMENTE ALTO", "&4&oTraje de materiales peligrosos requerido");
	public static final ItemStack NETHER_ICE_COOLANT_CELL = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQzY2Q0MTI1NTVmODk3MDE2MjEzZTVkNmM3NDMxYjQ0OGI5ZTU2NDRlMWIxOWVjNTFiNTMxNmYzNTg0MGUwIn19fQ=="), "&6Célula refrigerante de hielo del Nether");
	
	@Deprecated
	public static final ItemStack NETHER_DRILL = new CustomItem(Material.RED_TERRACOTTA, "&4Taladro del nether", "", "&rPermita minar el hielo del nether", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &7102 J/s", "", "&c&l! &cSolo se puede usar en el Nether", "&c&l! &cAsegúrate de Geo-Escanear el Chunk primero");
	
	// Cargo
	public static final ItemStack CARGO_MANAGER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUxMGJjODUzNjJhMTMwYTZmZjlkOTFmZjExZDZmYTQ2ZDdkMTkxMmEzNDMxZjc1MTU1OGVmM2M0ZDljMiJ9fX0="), "&6Gestor de carga", "", "&rComponente central para una red de transporte de items.");
	public static final ItemStack CARGO_NODE = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMDdiN2VmNmZkNzg2NDg2NWMzMWMxZGM4N2JlZDI0YWI1OTczNTc5ZjVjNjYzOGZlY2I4ZGVkZWI0NDNmZjAifX19"), "&7Nodo de carga &c(Conector)", "", "&rTubo de conexión de carga");
	public static final ItemStack CARGO_INPUT = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTZkMWMxYTY5YTNkZTlmZWM5NjJhNzdiZjNiMmUzNzZkZDI1Yzg3M2EzZDhmMTRmMWRkMzQ1ZGFlNGM0In19fQ=="), "&7Nodo de carga &c(Entrada)", "", "&rTubo de entrada de carga");
	public static final ItemStack CARGO_OUTPUT = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19"), "&7Nodo de carga &c(Salida)", "", "&rTubo de salida de carga");
	public static final ItemStack CARGO_OUTPUT_ADVANCED = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19"), "&6Nodo de carga avanzado &c(Salida)", "", "&rTubo de salida de carga");

	public static final ItemStack AUTO_BREEDER = new CustomItem(Material.HAY_BLOCK, "&eCriadora Automática", "", "&rFunciona con &aComida Orgánica", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &71024 J Buffer", "&8\u21E8 &e\u26A1 &760 J/Animal");;
	
	public static final ItemStack ORGANIC_FOOD = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aComida Orgánica", "&7Contiene: &9X");
	public static final ItemStack WHEAT_ORGANIC_FOOD = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aComida Orgánica", "&7Contiene: &9Trigo");
	public static final ItemStack CARROT_ORGANIC_FOOD = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aComida Orgánica", "&7Contiene: &9Zanahorias");
	public static final ItemStack POTATO_ORGANIC_FOOD = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aComida Orgánica", "&7Contiene: &9Patatas");
	public static final ItemStack SEEDS_ORGANIC_FOOD = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aComida Orgánica", "&7Contiene: &9Semillas");
	public static final ItemStack BEETROOT_ORGANIC_FOOD = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aComida Orgánica", "&7Contiene: &9Remolacha");
	public static final ItemStack MELON_ORGANIC_FOOD = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aComida Orgánica", "&7Contiene: &9Sandía");
	public static final ItemStack APPLE_ORGANIC_FOOD = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aComida Orgánica", "&7Contiene: &9Manzana");

	public static final ItemStack FERTILIZER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aFertilizante orgánico", "&7Contiene: &9X");
	public static final ItemStack WHEAT_FERTILIZER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aFertilizante orgánico", "&7Contiene: &9Wheat");
	public static final ItemStack CARROT_FERTILIZER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aFertilizante orgánico", "&7Contiene: &9Carrots");
	public static final ItemStack POTATO_FERTILIZER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aFertilizante orgánico", "&7Contiene: &9Potatoes");
	public static final ItemStack SEEDS_FERTILIZER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aFertilizante orgánico", "&7Contiene: &9Seeds");
	public static final ItemStack BEETROOT_FERTILIZER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aFertilizante orgánico", "&7Contiene: &9Beetroot");
	public static final ItemStack MELON_FERTILIZER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aFertilizante orgánico", "&7Contiene: &9Melon");
	public static final ItemStack APPLE_FERTILIZER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aFertilizante orgánico", "&7Contiene: &9Apple");

	public static final ItemStack ANIMAL_GROWTH_ACCELERATOR = new CustomItem(Material.HAY_BLOCK, "&bAcelerador de Crecimiento Animal", "", "&rFunciona con &aAlimentos orgánicos", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &71024 J Buffer", "&8\u21E8 &e\u26A1 &728 J/s");;
	public static final ItemStack CROP_GROWTH_ACCELERATOR = new CustomItem(Material.DRIED_KELP_BLOCK, "&aAcelerante de cultivos", "", "&rFunciona con &aFertilizante orgánico", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Radio: 7x7", "&8\u21E8 &7Velocidad: &a3/time", "&8\u21E8 &e\u26A1 &71024 J Buffer", "&8\u21E8 &e\u26A1 &750 J/s");
	public static final ItemStack CROP_GROWTH_ACCELERATOR_2 = new CustomItem(Material.DRIED_KELP_BLOCK, "&aAcelerante de cultivos &7(&eII&7)", "", "&rFunciona con &aFertilizante orgánico", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Radio: 9x9", "&8\u21E8 &7Velocidad: &a4/time", "&8\u21E8 &e\u26A1 &71024 J Buffer", "&8\u21E8 &e\u26A1 &760 J/s");

	public static final ItemStack FOOD_FABRICATOR = new CustomItem(Material.GREEN_STAINED_GLASS, "&cFabricador de alimentos", "", "&rProduce &aComida Orgánica", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &7256 J Buffer", "&8\u21E8 &e\u26A1 &714 J/s");
	public static final ItemStack FOOD_FABRICATOR_2 = new CustomItem(Material.GREEN_STAINED_GLASS, "&cFabricador de alimentos &7(&eII&7)", "", "&rProduce &aComida Orgánica", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 6x", "&8\u21E8 &e\u26A1 &7512 J Buffer", "&8\u21E8 &e\u26A1 &748 J/s");
	
	public static final ItemStack FOOD_COMPOSTER = new CustomItem(Material.COMPOSTER, "&cCompostador de alimentos", "", "&rProduce &aFertilizante orgánico", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &7256 J Buffer", "&8\u21E8 &e\u26A1 &716 J/s");
	public static final ItemStack FOOD_COMPOSTER_2 = new CustomItem(Material.COMPOSTER, "&cCompostador de alimentos &7(&eII&7)", "", "&rProduce &aFertilizante orgánico", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 10x", "&8\u21E8 &e\u26A1 &7512 J Buffer", "&8\u21E8 &e\u26A1 &752 J/s");

	public static final ItemStack XP_COLLECTOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTc2MmExNWIwNDY5MmEyZTRiM2ZiMzY2M2JkNGI3ODQzNGRjZTE3MzJiOGViMWM3YTlmN2MwZmJmNmYifX19"), "&aRecolector de XP", "", "&rRecoge xp cerca y lo almacena", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &71024 J Buffer", "&8\u21E8 &e\u26A1 &720 J/s");
	public static final ItemStack REACTOR_COOLANT_CELL = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGU0MDczYmU0MGNiM2RlYjMxMGEwYmU5NTliNGNhYzY4ZTgyNTM3MjcyOGZhZmI2YzI5NzNlNGU3YzMzIn19fQ=="), "&bReactor Coolant Cell");

	public static final ItemStack NUCLEAR_REACTOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTUyZmZkMDg1MjhlYzgxODNiMzVhYWM2NThiMjkyMjZhZDhiOWFhY2FjOGRkOWUwNGNmMTg2YjExMDY0Y2E0ZCJ9fX0="), "&2Reactor nuclear", "", "&rRequiere enfriamiento!", "&8\u21E8 &bDebe estar rodeado de agua", "&8\u21E8 &bDebe suministrarse con las células de refrigerante del reactor", "", "&4Generador End-Game", "&8\u21E8 &e\u26A1 &716384 J Buffer", "&8\u21E8 &e\u26A1 &7500 J/s");
	public static final ItemStack NETHERSTAR_REACTOR = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmRjY2NjYThlOWE1MTgyODVlMDM1MmI0MzE4MmY1ODQ1YjFhNjZiOWYwOWI0NTAyMjJjNmUyMTAwNWI2Y2ExYSJ9fX0="), "&fReactor de estrellas del nether", "", "&fFunciona con Nether Stars", "&8\u21E8 &bDebe estar rodeado de agua", "&8\u21E8 &bDebe suministrarse con las células de refrigerante del reactor", "", "&4Generador End-Game", "&8\u21E8 &e\u26A1 &732768 J Buffer", "&8\u21E8 &e\u26A1 &71024 J/s", "&8\u21E8 &4Causes nearby Entities to get Withered");
	public static final ItemStack REACTOR_ACCESS_PORT = new CustomItem(Material.CYAN_TERRACOTTA, "&2Puerto de acceso al reactor", "", "&rTe permite interactuar con un reactor", "&rA través de Nodos de Carga, también se puede utilizar.", "&rcomo un búfer", "", "&8\u21E8 &eDebe ser colocado &a3 bloques &eencima del reactor.");
	
	public static final ItemStack FREEZER = new CustomItem(Material.LIGHT_BLUE_STAINED_GLASS, "&bCongelador", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &7256 J Buffer", "&8\u21E8 &e\u26A1 &718 J/s");;
	public static final ItemStack FREEZER_2 = new CustomItem(Material.LIGHT_BLUE_STAINED_GLASS, "&bCongelador &7(&eII&7)", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 2x", "&8\u21E8 &e\u26A1 &7256 J Buffer", "&8\u21E8 &e\u26A1 &730 J/s");;
	
	public static final ItemStack ELECTRIC_GOLD_PAN = new CustomItem(Material.BROWN_TERRACOTTA, "&6Charola de oro eléctrica", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &72 J/s");
	public static final ItemStack ELECTRIC_GOLD_PAN_2 = new CustomItem(Material.BROWN_TERRACOTTA, "&6Charola de oro eléctrica &7(&eII&7)", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 3x", "&8\u21E8 &e\u26A1 &74 J/s");
	public static final ItemStack ELECTRIC_GOLD_PAN_3 = new CustomItem(Material.BROWN_TERRACOTTA, "&6Charola de oro eléctrica &7(&eIII&7)", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 10x", "&8\u21E8 &e\u26A1 &714 J/s");

	public static final ItemStack ELECTRIC_DUST_WASHER = new CustomItem(Material.LOOM, "&3Lavadora de polvo eléctrica", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &76 J/s");
	public static final ItemStack ELECTRIC_DUST_WASHER_2 = new CustomItem(Material.LOOM, "&3Lavadora de polvo eléctrica &7(&eII&7)", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 2x", "&8\u21E8 &e\u26A1 &710 J/s");
	public static final ItemStack ELECTRIC_DUST_WASHER_3 = new CustomItem(Material.LOOM, "&3Lavadora de polvo eléctrica &7(&eIII&7)", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 10x", "&8\u21E8 &e\u26A1 &730 J/s");

	public static final ItemStack ELECTRIC_INGOT_FACTORY = new CustomItem(Material.BLAST_FURNACE, "&cFundidora de lingotes eléctrica", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 1x", "&8\u21E8 &e\u26A1 &78 J/s");
	public static final ItemStack ELECTRIC_INGOT_FACTORY_2 = new CustomItem(Material.BLAST_FURNACE, "&cFundidora de lingotes eléctrica &7(&eII&7)", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 2x", "&8\u21E8 &e\u26A1 &714 J/s");
	public static final ItemStack ELECTRIC_INGOT_FACTORY_3 = new CustomItem(Material.BLAST_FURNACE, "&cFundidora de lingotes eléctrica &7(&eIII&7)", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Velocidad: 8x", "&8\u21E8 &e\u26A1 &740 J/s");

	public static final ItemStack AUTOMATED_CRAFTING_CHAMBER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJiODRlMzQ4YWI1OGJlMDQzNWY2MWUwMjdmYTZkZmU1NTdiZWU4ODkzZjFjMTBjM2MyYmViZDIwMjVkYSJ9fX0"), "&6Cámara de elaboración automática", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &710 J/Item");
	public static final ItemStack FLUID_PUMP = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQyM2FmOWY3NTNkMjQ0NGUwODdkZDE3YzYzMjUzMWRkMmRlNzE3NzQzZmFhMzUzZmZmNjI5ZGEyNTJiZSJ9fX0="), "&9Bomba de fluidos", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &732 J/Block");
	public static final ItemStack CHARGING_BENCH = new CustomItem(Material.BLAST_FURNACE, "&6Centro de carga", "", "&rCargas items tales como los Jetpacks", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &7128 J Buffer", "&8\u21E8 &e\u26A1 &7Energy Loss: &c50%");

	public static final ItemStack WITHER_ASSEMBLER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmI4YWIwZjY1YTU0YTlhNmVlOGFjZDkwM2I3OGRkZTM0ZThjZWVkNzZhZTViOTI4YTU1NGQ3NWQyYjQ1NDUifX19"), "&5Ensamblador de Wither", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Cooldown: &b30 Seconds", "&8\u21E8 &e\u26A1 &74096 J Buffer", "&8\u21E8 &e\u26A1 &74096 J/Wither");
	
	public static final ItemStack TRASH_CAN = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ=="), "&3Bote de basura", "", "&rDestruirá todos los artículos puestos en él");
	
	public static final ItemStack ELYTRA = new ItemStack(Material.ELYTRA);
	public static final ItemStack ELYTRA_SCALE = new CustomItem(Material.FEATHER, "&bEscala Eyltra");
	public static final ItemStack INFUSED_ELYTRA = new CustomItem(ELYTRA, "&5Elytra Infundido");
	public static final ItemStack SOULBOUND_ELYTRA = new CustomItem(ELYTRA, "&cElytra unión de alma");

	static {
		INFUSED_ELYTRA.addUnsafeEnchantment(Enchantment.MENDING, 1);
	}
	
	// ChestTerminal Addon
	
	public static final ItemStack CHEST_TERMINAL = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0NGZmM2E1ZjQ5YzY5Y2FiNjc2YmFkOGQ5OGEwNjNmYTc4Y2ZhNjE5MTZmZGVmM2UyNjc1NTdmZWMxODI4MyJ9fX0="), "&3CT Access Terminal", "&7If this Block is connected to a", "&7Cargo Network, it will allow you to remotely", "&7interact with any Items supplied by", "&7Nodes tuned into the ChestTerminal Channel");
	public static final ItemStack CT_IMPORT_BUS = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3CT Import Bus", "&7If this Block is connected to a", "&7Cargo Network, it will pull any Items from", "&7the Inventory it is attached to and place it", "&7into the CT Network Channel");
	public static final ItemStack CT_EXPORT_BUS = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3CT Export Bus", "&7If this Block is connected to a", "&7Cargo Network, it will pull any Items from", "&7the CT Network Channel and place these", "&7into the Inventory it is attached to");
	
	private static ItemStack getSkull(String texture) {
		try {
			return CustomSkull.getItem(texture);
		}
		catch(Exception x) {
			Slimefun.getLogger().log(Level.SEVERE, "An Error occured while initializing the Items for Slimefun " + Slimefun.getVersion(), x);
			
			return new ItemStack(Material.PLAYER_HEAD);
		}
	}
}

