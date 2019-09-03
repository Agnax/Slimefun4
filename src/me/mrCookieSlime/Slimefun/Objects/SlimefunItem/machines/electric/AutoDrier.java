package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.machines.electric;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.InvUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineHelper;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.interfaces.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.energy.ChargableBlock;

public class AutoDrier extends AContainer implements RecipeDisplayItem {
	
	private final List<ItemStack> recipes = new ArrayList<>();

    public AutoDrier(Category category, ItemStack item, String id, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, id, recipeType, recipe);
        
        recipes.add(new ItemStack(Material.ROTTEN_FLESH));
        recipes.add(new ItemStack(Material.LEATHER));
        
        recipes.add(new ItemStack(Material.WET_SPONGE));
        recipes.add(new ItemStack(Material.SPONGE));
        
        recipes.add(new ItemStack(Material.KELP));
        recipes.add(new ItemStack(Material.DRIED_KELP));
        
        recipes.add(new ItemStack(Material.COOKED_BEEF));
        recipes.add(SlimefunItems.BEEF_JERKY);
        
        recipes.add(new ItemStack(Material.POTION));
        recipes.add(new ItemStack(Material.GLASS_BOTTLE));
        
        recipes.add(new ItemStack(Material.OAK_SAPLING));
        recipes.add(new ItemStack(Material.STICK, 2));
        
        recipes.add(new ItemStack(Material.OAK_LEAVES));
        recipes.add(new ItemStack(Material.STICK));
        
        recipes.add(new ItemStack(Material.WATER_BUCKET));
        recipes.add(new ItemStack(Material.BUCKET));
    }

    @Override
    public String getInventoryTitle() {
        return "&eSecador automático";
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.FLINT_AND_STEEL);
    }
    
    @Override
    public List<ItemStack> getDisplayRecipes() {
    	return recipes;
    }

    @Override
    protected void tick(Block b) {
        if (isProcessing(b)) {
            int timeleft = progress.get(b);
            if (timeleft > 0) {
            	MachineHelper.updateProgressbar(BlockStorage.getInventory(b), 22, timeleft, processing.get(b).getTicks(), getProgressBar());
				
                if (ChargableBlock.isChargable(b)) {
                    if (ChargableBlock.getCharge(b) < getEnergyConsumption()) return;
                    ChargableBlock.addCharge(b, -getEnergyConsumption());
                    progress.put(b, timeleft - 1);
                }
                else progress.put(b, timeleft - 1);
            }
            else {
                BlockStorage.getInventory(b).replaceExistingItem(22, new CustomItem(new ItemStack(Material.BLACK_STAINED_GLASS_PANE), " "));
                pushItems(b, processing.get(b).getOutput());

                progress.remove(b);
                processing.remove(b);
            }
        }
        else {
            MachineRecipe r = null;
            int inputSlot = -1;
            
            for (int slot: getInputSlots()) {
                ItemStack item = BlockStorage.getInventory(b).getItemInSlot(slot);
                if (item != null) {
                    Material mat = item.getType();
                    ItemStack output = null;
                    
                    for (int i = 0; i < recipes.size(); i += 2) {
                    	if (SlimefunManager.isItemSimiliar(item, recipes.get(i), true)) {
                    		output = recipes.get(i + 1);
                    	}
                    }
                    
                    if (Tag.SAPLINGS.isTagged(mat)) {
                        output = new ItemStack(Material.STICK, 2);
                    }
                    else if (Tag.LEAVES.isTagged(mat)) {
                        output = new ItemStack(Material.STICK, 1);
                    }
                    else if (mat == Material.SPLASH_POTION || mat == Material.LINGERING_POTION) {
                        output = new ItemStack(Material.GLASS_BOTTLE);
                    }
                    
                    if (output != null) {
                    	r = new MachineRecipe(6, new ItemStack[] {item}, new ItemStack[] {output.clone()});
                        inputSlot = slot;
                        break;
                    }
                }
            }

            if (r != null) {
                if (inputSlot == -1) return;
                if (!fits(b, r.getOutput())) return;
                BlockStorage.getInventory(b).replaceExistingItem(inputSlot, InvUtils.decreaseItem(BlockStorage.getInventory(b).getItemInSlot(inputSlot), 1));
                processing.put(b, r);
                progress.put(b, r.getTicks());
            }
        }
    }

    @Override
    public int getEnergyConsumption() {
        return 5;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public String getMachineIdentifier() {
        return "AUTO_DRIER";
    }
}
