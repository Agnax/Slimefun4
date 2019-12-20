package io.github.thebusybiscuit.slimefun4.core.guide;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import io.github.thebusybiscuit.cscorelib2.chat.ChatColors;
import io.github.thebusybiscuit.cscorelib2.item.CustomItem;
import io.github.thebusybiscuit.cscorelib2.skull.SkullItem;
import io.github.thebusybiscuit.slimefun4.core.services.github.Contributor;
import io.github.thebusybiscuit.slimefun4.core.utils.ChatUtils;
import io.github.thebusybiscuit.slimefun4.core.utils.NumberUtils;
import me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.Slimefun.SlimefunGuide;
import me.mrCookieSlime.Slimefun.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.mrCookieSlime.Slimefun.api.Slimefun;

public final class GuideSettings {
	
	private static final int[] SLOTS = new int[] {0, 2, 4, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};

	private GuideSettings() {}
	
	public static void openSettings(Player p, final ItemStack guide) {
		final ChestMenu menu = new ChestMenu("Configuración / Info");

		menu.setEmptySlotsClickable(false);
		menu.addMenuOpeningHandler(pl -> pl.playSound(pl.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 0.7F, 0.7F));

		menu.addItem(1, new CustomItem(getItem(SlimefunGuideLayout.CHEST), "&e\u21E6 Regresar", "", "&7Regrese a su Guía de Slimefun"));
		menu.addMenuClickHandler(1, (pl, slot, item, action) -> {
			SlimefunGuide.openGuide(pl, guide);
			return false;
		});
		
		for (int i: SLOTS) {
			menu.addItem(i, new CustomItem(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "));
			menu.addMenuClickHandler(i, (pl, slot, item, action) -> false);
		}

		if (SlimefunManager.isItemSimilar(guide, getItem(SlimefunGuideLayout.CHEST), true)) {
			if (p.hasPermission("slimefun.cheat.items")) {
				menu.addItem(19, new CustomItem(new ItemStack(Material.CHEST), "&7Diseño de la guía: &eChest GUI", "", "&aChest GUI", "&7Book GUI", "&7Cheat Sheet", "", "&e Click para &8\u21E8 &7Cambiar Diseño"));
				menu.addMenuClickHandler(19, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.BOOK));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
			else {
				menu.addItem(19, new CustomItem(new ItemStack(Material.CHEST), "&7Diseño de la guía: &eChest GUI", "", "&aChest GUI", "&7Book GUI", "", "&e Click para &8\u21E8 &7Cambiar Diseño"));
				menu.addMenuClickHandler(19, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.BOOK));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
		}
		else if (SlimefunManager.isItemSimilar(guide, getItem(SlimefunGuideLayout.BOOK), true)) {
			if (p.hasPermission("slimefun.cheat.items")) {
				menu.addItem(19, new CustomItem(new ItemStack(Material.BOOK), "&7Diseño de la guía: &eBook GUI", "", "&7Chest GUI", "&aBook GUI", "&7Cheat Sheet", "", "&e Click para &8\u21E8 &7Cambiar Diseño"));
				menu.addMenuClickHandler(19, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.CHEAT_SHEET));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
			else {
				menu.addItem(19, new CustomItem(new ItemStack(Material.BOOK), "&7Diseño de la guía: &eBook GUI", "", "&7Chest GUI", "&aBook GUI", "", "&e Click para &8\u21E8 &7Cambiar Diseño"));
				menu.addMenuClickHandler(19, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.CHEST));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
		}
		else if (SlimefunManager.isItemSimilar(guide, getItem(SlimefunGuideLayout.CHEAT_SHEET), true)) {
			menu.addItem(19, new CustomItem(new ItemStack(Material.COMMAND_BLOCK), "&7Diseño de la guía: &eCheat Sheet", "", "&7Chest GUI", "&7Book GUI", "&aCheat Sheet", "", "&e Click para &8\u21E8 &7Cambiar Diseño"));
			menu.addMenuClickHandler(19, (pl, slot, item, action) -> {
				pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.CHEST));
				openSettings(pl, pl.getInventory().getItemInMainHand());
				return false;
			});
		}

		menu.addItem(3, new CustomItem(new ItemStack(Material.WRITABLE_BOOK),
				"&aCréditos",
				"",
				"&7Versión Slimefun: &a" + Slimefun.getVersion(),
				"&7Versión CS-CoreLib: &a" + CSCoreLib.getLib().getDescription().getVersion(),
				"&7Complementos instalados: &b" + Slimefun.getInstalledAddons().size(),
				"&7Contribuyentes: &e" + SlimefunPlugin.getGitHubService().getContributors().size(),
				"",
				"&7\u21E8 Haga clic para ver a las personas detrás de este complemento"
		));
		menu.addMenuClickHandler(3, (pl, slot, item, action) -> {
			openCredits(pl, 0);
			return false;
		});

		try {
			menu.addItem(5, new CustomItem(new ItemStack(Material.COMPARATOR), "&eCódigo fuente", "", "&7Bytes de código: &6" + NumberUtils.formatBigNumber(SlimefunPlugin.getGitHubService().getCodeSize()), "&7Última actividad: &a" + NumberUtils.timeDelta(SlimefunPlugin.getGitHubService().getLastUpdate()) + " ago", "&7Forks: &e" + SlimefunPlugin.getGitHubService().getForks(), "&7Estrellas: &e" + SlimefunPlugin.getGitHubService().getStars(), "", "&7&oSlimefun 4 es un proyecto comunitario,", "&7&oel código fuente está disponible en GitHub", "&7&oy si quieres mantener vivo este complemento,", "&7&oentonces por favor considera contribuir", "", "&7\u21E8 Haga clic para ir a GitHub"));
			menu.addMenuClickHandler(5, (pl, slot, item, action) -> {
				pl.closeInventory();
				ChatUtils.sendURL(pl, "https://github.com/TheBusyBiscuit/Slimefun4");
				return false;
			});
		} catch (Exception x) {
			Slimefun.getLogger().log(Level.SEVERE, "Se produjo un error al crear el panel de información para Slimefun " + Slimefun.getVersion(), x);
		}

		menu.addItem(7, new CustomItem(new ItemStack(Material.KNOWLEDGE_BOOK), "&3Slimefun Wiki", "", "&7¿Necesita ayuda con un item o máquina?", "&7¿No sabes qué hacer?", "&7Mira nuestra Wiki mantenida por la comunidad", "&7y conviértete en uno de nuestros editores!", "", "&7\u21E8 Haga clic para ir a la Wiki oficial de Slimefun"));
		menu.addMenuClickHandler(7, (pl, slot, item, action) -> {
			pl.closeInventory();
			ChatUtils.sendURL(pl, "https://github.com/TheBusyBiscuit/Slimefun4/wiki");
			return false;
		});

		menu.addItem(20, new CustomItem(new ItemStack(Material.REDSTONE), "&4Reportar un error", "", "&7Problemas abiertos: &a" + SlimefunPlugin.getGitHubService().getIssues(), "&7Pull Requests pendientes: &a" + SlimefunPlugin.getGitHubService().getPullRequests(), "", "&7\u21E8 Haga clic para ir al Slimefun Bug Tracker"));
		menu.addMenuClickHandler(20, (pl, slot, item, action) -> {
			pl.closeInventory();
			ChatUtils.sendURL(pl, "https://github.com/TheBusyBiscuit/Slimefun4/issues");
			return false;
		});
		
		// TODO: Resourcepack Install Button

		menu.open(p);
	}

	private static void openCredits(Player p, int page) {
		final ChestMenu menu = new ChestMenu("Créditos");

		menu.setEmptySlotsClickable(false);
		menu.addMenuOpeningHandler(pl -> pl.playSound(pl.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 0.7F, 0.7F));

		for (int i = 0; i < 9; i++) {
			if (i != 1) {
				menu.addItem(i, new CustomItem(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "));
				menu.addMenuClickHandler(i, (pl, slot, item, action) -> false);
			}
			else {
				menu.addItem(1, new CustomItem(getItem(SlimefunGuideLayout.CHEST), "&e\u21E6 Regresar", "", "&7Regrese al Panel de configuración"));
				menu.addMenuClickHandler(1, (pl, slot, item, action) -> {
					openSettings(pl, p.getInventory().getItemInMainHand());
					return false;
				});
			}
		}
		
		for (int i = 45; i < 54; i++) {
			if (i != 46 && i != 52) {
				menu.addItem(i, new CustomItem(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "));
				menu.addMenuClickHandler(i, (pl, slot, item, action) -> false);
			}
		}
		
		List<Contributor> contributors = new ArrayList<>(SlimefunPlugin.getGitHubService().getContributors().values());
		contributors.sort(Comparator.comparingInt(Contributor::index));
		
		boolean hasPrevious = page > 0;
		boolean hasNext = false;
		
		for (int i = page * 36; i < contributors.size(); i++) {
			if (i >= (page + 1) * 36) {
				hasNext = true;
				break;
			}
			
			Contributor contributor = contributors.get(i);
			ItemStack skull = new ItemStack(Material.PLAYER_HEAD);
			
			try {
				skull = SkullItem.fromBase64(contributor.getTexture());
			} catch (Exception e) {
				Slimefun.getLogger().log(Level.SEVERE, "Se produjo un error al insertar una cabeza de contribuidor.", e);
			}

			SkullMeta meta = (SkullMeta) skull.getItemMeta();
			meta.setDisplayName(ChatColor.GRAY + contributor.getName()
					+ (!contributor.getName().equals(contributor.getMinecraftName()) ? ChatColor.DARK_GRAY + " (MC: " + contributor.getMinecraftName() + ")" : "")
			);
			
			List<String> lore = new LinkedList<>();
			lore.add("");
			
			for (Map.Entry<String, Integer> entry : contributor.getContributions().entrySet()) {
				String info = entry.getKey();
				
				if (entry.getValue() > 0) {
					info += " &7(" + entry.getValue() + " Commit" + (entry.getValue() > 1 ? "s": "") + ")";
				}
				
				lore.add(ChatColors.color(info));
			}
			
			lore.add("");
			lore.add(ChatColors.color("&7\u21E8 Haga clic para visitar el perfil de " + contributor.getName()));
			meta.setLore(lore);
			skull.setItemMeta(meta);

			menu.addItem(i - page * 36 + 9, skull);
			menu.addMenuClickHandler(i - page * 36 + 9, (pl, slot, item, action) -> {
				pl.closeInventory();
				ChatUtils.sendURL(pl, contributor.getProfile());
				return false;
			});
		}

		if (hasPrevious) {
			menu.addItem(46, new CustomItem(Material.LIME_STAINED_GLASS_PANE, "&e\u21E6 Página anterior"));
			menu.addMenuClickHandler(46, (pl, slot, item, action) -> {
				openCredits(pl, page - 1);
				return false;
			});
		}
		else {
			menu.addItem(46, new CustomItem(Material.BLACK_STAINED_GLASS_PANE, " "));
			menu.addMenuClickHandler(46, (pl, slot, item, action) -> false);
		}

		if (hasNext) {
			menu.addItem(52, new CustomItem(Material.LIME_STAINED_GLASS_PANE, "&ePágina siguiente \u21E8"));
			menu.addMenuClickHandler(52, (pl, slot, item, action) -> {
				openCredits(pl, page + 1);
				return false;
			});
		}
		else {
			menu.addItem(52, new CustomItem(Material.BLACK_STAINED_GLASS_PANE, " "));
			menu.addMenuClickHandler(52, (pl, slot, item, action) -> false);
		}

		menu.open(p);
	}

	private static ItemStack getItem(SlimefunGuideLayout layout) {
		return SlimefunGuide.getItem(layout);
	}
	
}
