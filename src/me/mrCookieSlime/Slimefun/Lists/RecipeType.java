package me.mrCookieSlime.Slimefun.Lists;

import java.util.ArrayList;
import java.util.List;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunGadget;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunMachine;
import me.mrCookieSlime.Slimefun.api.SlimefunRecipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RecipeType {
	
	public static final RecipeType MULTIBLOCK = new RecipeType(new CustomItem(Material.BRICK, "&bMulti-Block", 0, new String[] {"", "&a&oConstruye esto en el mundo"}));
	public static final RecipeType ARMOR_FORGE = new RecipeType(new CustomItem(Material.ANVIL, "&bForja de armadura", 0, new String[] {"", "&a&oConstruye la armadura en la Forja de Armadura"}), "ARMOR_FORGE");
	public static final RecipeType GRIND_STONE = new RecipeType(new CustomItem(Material.DISPENSER, "&bPiedra de amolar", 0, new String[] {"", "&a&oMuele con la piedra de amolar"}), "GRIND_STONE");
	public static final RecipeType MOB_DROP = new RecipeType(new CustomItem(Material.IRON_SWORD, "&bDropeo de Mob", 0, new String[] {"", "&a&oMata a un mob específico para obtener este item."}));
	public static final RecipeType SMELTERY = new RecipeType(new CustomItem(Material.FURNACE, "&6Fundición", 0, new String[] {"", "&a&oSe funde usando la fundición."}), "SMELTERY");
	public static final RecipeType ORE_CRUSHER = new RecipeType(new CustomItem(Material.DISPENSER, "&bTrituradora de minerales", 0, new String[] {"", "&a&oTrituralo con la Trituradora de minerales"}), "ORE_CRUSHER");
	public static final RecipeType GOLD_PAN = new RecipeType(new CustomItem(Material.BOWL, "&bCharola de oro", 0, new String[] {"", "&a&oUtilice grava en la Charola de oro para obtener este item."}));
	public static final RecipeType COMPRESSOR = new RecipeType(new CustomItem(Material.PISTON, "&bCompresor", 0, new String[] {"", "&a&oComprimelo utilizando el compresor."}), "COMPRESSOR");
	public static final RecipeType PRESSURE_CHAMBER = new RecipeType(new CustomItem(Material.GLASS, "&bCámara de presión", 0, new String[] {"", "&a&oComprimelo utilizando la cámara de presión."}), "PRESSURE_CHAMBER");
	public static final RecipeType OVEN = new RecipeType(new CustomItem(Material.FURNACE, "&bHorno", 0, new String[] {"", "&a&oFundelo en un horno"}), "OVEN");
	public static final RecipeType MAGIC_WORKBENCH = new RecipeType(new CustomItem(Material.BOOKSHELF, "&6Mesa de trabajo mágico", 0, new String[] {"", "&a&oElaboralo en una Mesa de trabajo mágica"}), "MAGIC_WORKBENCH");
	public static final RecipeType ORE_WASHER = new RecipeType(new CustomItem(Material.CAULDRON, "&6Lavadora de minerales", 0, new String[] {"", "&a&oLávalo con la Lavadora de minerales"}), "ORE_WASHER");
	public static final RecipeType ENHANCED_CRAFTING_TABLE = new RecipeType(new CustomItem(Material.CRAFTING_TABLE, "&eMesa de crafteo mejorada", 0, new String[] {"", "&a&oUna mesa de crafteo regular no puede", "&a&omantener esta cantidad de poder..."}), "ENHANCED_CRAFTING_TABLE");
	public static final RecipeType JUICER = new RecipeType(new CustomItem(Material.GLASS_BOTTLE, "&eExprimidor", 0, new String[] {"", "&a&oÚselo en el Exprimidor"}), "JUICER");
	public static final RecipeType ANCIENT_ALTAR = new RecipeType(new CustomItem(Material.ENCHANTING_TABLE, "&4Altar antiguo", 0, new String[] {"", "&dPara elaborar este item necesitas ", "&dhacer un ritual en Altar antiguo"}));
	public static final RecipeType HEATED_PRESSURE_CHAMBER = new RecipeType(new CustomItem(new ItemStack(Material.GRAY_STAINED_GLASS), "&cCámara de presión climatizada", "", "&a&oCrea este artículo en una", "&a&oCámara de presión climatizada"), "HEATED_PRESSURE_CHAMBER");
	
	public static final RecipeType SHAPED_RECIPE = new RecipeType(new CustomItem(Material.CRAFTING_TABLE, "&eReceta Normal", 0, new String[] {"", "&a&oSólo una receta estándar en la mesa de crateo..."}));
	public static final RecipeType SHAPELESS_RECIPE = new RecipeType(new CustomItem(Material.CRAFTING_TABLE, "&eReceta sin forma", 0, new String[] {"", "&a&oSólo una receta estándar en la mesa de crateo..."}));
	public static final RecipeType FURNACE = new RecipeType(new CustomItem(Material.FURNACE, "&eReceta de horno", 0, new String[] {"", "&a&oSólo cocínalo en un horno normal"}));
	public static final RecipeType NULL = new RecipeType(null);
	
	private ItemStack item;
	private String machine;
	
	public RecipeType(ItemStack item) {
		this.item = item;
		this.machine = "";
	}
	
	public RecipeType(ItemStack item, String machine) {
		this.item = item;
		this.machine = machine;
	}
	
	public RecipeType(String machine, int seconds, ItemStack[] input, ItemStack[] output) {
		this.machine = machine;
		this.item = getMachine().getItem();
		
		SlimefunRecipes.registerMachineRecipe(machine, seconds, input, output);
	}
	
	public ItemStack toItem() {
		return this.item;
	}
	
	public SlimefunItem getMachine() {
		return SlimefunItem.getByID(machine);
	}
	
	public static List<ItemStack> getRecipeInputs(SlimefunItem machine) {
		if (machine == null) return new ArrayList<>();
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		List<ItemStack> convertible = new ArrayList<>();
		for (int i = 0; i < recipes.size(); i++) {
			if (i % 2 == 0) convertible.add(recipes.get(i)[0]);
		}
		return convertible;
	}
	
	public static List<ItemStack[]> getRecipeInputList(SlimefunItem machine) {
		if (machine == null) return new ArrayList<>();
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		List<ItemStack[]> convertible = new ArrayList<>();
		for (int i = 0; i < recipes.size(); i++) {
			if (i % 2 == 0) convertible.add(recipes.get(i));
		}
		return convertible;
	}
	
	public static ItemStack getRecipeOutput(SlimefunItem machine, ItemStack input) {
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		return recipes.get(((getRecipeInputs(machine).indexOf(input) * 2) + 1))[0];
	}
	
	public static ItemStack getRecipeOutputList(SlimefunItem machine, ItemStack[] input) {
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		return recipes.get(((getRecipeInputList(machine).indexOf(input) * 2) + 1))[0];
	}
}
