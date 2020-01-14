package io.github.thebusybiscuit.slimefun4.core.guide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.RecipeChoice.MaterialChoice;

import io.github.thebusybiscuit.cscorelib2.chat.ChatColors;
import io.github.thebusybiscuit.cscorelib2.chat.ChatInput;
import io.github.thebusybiscuit.cscorelib2.inventory.ItemUtils;
import io.github.thebusybiscuit.cscorelib2.item.CustomItem;
import io.github.thebusybiscuit.cscorelib2.recipes.MinecraftRecipe;
import io.github.thebusybiscuit.cscorelib2.skull.SkullItem;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler;
import me.mrCookieSlime.Slimefun.SlimefunGuide;
import me.mrCookieSlime.Slimefun.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.LockedCategory;
import me.mrCookieSlime.Slimefun.Objects.Research;
import me.mrCookieSlime.Slimefun.Objects.SeasonalCategory;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.interfaces.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.multiblocks.MultiBlockMachine;
import me.mrCookieSlime.Slimefun.api.GuideHandler;
import me.mrCookieSlime.Slimefun.api.PlayerProfile;
import me.mrCookieSlime.Slimefun.api.Slimefun;

public class ChestSlimefunGuide implements ISlimefunGuide {

	private static final int[] RECIPE_SLOTS = {3, 4, 5, 12, 13, 14, 21, 22, 23};
	private static final int CATEGORY_SIZE = 36;

	@Override
	public SlimefunGuideLayout getLayout() {
		return SlimefunGuideLayout.CHEST;
	}

	@Override
	public ItemStack getItem() {
		return new CustomItem(new ItemStack(Material.ENCHANTED_BOOK), "&aGuía de Slimefun &7(GUI de Cofre)", "", "&eClick Derecho &8\u21E8 &7Buscar Items", "&eShift + Click Derecho &8\u21E8 &7Abrir configuraciones / Créditos");
	}

	@Override
	public void openMainMenu(PlayerProfile profile, boolean survival, int page) {
		Player p = profile.getPlayer();
		if (p == null) return;

		if (survival) {
			profile.getGuideHistory().clear();
		}

		ChestMenu menu = create();

		List<Category> categories = SlimefunPlugin.getUtilities().enabledCategories;
		List<GuideHandler> handlers = SlimefunPlugin.getUtilities().guideHandlers.values().stream().flatMap(List::stream).collect(Collectors.toList());

		int index = 9;
		int pages = (categories.size() + handlers.size() - 1) / CATEGORY_SIZE + 1;

		fillInv(p, profile, menu, survival);

		int target = (CATEGORY_SIZE * (page - 1)) - 1;

		while (target < (categories.size() + handlers.size() - 1) && index < CATEGORY_SIZE + 9) {
			target++;

			if (target >= categories.size()) {
				if (!survival) {
					break;
				}

				index = handlers.get(target - categories.size()).next(p, index, menu);
			}
			else {
				Category category = categories.get(target);
				boolean locked = true;

				for (SlimefunItem item : category.getItems()) {
					if (Slimefun.isEnabled(p, item, false)) {
						locked = false;
						break;
					}
				}

				if (!locked) {
					if (!(category instanceof LockedCategory)) {
						if (!(category instanceof SeasonalCategory)) {
							menu.addItem(index, category.getItem());
							menu.addMenuClickHandler(index, (pl, slot, item, action) -> {
								openCategory(profile, category, survival, 1);
								return false;
							});
							index++;
						}
						else {
							if (((SeasonalCategory) category).isUnlocked()) {
								menu.addItem(index, category.getItem());
								menu.addMenuClickHandler(index, (pl, slot, item, action) -> {
									openCategory(profile, category, survival, 1);
									return false;
								});
								index++;
							}
						}
					}
					else if (!survival || ((LockedCategory) category).hasUnlocked(p, profile)) {
						menu.addItem(index, category.getItem());
						menu.addMenuClickHandler(index, (pl, slot, item, action) -> {
							openCategory(profile, category, survival, 1);
							return false;
						});

						index++;
					}
					else {
						List<String> parents = new ArrayList<>();
						parents.add("");
						parents.add(ChatColor.translateAlternateColorCodes('&', "&rDebes desbloquear todos los items"));
						parents.add(ChatColor.translateAlternateColorCodes('&', "&rde las siguientes categorías:"));
						parents.add("");

						for (Category parent : ((LockedCategory) category).getParents()) {
							parents.add(parent.getItem().getItemMeta().getDisplayName());
						}

						menu.addItem(index, new CustomItem(Material.BARRIER, "&4BLOQUEADO &7- &r" + category.getItem().getItemMeta().getDisplayName(), parents.toArray(new String[0])));
						menu.addMenuClickHandler(index, ChestMenuUtils.getEmptyClickHandler());
						index++;
					}
				}
			}
		}

		menu.addItem(46, ChestMenuUtils.getPreviousButton(page, pages));
		menu.addMenuClickHandler(46, (pl, slot, item, action) -> {
			int next = page - 1;
			if (next != page && next > 0) openMainMenu(profile, survival, next);
			return false;
		});

		menu.addItem(52, ChestMenuUtils.getNextButton(page, pages));
		menu.addMenuClickHandler(52, (pl, slot, item, action) -> {
			int next = page + 1;
			if (next != page && next <= pages) openMainMenu(profile, survival, next);
			return false;
		});

		menu.open(p);
	}

	@Override
	public void openCategory(PlayerProfile profile, Category category, boolean survival, int page) {
		Player p = profile.getPlayer();
		if (p == null) return;

		if (survival) {
			profile.getGuideHistory().add(category);
		}

		ChestMenu menu = create();
		fillInv(p, profile, menu, survival);

		menu.addItem(1, new CustomItem(ChestMenuUtils.getBackButton(), meta -> meta.setLore(Arrays.asList("", ChatColors.color("&rClick Izquierdo: &7Regresar al menú")))));
		menu.addMenuClickHandler(1, (pl, s, is, action) -> {
			openMainMenu(profile, survival, 1);
			return false;
		});

		int index = 9;
		int pages = (category.getItems().size() - 1) / CATEGORY_SIZE + 1;

		menu.addItem(46, ChestMenuUtils.getPreviousButton(page, pages));
		menu.addMenuClickHandler(46, (pl, slot, item, action) -> {
			int next = page - 1;
			if (next != page && next > 0) openCategory(profile, category, survival, next);
			return false;
		});

		menu.addItem(52, ChestMenuUtils.getNextButton(page, pages));
		menu.addMenuClickHandler(52, (pl, slot, item, action) -> {
			int next = page + 1;
			if (next != page && next <= pages) openCategory(profile, category, survival, next);
			return false;
		});

		int categoryIndex = CATEGORY_SIZE * (page - 1);

		for (int i = 0; i < CATEGORY_SIZE; i++) {
			int target = categoryIndex + i;
			if (target >= category.getItems().size()) break;

			SlimefunItem sfitem = category.getItems().get(target);

			if (Slimefun.isEnabled(p, sfitem, false)) {
				Research research = sfitem.getResearch();

				if (survival && research != null && !profile.hasUnlocked(research)) {
					if (Slimefun.hasPermission(p, sfitem, false)) {
						menu.addItem(index, new CustomItem(Material.BARRIER, "&r" + ItemUtils.getItemName(sfitem.getItem()), "&4&lBLOQUEADO", "", "&a> Click para desbloquear", "", "&7Cuesta: &b" + research.getCost() + " Niveles"));
						menu.addMenuClickHandler(index, (pl, slot, item, action) -> {
							if (!Research.isResearching(pl)) {
								if (research.canUnlock(pl)) {

									if (profile.hasUnlocked(research)) {
										openCategory(profile, category, true, page);
									}
									else {
										if (!(pl.getGameMode() == GameMode.CREATIVE && SlimefunPlugin.getSettings().researchesFreeInCreative)) {
											pl.setLevel(pl.getLevel() - research.getCost());
										}

										if (pl.getGameMode() == GameMode.CREATIVE) {
											research.unlock(pl, SlimefunPlugin.getSettings().researchesFreeInCreative);
											openCategory(profile, category, survival, page);
										}
										else {
											research.unlock(pl, false);
											Slimefun.runSync(() -> openCategory(profile, category, survival, page), 103L);
										}
									}
								}
								else SlimefunPlugin.getLocal().sendMessage(pl, "messages.not-enough-xp", true);
							}
							return false;
						});

						index++;
					}
					else {
						List<String> message = sfitem.getNoPermissionTooltip();
						menu.addItem(index, new CustomItem(Material.BARRIER, sfitem.getItemName(), message.toArray(new String[message.size()])));
						menu.addMenuClickHandler(index, ChestMenuUtils.getEmptyClickHandler());
						index++;
					}
				}
				else {
					menu.addItem(index, sfitem.getItem());
					menu.addMenuClickHandler(index, (pl, slot, item, action) -> {
						if (survival) {
							displayItem(profile, sfitem, true);
						}
						else {
							if (sfitem instanceof MultiBlockMachine) {
								SlimefunPlugin.getLocal().sendMessage(pl, "guide.cheat.no-multiblocks");
							}
							else {
								pl.getInventory().addItem(sfitem.getItem().clone());
							}
						}
						return false;
					});

					index++;
				}
			}
		}

		menu.open(p);
	}

	@Override
	public void openSearch(PlayerProfile profile, String input, boolean survival, boolean addToHistory) {
		Player p = profile.getPlayer();
		if (p == null) return;

		ChestMenu menu = new ChestMenu("Buscando por: " + shorten("", input));
		String searchTerm = input.toLowerCase();

		if (addToHistory) {
			profile.getGuideHistory().add(searchTerm);
		}

		menu.setEmptySlotsClickable(false);
		fillInv(p, profile, menu, survival);
		addBackButton(menu, 1, profile, survival);

		int index = 9;
		// Find items and add them
		for (SlimefunItem item : SlimefunItem.list()) {
			String itemName = ChatColor.stripColor(item.getItemName()).toLowerCase();

			if (index == 44) break;

			if (!itemName.isEmpty() && (itemName.equals(searchTerm) || itemName.contains(searchTerm))) {
				ItemStack itemstack = new CustomItem(item.getItem(), meta -> {
					List<String> lore = null;
					Category category = item.getCategory();

					if (category != null && category.getItem() != null && category.getItem().hasItemMeta() && category.getItem().getItemMeta().hasDisplayName()) {
						lore = Arrays.asList("", ChatColor.DARK_GRAY + "\u21E8 " + ChatColor.RESET + item.getCategory().getItem().getItemMeta().getDisplayName());
					}

					meta.setLore(lore);
					meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
				});

				menu.addItem(index, itemstack);
				menu.addMenuClickHandler(index, (pl, slot, itm, action) -> {
					if (!survival) {
						pl.getInventory().addItem(item.getItem().clone());
					}
					else {
						displayItem(profile, item, true);
					}

					return false;
				});

				index++;
			}
		}

		menu.open(p);
	}

	@Override
	public void displayItem(PlayerProfile profile, ItemStack item, boolean addToHistory) {
		Player p = profile.getPlayer();
		if (p == null) return;

		if (item == null || item.getType() == Material.AIR) return;

		SlimefunItem sfItem = SlimefunItem.getByItem(item);

		if (sfItem != null) {
			displayItem(profile, sfItem, addToHistory);
			return;
		}

		if (!SlimefunPlugin.getSettings().guideShowVanillaRecipes) {
			return;
		}

		Recipe[] recipes = SlimefunPlugin.getMinecraftRecipes().getRecipesFor(item).toArray(new Recipe[0]);

		if (recipes.length == 0) {
			return;
		}

		showMinecraftRecipe(recipes, 0, item, profile, p, addToHistory);
	}

	private void showMinecraftRecipe(Recipe[] recipes, int index, ItemStack item, PlayerProfile profile, Player p, boolean addToHistory) {
		Recipe recipe = recipes[index];

		ItemStack[] recipeItems = new ItemStack[9];
		RecipeType recipeType = RecipeType.NULL;
		ItemStack result = null;

		Optional<MinecraftRecipe<? super Recipe>> optional = MinecraftRecipe.of(recipe);
		RecipeChoiceTask task = new RecipeChoiceTask();

		if (optional.isPresent()) {
			MinecraftRecipe<?> mcRecipe = optional.get();

			RecipeChoice[] choices = SlimefunPlugin.getMinecraftRecipes().getRecipeInput(recipe);

			if (choices.length == 1) {
				recipeItems[4] = choices[0].getItemStack();

				if (choices[0] instanceof MaterialChoice && ((MaterialChoice) choices[0]).getChoices().size() > 1) {
					task.add(RECIPE_SLOTS[4], (MaterialChoice) choices[0]);
				}
			}
			else {
				for (int i = 0; i < choices.length; i++) {
					if (choices[i] != null) {
						recipeItems[i] = choices[i].getItemStack();

						if (choices[i] instanceof MaterialChoice && ((MaterialChoice) choices[i]).getChoices().size() > 1) {
							task.add(RECIPE_SLOTS[i], (MaterialChoice) choices[i]);
						}
					}
				}
			}

			if (mcRecipe == MinecraftRecipe.SHAPED_CRAFTING) {
				recipeType = new RecipeType(new CustomItem(mcRecipe.getMachine(), null, "&7Shaped Recipe"));
			}
			else if (mcRecipe == MinecraftRecipe.SHAPELESS_CRAFTING) {
				recipeType = new RecipeType(new CustomItem(mcRecipe.getMachine(), null, "&7Shapeless Recipe"));
			}
			else {
				recipeType = new RecipeType(mcRecipe);
			}

			result = recipe.getResult();
		}
		else {
			recipeItems = new ItemStack[] {null, null, null, null, new CustomItem(Material.BARRIER, "&4We are somehow unable to show you this Recipe :/"), null, null, null, null};
		}

		ChestMenu menu = create();
		displayItem(menu, profile, p, item, result, recipeType, recipeItems, addToHistory);

		if (recipes.length > 1) {
			for (int i = 27; i < 36; i++) {
				menu.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
			}

			menu.addItem(28, ChestMenuUtils.getPreviousButton(index + 1, recipes.length),
			(pl, slot, action, stack) -> {
				if (index > 0) {
					showMinecraftRecipe(recipes, index - 1, item, profile, p, false);
				}
				return false;
			});

			menu.addItem(34, ChestMenuUtils.getNextButton(index + 1, recipes.length),
			(pl, slot, action, stack) -> {
				if (index < recipes.length - 1) {
					showMinecraftRecipe(recipes, index + 1, item, profile, p, false);
				}
				return false;
			});
		}

		menu.open(p);

		if (!task.isEmpty()) {
			task.start(menu.toInventory());
		}
	}

	@Override
	public void displayItem(PlayerProfile profile, SlimefunItem item, boolean addToHistory) {
		Player p = profile.getPlayer();
		if (p == null) return;

		ItemStack result = item.getRecipeOutput() != null ? item.getRecipeOutput(): item.getItem();
		RecipeType recipeType = item.getRecipeType();
		ItemStack[] recipe = item.getRecipe();

		ChestMenu menu = create();

		if (item.hasWiki()) {
			menu.addItem(8, new CustomItem(Material.KNOWLEDGE_BOOK, "&rView this Item on our Wiki &7(Slimefun Wiki)", "", "&7\u21E8 Haga clic para abrir"));
			menu.addMenuClickHandler(8, (pl, slot, itemstack, action) -> {
				pl.closeInventory();
				ChatUtils.sendURL(pl, item.getWiki());
				return false;
			});
		}

		if (Slimefun.getItemConfig().contains(item.getID() + ".youtube")) {
			menu.addItem(7, new CustomItem(SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzNTNmZDBmODYzMTQzNTM4NzY1ODYwNzViOWJkZjBjNDg0YWFiMDMzMWI4NzJkZjExYmQ1NjRmY2IwMjllZCJ9fX0="), "&rVideo de demostración &7(Youtube)", "", "&7\u21E8 Haga clic para ver"));
			menu.addMenuClickHandler(7, (pl, slot, itemstack, action) -> {
				pl.closeInventory();
				ChatUtils.sendURL(pl, Slimefun.getItemConfig().getString(item.getID() + ".youtube"));
				return false;
			});
		}

		displayItem(menu, profile, p, item, result, recipeType, recipe, addToHistory);

		if (item instanceof RecipeDisplayItem) {
			displayRecipes(profile, menu, (RecipeDisplayItem) item, 0);
		}

		menu.open(p);
	}

	private void displayItem(ChestMenu menu, PlayerProfile profile, Player p, Object obj, ItemStack output, RecipeType recipeType, ItemStack[] recipe, boolean addToHistory) {
		LinkedList<Object> history = profile.getGuideHistory();
		boolean isSlimefunRecipe = obj instanceof SlimefunItem;

		if (addToHistory) {
			history.add(obj);
		}

		addBackButton(menu, 0, profile, true);

		MenuClickHandler clickHandler = (pl, slot, itemstack, action) -> {
			displayItem(profile, itemstack, true);
			return false;
		};

		for (int i = 0; i < 9; i++) {
			menu.addItem(RECIPE_SLOTS[i], getDisplayItem(p, isSlimefunRecipe, recipe[i]), clickHandler);
		}

		menu.addItem(10, recipeType.toItem(), ChestMenuUtils.getEmptyClickHandler());
		menu.addItem(16, output, ChestMenuUtils.getEmptyClickHandler());
	}

	private void fillInv(Player p, PlayerProfile profile, ChestMenu menu, boolean survival) {
		for (int i = 0; i < 9; i++) {
			menu.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
		}

		// Settings Panel
		menu.addItem(1, ChestMenuUtils.getMenuButton());
		menu.addMenuClickHandler(1, (pl, slot, item, action) -> {
			GuideSettings.openSettings(pl, pl.getInventory().getItemInMainHand());
			return false;
		});

		/*
		// Stats
		menu.addItem(4, new CustomItem(SkullItem.fromPlayer(p), "&7Player Stats: &e" + p.getName(), "", "&7Progress: &a" + Math.round(((profile.getResearches().size() * 100.0F) / Research.list().size()) * 100.0F) / 100.0F + "% &e(" + profile.getResearches().size() + " / " + Research.list().size() + ")", "", "&7\u21E8 Click for a full summary"));
		menu.addMenuClickHandler(4, (player, i, itemStack, clickAction) -> {
			player.closeInventory();
			profile.sendStats(player);
			return false;
		});
		 */

		// Search feature!
		menu.addItem(7, new CustomItem(ChestMenuUtils.getSearchButton(), SlimefunPlugin.getLocal().getMessage(p, "guide.search.name"), SlimefunPlugin.getLocal().getMessages(p, "guide.search.lore").toArray(new String[0])));
		menu.addMenuClickHandler(7, (pl, slot, item, action) -> {
			pl.closeInventory();
			SlimefunPlugin.getLocal().sendMessage(pl, "guide.search.message");

			ChatInput.waitForPlayer(SlimefunPlugin.instance, pl, msg ->
				SlimefunGuide.openSearch(profile, msg, survival, true)
			);

			return false;
		});

		for (int i = 45; i < 54; i++) {
			menu.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
		}
	}

	private void addBackButton(ChestMenu menu, int slot, PlayerProfile profile, boolean survival) {
		List<Object> playerHistory = profile.getGuideHistory();

		if (playerHistory.size() > 1) {

			menu.addItem(slot, new CustomItem(ChestMenuUtils.getBackButton(), meta -> meta.setLore(Arrays.asList(
				"",
				ChatColors.color("&rClick izquierdo: &7Regresar a la página anterior"),
				ChatColors.color("&rShift + click izquierdo: &7Regresar al menú principal")
			))));

			menu.addMenuClickHandler(slot, (pl, s, is, action) -> {
				if (action.isShiftClicked()) {
					openMainMenu(profile, survival, 1);
				}
				else {
					Object last = getLastEntry(profile, true);
					handleHistory(profile, last, survival);
				}
				return false;
			});

		}
		else {
			menu.addItem(slot, new CustomItem(ChestMenuUtils.getBackButton(), meta -> meta.setLore(Arrays.asList("", ChatColors.color("&rClick izquierdo: &7Regresar al menú principal")))));
			menu.addMenuClickHandler(slot, (pl, s, is, action) -> {
				openMainMenu(profile, survival, 1);
				return false;
			});
		}
	}

	private static ItemStack getDisplayItem(Player p, boolean isSlimefunRecipe, ItemStack item) {
		if (isSlimefunRecipe) {
			SlimefunItem slimefunItem = SlimefunItem.getByItem(item);
			if (slimefunItem == null) return item;

			String lore = Slimefun.hasPermission(p, slimefunItem, false) ? "&rNecesita ser desbloqueado en otro lugar" : "&rNo Permission";
			return Slimefun.hasUnlocked(p, slimefunItem, false) ? item: new CustomItem(Material.BARRIER, ItemUtils.getItemName(item), "&4&lBLOQUEADO", "", lore);
		}
		else {
			return item;
		}
	}

	private void displayRecipes(PlayerProfile profile, ChestMenu menu, RecipeDisplayItem sfItem, int page) {
		List<ItemStack> recipes = sfItem.getDisplayRecipes();

		if (!recipes.isEmpty()) {
			menu.addItem(53, null);

			if (page == 0) {
				for (int i = 27; i < 36; i++) {
					menu.replaceExistingItem(i, new CustomItem(ChestMenuUtils.getBackground(), sfItem.getRecipeSectionLabel()));
					menu.addMenuClickHandler(i, ChestMenuUtils.getEmptyClickHandler());
				}
			}

			int pages = (recipes.size() - 1) / 18 + 1;

			menu.replaceExistingItem(28, ChestMenuUtils.getPreviousButton(page + 1, pages));
			menu.addMenuClickHandler(28, (pl, slot, itemstack, action) -> {
				if (page > 0) {
					displayRecipes(profile, menu, sfItem, page - 1);
					pl.playSound(pl.getLocation(), Sound.ITEM_BOOK_PAGE_TURN, 1, 1);
				}
				
				return false;
			});

			menu.replaceExistingItem(34, ChestMenuUtils.getNextButton(page + 1, pages));
			menu.addMenuClickHandler(34, (pl, slot, itemstack, action) -> {
				if (recipes.size() > (18 * (page + 1))) {
					displayRecipes(profile, menu, sfItem, page + 1);
					pl.playSound(pl.getLocation(), Sound.ITEM_BOOK_PAGE_TURN, 1, 1);
				}
				
				return false;
			});

			int inputs = 36;
			int outputs = 45;

			for (int i = 0; i < 18; i++) {
				int slot = i % 2 == 0 ? inputs++: outputs++;

				if ((i + (page * 18)) < recipes.size()) {
					if (page == 0) {
						menu.replaceExistingItem(slot, recipes.get(i + (page * 18)).clone());
						menu.addMenuClickHandler(slot, (pl, s, itemstack, action) -> {
							displayItem(profile, itemstack, true);
							return false;
						});
					}
					else {
						menu.replaceExistingItem(slot, recipes.get(i + (page * 18)).clone());
					}
				}
				else {
					menu.replaceExistingItem(slot, null);
					menu.addMenuClickHandler(slot, ChestMenuUtils.getEmptyClickHandler());
				}
			}
		}
	}

	private static ChestMenu create() {
		ChestMenu menu = new ChestMenu("Guía de SlimeFun");

		menu.setEmptySlotsClickable(false);
		menu.addMenuOpeningHandler(pl -> pl.playSound(pl.getLocation(), Sound.ITEM_BOOK_PAGE_TURN, 1, 1));
		return menu;
	}

}