package me.mrCookieSlime.Slimefun.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.cscorelib2.item.CustomItem;
import io.github.thebusybiscuit.cscorelib2.skull.SkullItem;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.core.utils.ChatUtils;
import io.github.thebusybiscuit.slimefun4.core.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.items.StormStaff;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

public final class SlimefunItems {
	
	private SlimefunItems() {}
	
	/*		 Items 		*/
	public static final ItemStack PORTABLE_CRAFTER = new SlimefunItemStack("PORTABLE_CRAFTER", "72ec4a4bd8a58f8361f8a0303e2199d33d624ea5f92f7cb3414fee95e2d861", "&6Crafter Portatil", "&a&oUna mesa de fabricación portátil", "", "&eClick Derecho&7 para abrir");
	public static final ItemStack PORTABLE_DUSTBIN = new SlimefunItemStack("PORTABLE_DUSTBIN", "32d41042ce99147cc38cac9e46741576e7ee791283e6fac8d3292cae2935f1f", "&6Cubo de basura portátil", "&rTu destructor de objetos portátil", "", "&eClick Derecho&7 para abrir");
	public static final ItemStack ENDER_BACKPACK = new SlimefunItemStack("ENDER_BACKPACK", "2a3b34862b9afb63cf8d5779966d3fba70af82b04e83f3eaf6449aeba", "&6Mochila Ender","&a&oUn cofre portátil de Ender", "", "&eClick Derecho&7 para abrir");
	public static final ItemStack MAGIC_EYE_OF_ENDER = new SlimefunItemStack("MAGIC_EYE_OF_ENDER", Material.ENDER_EYE, "&6&lOjo Mágico de Ender", "&4&lRequiere armadura completa de Ender", "", "&7&eClick Derecho&7 para dispara una Enderpearl");
	public static final ItemStack BROKEN_SPAWNER = new SlimefunItemStack("BROKEN_SPAWNER", Material.SPAWNER, "&cSpawner Roto", "&7Tipo: &b<Tipo>", "", "&cFracturado, debe repararse en un Altar Antiguo");
	public static final ItemStack REPAIRED_SPAWNER = new SlimefunItemStack("REINFORCED_SPAWNER", Material.SPAWNER, "&bSpawner Reforzado", "&7Tipo: &b<Tipo>");
	public static final ItemStack INFERNAL_BONEMEAL = new SlimefunItemStack("INFERNAL_BONEMEAL", Material.BONE_MEAL, "&4Polvo de hueso infernal", "", "&cAcelera el crecimiento de", "&cVerrugas del nether también");
	
	/*		 Gadgets 		*/
	public static final ItemStack GOLD_PAN = new SlimefunItemStack("GOLD_PAN", Material.BOWL, "&6Lavador de oro", "&a&oPuede conseguirte todo tipo de riquezas...", "", "&7&eClick Derecho&7 sacar varias cosas de grava");
	public static final ItemStack NETHER_GOLD_PAN = new SlimefunItemStack("NETHER_GOLD_PAN", Material.BOWL, "&4Lavador de oro infernal", "", "&7&eClick Derecho&7 Puede conseguirte todo tipo de riquezas", "de la Soul Sand");
	public static final ItemStack PARACHUTE = new SlimefunItemStack("PARACHUTE", Material.LEATHER_CHESTPLATE, Color.WHITE, "&r&lParacaídas", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack GRAPPLING_HOOK = new SlimefunItemStack("GRAPPLING_HOOK", Material.LEAD, "&6Gancho", "", "&7&eClick derecho&7 para usar");
	public static final ItemStack SOLAR_HELMET = new SlimefunItemStack("SOLAR_HELMET", Material.IRON_HELMET, "&bCasco Solar", "", "&a&oCarga con energía los items y la armadura");
	public static final ItemStack CLOTH = new SlimefunItemStack("CLOTH", Material.PAPER, "&bTela");
	public static final ItemStack CAN = new SlimefunItemStack("CAN", "94da97f080e395b842c4cc82a840823d4dbd8ca688a206853e5783e4bfdc012", "&rLata");
	public static final ItemStack NIGHT_VISION_GOGGLES = new SlimefunItemStack("NIGHT_VISION_GOGGLES", Material.LEATHER_HELMET, Color.BLACK, "&aLentes de visión nocturna", "", "&9+ Vision nocturna");
	public static final ItemStack FARMER_SHOES = new SlimefunItemStack("FARMER_SHOES", Material.LEATHER_BOOTS, Color.YELLOW, "&eZapatos de granjero", "", "&6&oEvita que pisotees tus cultivos");
	public static final ItemStack INFUSED_MAGNET = new SlimefunItemStack("INFUSED_MAGNET", "aba8ebc4c6a81730947499bf7e1d5e73fed6c1bb2c051e96d35eb16d24610e7", "&aImán infundido" , "", "&rImán infundido Mágico", "&ratraer artículos cercanos", "&rsiempre y cuando esté en algún lugar de", "&rsu inventario", "", "&7Mantén &eShift&7 para recoger artículos cercanos");
	public static final ItemStack FLASK_OF_KNOWLEDGE = new SlimefunItemStack("FLASK_OF_KNOWLEDGE", Material.GLASS_BOTTLE, "&cFrasco de conocimiento", "", "&rLe permite almacenar algunos de", "&rtu experiencia en una botella", "&7Cuesta: &a1 Nivel");
	public static final ItemStack RAG = new SlimefunItemStack("RAG", Material.PAPER, "&cTrapo", "", "&aNivel I - Suplemento Médico", "", "&rRestaura 2 Corazones", "&rExtingue el fuego", "", "&7&eClick derecho&7 para usar");
	public static final ItemStack BANDAGE = new SlimefunItemStack("BANDAGE", Material.PAPER, "&cVendaje", "", "&aNivel II - Suplemento Médico", "", "&rRestaura 4 Corazones", "&rExtingue el fuego", "", "&7&eClick derecho&7 para usar");
	public static final ItemStack SPLINT = new SlimefunItemStack("SPLINT", Material.STICK, "&cTablilla", "", "&aNivel I - Suplemento Médico", "", "&rRestaura 2 Corazones", "", "&7&eClick derecho&7 para usar");
	public static final ItemStack VITAMINS = new SlimefunItemStack("VITAMINS", Material.NETHER_WART, "&cVitaminas", "", "&aNivel III - Suplemento Médico", "", "&rRestaura 4 Corazones", "&rExtingue el fuego", "&rCura el Veneno/Wither/Radiación", "", "&7&eClick derecho&7 para usar");
	public static final ItemStack MEDICINE = new SlimefunItemStack("MEDICINE", Material.POTION, Color.RED, "&cMedicina", "", "&aNivel III - Suplemento Médico", "", "&rRestaura 4 Corazones", "&rExtingue el fuego", "&rCura el Veneno/Wither/Radiación");
	
	/*		Backpacks		*/
	public static final ItemStack BACKPACK_SMALL = new SlimefunItemStack("SMALL_BACKPACK", "40cb1e67b512ab2d4bf3d7ace0eaaf61c32cd4681ddc3987ceb326706a33fa", "&eMochila Pequeña","", "&7Tamaño: &e9", "&7ID: <ID>", "", "&7&eClick derecho&7 para abrir");
	public static final ItemStack BACKPACK_MEDIUM = new SlimefunItemStack("MEDIUM_BACKPACK", "40cb1e67b512ab2d4bf3d7ace0eaaf61c32cd4681ddc3987ceb326706a33fa", "&eBackpack","", "&7Tamaño: &e18", "&7ID: <ID>", "", "&7&eClick derecho&7 para abrir");
	public static final ItemStack BACKPACK_LARGE = new SlimefunItemStack("LARGE_BACKPACK", "40cb1e67b512ab2d4bf3d7ace0eaaf61c32cd4681ddc3987ceb326706a33fa", "&eMochila Grande","", "&7Tamaño: &e27", "&7ID: <ID>", "", "&7&eClick derecho&7 para abrir");
	public static final ItemStack WOVEN_BACKPACK = new SlimefunItemStack("WOVEN_BACKPACK", "40cb1e67b512ab2d4bf3d7ace0eaaf61c32cd4681ddc3987ceb326706a33fa", "&eMochila Trenzada","", "&7Tamaño: &e36", "&7ID: <ID>", "", "&7&eClick derecho&7 para abrir");
	public static final ItemStack GILDED_BACKPACK = new SlimefunItemStack("GILDED_BACKPACK", "40cb1e67b512ab2d4bf3d7ace0eaaf61c32cd4681ddc3987ceb326706a33fa", "&eMochila Dorada","", "&7Tamaño: &e45", "&7ID: <ID>", "", "&7&eClick derecho&7 para abrir");
	public static final ItemStack RADIANT_BACKPACK = new SlimefunItemStack("RADIANT_BACKPACK", "40cb1e67b512ab2d4bf3d7ace0eaaf61c32cd4681ddc3987ceb326706a33fa", "&eMochila Radiante","", "&7Tamaño: &e54 (Double chest)", "&7ID: <ID>", "", "&7&eClick derecho&7 para abrir");
	public static final ItemStack BOUND_BACKPACK = new SlimefunItemStack("BOUND_BACKPACK", "2a3b34862b9afb63cf8d5779966d3fba70af82b04e83f3eaf6449aeba", "&cMochila de Alma unida","", "&7Tamaño: &e36", "&7ID: <ID>", "", "&7&eClick derecho&7 para abrir");
	public static final ItemStack COOLER = new SlimefunItemStack("COOLER", "d4c1572584eb5de229de9f5a4f779d0aacbaffd33bcb33eb4536a6a2bc6a1", "&bNevera","&rLe permite almacenar jugos / batidos", "&ry los consume automáticamente cuando tienes hambre", "&rsi tienes esto en tu inventario", "", "&7Tamaño: &e27", "&7ID: <ID>", "", "&7&eClick derecho&7 para abrir");

	/*		 Jetpacks		*/
	public static final ItemStack DURALUMIN_JETPACK = new SlimefunItemStack("DURALUMIN_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Jetpack Electrico &7- &eI", "", "&8\u21E8 &7Material: &bDuralumin", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "&8\u21E8 &7Impulso: &c0.35", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack SOLDER_JETPACK = new SlimefunItemStack("SOLDER_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Jetpack Electrico &7- &eII", "", "&8\u21E8 &7Material: &bSolder", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "&8\u21E8 &7Impulso: &c0.4", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack BILLON_JETPACK = new SlimefunItemStack("BILLON_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Jetpack Electrico &7- &eIII", "", "&8\u21E8 &7Material: &bBillon", "&c&o&8\u21E8 &e\u26A1 &70 / 45 J", "&8\u21E8 &7Impulso: &c0.45", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack STEEL_JETPACK = new SlimefunItemStack("STEEL_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Jetpack Electrico &7- &eIV", "", "&8\u21E8 &7Material: &bSteel", "&c&o&8\u21E8 &e\u26A1 &70 / 60 J", "&8\u21E8 &7Impulso: &c0.5", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack DAMASCUS_STEEL_JETPACK = new SlimefunItemStack("DAMASCUS_STEEL_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Jetpack Electrico &7- &eV", "", "&8\u21E8 &7Material: &bDamascus Steel", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "&8\u21E8 &7Impulso: &c0.55", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack REINFORCED_ALLOY_JETPACK = new SlimefunItemStack("REINFORCED_ALLOY_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Jetpack Electrico &7- &eVI", "", "&8\u21E8 &7Material: &bReforzado Alloy", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "&8\u21E8 &7Impulso: &c0.6", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack CARBONADO_JETPACK = new SlimefunItemStack("CARBONADO_JETPACK", Material.LEATHER_CHESTPLATE, Color.BLACK, "&9Jetpack Electrico &7- &eVII", "", "&8\u21E8 &7Material: &bCarbonado", "&c&o&8\u21E8 &e\u26A1 &70 / 150 J", "&8\u21E8 &7Impulso: &c0.7", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack ARMORED_JETPACK = new SlimefunItemStack("ARMORED_JETPACK", Material.IRON_CHESTPLATE, "&9Jetpack Blindado", "&8\u21E8 &7Material: &bSteel", "", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7Impulso: &c0.45", "", "&7Mantén &eShift&7 para usar");
	
	/*		 Jetboots		*/
	public static final ItemStack DURALUMIN_JETBOOTS = new SlimefunItemStack("DURALUMIN_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Botas Jet &7- &eI", "", "&8\u21E8 &7Material: &bDuralumin", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "&8\u21E8 &7Velocidad: &a0.35", "&8\u21E8 &7Precisión: &c50%", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack SOLDER_JETBOOTS = new SlimefunItemStack("SOLDER_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Botas Jet &7- &eII", "", "&8\u21E8 &7Material: &bSolder", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "&8\u21E8 &7Velocidad: &a0.4", "&8\u21E8 &7Precisión: &660%", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack BILLON_JETBOOTS = new SlimefunItemStack("BILLON_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Botas Jet &7- &eIII", "", "&8\u21E8 &7Material: &bBillon", "&c&o&8\u21E8 &e\u26A1 &70 / 40 J", "&8\u21E8 &7Velocidad: &a0.45", "&8\u21E8 &7Precisión: &665%", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack STEEL_JETBOOTS = new SlimefunItemStack("STEEL_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Botas Jet &7- &eIV", "", "&8\u21E8 &7Material: &bSteel", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7Velocidad: &a0.5", "&8\u21E8 &7Precisión: &e70%", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack DAMASCUS_STEEL_JETBOOTS = new SlimefunItemStack("DAMASCUS_STEEL_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Botas Jet &7- &eV", "", "&8\u21E8 &7Material: &bDamascus Steel", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "&8\u21E8 &7Velocidad: &a0.55", "&8\u21E8 &7Precisión: &a75%", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack REINFORCED_ALLOY_JETBOOTS = new SlimefunItemStack("REINFORCED_ALLOY_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Botas Jet &7- &eVI", "", "&8\u21E8 &7Material: &bReforzado Alloy", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "&8\u21E8 &7Velocidad: &a0.6", "&8\u21E8 &7Precisión: &c80%", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack CARBONADO_JETBOOTS = new SlimefunItemStack("CARBONADO_JETBOOTS", Material.LEATHER_BOOTS, Color.BLACK, "&9Botas Jet &7- &eVII", "", "&8\u21E8 &7Material: &bCarbonado", "&c&o&8\u21E8 &e\u26A1 &70 / 125 J", "&8\u21E8 &7Velocidad: &a0.7", "&8\u21E8 &7Precisión: &c99.9%", "", "&7Mantén &eShift&7 para usar");
	public static final ItemStack ARMORED_JETBOOTS = new SlimefunItemStack("ARMORED_JETBOOTS", Material.IRON_BOOTS, "&9Botas Jet Blindadas", "", "&8\u21E8 &7Material: &bSteel", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7Velocidad: &a0.45", "&8\u21E8 &7Precisión: &e70%", "", "&7Mantén &eShift&7 para usar");
	
	/*		 Multi Tools		*/
	public static final ItemStack DURALUMIN_MULTI_TOOL = new SlimefunItemStack("DURALUMIN_MULTI_TOOL", Material.SHEARS, "&9Multi Herramienta &7- &eI", "", "&8\u21E8 &7Material: &bDuralumin", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "", "&7&eClick derecho&7 para usar", "&7Mantén &eShift + Click Derecho&7 para cambiar el modo");
	public static final ItemStack SOLDER_MULTI_TOOL = new SlimefunItemStack("SOLDER_MULTI_TOOL", Material.SHEARS, "&9Multi Herramienta &7- &eII", "", "&8\u21E8 &7Material: &bSolder", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "", "&7&eClick derecho&7 para usar", "&7Mantén &eShift + Click Derecho&7 para cambiar el modo");
	public static final ItemStack BILLON_MULTI_TOOL = new SlimefunItemStack("BILLON_MULTI_TOOL", Material.SHEARS, "&9Multi Herramienta &7- &eIII", "", "&8\u21E8 &7Material: &bBillon", "&c&o&8\u21E8 &e\u26A1 &70 / 40 J", "", "&7&eClick derecho&7 para usar", "&7Mantén &eShift + Click Derecho&7 para cambiar el modo");
	public static final ItemStack STEEL_MULTI_TOOL = new SlimefunItemStack("STEEL_MULTI_TOOL", Material.SHEARS, "&9Multi Herramienta &7- &eIV", "", "&8\u21E8 &7Material: &bSteel", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "", "&7&eClick derecho&7 para usar", "&7Mantén &eShift + Click Derecho&7 para cambiar el modo");
	public static final ItemStack DAMASCUS_STEEL_MULTI_TOOL = new SlimefunItemStack("DAMASCUS_STEEL_MULTI_TOOL", Material.SHEARS, "&9Multi Herramienta &7- &eV", "", "&8\u21E8 &7Material: &bDamascus Steel", "&c&o&8\u21E8 &e\u26A1 &70 / 60 J", "", "&7&eClick derecho&7 para usar", "&7Mantén &eShift + Click Derecho&7 para cambiar el modo");
	public static final ItemStack REINFORCED_ALLOY_MULTI_TOOL = new SlimefunItemStack("REINFORCED_ALLOY_MULTI_TOOL", Material.SHEARS, "&9Multi Herramienta &7- &eVI", "", "&8\u21E8 &7Material: &bReforzado Alloy", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "", "&7&eClick derecho&7 para usar", "&7Mantén &eShift + Click Derecho&7 para cambiar el modo");
	public static final ItemStack CARBONADO_MULTI_TOOL = new SlimefunItemStack("CARBONADO_MULTI_TOOL", Material.SHEARS, "&9Multi Herramienta &7- &eVII", "", "&8\u21E8 &7Material: &bCarbonado", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "", "&7&eClick derecho&7 para usar", "&7Mantén &eShift + Click Derecho&7 para cambiar el modo");
	
	static {
		ItemMeta duralumin = DURALUMIN_MULTI_TOOL.getItemMeta();
		duralumin.setUnbreakable(true);
		DURALUMIN_MULTI_TOOL.setItemMeta(duralumin);

		ItemMeta solder = SOLDER_MULTI_TOOL.getItemMeta();
		solder.setUnbreakable(true);
		SOLDER_MULTI_TOOL.setItemMeta(solder);

		ItemMeta billon = BILLON_MULTI_TOOL.getItemMeta();
		billon.setUnbreakable(true);
		BILLON_MULTI_TOOL.setItemMeta(billon);

		ItemMeta steel = STEEL_MULTI_TOOL.getItemMeta();
		steel.setUnbreakable(true);
		STEEL_MULTI_TOOL.setItemMeta(steel);

		ItemMeta damascus = DAMASCUS_STEEL_MULTI_TOOL.getItemMeta();
		damascus.setUnbreakable(true);
		DAMASCUS_STEEL_MULTI_TOOL.setItemMeta(damascus);

		ItemMeta reinforced = REINFORCED_ALLOY_MULTI_TOOL.getItemMeta();
		reinforced.setUnbreakable(true);
		REINFORCED_ALLOY_MULTI_TOOL.setItemMeta(reinforced);

		ItemMeta carbonado = CARBONADO_MULTI_TOOL.getItemMeta();
		carbonado.setUnbreakable(true);
		CARBONADO_MULTI_TOOL.setItemMeta(carbonado);
	}
	
	/*		 Food 		*/
	public static final ItemStack FORTUNE_COOKIE = new SlimefunItemStack("FORTUNE_COOKIE", Material.COOKIE, "&6Galleta de la fortuna", "", "&a&oTe dice cosas sobre tu futuro :o");
	public static final ItemStack DIET_COOKIE = new SlimefunItemStack("DIET_COOKIE", Material.COOKIE, "&6Galleta Dietetica", "", "&aUna muy &oligera &r&agalleta.");
	public static final ItemStack MAGIC_SUGAR = new SlimefunItemStack("MAGIC_SUGAR", Material.SUGAR, "&6Azúcar Mágica", "", "&a&oSiente el poder de Hermes!");
	public static final ItemStack MONSTER_JERKY = new SlimefunItemStack("MONSTER_JERKY", Material.ROTTEN_FLESH, "&6Carne Monstruosa", "", "&a&oYa no más hambre");
	public static final ItemStack APPLE_JUICE = new SlimefunItemStack("APPLE_JUICE", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 6, 0),"&cJugo de Manzana", "", "&7&oRestaura &b&o" + "3.0" + " &7&ode hambre"));
	public static final ItemStack MELON_JUICE = new SlimefunItemStack("MELON_JUICE", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 6, 0),"&cJugo de Sandía", "", "&7&oRestaura &b&o" + "3.0" + " &7&ode hambre"));
	public static final ItemStack CARROT_JUICE = new SlimefunItemStack("CARROT_JUICE", Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 6, 0),"&6Jugo de Zanahoria", "", "&7&oRestaura &b&o" + "3.0" + " &7&ode hambre"));
	public static final ItemStack PUMPKIN_JUICE = new SlimefunItemStack("PUMPKIN_JUICE", Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 6, 0),"&6Juego de Calabaza", "", "&7&oRestaura &b&o" + "3.0" + " &7&ode hambre"));
	public static final ItemStack SWEET_BERRY_JUICE = new SlimefunItemStack("SWEET_BERRY_JUICE", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 6, 0),"&cJugo de bayas dulces", "", "&7&oRestaura &b&o" + "3.0" + " &7&ode hambre"));
	public static final ItemStack GOLDEN_APPLE_JUICE = new SlimefunItemStack("GOLDEN_APPLE_JUICE", Color.YELLOW, new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0),"&bJugo de manzana dorada");
	
	public static final ItemStack BEEF_JERKY = new SlimefunItemStack("BEEF_JERKY", Material.COOKED_BEEF, "&6Carne seca", "", "&r¡Extra saturante!");
	public static final ItemStack PORK_JERKY = new SlimefunItemStack("PORK_JERKY", Material.COOKED_PORKCHOP, "&6Cecina", "", "&r¡Extra saturante!");
	public static final ItemStack CHICKEN_JERKY = new SlimefunItemStack("CHICKEN_JERKY", Material.COOKED_CHICKEN, "&6Pollo Seco", "", "&r¡Extra saturante!");
	public static final ItemStack MUTTON_JERKY = new SlimefunItemStack("MUTTON_JERKY", Material.COOKED_MUTTON, "&6Carne seca de cordero", "", "&r¡Extra saturante!");
	public static final ItemStack RABBIT_JERKY = new SlimefunItemStack("RABBIT_JERKY", Material.COOKED_RABBIT, "&6Carne seca de conejo", "", "&r¡Extra saturante!");
	public static final ItemStack FISH_JERKY = new SlimefunItemStack("FISH_JERKY", Material.COOKED_COD, "&6Carne seca de Pescado", "", "&r¡Extra saturante!");

	public static final ItemStack KELP_COOKIE = new SlimefunItemStack("KELP_COOKIE", Material.COOKIE, "&2Galleta de Alga");
	
	/*		Christmas		*/
	public static final ItemStack CHRISTMAS_MILK = new SlimefunItemStack("CHRISTMAS_MILK", Color.WHITE, new PotionEffect(PotionEffectType.SATURATION, 5, 0),"&6Vaso de leche", "", "&7&oRestaura &b&o" + "2.5" + " &7&ode hambre");
	public static final ItemStack CHRISTMAS_CHOCOLATE_MILK = new SlimefunItemStack("CHRISTMAS_CHOCOLATE_MILK", Color.MAROON, new PotionEffect(PotionEffectType.SATURATION, 12, 0),"&6Leche con Chocolate", "", "&7&oRestaura &b&o" + "6.0" + " &7&ode hambre");
	public static final ItemStack CHRISTMAS_EGG_NOG = new SlimefunItemStack("CHRISTMAS_EGG_NOG", Color.GRAY, new PotionEffect(PotionEffectType.SATURATION, 7, 0),"&aPonche de huevo", "", "&7&oRestaura &b&o" + "3.5" + " &7&ode hambre");
	public static final ItemStack CHRISTMAS_APPLE_CIDER = new SlimefunItemStack("CHRISTMAS_APPLE_CIDER", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 14, 0),"&cSidra de manzana", "", "&7&oRestaura &b&o" + "7.0" + " &7&ode hambre");
	public static final ItemStack CHRISTMAS_COOKIE = new SlimefunItemStack("CHRISTMAS_COOKIE",Material.COOKIE, ChatUtils.christmas("Galleta de navidad"));
	public static final ItemStack CHRISTMAS_FRUIT_CAKE = new SlimefunItemStack("CHRISTMAS_FRUIT_CAKE",Material.PUMPKIN_PIE, ChatUtils.christmas("Pastel de frutas"));
	public static final ItemStack CHRISTMAS_APPLE_PIE = new SlimefunItemStack("CHRISTMAS_APPLE_PIE",Material.PUMPKIN_PIE, "&rPie de manzana");
	public static final ItemStack CHRISTMAS_HOT_CHOCOLATE = new SlimefunItemStack("CHRISTMAS_HOT_CHOCOLATE", Color.MAROON, new PotionEffect(PotionEffectType.SATURATION, 14, 0),"&6Chocolate caliente", "", "&7&oRestaura &b&o" + "7.0" + " &7&ode hambre");
	public static final ItemStack CHRISTMAS_CAKE = new SlimefunItemStack("CHRISTMAS_CAKE",Material.PUMPKIN_PIE, ChatUtils.christmas("Pastel de Navidad"));
	public static final ItemStack CHRISTMAS_CARAMEL = new SlimefunItemStack("CHRISTMAS_CARAMEL",Material.BRICK, "&6Caramelo");
	public static final ItemStack CHRISTMAS_CARAMEL_APPLE = new SlimefunItemStack("CHRISTMAS_CARAMEL_APPLE",Material.APPLE, "&6Caramelo de Manzana");
	public static final ItemStack CHRISTMAS_CHOCOLATE_APPLE = new SlimefunItemStack("CHRISTMAS_CHOCOLATE_APPLE",Material.APPLE, "&6Manzana de chocolate");
	public static final ItemStack CHRISTMAS_PRESENT = new SlimefunItemStack("CHRISTMAS_PRESENT",Material.CHEST, ChatUtils.christmas("Regalo de Navidad"), "&7De: &emrCookieSlime", "&7Para: &eTí bb", "", "&eClick Derecho&7 para abrir");
	
	/*		Easter			*/
	public static final ItemStack EASTER_EGG = new SlimefunItemStack("EASTER_EGG", Material.EGG, "&rHuevo de Pascua", "&b¡Sorpresa! ¡Sorpresa!");
	public static final ItemStack EASTER_CARROT_PIE = new SlimefunItemStack("CARROT_PIE", Material.PUMPKIN_PIE, "&6Pastel de zanahoria");
	public static final ItemStack EASTER_APPLE_PIE = new SlimefunItemStack("EASTER_APPLE_PIE", Material.PUMPKIN_PIE, "&rPastel de Manzana");
	
	/*		 Weapons 		*/
	public static final ItemStack GRANDMAS_WALKING_STICK = new SlimefunItemStack("GRANDMAS_WALKING_STICK", Material.STICK, "&7Bastón de la abuela");
	public static final ItemStack GRANDPAS_WALKING_STICK = new SlimefunItemStack("GRANDPAS_WALKING_STICK", Material.STICK, "&7Bastón del abuelo");
	public static final ItemStack SWORD_OF_BEHEADING = new SlimefunItemStack("SWORD_OF_BEHEADING", Material.IRON_SWORD, "&6Espada de decapitación", "&7Decapitación II", "", "&rTiene la oportunidad de decapitar a las mounstruos", "&r(incluso una mayor probabilidad de esqueletos de Wither)");
	public static final ItemStack BLADE_OF_VAMPIRES = new SlimefunItemStack("BLADE_OF_VAMPIRES", Material.GOLDEN_SWORD, "&cEspada de vampiros", "&7Robo de vida I", "", "&rCada vez que atacas algo", "&rtienes un 45% de posibilidades de", "&rrecupera 2 corazones de tu salud");
	public static final ItemStack SEISMIC_AXE = new SlimefunItemStack("SEISMIC_AXE", Material.IRON_AXE, "&aHacha sísmica", "", "&7&oUn terremoto portátil...", "", "&7&eClick derecho&7 para usar");
	
	static {
		GRANDMAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
		GRANDPAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);
		
		BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
		BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
		BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
	}
	
	/*		Bows		*/
	public static final ItemStack EXPLOSIVE_BOW = new SlimefunItemStack("EXPLOSIVE_BOW", Material.BOW, "&cArco explosivo", "&rCualquier flecha disparada usando este arco", "&rlanzará enemigos golpeados en el aire");
	public static final ItemStack ICY_BOW = new SlimefunItemStack("ICY_BOW", Material.BOW, "&bArco helado", "&rCualquier flecha disparada usando este arco", "&rcongelará al que sea golpeado por esta", "&rpor 2 segundos");
	
	/*		 Tools		*/
	public static final ItemStack AUTO_SMELT_PICKAXE = new SlimefunItemStack("SMELTERS_PICKAXE", Material.DIAMOND_PICKAXE, "&6Pico de fundición", "&c&lFundición automática", "", "&9Funciona con fortuna");
	public static final ItemStack LUMBER_AXE = new SlimefunItemStack("LUMBER_AXE", Material.DIAMOND_AXE, "&6Hacha de madera", "&a&oCorta todo el árbol..");
	public static final ItemStack PICKAXE_OF_CONTAINMENT = new SlimefunItemStack("PICKAXE_OF_CONTAINMENT", Material.GOLDEN_PICKAXE, "&cPico de contención", "", "&9Puede recoger engendradores");
	public static final ItemStack HERCULES_PICKAXE = new SlimefunItemStack("HERCULES_PICKAXE", Material.IRON_PICKAXE, "&9Pico de Hércules", "", "&rTan poderoso que", "&raplasta todos los minerales extraídos", "&ren polvo...");
	public static final ItemStack EXPLOSIVE_PICKAXE = new SlimefunItemStack("EXPLOSIVE_PICKAXE", Material.DIAMOND_PICKAXE, "&ePico Explosivo", "", "&rTe permite minar un poco", "&rde bloques a la vez...", "", "&9Funciona con fortuna");
	public static final ItemStack EXPLOSIVE_SHOVEL = new SlimefunItemStack("EXPLOSIVE_SHOVEL", Material.DIAMOND_SHOVEL, "&ePala explosiva", "", "&rTe permite minar un poco", "&rde bloques excavables a la vez...");
	public static final ItemStack PICKAXE_OF_THE_SEEKER = new SlimefunItemStack("PICKAXE_OF_THE_SEEKER", Material.DIAMOND_PICKAXE, "&aPico del buscador", "&rSiempre te indicará el mineral más cercano", "&rpero podría dañarse al hacerlo", "", "&7&eClick Derecho&7 ser señalado al mineral más cercano");
	public static final ItemStack COBALT_PICKAXE = new SlimefunItemStack("COBALT_PICKAXE", Material.IRON_PICKAXE, "&9Pico de cobalto");
	public static final ItemStack PICKAXE_OF_VEIN_MINING = new SlimefunItemStack("PICKAXE_OF_VEIN_MINING", Material.DIAMOND_PICKAXE, "&ePico de minería de menas", "", "&rEste pico se cavará", "&rmenas enteras de minerales...");
	
	static {
		HERCULES_PICKAXE.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
		HERCULES_PICKAXE.addUnsafeEnchantment(Enchantment.DIG_SPEED, 3);
		
		COBALT_PICKAXE.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		COBALT_PICKAXE.addUnsafeEnchantment(Enchantment.DIG_SPEED, 6);
	}
	
	/*		 Armor 		*/
	public static final ItemStack GLOWSTONE_HELMET = new SlimefunItemStack("GLOWSTONE_HELMET", Material.LEATHER_HELMET, Color.YELLOW, "&e&lCasco de piedra luminosa", "", "&a&oBrillando como el sol!", "", "&9+ Visión Nocturna");
	public static final ItemStack GLOWSTONE_CHESTPLATE = new SlimefunItemStack("GLOWSTONE_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.YELLOW, "&e&lPeto de piedra luminosa", "", "&a&oBrillando como el sol!", "", "&9+ Visión Nocturna");
	public static final ItemStack GLOWSTONE_LEGGINGS = new SlimefunItemStack("GLOWSTONE_LEGGINGS", Material.LEATHER_LEGGINGS, Color.YELLOW, "&e&lLeotardos de piedra luminosa", "", "&a&oBrillando como el sol!", "", "&9+ Visión Nocturna");
	public static final ItemStack GLOWSTONE_BOOTS = new SlimefunItemStack("GLOWSTONE_BOOTS", Material.LEATHER_BOOTS, Color.YELLOW, "&e&lBotas de piedra luminosa", "", "&a&oBrillando como el sol!", "", "&9+ Visión Nocturna");
	
	public static final ItemStack ENDER_HELMET = new SlimefunItemStack("ENDER_HELMET", Material.LEATHER_HELMET, Color.fromRGB(28, 25, 112), "&5&lCasco de Ender", "", "&a&o¡A veces está aquí, a veces allí!");
	public static final ItemStack ENDER_CHESTPLATE = new SlimefunItemStack("ENDER_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.fromRGB(28, 25, 112), "&5&lPeto de Ender", "", "&a&o¡A veces está aquí, a veces allí!");
	public static final ItemStack ENDER_LEGGINGS = new SlimefunItemStack("ENDER_LEGGINGS", Material.LEATHER_LEGGINGS, Color.fromRGB(28, 25, 112), "&5&lPantalones de Ender", "", "&a&o¡A veces está aquí, a veces allí!");
	public static final ItemStack ENDER_BOOTS = new SlimefunItemStack("ENDER_BOOTS", Material.LEATHER_BOOTS, Color.fromRGB(28, 25, 112), "&5&lBotas de Ender", "", "&a&o¡A veces está aquí, a veces allí!", "" , "&9+ No Enderpearl Damage");
	
	public static final ItemStack SLIME_HELMET = new SlimefunItemStack("SLIME_HELMET", Material.LEATHER_HELMET, Color.LIME, "&a&lCasco de Slime", "", "&a&oSensación de Rebote");
	public static final ItemStack SLIME_CHESTPLATE = new SlimefunItemStack("SLIME_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.LIME, "&a&lPeto", "", "&a&oSensación de Rebote");
	public static final ItemStack SLIME_LEGGINGS = new SlimefunItemStack("SLIME_LEGGINGS", Material.LEATHER_LEGGINGS, Color.LIME, "&a&lPantalones de Slime", "", "&a&oSensación de Rebote", "", "&9+ Velocidad");
	public static final ItemStack SLIME_BOOTS = new SlimefunItemStack("SLIME_BOOTS", Material.LEATHER_BOOTS, Color.LIME, "&a&lBotas para Slime", "", "&a&oSensación de Rebote", "", "&9+ Impulso de salto", "&9+ Sin daño por caída");
	
	public static final ItemStack CACTUS_HELMET = new SlimefunItemStack("CACTUS_HELMET", Material.LEATHER_HELMET, Color.GREEN, "&2Casco de Cactus");
	public static final ItemStack CACTUS_CHESTPLATE = new SlimefunItemStack("CACTUS_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.GREEN, "&2Peto de Cactus");
	public static final ItemStack CACTUS_LEGGINGS = new SlimefunItemStack("CACTUS_LEGGINGS", Material.LEATHER_LEGGINGS, Color.GREEN, "&2Pantalones de Cactus");
	public static final ItemStack CACTUS_BOOTS = new SlimefunItemStack("CACTUS_BOOTS", Material.LEATHER_BOOTS, Color.GREEN, "&2Botas de Cactus");
	
	public static final ItemStack DAMASCUS_STEEL_HELMET = new SlimefunItemStack("DAMASCUS_STEEL_HELMET", Material.IRON_HELMET, "&7Casco de Acero de Damasco");
	public static final ItemStack DAMASCUS_STEEL_CHESTPLATE = new SlimefunItemStack("DAMASCUS_STEEL_CHESTPLATE", Material.IRON_CHESTPLATE, "&7Peto de Acero de Damasco");
	public static final ItemStack DAMASCUS_STEEL_LEGGINGS = new SlimefunItemStack("DAMASCUS_STEEL_LEGGINGS", Material.IRON_LEGGINGS, "&7Pantalones de Acero de Damasco");
	public static final ItemStack DAMASCUS_STEEL_BOOTS = new SlimefunItemStack("DAMASCUS_STEEL_BOOTS", Material.IRON_BOOTS, "&7Botas de Acero de Damasco");
	
	public static final ItemStack REINFORCED_ALLOY_HELMET = new SlimefunItemStack("REINFORCED_ALLOY_HELMET", Material.IRON_HELMET, "&bCasco Reforzado");
	public static final ItemStack REINFORCED_ALLOY_CHESTPLATE = new SlimefunItemStack("REINFORCED_ALLOY_CHESTPLATE", Material.IRON_CHESTPLATE, "&bPeto Reforzado");
	public static final ItemStack REINFORCED_ALLOY_LEGGINGS = new SlimefunItemStack("REINFORCED_ALLOY_LEGGINGS", Material.IRON_LEGGINGS, "&bPantalones Reforzado");
	public static final ItemStack REINFORCED_ALLOY_BOOTS = new SlimefunItemStack("REINFORCED_ALLOY_BOOTS", Material.IRON_BOOTS, "&bBotas Reforzado");
	
	public static final ItemStack SCUBA_HELMET = new SlimefunItemStack("SCUBA_HELMET", Material.LEATHER_HELMET, Color.ORANGE, "&cCasco de buceo", "", "&bTe permite respirar bajo el agua", "&4&oParte del traje de materiales peligrosos");
	public static final ItemStack HAZMATSUIT_CHESTPLATE = new SlimefunItemStack("HAZMAT_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.ORANGE, "&cTraje de materiales peligrosos", "", "&bTe permite caminar a través del fuego", "&4&oParte del traje de materiales peligrosos");
	public static final ItemStack HAZMATSUIT_LEGGINGS = new SlimefunItemStack("HAZMAT_LEGGINGS", Material.LEATHER_LEGGINGS, Color.ORANGE, "&cMallas de traje Hazmat", "", "&4&oParte del traje de materiales peligrosos");
	public static final ItemStack RUBBER_BOOTS = new SlimefunItemStack("RUBBER_BOOTS", Material.LEATHER_BOOTS, Color.BLACK, "&cBotas de goma", "", "&4&oParte del traje de materiales peligrosos");
	
	public static final ItemStack GILDED_IRON_HELMET = new SlimefunItemStack("GILDED_IRON_HELMET", Material.GOLDEN_HELMET, "&6Casco de Hierro dorado");
	public static final ItemStack GILDED_IRON_CHESTPLATE = new SlimefunItemStack("GILDED_IRON_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&6Peto de Hierro dorado");
	public static final ItemStack GILDED_IRON_LEGGINGS = new SlimefunItemStack("GILDED_IRON_LEGGINGS", Material.GOLDEN_LEGGINGS, "&6Pantalones de Hierro dorado");
	public static final ItemStack GILDED_IRON_BOOTS = new SlimefunItemStack("GILDED_IRON_BOOTS", Material.GOLDEN_BOOTS, "&6Botas de Hierro dorado");
	
	public static final ItemStack GOLD_HELMET = new SlimefunItemStack("GOLD_12K_HELMET", Material.GOLDEN_HELMET, "&6Casco de Gold", "&912-Carat");
	public static final ItemStack GOLD_CHESTPLATE = new SlimefunItemStack("GOLD_12K_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&6Peto de Gold", "&912-Carat");
	public static final ItemStack GOLD_LEGGINGS = new SlimefunItemStack("GOLD_12K_LEGGINGS", Material.GOLDEN_LEGGINGS, "&6Pantalones de Gold", "&912-Carat");
	public static final ItemStack GOLD_BOOTS = new SlimefunItemStack("GOLD_12K_BOOTS", Material.GOLDEN_BOOTS, "&6Botas de Gold", "&912-Carat");
	
	public static final ItemStack SLIME_HELMET_STEEL = new SlimefunItemStack("SLIME_STEEL_HELMET", Material.IRON_HELMET, "&a&lCasco de Slime", "&7&oReforzado", "", "&a&oSensación de Rebote");
	public static final ItemStack SLIME_CHESTPLATE_STEEL = new SlimefunItemStack("SLIME_STEEL_CHESTPLATE", Material.IRON_CHESTPLATE, "&a&lPeto de Slime", "&7&oReforzado", "", "&a&oSensación de Rebote");
	public static final ItemStack SLIME_LEGGINGS_STEEL = new SlimefunItemStack("SLIME_STEEL_LEGGINGS", Material.IRON_LEGGINGS, "&a&lPantalones de Slime", "&7&oReforzado", "", "&a&oSensación de Rebote", "", "&9+ Velocidad");
	public static final ItemStack SLIME_BOOTS_STEEL = new SlimefunItemStack("SLIME_STEEL_BOOTS", Material.IRON_BOOTS, "&a&lBotas de Slime", "&7&oReforzado", "", "&a&oSensación de Rebote", "", "&9+ Impulso de salto", "&9+ Sin daño por caída");
	
	public static final ItemStack BOOTS_OF_THE_STOMPER = new SlimefunItemStack("BOOTS_OF_THE_STOMPER", Material.LEATHER_BOOTS, Color.AQUA, "&bBotas del pisotón", "", "&9Todo el daño de caída que recibes", "&9se aplicará a los mobs / jugadores cercanos", "", "&9+ Sin daño por caída");
	
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
	}
	
	/*		 Misc 		*/
	public static final ItemStack MAGIC_LUMP_1 = new SlimefunItemStack("MAGIC_LUMP_1", Material.GOLD_NUGGET, "&6Bulto mágico &7- &eI", "", "&c&oTier: I");
	public static final ItemStack MAGIC_LUMP_2 = new SlimefunItemStack("MAGIC_LUMP_2", Material.GOLD_NUGGET, "&6Bulto mágico &7- &eII", "", "&c&oTier: II");
	public static final ItemStack MAGIC_LUMP_3 = new SlimefunItemStack("MAGIC_LUMP_3", Material.GOLD_NUGGET, "&6Bulto mágico &7- &eIII", "", "&c&oTier: III");
	public static final ItemStack ENDER_LUMP_1 = new SlimefunItemStack("ENDER_LUMP_1", Material.GOLD_NUGGET, "&5Bulto de Ender &7- &eI", "", "&c&oTier: I");
	public static final ItemStack ENDER_LUMP_2 = new SlimefunItemStack("ENDER_LUMP_2", Material.GOLD_NUGGET, "&5Bulto de Ender &7- &eII", "", "&c&oTier: II");
	public static final ItemStack ENDER_LUMP_3 = new SlimefunItemStack("ENDER_LUMP_3", Material.GOLD_NUGGET, "&5Bulto de Ender &7- &eIII", "", "&c&oTier: III");
	public static final ItemStack MAGICAL_BOOK_COVER = new SlimefunItemStack("MAGICAL_BOOK_COVER", Material.PAPER, "&6Portada de libro mágico", "", "&a&oUtilizado para varios libros de magia");
	public static final ItemStack BASIC_CIRCUIT_BOARD = new SlimefunItemStack("BASIC_CIRCUIT_BOARD", Material.ACTIVATOR_RAIL, "&bPlaca de circuito básico");
	public static final ItemStack ADVANCED_CIRCUIT_BOARD = new SlimefunItemStack("ADVANCED_CIRCUIT_BOARD", Material.POWERED_RAIL, "&bCircuito avanzado");
	public static final ItemStack WHEAT_FLOUR = new SlimefunItemStack("WHEAT_FLOUR", Material.SUGAR, "&rHarina de trigo");
	public static final ItemStack STEEL_PLATE = new SlimefunItemStack("STEEL_PLATE", Material.PAPER, "&7&lPlaca de acero");
	public static final ItemStack BATTERY = new SlimefunItemStack("BATTERY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmUyZGRhNmVmNjE4NWQ0ZGQ2ZWE4Njg0ZTk3ZDM5YmE4YWIwMzdlMjVmNzVjZGVhNmJkMjlkZjhlYjM0ZWUifX19", "&6Batería");
	public static final ItemStack CARBON = new SlimefunItemStack("CARBON", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGIzYTA5NWI2YjgxZTZiOTg1M2ExOTMyNGVlZGYwYmI5MzQ5NDE3MjU4ZGQxNzNiOGVmZjg3YTA4N2FhIn19fQ==", "&eCarbono");
	public static final ItemStack COMPRESSED_CARBON = new SlimefunItemStack("COMPRESSED_CARBON", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0=", "&cCarbono Comprimido");
	public static final ItemStack CARBON_CHUNK = new SlimefunItemStack("CARBON_CHUNK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0=", "&4Trozo de Carbono");
	public static final ItemStack STEEL_THRUSTER = new SlimefunItemStack("STEEL_THRUSTER", Material.BUCKET, "&7&lPropulsor de acero");
	public static final ItemStack POWER_CRYSTAL = new SlimefunItemStack("POWER_CRYSTAL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTNjMWIwMzZiNmUwMzUxN2IyODVhODExYmQ4NWU3M2Y1YWJmZGFjYzFkZGY5MGRmZjk2MmUxODA5MzRlMyJ9fX0=", "&c&lCristal de poder");
	public static final ItemStack CHAIN = new SlimefunItemStack("CHAIN", Material.STRING, "&bCadena");
	public static final ItemStack HOOK = new SlimefunItemStack("HOOK", Material.FLINT, "&bEnganche");
	public static final ItemStack SIFTED_ORE = new SlimefunItemStack("SIFTED_ORE", Material.GUNPOWDER, "&6Mineral tamizado");
	public static final ItemStack STONE_CHUNK = new SlimefunItemStack("STONE_CHUNK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U4ZjVhZGIxNGQ2YzlmNmI4MTBkMDI3NTQzZjFhOGMxZjQxN2UyZmVkOTkzYzk3YmNkODljNzRmNWUyZTgifX19", "&6Trozo de piedra");
	public static final ItemStack LAVA_CRYSTAL = new SlimefunItemStack("LAVA_CRYSTAL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTNhZDhlZTg0OWVkZjA0ZWQ5YTI2Y2EzMzQxZjYwMzNiZDc2ZGNjNDIzMWVkMWVhNjNiNzU2NTc1MWIyN2FjIn19fQ==", "&4Cristal de lava");
	public static final ItemStack SALT = new SlimefunItemStack("SALT", Material.SUGAR, "&rSal");
	public static final ItemStack CHEESE = new SlimefunItemStack("CHEESE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzRmZWJiYzE1ZDFkNGNjNjJiZWRjNWQ3YTJiNmYwZjQ2Y2Q1YjA2OTZhODg0ZGU3NWUyODllMzVjYmI1M2EwIn19fQ==", "&rQueso");
	public static final ItemStack BUTTER = new SlimefunItemStack("BUTTER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY2YjE5ZjdkNjM1ZDAzNDczODkxZGYzMzAxN2M1NDkzNjMyMDlhOGY2MzI4YTg1NDJjMjEzZDA4NTI1ZSJ9fX0=", "&rMantequilla");
	public static final ItemStack DUCT_TAPE = new SlimefunItemStack("DUCT_TAPE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjJmYWFjZWFiNjM4NGZmZjVlZDI0YmI0NGE0YWYyZjU4NGViMTM4MjcyOWVjZDkzYTUzNjlhY2ZkNjY1NCJ9fX0=", "&8Cinta adhesiva", "", "&rPuedes reparar artículos usando esto", "&ren un yunque automático");
	public static final ItemStack HEAVY_CREAM = new SlimefunItemStack("HEAVY_CREAM", Material.SNOWBALL, "&rCrema espesa");
	public static final ItemStack CRUSHED_ORE = new SlimefunItemStack("CRUSHED_ORE", Material.GUNPOWDER, "&6Mineral triturado");
	public static final ItemStack PULVERIZED_ORE = new SlimefunItemStack("PULVERIZED_ORE", Material.GUNPOWDER, "&6Mineral pulverizado");
	public static final ItemStack PURE_ORE_CLUSTER = new SlimefunItemStack("PURE_ORE_CLUSTER", Material.GUNPOWDER, "&6Racimo de mineral puro");
	public static final ItemStack SMALL_URANIUM = new SlimefunItemStack("SMALL_URANIUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0=", "&cPequeño trozo de uranio", "", "&eNivel de radiación: MODERADO", "&4&oTraje contra radiación requerida");
	public static final ItemStack TINY_URANIUM = new SlimefunItemStack("TINY_URANIUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0=", "&cPequeña pila de uranio", "", "&cNivel de radiación: LOW", "&4&oNo es Traje contra radiación requerida");
	
	public static final ItemStack MAGNET = new SlimefunItemStack("MAGNET", "aba8ebc4c6a81730947499bf7e1d5e73fed6c1bb2c051e96d35eb16d24610e7", "&cMagneto");
	public static final ItemStack NECROTIC_SKULL = new SlimefunItemStack("NECROTIC_SKULL", Material.WITHER_SKELETON_SKULL, "&cCráneo necrótico");
	public static final ItemStack ESSENCE_OF_AFTERLIFE = new SlimefunItemStack("ESSENCE_OF_AFTERLIFE", Material.GUNPOWDER, "&4Esencia del más allá");
	public static final ItemStack ELECTRO_MAGNET = new SlimefunItemStack("ELECTRO_MAGNET", "aba8ebc4c6a81730947499bf7e1d5e73fed6c1bb2c051e96d35eb16d24610e7", "&cElectromagneto");
	public static final ItemStack HEATING_COIL = new SlimefunItemStack("HEATING_COIL", "7e3bc4893ba41a3f73ee28174cdf4fef6b145e41fe6c82cb7be8d8e9771a5", "&cBobina de calentamiento");
	public static final ItemStack COOLING_UNIT = new SlimefunItemStack("COOLING_UNIT", "754bad86c99df780c889a1098f77648ead7385cc1ddb093da5a7d8c4c2ae54d", "&bUnidad de enfriamiento");
	public static final ItemStack ELECTRIC_MOTOR = new SlimefunItemStack("ELECTRIC_MOTOR", "8cbca012f67e54de9aee72ff424e056c2ae58de5eacc949ab2bcd9683cec", "&cMotor Electrico");
	public static final ItemStack CARGO_MOTOR = new SlimefunItemStack("CARGO_MOTOR", "8cbca012f67e54de9aee72ff424e056c2ae58de5eacc949ab2bcd9683cec", "&3Motor de Carga");
	public static final ItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new SlimefunItemStack("SCROLL_OF_DIMENSIONAL_TELEPOSITION", Material.PAPER, "&6Pergamino de teleposición dimensional", "", "&cEste pergamino es capaz de crear", "&cun agujero negro temporal que tira", "&centidades cercanas en sí mismo y los envía", "&ca otra dimensión donde", "&ctodo está al revés", "", "&rEn otras palabras: Hace que las entidades giren 180 grados");
	public static final ItemStack TOME_OF_KNOWLEDGE_SHARING = new SlimefunItemStack("TOME_OF_KNOWLEDGE_SHARING", Material.BOOK, "&6Tomo de intercambio de conocimientos", "&7Dueño: &bNone", "", "&eClick Derecho&7 para unir este tomo a ti mismo", "", "", "&eClick Derecho&7 para obtener todas las investigaciones por", "&7el propietario previamente asignado");
	public static final ItemStack HARDENED_GLASS = new SlimefunItemStack("HARDENED_GLASS", Material.LIGHT_GRAY_STAINED_GLASS, "&7Vidrio endurecido", "", "&rSoporta explosiones");
	public static final ItemStack WITHER_PROOF_OBSIDIAN = new SlimefunItemStack("WITHER_PROOF_OBSIDIAN", Material.OBSIDIAN, "&5Obsidiana a prueba de Wither", "", "&rSoporta explosiones", "&rResiste a los jefes de Wither");
	public static final ItemStack WITHER_PROOF_GLASS = new SlimefunItemStack("WITHER_PROOF_GLASS", Material.PURPLE_STAINED_GLASS, "&5Vidrio a prueba de Wither", "", "&rSoporta explosiones", "&rResiste a los jefes de Wither");
	public static final ItemStack REINFORCED_PLATE = new SlimefunItemStack("REINFORCED_PLATE", Material.PAPER, "&7Plato Reforzado");
	public static final ItemStack ANCIENT_PEDESTAL = new SlimefunItemStack("ANCIENT_PEDESTAL", Material.DISPENSER, "&dPedestal antiguo", "", "&5Parte del altar antiguo");
	public static final ItemStack ANCIENT_ALTAR = new SlimefunItemStack("ANCIENT_ALTAR", Material.ENCHANTING_TABLE, "&dAltar Antiguo", "", "&5Altar de bloques múltiples para", "&5procesos mágicos de elaboración");
	public static final ItemStack COPPER_WIRE = new SlimefunItemStack("COPPER_WIRE", Material.STRING, "&6Alambre de cobre", "", "&6Componente crucial en módulos eléctricos.");
	
	public static final ItemStack RAINBOW_WOOL = new SlimefunItemStack("RAINBOW_WOOL", Material.WHITE_WOOL, "&5Lana de arco iris", "", "&d¡Ciclos a través de todos los colores del arco iris!");
	public static final ItemStack RAINBOW_GLASS = new SlimefunItemStack("RAINBOW_GLASS", Material.WHITE_STAINED_GLASS, "&5Vidrio arcoiris", "", "&d¡Recorre todos los colores del arcoiris!");
	public static final ItemStack RAINBOW_CLAY = new SlimefunItemStack("RAINBOW_CLAY", Material.WHITE_TERRACOTTA, "&5Arcilla del arco iris", "", "&d¡Recorre todos los colores del arcoiris!");
	public static final ItemStack RAINBOW_GLASS_PANE = new SlimefunItemStack("RAINBOW_GLASS_PANE", Material.WHITE_STAINED_GLASS_PANE, "&5Panel de vidrio arcoiris", "", "&d¡Ciclos a través de todos los colores del arco iris!");
	
	public static final ItemStack RAINBOW_WOOL_XMAS = new SlimefunItemStack("RAINBOW_WOOL_XMAS", Material.WHITE_WOOL, "&5Lana de arco iris &7(Navidad)", "", Christmas.color("< Christmas Edition >"));
	public static final ItemStack RAINBOW_GLASS_XMAS = new SlimefunItemStack("RAINBOW_GLASS_XMAS", Material.WHITE_STAINED_GLASS, "&5Vidrio arcoiris &7(Navidad)", "", Christmas.color("< Christmas Edition >"));
	public static final ItemStack RAINBOW_CLAY_XMAS = new SlimefunItemStack("RAINBOW_CLAY_XMAS", Material.WHITE_TERRACOTTA, "&5Arcilla del arco iris &7(Navidad)", "", Christmas.color("< Christmas Edition >"));
	public static final ItemStack RAINBOW_GLASS_PANE_XMAS = new SlimefunItemStack("RAINBOW_GLASS_PANE_XMAS", Material.WHITE_STAINED_GLASS_PANE, "&5Panel de vidrio arcoiris &7(Navidad)", "", Christmas.color("< Christmas Edition >"));
	
	public static final ItemStack RAINBOW_WOOL_VALENTINE = new SlimefunItemStack("RAINBOW_WOOL_VALENTINE", Material.PINK_WOOL, "&5Lana de arco iris &7(Día de San Valentín)", "", "&d< Día de San Valentín >");
	public static final ItemStack RAINBOW_GLASS_VALENTINE = new SlimefunItemStack("RAINBOW_GLASS_VALENTINE", Material.PINK_STAINED_GLASS, "&5Vidrio arcoiris &7(Día de San Valentín)", "", "&d< Día de San Valentín >");
	public static final ItemStack RAINBOW_CLAY_VALENTINE = new SlimefunItemStack("RAINBOW_CLAY_VALENTINE", Material.PINK_TERRACOTTA, "&5Arcilla del arco iris &7(Día de San Valentín)", "", "&d< Día de San Valentín >");
	public static final ItemStack RAINBOW_GLASS_PANE_VALENTINE = new SlimefunItemStack("RAINBOW_GLASS_PANE_VALENTINE", Material.PINK_STAINED_GLASS_PANE, "&5Panel de vidrio arcoiris &7(Día de San Valentín)", "", "&d< Día de San Valentín >");
    
	/*		 Ingots 		*/
	public static final ItemStack COPPER_INGOT = new SlimefunItemStack("COPPER_INGOT", Material.BRICK, "&bLingote de Cobre");
	public static final ItemStack TIN_INGOT = new SlimefunItemStack("TIN_INGOT", Material.IRON_INGOT, "&bLingote de Estaño");
	public static final ItemStack SILVER_INGOT = new SlimefunItemStack("SILVER_INGOT", Material.IRON_INGOT, "&bLingote de Plata");
	public static final ItemStack ALUMINUM_INGOT = new SlimefunItemStack("ALUMINUM_INGOT", Material.IRON_INGOT, "&bLingote de Aluminio");
	public static final ItemStack LEAD_INGOT = new SlimefunItemStack("LEAD_INGOT", Material.IRON_INGOT, "&bLingote de Plomo");
	public static final ItemStack ZINC_INGOT = new SlimefunItemStack("ZINC_INGOT", Material.IRON_INGOT, "&bLingote de Zinc");
	public static final ItemStack MAGNESIUM_INGOT = new SlimefunItemStack("MAGNESIUM_INGOT", Material.IRON_INGOT, "&bLingote de Magnesio");
	
	/*		Alloy (Carbon + Iron)	*/
	public static final ItemStack STEEL_INGOT = new SlimefunItemStack("STEEL_INGOT", Material.IRON_INGOT, "&bLingote de Acero");
	/*		Alloy (Copper + Tin)	*/
	public static final ItemStack BRONZE_INGOT = new SlimefunItemStack("BRONZE_INGOT", Material.BRICK, "&bLingote de Bronce");
	/*		Alloy (Copper + Aluminum)	*/
	public static final ItemStack DURALUMIN_INGOT = new SlimefunItemStack("DURALUMIN_INGOT", Material.IRON_INGOT, "&bLingote de Duraluminio");
	/*		Alloy (Copper + Silver)	*/
	public static final ItemStack BILLON_INGOT = new SlimefunItemStack("BILLON_INGOT", Material.IRON_INGOT, "&bLingote de Billon");
	/*		Alloy (Copper + Zinc)	*/
	public static final ItemStack BRASS_INGOT = new SlimefunItemStack("BRASS_INGOT", Material.GOLD_INGOT, "&bLingote de Brass");
	/*		Alloy (Aluminum + Brass)	*/
	public static final ItemStack ALUMINUM_BRASS_INGOT = new SlimefunItemStack("ALUMINUM_BRASS_INGOT", Material.GOLD_INGOT, "&bLingote de Latón de aluminio");
	/*		Alloy (Aluminum + Bronze)	*/
	public static final ItemStack ALUMINUM_BRONZE_INGOT = new SlimefunItemStack("ALUMINUM_BRONZE_INGOT", Material.GOLD_INGOT, "&bLingote de Bronce y aluminio");
	/*		Alloy (Gold + Silver + Copper)	*/
	public static final ItemStack CORINTHIAN_BRONZE_INGOT = new SlimefunItemStack("CORINTHIAN_BRONZE_INGOT", Material.GOLD_INGOT, "&bLingote de Bronce corintio");
	/*		Alloy (Lead + Tin)	*/
	public static final ItemStack SOLDER_INGOT = new SlimefunItemStack("SOLDER_INGOT", Material.IRON_INGOT, "&bLingote de Soldadura");
	/*		Alloy (Steel + Iron + Carbon)	*/
	public static final ItemStack DAMASCUS_STEEL_INGOT = new SlimefunItemStack("DAMASCUS_STEEL_INGOT", Material.IRON_INGOT, "&bLingote de Acero de Damasco");
	/*		Alloy (Damascus Steel + Duralumin + Compressed Carbon + Aluminium Bronze)	*/
	public static final ItemStack HARDENED_METAL_INGOT = new SlimefunItemStack("HARDENED_METAL_INGOT", Material.IRON_INGOT, "&b&lMetal endurecido");
	/*		Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + Damascus Steel)	*/
	public static final ItemStack REINFORCED_ALLOY_INGOT = new SlimefunItemStack("REINFORCED_ALLOY_INGOT", Material.IRON_INGOT, "&b&lLingote de Aleación Reforzada");
	/*		Alloy (Iron + Silicon)		*/
	public static final ItemStack FERROSILICON = new SlimefunItemStack("FERROSILICON", Material.IRON_INGOT, "&bFerrosilicon");
	/*		Alloy (Iron + Gold)			*/
	public static final ItemStack GILDED_IRON = new SlimefunItemStack("GILDED_IRON", Material.GOLD_INGOT, "&6&lHierro dorado");
	/*		Alloy (Redston + Ferrosilicon)	*/
	public static final ItemStack REDSTONE_ALLOY = new SlimefunItemStack("REDSTONE_ALLOY", Material.BRICK, "&cLingote de Aleación de Redstone");
	/*		Alloy (Iron + Copper)		*/
	public static final ItemStack NICKEL_INGOT = new SlimefunItemStack("NICKEL_INGOT", Material.IRON_INGOT, "&bLingote de Nickel");
	/*		Alloy (Nickel + Iron + Copper)		*/
	public static final ItemStack COBALT_INGOT = new SlimefunItemStack("COBALT_INGOT", Material.IRON_INGOT, "&9Lingote de Cobalto");
	
	/*		Gold		*/
	public static final ItemStack GOLD_4K = new SlimefunItemStack("GOLD_4K", Material.GOLD_INGOT, "&rLingote de Oro &7(4-Quilates)");
	public static final ItemStack GOLD_6K = new SlimefunItemStack("GOLD_6K", Material.GOLD_INGOT, "&rLingote de Oro &7(6-Quilates)");
	public static final ItemStack GOLD_8K = new SlimefunItemStack("GOLD_8K", Material.GOLD_INGOT, "&rLingote de Oro &7(8-Quilates)");
	public static final ItemStack GOLD_10K = new SlimefunItemStack("GOLD_10K", Material.GOLD_INGOT, "&rLingote de Oro &7(10-Quilates)");
	public static final ItemStack GOLD_12K = new SlimefunItemStack("GOLD_12K", Material.GOLD_INGOT, "&rLingote de Oro &7(12-Quilates)");
	public static final ItemStack GOLD_14K = new SlimefunItemStack("GOLD_14K", Material.GOLD_INGOT, "&rLingote de Oro &7(14-Quilates)");
	public static final ItemStack GOLD_16K = new SlimefunItemStack("GOLD_16K", Material.GOLD_INGOT, "&rLingote de Oro &7(16-Quilates)");
	public static final ItemStack GOLD_18K = new SlimefunItemStack("GOLD_18K", Material.GOLD_INGOT, "&rLingote de Oro &7(18-Quilates)");
	public static final ItemStack GOLD_20K = new SlimefunItemStack("GOLD_20K", Material.GOLD_INGOT, "&rLingote de Oro &7(20-Quilates)");
	public static final ItemStack GOLD_22K = new SlimefunItemStack("GOLD_22K", Material.GOLD_INGOT, "&rLingote de Oro &7(22-Quilates)");
	public static final ItemStack GOLD_24K = new SlimefunItemStack("GOLD_24K", Material.GOLD_INGOT, "&rLingote de Oro &7(24-Quilates)");
	
	/*		 Dusts 		*/
	public static final ItemStack IRON_DUST = new SlimefunItemStack("IRON_DUST", Material.GUNPOWDER, "&6Polvo de Hierro");
	public static final ItemStack GOLD_DUST = new SlimefunItemStack("GOLD_DUST", Material.GLOWSTONE_DUST, "&6Polvo de Oro");
	public static final ItemStack TIN_DUST = new SlimefunItemStack("TIN_DUST", Material.SUGAR, "&6Polvo de Estaño");
	public static final ItemStack COPPER_DUST = new SlimefunItemStack("COPPER_DUST", Material.GLOWSTONE_DUST, "&6Polvo de Cobre");
	public static final ItemStack SILVER_DUST = new SlimefunItemStack("SILVER_DUST", Material.SUGAR, "&6Polvo de Plata");
	public static final ItemStack ALUMINUM_DUST = new SlimefunItemStack("ALUMINUM_DUST", Material.SUGAR, "&6Polvo de Aluminio");
	public static final ItemStack LEAD_DUST = new SlimefunItemStack("LEAD_DUST", Material.GUNPOWDER, "&6Polvo de Plomo");
	public static final ItemStack SULFATE = new SlimefunItemStack("SULFATE", Material.GLOWSTONE_DUST, "&6Sulfato");
	public static final ItemStack ZINC_DUST = new SlimefunItemStack("ZINC_DUST", Material.SUGAR, "&6Polvo de Zinc");
	public static final ItemStack MAGNESIUM_DUST = new SlimefunItemStack("MAGNESIUM_DUST", Material.SUGAR, "&6Magnesio");
	public static final ItemStack SILICON = new SlimefunItemStack("SILICON", Material.FIREWORK_STAR, "&6Silicón");
	public static final ItemStack GOLD_24K_BLOCK = new SlimefunItemStack("GOLD_24K_BLOCK", Material.GOLD_BLOCK, "&rBloque de Oro &7(24-Quilates)");
	
	/*		 Gems 		*/
	public static final ItemStack SYNTHETIC_DIAMOND = new SlimefunItemStack("SYNTHETIC_DIAMOND", Material.DIAMOND, "&bDiamante Sintético");
	public static final ItemStack SYNTHETIC_EMERALD = new SlimefunItemStack("SYNTHETIC_EMERALD", Material.EMERALD, "&bEsmeralda Sintética");
	public static final ItemStack SYNTHETIC_SAPPHIRE = new SlimefunItemStack("SYNTHETIC_SAPPHIRE", "e35032f4d7d01de8ec99d89f8723012d4e74fa73022c4facf1b57c7ff6ff0", "&bSafiro Sintético");
	public static final ItemStack CARBONADO = new SlimefunItemStack("CARBONADO", "12f4b1577f5160c6893172571c4a71d8b321cdceaa032c6e0e3b60e0b328fa", "&b&lCarbonado", "", "&7&o\"Diamante Negro\"");
	public static final ItemStack RAW_CARBONADO = new SlimefunItemStack("RAW_CARBONADO", "eb49e6ec10771e899225aea73cd8cf03684f411d1415c7323c93cb9476230=", "&bCarbonado Crudo");
	
	public static final ItemStack URANIUM = new SlimefunItemStack("URANIUM", "c8b29afa6d6dc923e2e1324bf8192750f7bdbddc689632a2b6c18d9fe7a5e=", "&4Uranio", "", "&2Nivel de radiación: ALTA", "&4&oTraje contra radiación requerida");
	public static final ItemStack NEPTUNIUM = new SlimefunItemStack("NEPTUNIUM", "4edea6bfd37e49de43f154fe6fca617d4129e61b95759a3d49a15935a1c2dcf0=", "&aNeptunio", "", "&2Nivel de radiación: ALTA", "&4&oTraje contra radiación requerida");
	public static final ItemStack PLUTONIUM = new SlimefunItemStack("PLUTONIUM", "25cf91b7388665a6d7c1b6026bdb2322c6d278997a44478677cbcc15f76124f==", "&7Plutonio", "", "&2Nivel de radiación: ALTA", "&4&oTraje contra radiación requerida");
	public static final ItemStack BOOSTED_URANIUM = new SlimefunItemStack("BOOSTED_URANIUM", "6837ca12f222f4787196a17b8ab656985f8404c50767adbcb6e7f14254fee=", "&2Uranio potenciado", "", "&2Nivel de radiación: ALTA", "&4&oTraje contra radiación requerida");
	
	/*		Talisman		*/
	public static final ItemStack TALISMAN = new SlimefunItemStack("COMMON_TALISMAN", Material.EMERALD, "&6Talisman Común");
	public static final ItemStack ENDER_TALISMAN = new SlimefunItemStack("ENDER_TALISMAN", Material.EMERALD, "&5Talisman de Ender");
	
	public static final ItemStack TALISMAN_ANVIL = new SlimefunItemStack("ANVIL_TALISMAN", Material.EMERALD, "&aTalisman del Herrero", "", "&rCada Talisman previene que", "&r1 herramienta se rompa, pero entonces", "&rserá consumido", "", "&4&lADVERTENCIA:", "&4Este talisman no funcionará con", "&4herramientas muy poderosas", "&4o muy complejas.");
	public static final ItemStack TALISMAN_MINER = new SlimefunItemStack("MINER_TALISMAN", Material.EMERALD, "&aTalisman del Minero", "", "&rMientras tenga este Talisman", "&ren su inventario tiene", "&run 20% de probabilidad de multiplicar", "&rtodos los ores que piques.");
	public static final ItemStack TALISMAN_HUNTER = new SlimefunItemStack("HUNTER_TALISMAN", Material.EMERALD, "&aTalisman del Cazador", "", "&rMientras tenga este Talisman", "&ren su inventario tiene", "&run 20% de probabilidad de multiplicar", "&rlos items de los mobs.");
	public static final ItemStack TALISMAN_LAVA = new SlimefunItemStack("LAVA_TALISMAN", Material.EMERALD, "&aTalisman del caminante volcánico", "", "&rMientras tenga este Talisman", "&ren su inventario lo hará", "&rresistente al fuego", "&rtan pronto como toque la lava", "&rpero se consumirá el talisman.");
	public static final ItemStack TALISMAN_WATER = new SlimefunItemStack("WATER_TALISMAN", Material.EMERALD, "&aTalisman del Buceador", "", "&rMientras tenga este Talisman", "&ren su inventario le dará la", "&rhabilidad de respirar bajo", "&rel agua tan pronto como", "&rempiezes ahogarte", "&rpero se consumirá el talisman.");
	public static final ItemStack TALISMAN_ANGEL = new SlimefunItemStack("ANGEL_TALISMAN", Material.EMERALD, "&aTalisman del Angel", "", "&rMientras tenga este Talisman", "&ren su inventario tiene una", "&rprobabilidad del 75% que no", "&rrecibas daño por caída");
	public static final ItemStack TALISMAN_FIRE = new SlimefunItemStack("FIRE_TALISMAN", Material.EMERALD, "&aTalisman del luchador de fuego", "", "&rMientras tenga este Talisman", "&ren su inventario lo hará", "&rresistente al fuego", "&rtan printo como empieces a quemarte", "&rpero se consumirá el talisman.");
	public static final ItemStack TALISMAN_MAGICIAN = new SlimefunItemStack("MAGICIAN_TALISMAN", Material.EMERALD, "&aTalisman del Mago", "", "&rMientras tenga este Talisman", "&ren tu inventario te da", "&run 80% de suerte extra al encantar", "&rA veces obtendrás un encantamiento adicional");
	public static final ItemStack TALISMAN_TRAVELLER = new SlimefunItemStack("TRAVELLER_TALISMAN", Material.EMERALD, "&aTalisman del Viajero", "", "&rMientras tenga este Talisman", "&ren tu inventario te da", "&run 60% probabilidad de obtener", "&run incremento de velocidad mientras corra.");
	public static final ItemStack TALISMAN_WARRIOR = new SlimefunItemStack("WARRIOR_TALISMAN", Material.EMERALD, "&aTalisman del Guerrero", "", "&rMientras tenga este Talisman", "&ren tu inventario te da", "&rFuerza III cada vez que te golpean", "&rpero se consumirá el talisman.");
	public static final ItemStack TALISMAN_KNIGHT = new SlimefunItemStack("KNIGHT_TALISMAN", Material.EMERALD, "&aTalisman del Caballero", "", "&rMientras tenga este Talisman", "&ren tu inventario te da", "&run 30% probabilidad de obtener regeneración por", "&r5 segundos cada vez que te golpean", "&rpero se consumirá el talisman.");
	public static final ItemStack TALISMAN_WHIRLWIND = new SlimefunItemStack("WHIRLWIND_TALISMAN", Material.EMERALD, "&aTalisman del Torbellino", "", "&rMientras tenga este Talisman", "&ren su inventario reflejará", "&rel 60% de los proyectiles que te disparen.");
	public static final ItemStack TALISMAN_WIZARD = new SlimefunItemStack("WIZARD_TALISMAN", Material.EMERALD, "&aTalisman del Hechicero", "", "&rMientras tenga este Talisman", "&ren su inventario te permitirá", "&robtener Fortuna de nivel 4/5 sin embargo", "&rtambién habrá la probabilidad de bajar", "&run nivel de otro encantamientos del objeto.");
	
	/*		Staves		*/
	public static final ItemStack STAFF_ELEMENTAL = new SlimefunItemStack("STAFF_ELEMENTAL", Material.STICK, "&6Bastón Elemental");
	public static final ItemStack STAFF_WIND = new SlimefunItemStack("STAFF_ELEMENTAL_WIND", Material.STICK, "&6Bastón Elemental &7- &b&oAire", "", "&7Elemento: &b&oAire", "", "&eClick Derecho&7 para lanzarse hacia adelante");
	public static final ItemStack STAFF_FIRE = new SlimefunItemStack("STAFF_ELEMENTAL_FIRE", Material.STICK, "&6Bastón Elemental &7- &c&oFuego", "", "&7Elemento: &c&oFuego");
	public static final ItemStack STAFF_WATER = new SlimefunItemStack("STAFF_ELEMENTAL_WATER", Material.STICK, "&6Bastón Elemental &7- &1&oAgua", "", "&7Elemento: &1&oAgua", "", "&eClick Derecho&7 para extinguirte");
	public static final ItemStack STAFF_STORM = new SlimefunItemStack("STAFF_ELEMENTAL_STORM", Material.STICK, "&6Bastón Elemental &7- &8&oTormenta", "", "&7Elemento: &8&oTormenta", "", "&eClick Derecho&7 para convocar un rayo", "&e" + StormStaff.MAX_USES + " Usos &7restantes");
	
	static {
		STAFF_WIND.addUnsafeEnchantment(Enchantment.LUCK, 1);
		STAFF_FIRE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);
		STAFF_WATER.addUnsafeEnchantment(Enchantment.WATER_WORKER, 1);
		STAFF_STORM.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
	}
	
	/*		 Machines 		*/
	public static final ItemStack GRIND_STONE = new SlimefunItemStack("GRIND_STONE", Material.DISPENSER, "&bPiedra de moler", "", "&aMuele elementos a otros elementos");
	public static final ItemStack ARMOR_FORGE = new SlimefunItemStack("ARMOR_FORGE", Material.ANVIL, "&6Forja de armadura", "", "&aTe da la capacidad de crear poderosas armaduras");
	public static final ItemStack SMELTERY = new SlimefunItemStack("SMELTERY", Material.FURNACE, "&6Taller de fundición", "", "&aActúa como un horno de alta temperatura para metales.");
	public static final ItemStack IGNITION_CHAMBER = new SlimefunItemStack("IGNITION_CHAMBER", Material.HOPPER, "&4Cámara de encendido automático", "&rEvita que la fundición agote el fuego.", "&rRequiere pedernal y acero", "&rDebe colocarse junto al dispensador de la fundición.");
	public static final ItemStack ORE_CRUSHER = new SlimefunItemStack("ORE_CRUSHER", Material.DISPENSER, "&bTrituradora de mineral", "", "&aAplasta minerales para duplicarlos");
	public static final ItemStack COMPRESSOR = new SlimefunItemStack("COMPRESSOR", Material.PISTON, "&bCompresor", "", "&aComprime artículos");
	public static final ItemStack PRESSURE_CHAMBER = new SlimefunItemStack("PRESSURE_CHAMBER", Material.GLASS, "&bCámara de presión", "", "&aComprime los objetos aún más");
	public static final ItemStack MAGIC_WORKBENCH = new SlimefunItemStack("MAGIC_WORKBENCH", Material.CRAFTING_TABLE, "&6Banco de trabajo mágico", "", "&dInfunde elementos con energía mágica");
	public static final ItemStack ORE_WASHER = new SlimefunItemStack("ORE_WASHER", Material.CAULDRON, "&6Lavadora de minerales", "", "&aLava el mineral tamizado para filtrar los minerales", "&ay te da pequeños pedazos de piedra");
	public static final ItemStack TABLE_SAW = new SlimefunItemStack("TABLE_SAW", Material.STONECUTTER, "&6Sierra de mesa", "", "&aLe permite obtener 8 tablas de 1 registro", "&a(Funciona con todos los tipos de registro)");
	public static final ItemStack COMPOSTER = new SlimefunItemStack("COMPOSTER", Material.CAULDRON, "&aCompostador", "", "&a&oPuede convertir varios materiales a lo largo del tiempo...");
	public static final ItemStack ENHANCED_CRAFTING_TABLE = new SlimefunItemStack("ENHANCED_CRAFTING_TABLE", Material.CRAFTING_TABLE, "&eMesa de fabricación mejorada", "", "&aUna mesa de fabricación normal no puede", "&amantener esta enorme cantidad de poder...");
	public static final ItemStack CRUCIBLE = new SlimefunItemStack("CRUCIBLE", Material.CAULDRON, "&cCrisol", "", "&a&oSe usa para fundir artículos en líquidos");
	public static final ItemStack JUICER = new SlimefunItemStack("JUICER", Material.GLASS_BOTTLE, "&aExprimidor", "", "&aTe permite crear deliciosos jugos");
	
	public static final ItemStack SOLAR_PANEL = new SlimefunItemStack("SOLAR_PANEL", Material.DAYLIGHT_DETECTOR, "&bPanel Solar", "", "&a&oTransforma la luz del sol en energía");
	public static final ItemStack SOLAR_ARRAY = new SlimefunItemStack("SOLAR_ARRAY", Material.DAYLIGHT_DETECTOR, "&bMatriz Solar", "", "&a&oTransforma la luz del sol en energía");
	
	@Deprecated
	public static final ItemStack DIGITAL_MINER = new CustomItem(Material.IRON_PICKAXE, "&bMinero digital", "", "&4OBSOLETO", "&c¡Esta máquina será removida pronto!!");

	@Deprecated
	public static final ItemStack ADVANCED_DIGITAL_MINER = new CustomItem(Material.DIAMOND_PICKAXE, "&6Minero digital avanzado", "", "&4OBSOLETO", "&c¡Esta máquina será removida pronto!!");
	
	public static final ItemStack AUTOMATED_PANNING_MACHINE = new SlimefunItemStack("AUTOMATED_PANNING_MACHINE", Material.BOWL, "&ePanorámica automatizada", "", "&rUna versión MultiBlock del Lavador de oro", "&ry del Lavador de oro Infernal combinada en una máquina.");
	public static final ItemStack OUTPUT_CHEST = new SlimefunItemStack("OUTPUT_CHEST", Material.CHEST, "&4Cofre de salida", "", "&c&oMáquina básica que intentará poner", "&c&oartículos en este cofre si se coloca", "&c&oadyacente al dispensador.");
	public static final ItemStack HOLOGRAM_PROJECTOR = new SlimefunItemStack("HOLOGRAM_PROJECTOR", Material.QUARTZ_SLAB, "&bProyector holograma", "", "&rProyecta un holograma editable");
	
	/*		 Horno Mejorados 		*/
	public static final ItemStack ENHANCED_FURNACE = new SlimefunItemStack("ENHANCED_FURNACE", Material.FURNACE, "&7Horno Mejorado - &eI", "", "&7Velocidad de procesamiento: &e1x", "&7Eficiencia de Combustible: &e1x", "&7Multiplicador de suerte: &e1x");
	public static final ItemStack ENHANCED_FURNACE_2 = new SlimefunItemStack("ENHANCED_FURNACE_2", Material.FURNACE, "&7Horno Mejorado - &eII", "", "&7Velocidad de procesamiento: &e2x", "&7Eficiencia de Combustible: &e1x", "&7Multiplicador de suerte: &e1x");
	public static final ItemStack ENHANCED_FURNACE_3 = new SlimefunItemStack("ENHANCED_FURNACE_3", Material.FURNACE, "&7Horno Mejorado - &eIII", "", "&7Velocidad de procesamiento: &e2x", "&7Eficiencia de Combustible: &e2x", "&7Multiplicador de suerte: &e1x");
	public static final ItemStack ENHANCED_FURNACE_4 = new SlimefunItemStack("ENHANCED_FURNACE_4", Material.FURNACE, "&7Horno Mejorado - &eIV", "", "&7Velocidad de procesamiento: &e3x", "&7Eficiencia de Combustible: &e2x", "&7Multiplicador de suerte: &e1x");
	public static final ItemStack ENHANCED_FURNACE_5 = new SlimefunItemStack("ENHANCED_FURNACE_5", Material.FURNACE, "&7Horno Mejorado - &eV", "", "&7Velocidad de procesamiento: &e3x", "&7Eficiencia de Combustible: &e2x", "&7Multiplicador de suerte: &e2x");
	public static final ItemStack ENHANCED_FURNACE_6 = new SlimefunItemStack("ENHANCED_FURNACE_6", Material.FURNACE, "&7Horno Mejorado - &eVI", "", "&7Velocidad de procesamiento: &e3x", "&7Eficiencia de Combustible: &e3x", "&7Multiplicador de suerte: &e2x");
	public static final ItemStack ENHANCED_FURNACE_7 = new SlimefunItemStack("ENHANCED_FURNACE_7", Material.FURNACE, "&7Horno Mejorado - &eVII", "", "&7Velocidad de procesamiento: &e4x", "&7Eficiencia de Combustible: &e3x", "&7Multiplicador de suerte: &e2x");
	public static final ItemStack ENHANCED_FURNACE_8 = new SlimefunItemStack("ENHANCED_FURNACE_8", Material.FURNACE, "&7Horno Mejorado - &eVIII", "", "&7Velocidad de procesamiento: &e4x", "&7Eficiencia de Combustible: &e4x", "&7Multiplicador de suerte: &e2x");
	public static final ItemStack ENHANCED_FURNACE_9 = new SlimefunItemStack("ENHANCED_FURNACE_9", Material.FURNACE, "&7Horno Mejorado - &eIX", "", "&7Velocidad de procesamiento: &e5x", "&7Eficiencia de Combustible: &e4x", "&7Multiplicador de suerte: &e2x");
	public static final ItemStack ENHANCED_FURNACE_10 = new SlimefunItemStack("ENHANCED_FURNACE_10", Material.FURNACE, "&7Horno Mejorado - &eX", "", "&7Velocidad de procesamiento: &e5x", "&7Eficiencia de Combustible: &e5x", "&7Multiplicador de suerte: &e2x");
	public static final ItemStack ENHANCED_FURNACE_11 = new SlimefunItemStack("ENHANCED_FURNACE_11", Material.FURNACE, "&7Horno Mejorado - &eXI", "", "&7Velocidad de procesamiento: &e5x", "&7Eficiencia de Combustible: &e5x", "&7Multiplicador de suerte: &e3x");
	public static final ItemStack REINFORCED_FURNACE = new SlimefunItemStack("REINFORCED_FURNACE", Material.FURNACE, "&7Horno Reforzado", "", "&7Velocidad de procesamiento: &e10x", "&7Eficiencia de Combustible: &e10x", "&7Multiplicador de suerte: &e3x");
	public static final ItemStack CARBONADO_EDGED_FURNACE = new SlimefunItemStack("CARBONADO_EDGED_FURNACE", Material.FURNACE, "&7Horno de filo Carbonado", "", "&7Velocidad de procesamiento: &e20x", "&7Eficiencia de Combustible: &e10x", "&7Multiplicador de suerte: &e3x");
	
	public static final ItemStack BLOCK_PLACER = new SlimefunItemStack("BLOCK_PLACER", Material.DISPENSER, "&aColocador de Bloques", "", "&rTodos los bloques en este dispensador", "&rse colocará automáticamente");
	
	/*		Soulbound Items		*/
	public static final ItemStack SOULBOUND_SWORD = new SlimefunItemStack("SOULBOUND_SWORD", Material.DIAMOND_SWORD, "&cEspada ligada al alma");
	public static final ItemStack SOULBOUND_BOW = new SlimefunItemStack("SOULBOUND_BOW", Material.BOW, "&cArco ligado al alma");
	public static final ItemStack SOULBOUND_PICKAXE = new SlimefunItemStack("SOULBOUND_PICKAXE", Material.DIAMOND_PICKAXE, "&cPico atado al alma");
	public static final ItemStack SOULBOUND_AXE = new SlimefunItemStack("SOULBOUND_AXE", Material.DIAMOND_AXE, "&cHacha ligada al alma");
	public static final ItemStack SOULBOUND_SHOVEL = new SlimefunItemStack("SOULBOUND_SHOVEL", Material.DIAMOND_SHOVEL, "&cPala ligada al alma");
	public static final ItemStack SOULBOUND_HOE = new SlimefunItemStack("SOULBOUND_HOE", Material.DIAMOND_HOE, "&cAzada ligada al alma");
	public static final ItemStack SOULBOUND_TRIDENT = new SlimefunItemStack("SOULBOUND_TRIDENT", Material.TRIDENT, "&cTridente ligado al alma");
	
	public static final ItemStack SOULBOUND_HELMET = new SlimefunItemStack("SOULBOUND_HELMET", Material.DIAMOND_HELMET, "&cLigado al alma");
	public static final ItemStack SOULBOUND_CHESTPLATE = new SlimefunItemStack("SOULBOUND_CHESTPLATE", Material.DIAMOND_CHESTPLATE, "&cLigado al alma");
	public static final ItemStack SOULBOUND_LEGGINGS = new SlimefunItemStack("SOULBOUND_LEGGINGS", Material.DIAMOND_LEGGINGS, "&cLigado al alma");
	public static final ItemStack SOULBOUND_BOOTS = new SlimefunItemStack("SOULBOUND_BOOTS", Material.DIAMOND_BOOTS, "&cLigado al alma");
	
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
		imB.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8Runa vacía"));
		itemB.setItemMeta(imB);
		BLANK_RUNE = new SlimefunItemStack("BLANK_RUNE", itemB);
		
		ItemStack itemA = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imA = (FireworkEffectMeta) itemA.getItemMeta();
		imA.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.AQUA).build());
		imA.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&b&lAire&8&l]"));
		itemA.setItemMeta(imA);
		RUNE_AIR = new SlimefunItemStack("ANCIENT_RUNE_AIR", itemA);
		
		ItemStack itemW = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imW = (FireworkEffectMeta) itemW.getItemMeta();
		imW.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.BLUE).build());
		imW.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&1&lAgua&8&l]"));
		itemW.setItemMeta(imW);
		RUNE_WATER = new SlimefunItemStack("ANCIENT_RUNE_WATER", itemW);
		
		ItemStack itemF = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imF = (FireworkEffectMeta) itemF.getItemMeta();
		imF.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.RED).build());
		imF.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&4&lFuego&8&l]"));
		itemF.setItemMeta(imF);
		RUNE_FIRE = new SlimefunItemStack("ANCIENT_RUNE_FIRE", itemF);
		
		ItemStack itemE = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imE = (FireworkEffectMeta) itemE.getItemMeta();
		imE.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.fromRGB(112, 47, 7)).build());
		imE.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&c&lTierra&8&l]"));
		itemE.setItemMeta(imE);
		RUNE_EARTH = new SlimefunItemStack("ANCIENT_RUNE_EARTH", itemE);
		
		ItemStack itemN = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imN = (FireworkEffectMeta) itemN.getItemMeta();
		imN.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.PURPLE).build());
		imN.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&5&lEnder&8&l]"));
		itemN.setItemMeta(imN);
		RUNE_ENDER = new SlimefunItemStack("ANCIENT_RUNE_ENDER", itemN);
		
		ItemStack itemR = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imR = (FireworkEffectMeta) itemR.getItemMeta();
		imR.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.FUCHSIA).build());
		imR.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&d&lArco iris&8&l]"));
		itemR.setItemMeta(imR);
		RUNE_RAINBOW = new SlimefunItemStack("ANCIENT_RUNE_RAINBOW", itemR);
		
		ItemStack itemL = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imL = (FireworkEffectMeta) itemL.getItemMeta();
		imL.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.fromRGB(255, 255, 95)).build());
		imL.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&e&lRelámpago&8&l]"));
		itemL.setItemMeta(imL);
		RUNE_LIGHTNING = new SlimefunItemStack("ANCIENT_RUNE_LIGHTNING", itemL);

		ItemStack itemS = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imS = (FireworkEffectMeta) itemS.getItemMeta();
		imS.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.fromRGB(47, 0, 117)).build());
		imS.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Runa antigua &8&l[&5&lLigado al alma&8&l]"));
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.YELLOW + "Tirar esta runa sobre un objeto en el suelo para");
		lore.add(ChatColor.DARK_PURPLE + "unir " + ChatColor.YELLOW + "ese objeto con tu alma.");
		lore.add(" ");
		lore.add(ChatColor.YELLOW + "Se recomienda que solo use esta runa");
		lore.add(ChatColor.YELLOW + "sobre  " + ChatColor.GOLD + "objetos " + ChatColor.YELLOW + "importantes.");
		lore.add(" ");
		lore.add(ChatColor.YELLOW + "Los objetos atados a tu alma no caerán sobre la muerte.");
		imS.setLore(lore);
		itemS.setItemMeta(imS);
		RUNE_SOULBOUND = new SlimefunItemStack("ANCIENT_RUNE_SOULBOUND", itemS);
	}
	
	/*		Electricity			*/
	public static final ItemStack SOLAR_GENERATOR = new SlimefunItemStack("SOLAR_GENERATOR", Material.DAYLIGHT_DETECTOR, "&bGenerador solar", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR), LoreBuilder.powerBuffer(0), LoreBuilder.powerPerSecond(4));
	public static final ItemStack SOLAR_GENERATOR_2 = new SlimefunItemStack("SOLAR_GENERATOR_2", Material.DAYLIGHT_DETECTOR, "&cGenerador solar Avanzada", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR), LoreBuilder.powerBuffer(0), LoreBuilder.powerPerSecond(16));
	public static final ItemStack SOLAR_GENERATOR_3 = new SlimefunItemStack("SOLAR_GENERATOR_3", Material.DAYLIGHT_DETECTOR, "&4Generador solar Carbonado", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(0), LoreBuilder.powerPerSecond(64));
	public static final ItemStack SOLAR_GENERATOR_4 = new SlimefunItemStack("SOLAR_GENERATOR_4", Material.DAYLIGHT_DETECTOR, "&eGenerador solar Energizado", "", "&9Funciona en la noche", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(0), LoreBuilder.powerPerSecond(256) + " (Día)", LoreBuilder.powerPerSecond(128) + " (Noche)");
	
	public static final ItemStack COAL_GENERATOR = new SlimefunItemStack("COAL_GENERATOR", "9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730", "&cGenerador de carbón", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR), LoreBuilder.powerBuffer(64), LoreBuilder.powerPerSecond(16));
	public static final ItemStack COAL_GENERATOR_2 = new SlimefunItemStack("COAL_GENERATOR_2", "9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730", "&cGenerador de carbón &7(&eII&7)", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(30));
	
	public static final ItemStack LAVA_GENERATOR = new SlimefunItemStack("LAVA_GENERATOR", "9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730", "&4Generador de lava", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR), LoreBuilder.powerBuffer(512), LoreBuilder.powerPerSecond(20));
	public static final ItemStack LAVA_GENERATOR_2 = new SlimefunItemStack("LAVA_GENERATOR_2", "9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730", "&4Generador de lava &7(&eII&7)", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR), LoreBuilder.powerBuffer(1024), LoreBuilder.powerPerSecond(40));
	
	public static final ItemStack ELECTRIC_FURNACE = new SlimefunItemStack("ELECTRIC_FURNACE", Material.FURNACE, "&cHorno eléctrico", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(4));
	public static final ItemStack ELECTRIC_FURNACE_2 = new SlimefunItemStack("ELECTRIC_FURNACE_2", Material.FURNACE, "&cHorno eléctrico &7- &eII", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "&8\u21E8 &7Speed: 2x", LoreBuilder.powerPerSecond(6));
	public static final ItemStack ELECTRIC_FURNACE_3 = new SlimefunItemStack("ELECTRIC_FURNACE_3", Material.FURNACE, "&cHorno eléctrico &7- &eIII", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "&8\u21E8 &7Speed: 4x", LoreBuilder.powerPerSecond(10));
	
	public static final ItemStack ELECTRIC_ORE_GRINDER = new SlimefunItemStack("ELECTRIC_ORE_GRINDER", Material.FURNACE, "&cMolinillo de mineral eléctrico", "","&rFunciona como una trituradora de mineral y piedra de moler", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(12));
	public static final ItemStack ELECTRIC_ORE_GRINDER_2 = new SlimefunItemStack("ELECTRIC_ORE_GRINDER_2", Material.FURNACE, "&cMolinillo de mineral eléctrico &7(&eII&7)", "","&rFunciona como una trituradora de mineral y piedra de moler", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 4x", LoreBuilder.powerPerSecond(30));
	public static final ItemStack ELECTRIC_INGOT_PULVERIZER = new SlimefunItemStack("ELECTRIC_INGOT_PULVERIZER", Material.FURNACE, "&cPulverizador de lingotes eléctrico", "", "&rPulveriza lingotes en polvo", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(14));
	public static final ItemStack AUTO_DRIER = new SlimefunItemStack("AUTO_DRIER", Material.SMOKER, "&eSecador automático", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(10));
	public static final ItemStack AUTO_ENCHANTER = new SlimefunItemStack("AUTO_ENCHANTER", Material.ENCHANTING_TABLE, "&5Encantador automático", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(18));
	public static final ItemStack AUTO_DISENCHANTER = new SlimefunItemStack("AUTO_DISENCHANTER", Material.ENCHANTING_TABLE, "&5Desencantador automático", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(18));
	public static final ItemStack AUTO_ANVIL = new SlimefunItemStack("AUTO_ANVIL", Material.IRON_BLOCK, "&7Yunque automático", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &7Factor de reparación: 10%", LoreBuilder.powerPerSecond(24));
	public static final ItemStack AUTO_ANVIL_2 = new SlimefunItemStack("AUTO_ANVIL_2", Material.IRON_BLOCK, "&7Yunque automático Mk.II", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Factor de reparación: 25%", LoreBuilder.powerPerSecond(32));
	
	public static final ItemStack BIO_REACTOR = new SlimefunItemStack("BIO_REACTOR", Material.LIME_TERRACOTTA, "&2Bio Reactor", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR), LoreBuilder.powerBuffer(128), LoreBuilder.powerPerSecond(8));
	public static final ItemStack MULTIMETER = new SlimefunItemStack("MULTIMETER", Material.CLOCK, "&eMultímetro", "", "&rMide la cantidad de almacenado", "&rEnergía en un bloque");
	
	public static final ItemStack SMALL_CAPACITOR = new SlimefunItemStack("SMALL_CAPACITOR", "91361e576b493cbfdfae328661cedd1add55fab4e5eb418b92cebf6275f8bb4", "&aPequeño condensador de energía", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &7128 J Capacity");
	public static final ItemStack MEDIUM_CAPACITOR = new SlimefunItemStack("MEDIUM_CAPACITOR", "91361e576b493cbfdfae328661cedd1add55fab4e5eb418b92cebf6275f8bb4", "&aCondensador de energía media", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &7512 J Capacity");
	public static final ItemStack BIG_CAPACITOR = new SlimefunItemStack("BIG_CAPACITOR", "91361e576b493cbfdfae328661cedd1add55fab4e5eb418b92cebf6275f8bb4", "&aCondensador de gran energía", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &71024 J Capacity");
	public static final ItemStack LARGE_CAPACITOR = new SlimefunItemStack("LARGE_CAPACITOR", "91361e576b493cbfdfae328661cedd1add55fab4e5eb418b92cebf6275f8bb4", "&aLarge Energy Capacitor", "", LoreBuilder.machine(MachineTier.GOOD, MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &78192 J Capacity");
	public static final ItemStack CARBONADO_EDGED_CAPACITOR = new SlimefunItemStack("CARBONADO_EDGED_CAPACITOR", "91361e576b493cbfdfae328661cedd1add55fab4e5eb418b92cebf6275f8bb4", "&aCondensador de energía con bordes de carbono", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &765536 J Capacity");
	
	/*		Robots				*/
	public static final ItemStack PROGRAMMABLE_ANDROID = new SlimefunItemStack("PROGRAMMABLE_ANDROID", "3503cb7ed845e7a507f569afc647c47ac483771465c9a679a54594c76afba", "&cAndroid programable &7(Normal)", "", "&8\u21E8 &7Función: None", "&8\u21E8 &7Eficiencia de Combustible: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_FARMER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_FARMER", "f9d33357e8418823bf783de92de80291b4ebd392aec8706698e06896d498f6", "&cAndroid programable &7(Granjero)", "", "&8\u21E8 &7Función: Granjero", "&8\u21E8 &7Eficiencia de Combustible: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_MINER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_MINER", "e638a28541ab3ae0a723d5578738e08758388ec4c33247bd4ca13482aef334", "&cAndroid programable &7(Minero)", "", "&8\u21E8 &7Función: Minado", "&8\u21E8 &7Eficiencia de Combustible: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_WOODCUTTER", "d32a814510142205169a1ad32f0a745f18e9cb6c66ee64eca2e65babdef9ff", "&cAndroid programable &7(Leñador)", "", "&8\u21E8 &7Función: Carpintería", "&8\u21E8 &7Eficiencia de Combustible: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_BUTCHER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_BUTCHER", "3b472df0ad9a3be88f2e5d5d422d02b116d64d8df1475ed32e546afc84b31", "&cAndroid programable &7(Carnicero)", "", "&8\u21E8 &7Función: Matanza", "&8\u21E8 &7Daño: 4", "&8\u21E8 &7Eficiencia de Combustible: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_FISHERMAN = new SlimefunItemStack("PROGRAMMABLE_ANDROID_FISHERMAN", "345e8733a73114333b98b3601751241722f4713e1a1a5d36fbb132493f1c7", "&cAndroid programable &7(Pescador)", "", "&8\u21E8 &7Función: Pescar", "&8\u21E8 &7Tasa de éxito: 10%", "&8\u21E8 &7Eficiencia de Combustible: 1.0x");
	
	public static final ItemStack PROGRAMMABLE_ANDROID_2 = new SlimefunItemStack("PROGRAMMABLE_ANDROID_2", "3503cb7ed845e7a507f569afc647c47ac483771465c9a679a54594c76afba", "&cAndroid programable Avanzado &7(Normal)", "", "&8\u21E8 &7Función: None", "&8\u21E8 &7Eficiencia de Combustible: 1.5x");
	public static final ItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = new SlimefunItemStack("PROGRAMMABLE_ANDROID_2_FISHERMAN", "345e8733a73114333b98b3601751241722f4713e1a1a5d36fbb132493f1c7", "&cAndroid programable Avanzado &7(Pescador)", "", "&8\u21E8 &7Función: Pescar", "&8\u21E8 &7Tasa de éxito: 20%", "&8\u21E8 &7Eficiencia de Combustible: 1.5x");
	public static final ItemStack PROGRAMMABLE_ANDROID_2_FARMER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_2_FARMER", "f9d33357e8418823bf783de92de80291b4ebd392aec8706698e06896d498f6", "&cAndroid programable Avanzado &7(Granjero)", "", "&8\u21E8 &7Función: Granjero", "&8\u21E8 &7Eficiencia de Combustible: 1.5x", "&8\u21E8 &7Can also harvest Plants from ExoticGarden");
	public static final ItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_2_BUTCHER", "3b472df0ad9a3be88f2e5d5d422d02b116d64d8df1475ed32e546afc84b31", "&cAndroid programable Avanzado &7(Carnicero)", "", "&8\u21E8 &7Función: Matanza", "&8\u21E8 &7Daño: 8", "&8\u21E8 &7Eficiencia de Combustible: 1.5x");

	public static final ItemStack PROGRAMMABLE_ANDROID_3 = new SlimefunItemStack("PROGRAMMABLE_ANDROID_3", "3503cb7ed845e7a507f569afc647c47ac483771465c9a679a54594c76afba", "&eAndroid programable Empoderado &7(Normal)", "", "&8\u21E8 &7Función: None", "&8\u21E8 &7Eficiencia de Combustible: 3.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = new SlimefunItemStack("PROGRAMMABLE_ANDROID_3_FISHERMAN", "345e8733a73114333b98b3601751241722f4713e1a1a5d36fbb132493f1c7", "&eAndroid programable Empoderado &7(Pescador)", "", "&8\u21E8 &7Función: Pescar", "&8\u21E8 &7Tasa de éxito: 30%", "&8\u21E8 &7Eficiencia de Combustible: 8.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_3_BUTCHER", "3b472df0ad9a3be88f2e5d5d422d02b116d64d8df1475ed32e546afc84b31", "&eAndroid programable Empoderado &7(Carnicero)", "", "&8\u21E8 &7Función: Matanza", "&8\u21E8 &7Daño: 20", "&8\u21E8 &7Eficiencia de Combustible: 8.0x");
	
	/*		GPS					*/
	public static final ItemStack GPS_TRANSMITTER = new SlimefunItemStack("GPS_TRANSMITTER", "b0c9c1a022f40b73f14b4cba37c718c6a533f3a2864b6536d5f456934cc1f", "&bTransmisor GPS", "", LoreBuilder.powerBuffer(16), LoreBuilder.powerPerSecond(2)));
	public static final ItemStack GPS_TRANSMITTER_2 = new SlimefunItemStack("GPS_TRANSMITTER_2", "b0c9c1a022f40b73f14b4cba37c718c6a533f3a2864b6536d5f456934cc1f", "&cTransmisor GPS Advanzad", "", LoreBuilder.powerBuffer(64), LoreBuilder.powerPerSecond(6));
	public static final ItemStack GPS_TRANSMITTER_3 = new SlimefunItemStack("GPS_TRANSMITTER_3", "b0c9c1a022f40b73f14b4cba37c718c6a533f3a2864b6536d5f456934cc1f", "&4Transmisor GPS Carbonado", "", LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(22));
	public static final ItemStack GPS_TRANSMITTER_4 = new SlimefunItemStack("GPS_TRANSMITTER_4", "b0c9c1a022f40b73f14b4cba37c718c6a533f3a2864b6536d5f456934cc1f", "&eTransmisor GPS Energizado", "", LoreBuilder.powerBuffer(1024), LoreBuilder.powerPerSecond(92));
	
	public static final ItemStack GPS_MARKER_TOOL = new SlimefunItemStack("GPS_MARKER_TOOL", Material.REDSTONE_TORCH, "&bHerramienta de marcador GPS", "", "&rLe permite establecer un Waypoint en", "&rla ubicación donde colocas esto");
	public static final ItemStack GPS_CONTROL_PANEL = new SlimefunItemStack("GPS_CONTROL_PANEL", "ddcfba58faf1f64847884111822b64afa21d7fc62d4481f14f3f3bcb6330", "&bPanel de control de GPS", "", "&rLe permite rastrear sus satélites", "&ry gestiona tus Waypoints");
	public static final ItemStack GPS_EMERGENCY_TRANSMITTER = new SlimefunItemStack("GPS_EMERGENCY_TRANSMITTER", "b0c9c1a022f40b73f14b4cba37c718c6a533f3a2864b6536d5f456934cc1f", "&cTransmisor de emergencia GPS", "", "&rLlevar esto en tu inventario", "&restablece automáticamente un Waypoint", "&ren tu ubicación cuando mueras.");
	
	public static final ItemStack ANDROID_INTERFACE_FUEL = new SlimefunItemStack("ANDROID_INTERFACE_FUEL", Material.DISPENSER, "&7Interfaz de Android &c(Combustible)", "", "&rElementos almacenados en esta interfaz", "&rse insertará en la ranura de combustible de Android", "&rcuando su guión les dice que lo hagan");
	public static final ItemStack ANDROID_INTERFACE_ITEMS = new SlimefunItemStack("ANDROID_INTERFACE_ITEMS", Material.DISPENSER, "&7Interfaz de Android &9(Items)", "", "&rAItems almacenados en un inventario de Android", "&rse insertará en esta interfaz", "&rcuando su guión les dice que lo hagan");
	
	public static final ItemStack GPS_GEO_SCANNER = new SlimefunItemStack("GPS_GEO_SCANNER", "2ad8cfeb387a56e3e5bcf85345d6a417b242293887db3ce3ba91fa409b254b86", "&bGPS Geo-Scanner", "", "&rEscanea un trozo de recursos naturales", "&rcomo el &8Aceite");
	public static final ItemStack PORTABLE_GEO_SCANNER = new SlimefunItemStack("PORTABLE_GEO_SCANNER", Material.CLOCK, "&bGeo-Scanner Portátil", "", "&rEscanea un trozo de recursos naturales", "", "&eClick Derecho&7 para escanear");
	public static final ItemStack GEO_MINER = new SlimefunItemStack("GEO_MINER", "a37741f764dd3dd7adaeb43b63d3959eb70e5eb28f15d6b34cab34a1d1f60387", "&6GEO Minero", "", "&eExtrae recursos del trozo", "&eEstos recursos no se pueden extraer con un pico", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(48), "", "&c&l! &cAsegúrese de que el Geo-Scan esté en el Chunk primero");
	public static final ItemStack OIL_PUMP = new SlimefunItemStack("OIL_PUMP", "afe1a040a425e31a46d4f9a9b9806fa2f0c47ee84711cc1932fd8ab32b2d038", "&rBomba de aceite", "", "&7Bombea aceite y lo llena en cubos", "", "&c&l! &cAsegúrese de que el Geo-Scan esté en el Chunk primero");
	public static final ItemStack BUCKET_OF_OIL = new SlimefunItemStack("BUCKET_OF_OIL", "6ce04b41d19ec7927f982a63a94a3d79f78ecec33363051fde0831bfabdbd", "&rCubo de aceite");
	public static final ItemStack BUCKET_OF_FUEL = new SlimefunItemStack("BUCKET_OF_FUEL", "a84ddca766725b8b97413f259c3f7668070f6ae55483a90c8e5525394f9c099", "&rCubo de combustible");

	public static final ItemStack REFINERY = new SlimefunItemStack("REFINERY", Material.PISTON, "&cRefinería", "", "&rRefina el petróleo para crear combustible");
	public static final ItemStack COMBUSTION_REACTOR = new SlimefunItemStack("COMBUSTION_REACTOR", "9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730", "&cReactor de combustión", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(24));
	public static final ItemStack ANDROID_MEMORY_CORE = new SlimefunItemStack("ANDROID_MEMORY_CORE", "d78f2b7e5e75639ea7fb796c35d364c4df28b4243e66b76277aadcd6261337", "&bNucleo de memoria para Androide");
	
	public static final ItemStack GPS_TELEPORTER_PYLON = new SlimefunItemStack("GPS_TELEPORTER_PYLON", Material.PURPLE_STAINED_GLASS, "&5Pilón Teleportador GPS", "", "&7Componente Teletransportador");
	public static final ItemStack GPS_TELEPORTATION_MATRIX = new SlimefunItemStack("GPS_TELEPORTATION_MATRIX", Material.IRON_BLOCK, "&bMatriz de teletransportador GPS", "", "&rEste es el componente principal de su teletransportador", "&rEsta matriz permite a los jugadores elegir entre todos", "&rWaypoints hechos por el jugador que ha colocado", "&reste dispositivo.");
	public static final ItemStack GPS_ACTIVATION_DEVICE_SHARED = new SlimefunItemStack("GPS_ACTIVATION_DEVICE_SHARED", Material.STONE_PRESSURE_PLATE, "&rDispositivo de Activación GPS &3(Compartido)", "", "&rColoque esto en una matriz de teletransportación", "&ry pisar esta placa para activar", "&rel proceso de teletransportación");
	public static final ItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new SlimefunItemStack("GPS_ACTIVATION_DEVICE_PERSONAL", Material.STONE_PRESSURE_PLATE, "&rDispositivo de Activación GPS &a(Personal)", "", "&rColoque esto en una matriz de teletransportación", "&ry pisar esta placa para activar", "&rel proceso de teletransportación", "", "&rEsta versión solo permite a la persona que", "&rcolocó este dispositivo para usarlo");

	public static final ItemStack ELEVATOR = new SlimefunItemStack("ELEVATOR_PLATE", Material.STONE_PRESSURE_PLATE, "&bPlaca elevadora", "", "&rColoque una placa elevadora en cada piso", "&ry podrás teletransportarte entre ellos.", "", "&eClick Derecho a este bloque &7para renombrarlo");
	
	public static final ItemStack INFUSED_HOPPER = new SlimefunItemStack("INFUSED_HOPPER", Material.HOPPER, "&5Tolva infundida", "", "&rRecoge automáticamente artículos cercanos en un 7x7x7", "&rRadio cuando se coloca.");

	public static final ItemStack PLASTIC_SHEET = new SlimefunItemStack("PLASTIC_SHEET", Material.PAPER, "&rLámina de plástico");
	
	public static final ItemStack HEATED_PRESSURE_CHAMBER = new SlimefunItemStack("HEATED_PRESSURE_CHAMBER", Material.LIGHT_GRAY_STAINED_GLASS, "&cCámara de presión calentada", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(10));
	public static final ItemStack HEATED_PRESSURE_CHAMBER_2 = new SlimefunItemStack("HEATED_PRESSURE_CHAMBER_2", Material.LIGHT_GRAY_STAINED_GLASS, "&cCámara de presión calentada&7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 5x", LoreBuilder.powerPerSecond(44));
	
	public static final ItemStack ELECTRIC_SMELTERY = new SlimefunItemStack("ELECTRIC_SMELTERY", Material.FURNACE, "&cFundicion electrica", "", "&4Solo aleaciones, no funde el polvo en lingotes", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(20));
	public static final ItemStack ELECTRIC_SMELTERY_2 = new SlimefunItemStack("ELECTRIC_SMELTERY_2", Material.FURNACE, "&cFundicion electrica &7- &eII", "", "&4Solo aleaciones, no funde el polvo en lingotes", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 3x", LoreBuilder.powerPerSecond(40));
	
	public static final ItemStack ELECTRIC_PRESS = new SlimefunItemStack("ELECTRIC_PRESS", "8d5cf92bc79ec19f4106441affff1406a1367010dcafb197dd94cfca1a6de0fc", "&ePrensa eléctrica", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(16));
	public static final ItemStack ELECTRIC_PRESS_2 = new SlimefunItemStack("ELECTRIC_PRESS_2", "8d5cf92bc79ec19f4106441affff1406a1367010dcafb197dd94cfca1a6de0fc", "&ePrensa eléctrica &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 3x", LoreBuilder.powerPerSecond(40));
	
	public static final ItemStack ELECTRIFIED_CRUCIBLE = new SlimefunItemStack("ELECTRIFIED_CRUCIBLE", Material.RED_TERRACOTTA, "&cCrisol electrificado", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(48));
	public static final ItemStack ELECTRIFIED_CRUCIBLE_2 = new SlimefunItemStack("ELECTRIFIED_CRUCIBLE_2", Material.RED_TERRACOTTA, "&cCrisol electrificado &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 2x", LoreBuilder.powerPerSecond(80));
	public static final ItemStack ELECTRIFIED_CRUCIBLE_3 = new SlimefunItemStack("ELECTRIFIED_CRUCIBLE_3", Material.RED_TERRACOTTA, "&cCrisol electrificado &7- &eIII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 4x", LoreBuilder.powerPerSecond(120));

	public static final ItemStack CARBON_PRESS = new SlimefunItemStack("CARBON_PRESS", Material.BLACK_STAINED_GLASS, "&cPrensa de carbono", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(20));
	public static final ItemStack CARBON_PRESS_2 = new SlimefunItemStack("CARBON_PRESS_2", Material.BLACK_STAINED_GLASS, "&cPrensa de carbono &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 3x", LoreBuilder.powerPerSecond(50));
	public static final ItemStack CARBON_PRESS_3 = new SlimefunItemStack("CARBON_PRESS_3", Material.BLACK_STAINED_GLASS, "&cPrensa de carbono &7- &eIII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 15x", LoreBuilder.powerPerSecond(180));
	
	public static final ItemStack BLISTERING_INGOT = new SlimefunItemStack("BLISTERING_INGOT", Material.GOLD_INGOT, "&6Lingote abrasador &7(33%)", "", LoreBuilder.radioactive(Radioactivity.HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);
	public static final ItemStack BLISTERING_INGOT_2 = new SlimefunItemStack("BLISTERING_INGOT_2", Material.GOLD_INGOT, "&6Lingote abrasador &7(66%)", "", LoreBuilder.radioactive(Radioactivity.VERY_HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);
	public static final ItemStack BLISTERING_INGOT_3 = new SlimefunItemStack("BLISTERING_INGOT_3", Material.GOLD_INGOT, "&6Lingote abrasador", "", LoreBuilder.radioactive(Radioactivity.VERY_HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);
	
	public static final ItemStack ENERGY_REGULATOR = new SlimefunItemStack("ENERGY_REGULATOR", "d78f2b7e5e75639ea7fb796c35d364c4df28b4243e66b76277aadcd6261337", "&6Regulador de energía", "", "&rComponente central de una red energética");
	public static final ItemStack DEBUG_FISH = new CustomItem(Material.SALMON, "&3¿Cuánto cuesta el pescado?", "", "&eClick Derecho &rcualquier bloque para ver es BlockData", "&eClick Izquierdo &rpara romper el bloque", "&eShift + lick Izquierdo &ren cualquier bloque para borrar el BlockData", "&eShift + lick derecho &rcolocar un bloque de marcador de posición");
	
	public static final ItemStack NETHER_ICE = new SlimefunItemStack("NETHER_ICE", "3ce2dad9baf7eaba7e80d4d0f9fac0aab01a76b12fb71c3d2af2a16fdd4c7383", "&eHielo abisal", "", LoreBuilder.radioactive(Radioactivity.MODERATE), LoreBuilder.HAZMAT_SUIT_REQUIRED);
	public static final ItemStack ENRICHED_NETHER_ICE = new SlimefunItemStack("ENRICHED_NETHER_ICE", "7c818aa13aabc7294838d21caac057e97bd8c89641a0c0f8a55442ff4e27", "&eHielo abisal enriquecido", "", LoreBuilder.radioactive(Radioactivity.VERY_HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);
	public static final ItemStack NETHER_ICE_COOLANT_CELL = new SlimefunItemStack("NETHER_ICE_COOLANT_CELL", "8d3cd412555f897016213e5d6c7431b448b9e5644e1b19ec51b5316f35840e0", "&6Celda de refrigerante de hielo abisal");
	
	// Cargo
	public static final ItemStack CARGO_MANAGER = new SlimefunItemStack("CARGO_MANAGER", "e510bc85362a130a6ff9d91ff11d6fa46d7d1912a3431f751558ef3c4d9c2", "&6Gestor de carga", "", "&rComponente central de una red de transporte de items");
	public static final ItemStack CARGO_NODE = new SlimefunItemStack("CARGO_NODE", "07b7ef6fd7864865c31c1dc87bed24ab5973579f5c6638fecb8dedeb443ff0", "&7Nodo de carga &c(Conector)", "", "&rTubo conector de carga");
	public static final ItemStack CARGO_INPUT = new SlimefunItemStack("CARGO_NODE_INPUT", "16d1c1a69a3de9fec962a77bf3b2e376dd25c873a3d8f14f1dd345dae4c4", "&7Nodo de carga &c(Entrada)", "", "&rTubería de entrada de carga");
	public static final ItemStack CARGO_OUTPUT = new SlimefunItemStack("CARGO_NODE_OUTPUT", "55b21fd480c1c43bf3b9f842c869bdc3bc5acc2599bf2eb6b8a1c95dce978f", "&7Nodo de carga &c(Salida)", "", "&rTubería de salida de carga");
	public static final ItemStack CARGO_OUTPUT_ADVANCED = new SlimefunItemStack("CARGO_NODE_OUTPUT_ADVANCED", "55b21fd480c1c43bf3b9f842c869bdc3bc5acc2599bf2eb6b8a1c95dce978f", "&6Nodo de carga Avanzada &c(Salida)", "", "&rTubería de salida de carga");

	public static final ItemStack AUTO_BREEDER = new SlimefunItemStack("AUTO_BREEDER", Material.HAY_BLOCK, "&eAuto-Alimentador", "", "&rFunciona con &aComida orgánica", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerBuffer(1024), "&8\u21E8 &e\u26A1 &760 J/Animal");
	
	public static final ItemStack ORGANIC_FOOD = new CustomItem(SkullItem.fromBase64("b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79"), "&aComida Organica", "&7Contenido: &9X");
	public static final ItemStack WHEAT_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_WHEAT", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aComida Organica", "&7Contenido: &9Trigo");
	public static final ItemStack CARROT_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_CARROT", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aComida Organica", "&7Contenido: &9Zanahoría");
	public static final ItemStack POTATO_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_POTATO", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aComida Organica", "&7Contenido: &9Patatas");
	public static final ItemStack SEEDS_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_SEEDS", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aComida Organica", "&7Contenido: &9Semillas");
	public static final ItemStack BEETROOT_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_BEETROOT", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aComida Organica", "&7Contenido: &9&9Remolacha");
	public static final ItemStack MELON_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_MELON", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aComida Organica", "&7Contenido: &9Sandía");
	public static final ItemStack APPLE_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_APPLE", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aComida Organica", "&7Contenido: &9Manzana");
	public static final ItemStack SWEET_BERRIES_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_SWEET_BERRIES", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aComida Organica", "&7Contenido: &9Bayas dulces");
	
	public static final ItemStack FERTILIZER = new CustomItem(SkullItem.fromBase64("b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79"), "&aFertilizante orgánico", "&7Contenido: &9X");
	public static final ItemStack WHEAT_FERTILIZER = new SlimefunItemStack("FERTILIZER_WHEAT", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aFertilizante orgánico", "&7Contenido: &9Trigo");
	public static final ItemStack CARROT_FERTILIZER = new SlimefunItemStack("FERTILIZER_CARROT", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aFertilizante orgánico", "&7Contenido: &9Zanahoría");
	public static final ItemStack POTATO_FERTILIZER = new SlimefunItemStack("FERTILIZER_POTATO", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aFertilizante orgánico", "&7Contenido: &9Patatas");
	public static final ItemStack SEEDS_FERTILIZER = new SlimefunItemStack("FERTILIZER_SEEDS", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aFertilizante orgánico", "&7Contenido: &9Semillas");
	public static final ItemStack BEETROOT_FERTILIZER = new SlimefunItemStack("FERTILIZER_BEETROOT", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aFertilizante orgánico", "&7Contenido: &9&9Remolacha");
	public static final ItemStack MELON_FERTILIZER = new SlimefunItemStack("FERTILIZER_MELON", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aFertilizante orgánico", "&7Contenido: &9Sandía");
	public static final ItemStack APPLE_FERTILIZER = new SlimefunItemStack("FERTILIZER_APPLE", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aFertilizante orgánico", "&7Contenido: &9Manzana");
	public static final ItemStack SWEET_BERRIES_FERTILIZER = new SlimefunItemStack("FERTILIZER_SWEET_BERRIES", "b439e3f5acbee9be4c4259289d6d9f35c635ffa661114687b3ea6dda8c79", "&aFertilizante orgánico", "&7Contenido: &9Bayas dulces");
	
	public static final ItemStack ANIMAL_GROWTH_ACCELERATOR = new SlimefunItemStack("ANIMAL_GROWTH_ACCELERATOR", Material.HAY_BLOCK, "&bAcelerador de crecimiento animal", "", "&rFunciona con &aComida Organica", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerBuffer(1024), LoreBuilder.powerPerSecond(28));
	public static final ItemStack CROP_GROWTH_ACCELERATOR = new SlimefunItemStack("CROP_GROWTH_ACCELERATOR", Material.LIME_TERRACOTTA, "&aAcelerador de crecimiento de cultivos", "", "&rFunciona con &aFertilizante orgánico", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Radius: 7x7", "&8\u21E8 &7Speed: &a3/time", LoreBuilder.powerBuffer(1024), LoreBuilder.powerPerSecond(50));
	public static final ItemStack CROP_GROWTH_ACCELERATOR_2 = new SlimefunItemStack("CROP_GROWTH_ACCELERATOR_2", Material.LIME_TERRACOTTA, "&aAcelerador de crecimiento de cultivos &7(&eII&7)", "", "&rFunciona con &aFertilizante orgánico", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Radius: 9x9", "&8\u21E8 &7Speed: &a4/time", LoreBuilder.powerBuffer(1024), LoreBuilder.powerPerSecond(60));

	public static final ItemStack FOOD_FABRICATOR = new SlimefunItemStack("FOOD_FABRICATOR", Material.GREEN_STAINED_GLASS, "&cFabricador de comida", "", "&rProduce &aComida Organica", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(14));
	public static final ItemStack FOOD_FABRICATOR_2 = new SlimefunItemStack("FOOD_FABRICATOR_2", Material.GREEN_STAINED_GLASS, "&cFabricador de comida &7(&eII&7)", "", "&rProduce &aComida Organica", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 6x", LoreBuilder.powerBuffer(512), LoreBuilder.powerPerSecond(48));
	
	public static final ItemStack FOOD_COMPOSTER = new SlimefunItemStack("FOOD_COMPOSTER", Material.GREEN_TERRACOTTA, "&cCompostador de alimentos", "", "&rProduce &aFertilizante orgánico", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(16));
	public static final ItemStack FOOD_COMPOSTER_2 = new SlimefunItemStack("FOOD_COMPOSTER_2", Material.GREEN_TERRACOTTA, "&cCompostador de alimentos &7(&eII&7)", "", "&rProduce &aFertilizante orgánico", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 10x", LoreBuilder.powerBuffer(512), LoreBuilder.powerPerSecond(52));

	public static final ItemStack XP_COLLECTOR = new SlimefunItemStack("XP_COLLECTOR", "1762a15b04692a2e4b3fb3663bd4b78434dce1732b8eb1c7a9f7c0fbf6f", "&aRecolector de EXP", "", "&rRecoge Exp cerca y lo almacena", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerBuffer(1024), LoreBuilder.powerPerSecond(20)));
	public static final ItemStack REACTOR_COOLANT_CELL = new SlimefunItemStack("REACTOR_COLLANT_CELL", "de4073be40cb3deb310a0be959b4cac68e825372728fafb6c2973e4e7c33", "&bCelda de refrigerante del reactor");

	public static final ItemStack NUCLEAR_REACTOR = new SlimefunItemStack("NUCLEAR_REACTOR", "9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730", "&2Reactor nuclear", "", "&r¡Requiere enfriamiento!", "&8\u21E8 &bDebe estar rodeado de agua", "&8\u21E8 &bDebe suministrarse con celdas de refrigerante del reactor", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(16384), LoreBuilder.powerPerSecond(500));
	public static final ItemStack NETHERSTAR_REACTOR = new SlimefunItemStack("NETHERSTAR_REACTOR", "9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730", "&fReactor de estrella del Nether", "", "&fFunciona con estrellas del Nether", "&8\u21E8 &bDebe estar rodeado de agua", "&8\u21E8 &bDebe suministrarse con celdas de refrigerante del reactor", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(32768), LoreBuilder.powerPerSecond(1024), "&8\u21E8 &e\u26A1 &732768 Tope de J", "&8\u21E8 &e\u26A1 &71024 J/s", "&8\u21E8 &4Las entidades cercanas se marchitan");
	public static final ItemStack REACTOR_ACCESS_PORT = new SlimefunItemStack("REACTOR_ACCESS_PORT", Material.CYAN_TERRACOTTA, "&2Puerto de acceso al reactor", "", "&rTe permite interactuar con un Reactor", "&ra través de nodos de carga, también se puede utilizar", "&rcomo un Buffer", "", "&8\u21E8 &eDebe colocarse &a3 Bloques &eencima del reactor");
	
	public static final ItemStack FREEZER = new SlimefunItemStack("FREEZER", Material.LIGHT_BLUE_STAINED_GLASS, "&bCongelador", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(18));
	public static final ItemStack FREEZER_2 = new SlimefunItemStack("FREEZER_2", Material.LIGHT_BLUE_STAINED_GLASS, "&bCongelador &7(&eII&7)", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 2x", LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(30));
	
	public static final ItemStack ELECTRIC_GOLD_PAN = new SlimefunItemStack("ELECTRIC_GOLD_PAN", Material.BROWN_TERRACOTTA, "&6Limpiador de Oro eléctrico", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(2));
	public static final ItemStack ELECTRIC_GOLD_PAN_2 = new SlimefunItemStack("ELECTRIC_GOLD_PAN_2", Material.BROWN_TERRACOTTA, "&6Limpiador de Oro eléctrico &7(&eII&7)", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "&8\u21E8 &7Speed: 3x", LoreBuilder.powerPerSecond(4));
	public static final ItemStack ELECTRIC_GOLD_PAN_3 = new SlimefunItemStack("ELECTRIC_GOLD_PAN_3", Material.BROWN_TERRACOTTA, "&6Limpiador de Oro eléctrico &7(&eIII&7)", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 10x", LoreBuilder.powerPerSecond(14));

	public static final ItemStack ELECTRIC_DUST_WASHER = new SlimefunItemStack("ELECTRIC_DUST_WASHER", Material.BLUE_STAINED_GLASS, "&3Lavado de polvo eléctrico", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(6));
	public static final ItemStack ELECTRIC_DUST_WASHER_2 = new SlimefunItemStack("ELECTRIC_DUST_WASHER_2", Material.BLUE_STAINED_GLASS, "&3Lavado de polvo eléctrico &7(&eII&7)", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "&8\u21E8 &7Speed: 2x", LoreBuilder.powerPerSecond(10));
	public static final ItemStack ELECTRIC_DUST_WASHER_3 = new SlimefunItemStack("ELECTRIC_DUST_WASHER_3", Material.BLUE_STAINED_GLASS, "&3Lavado de polvo eléctrico &7(&eIII&7)", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 10x", LoreBuilder.powerPerSecond(30));

	public static final ItemStack ELECTRIC_INGOT_FACTORY = new SlimefunItemStack("ELECTRIC_INGOT_FACTORY", Material.RED_TERRACOTTA, "&cFábrica de lingotes eléctricos", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "&8\u21E8 &7Speed: 1x", LoreBuilder.powerPerSecond(8));
	public static final ItemStack ELECTRIC_INGOT_FACTORY_2 = new SlimefunItemStack("ELECTRIC_INGOT_FACTORY_2", Material.RED_TERRACOTTA, "&cFábrica de lingotes eléctricos &7(&eII&7)", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "&8\u21E8 &7Speed: 2x", LoreBuilder.powerPerSecond(14));
	public static final ItemStack ELECTRIC_INGOT_FACTORY_3 = new SlimefunItemStack("ELECTRIC_INGOT_FACTORY_3", Material.RED_TERRACOTTA, "&cFábrica de lingotes eléctricos &7(&eIII&7)", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Speed: 8x", LoreBuilder.powerPerSecond(40));

	public static final ItemStack AUTOMATED_CRAFTING_CHAMBER = new SlimefunItemStack("AUTOMATED_CRAFTING_CHAMBER", Material.CRAFTING_TABLE, "&6Cámara de fabricación automatizada", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &710 J/Item");
	public static final ItemStack FLUID_PUMP = new SlimefunItemStack("FLUID_PUMP", Material.BLUE_TERRACOTTA, "&9Bomba de fluido", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &732 J/Block");
	public static final ItemStack CHARGING_BENCH = new SlimefunItemStack("CHARGING_BENCH", Material.CRAFTING_TABLE, "&6Banco de carga", "", "&rCarga artículos como Jetpacks", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerBuffer(128), "&8\u21E8 &e\u26A1 &7Pérdida de energía: &c50%");

	public static final ItemStack WITHER_ASSEMBLER = new SlimefunItemStack("WITHER_ASSEMBLER", Material.OBSIDIAN, "&5Ensamblador de Wither", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Tiempo de espera: &b30 Segundos", LoreBuilder.powerBuffer(4096), "&8\u21E8 &e\u26A1 &74096 J/Wither");
	
	public static final ItemStack TRASH_CAN = new SlimefunItemStack("TRASH_CAN_BLOCK", "32d41042ce99147cc38cac9e46741576e7ee791283e6fac8d3292cae2935f1f", "&3Bote de basura", "", "&rDestruirá todos los artículos puestos en él");
	
	public static final ItemStack ELYTRA = new ItemStack(Material.ELYTRA);
	public static final ItemStack ELYTRA_SCALE = new SlimefunItemStack("ELYTRA_SCALE", Material.FEATHER, "&bEscala Elytra");
	public static final ItemStack INFUSED_ELYTRA = new SlimefunItemStack("INFUSED_ELYTRA", ELYTRA, "&5Elytra infundido");
	public static final ItemStack SOULBOUND_ELYTRA = new SlimefunItemStack("SOULBOUND_ELYTRA", ELYTRA, "&cElytra ligada al alma");

	public static final ItemStack TOTEM_OF_UNDYING = new ItemStack(Material.TOTEM_OF_UNDYING);

	public static final ItemStack MAGNESIUM_SALT = new SlimefunItemStack("MAGNESIUM_SALT", Material.SUGAR, "&cSal de magnesio", "", "&7Un tipo especial de combustible que puede ser", "&7utilizado en un generador de magnesio");
	public static final ItemStack MAGNESIUM_GENERATOR = new SlimefunItemStack("MAGNESIUM_GENERATOR", "9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730", "&cGenerador de magnesio", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR), LoreBuilder.powerBuffer(128), LoreBuilder.powerPerSecond(36));
	
	static {
		INFUSED_ELYTRA.addUnsafeEnchantment(Enchantment.MENDING, 1);
	}
	
	// ChestTerminal Addon
	
	public static final ItemStack CHEST_TERMINAL = new SlimefunItemStack("CHEST_TERMINAL", "7a44ff3a5f49c69cab676bad8d98a063fa78cfa61916fdef3e267557fec18283", "&3Terminal de acceso CT", "&7Si este bloque está conectado a un", "&7Cargo Network, te permitirá remotamente", "&7interactuar con cualquier artículo suministrado por", "&7Nodos sintonizados en el canal ChestTerminal");
	public static final ItemStack CT_IMPORT_BUS = new SlimefunItemStack("CT_IMPORT_BUS", "113db2e7e72ea4432eefbd6e58a85eaa2423f83e642ca41abc6a9317757b889", "&3Bus de entrada CT", "&7Si este bloque está conectado a un", "&7Cargo Network, extraerá cualquier artículo de", "&7el inventario al que está adjunto y colocarlo", "&7en el canal de red CT");
	public static final ItemStack CT_EXPORT_BUS = new SlimefunItemStack("CT_EXPORT_BUS", "113db2e7e72ea4432eefbd6e58a85eaa2423f83e642ca41abc6a9317757b889", "&3Bus de salida CT", "&7Si este bloque está conectado a un", "&7Cargo Network, extraerá cualquier artículo de", "&7el canal de red CT y colocar estos", "&7en el inventario al que está adjunto");

}