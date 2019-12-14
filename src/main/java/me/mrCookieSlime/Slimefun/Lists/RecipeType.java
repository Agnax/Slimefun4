package me.mrCookieSlime.Slimefun.Lists;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.cscorelib2.item.CustomItem;
import io.github.thebusybiscuit.cscorelib2.recipes.MinecraftRecipe;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunGadget;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunMachine;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.api.SlimefunRecipes;

public class RecipeType {
	
	public static final RecipeType MULTIBLOCK = new RecipeType(new CustomItem(Material.BRICKS, "&bMulti Bloque", "", "&a&oConstruyelo en el mundo"));
	public static final RecipeType ARMOR_FORGE = new RecipeType((SlimefunItemStack) SlimefunItems.ARMOR_FORGE, "", "&a&oHazlo en una Forja de armadura");
	public static final RecipeType GRIND_STONE = new RecipeType((SlimefunItemStack) SlimefunItems.GRIND_STONE, "", "&a&oMolerlo usando la piedra de moler");
	public static final RecipeType MOB_DROP = new RecipeType(new CustomItem(Material.IRON_SWORD, "&bDrop de mobs", "", "&a&oMata"));
	public static final RecipeType SMELTERY = new RecipeType((SlimefunItemStack) SlimefunItems.SMELTERY, "", "&a&oFundelo usando el horno de fundición");
	public static final RecipeType ORE_CRUSHER = new RecipeType((SlimefunItemStack) SlimefunItems.ORE_CRUSHER, "", "&a&oPolvorizalo con la trituradora de mineral");
	public static final RecipeType GOLD_PAN = new RecipeType((SlimefunItemStack) SlimefunItems.GOLD_PAN, "", "&a&oUsa una sartén de oro en la grava para obtener este artículo");
	public static final RecipeType COMPRESSOR = new RecipeType((SlimefunItemStack) SlimefunItems.COMPRESSOR, "", "&a&oComprimelo en el compresor");
	public static final RecipeType PRESSURE_CHAMBER = new RecipeType((SlimefunItemStack) SlimefunItems.PRESSURE_CHAMBER, "", "&a&oComprimelo en la cámara de presión");
	public static final RecipeType MAGIC_WORKBENCH = new RecipeType((SlimefunItemStack) SlimefunItems.MAGIC_WORKBENCH, "", "&a&oCraftealo en la mesa de crafteo mágica");
	public static final RecipeType ORE_WASHER = new RecipeType((SlimefunItemStack) SlimefunItems.ORE_WASHER, "", "&a&oLavalo con la lavadora de Minerales");
	public static final RecipeType ENHANCED_CRAFTING_TABLE = new RecipeType((SlimefunItemStack) SlimefunItems.ENHANCED_CRAFTING_TABLE, "", "&a&oUna mesa de fabricación normal no puede", "&a&omantener la cantidad inmensa de energía que emana esto...");
	public static final RecipeType JUICER = new RecipeType((SlimefunItemStack) SlimefunItems.JUICER, "", "&a&oUsado para la creación de jugos");
	public static final RecipeType ANCIENT_ALTAR = new RecipeType((SlimefunItemStack) SlimefunItems.ANCIENT_ALTAR, "", "&dNecesitarás crear este artículo", "&drealizando un ritual de altar antiguo");
	public static final RecipeType HEATED_PRESSURE_CHAMBER = new RecipeType((SlimefunItemStack) SlimefunItems.HEATED_PRESSURE_CHAMBER, "", "&a&oCrea este artículo en una", "&a&opresión calentada");
	
	public static final RecipeType SHAPED_RECIPE = new RecipeType(new CustomItem(Material.CRAFTING_TABLE, "&eReceta con forma", "", "&a&oSolo es una receta estándar en el Workbench..."));
	public static final RecipeType SHAPELESS_RECIPE = new RecipeType(new CustomItem(Material.CRAFTING_TABLE, "&eReceta sin forma", "", "&a&oSolo es una receta estándar en el Workbench..."));
	public static final RecipeType FURNACE = new RecipeType(new CustomItem(Material.FURNACE, "&eReceta de Horno", "", "&a&oSólo fundelo en un horno normal"));
	public static final RecipeType NULL = new RecipeType((ItemStack) null);
	
	private final ItemStack item;
	private final String machine;
	
	public RecipeType(ItemStack item, String machine) {
		this.item = item;
		this.machine = machine;
	}
	
	public RecipeType(SlimefunItemStack slimefunItem, String... lore) {
		this.item = new CustomItem(slimefunItem, null, lore);
		this.machine = slimefunItem.getItemID();
	}
	
	public RecipeType(ItemStack item) {
		this(item, "");
	}
	
	public RecipeType(MinecraftRecipe<?> recipe) {
		this(new ItemStack(recipe.getMachine()));
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
		return recipes.get(((getRecipeInputs(machine).indexOf(input) * 2) + 1))[0].clone();
	}
	
	public static ItemStack getRecipeOutputList(SlimefunItem machine, ItemStack[] input) {
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		return recipes.get(((getRecipeInputList(machine).indexOf(input) * 2) + 1))[0];
	}
}
