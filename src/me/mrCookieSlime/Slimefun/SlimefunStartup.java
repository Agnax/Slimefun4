package me.mrCookieSlime.Slimefun;

import java.io.File;

import org.bstats.bukkit.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.cscorelib2.updater.BukkitUpdater;
import io.github.thebusybiscuit.cscorelib2.updater.GitHubBuildsUpdater;
import io.github.thebusybiscuit.cscorelib2.updater.Updater;
import me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib;
import me.mrCookieSlime.CSCoreLibPlugin.PluginUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Reflection.ReflectionUtils;
import me.mrCookieSlime.Slimefun.GEO.OreGenSystem;
import me.mrCookieSlime.Slimefun.GEO.Resources.NetherIceResource;
import me.mrCookieSlime.Slimefun.GEO.Resources.OilResource;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.MultiBlock;
import me.mrCookieSlime.Slimefun.Objects.Research;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunArmorPiece;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.multiblocks.OreWasher;
import me.mrCookieSlime.Slimefun.Setup.CSCoreLibLoader;
import me.mrCookieSlime.Slimefun.Setup.Files;
import me.mrCookieSlime.Slimefun.Setup.Messages;
import me.mrCookieSlime.Slimefun.Setup.MiscSetup;
import me.mrCookieSlime.Slimefun.Setup.ResearchSetup;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.mrCookieSlime.Slimefun.Setup.SlimefunSetup;
import me.mrCookieSlime.Slimefun.ancient_altar.AncientAltarListener;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.PlayerProfile;
import me.mrCookieSlime.Slimefun.api.Slimefun;
import me.mrCookieSlime.Slimefun.api.SlimefunBackup;
import me.mrCookieSlime.Slimefun.api.TickerTask;
import me.mrCookieSlime.Slimefun.api.energy.ChargableBlock;
import me.mrCookieSlime.Slimefun.api.energy.EnergyNet;
import me.mrCookieSlime.Slimefun.api.energy.ItemEnergy;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.UniversalBlockMenu;
import me.mrCookieSlime.Slimefun.api.item_transport.CargoNet;
import me.mrCookieSlime.Slimefun.autosave.BlockAutoSaver;
import me.mrCookieSlime.Slimefun.autosave.PlayerAutoSaver;
import me.mrCookieSlime.Slimefun.commands.SlimefunCommand;
import me.mrCookieSlime.Slimefun.commands.SlimefunTabCompleter;
import me.mrCookieSlime.Slimefun.hooks.SlimefunHooks;
import me.mrCookieSlime.Slimefun.hooks.github.GitHubConnector;
import me.mrCookieSlime.Slimefun.hooks.github.GitHubSetup;
import me.mrCookieSlime.Slimefun.listeners.AndroidKillingListener;
import me.mrCookieSlime.Slimefun.listeners.ArmorListener;
import me.mrCookieSlime.Slimefun.listeners.AutonomousToolsListener;
import me.mrCookieSlime.Slimefun.listeners.BackpackListener;
import me.mrCookieSlime.Slimefun.listeners.BlockListener;
import me.mrCookieSlime.Slimefun.listeners.BowListener;
import me.mrCookieSlime.Slimefun.listeners.CoolerListener;
import me.mrCookieSlime.Slimefun.listeners.DamageListener;
import me.mrCookieSlime.Slimefun.listeners.FurnaceListener;
import me.mrCookieSlime.Slimefun.listeners.GearListener;
import me.mrCookieSlime.Slimefun.listeners.GuideOnJoinListener;
import me.mrCookieSlime.Slimefun.listeners.ItemListener;
import me.mrCookieSlime.Slimefun.listeners.ItemPickupListener;
import me.mrCookieSlime.Slimefun.listeners.NetworkListener;
import me.mrCookieSlime.Slimefun.listeners.PlayerQuitListener;
import me.mrCookieSlime.Slimefun.listeners.TalismanListener;
import me.mrCookieSlime.Slimefun.listeners.TeleporterListener;
import me.mrCookieSlime.Slimefun.listeners.ToolListener;
import me.mrCookieSlime.Slimefun.listeners.WorldListener;
import me.mrCookieSlime.Slimefun.utils.Settings;
import me.mrCookieSlime.Slimefun.utils.Utilities;

public final class SlimefunStartup extends JavaPlugin {

	public static SlimefunStartup instance;

	private static Config researches;
	private static Config items;
	private static Config whitelist;
	private static Config config;

	public static TickerTask ticker;
	
	private Utilities utilities = new Utilities();
	private Settings settings;
	private SlimefunHooks hooks;
	
	// Supported Versions of Minecraft
	private final String[] supported = {"v1_14_"};

	@Override
	public void onEnable() {
		CSCoreLibLoader loader = new CSCoreLibLoader(this);
		if (loader.load()) {

			String currentVersion = ReflectionUtils.getVersion();

			if (currentVersion.startsWith("v")) {
				boolean compatibleVersion = false;
				StringBuilder versions = new StringBuilder();

				int i = 0;
				for (String version: supported) {
					if (currentVersion.startsWith(version)) {
						compatibleVersion = true;
					}

					if (i == 0) versions.append(version.substring(1).replaceFirst("_", ".").replace("_", ".X"));
					else if (i == supported.length - 1) versions.append(" or " + version.substring(1).replaceFirst("_", ".").replace("_", ".X"));
					else versions.append(", " + version.substring(1).replaceFirst("_", ".").replace("_", ".X"));

					i++;
				}

				// Looks like you are using an unsupported Minecraft Version
				if (!compatibleVersion) {
					System.err.println("### Slimefun failed to load!");
					System.err.println("###");
					System.err.println("### You are using the wrong Version of Minecraft!!!");
					System.err.println("###");
					System.err.println("### You are using Minecraft " + ReflectionUtils.getVersion());
					System.err.println("### but Slimefun v" + getDescription().getVersion() + " requires you to be using");
					System.err.println("### Minecraft " + versions.toString());
					System.err.println("###");
					System.err.println("### Please use an older Version of Slimefun and disable auto-updating");
					System.err.println("### or consider updating your Server Software.");
					getServer().getPluginManager().disablePlugin(this);
					return;
				}
			}

			instance = this;
			System.out.println("[Slimefun] Loading Files...");
			Files.cleanup();

			System.out.println("[Slimefun] Loading Config...");

			PluginUtils utils = new PluginUtils(this);
			utils.setupConfig();

			// Loading all extra configs
			researches = new Config(Files.RESEARCHES);
			items = new Config(Files.ITEMS);
			whitelist = new Config(Files.WHITELIST);

			// Setup Config and messages.yml
			utils.setupLocalization();
			config = utils.getConfig();
			Messages.local = utils.getLocalization();
			Messages.setup();
			
			// Setting up bStats
			new Metrics(this);

			// Setting up the Auto-Updater
			Updater updater;

			if (!getDescription().getVersion().startsWith("DEV - ")) {
				// We are using an official build, use the BukkitDev Updater
				updater = new BukkitUpdater(this, getFile(), 53485);
			}
			else {
				// If we are using a development build, we want to switch to our custom 
				updater = new GitHubBuildsUpdater(this, getFile(), "TheBusyBiscuit/Slimefun4/master");
			}

			if (config.getBoolean("options.auto-update")) updater.start();

			// Creating all necessary Folders
			String[] storage = {"blocks", "stored-blocks", "stored-inventories", "stored-chunks", "universal-inventories", "waypoints", "block-backups"};
			String[] general = {"scripts", "generators", "error-reports", "cache/github"};
			for (String s : storage) createDir("data-storage/Slimefun/" + s);
			for (String s : general) createDir("plugins/Slimefun/" + s);

			SlimefunManager.plugin = this;

			System.out.println("[Slimefun] Loading Items...");
			MiscSetup.setupItemSettings();
			
			try {
				SlimefunSetup.setupItems();
			} catch (Exception x) {
				x.printStackTrace();
			}
			MiscSetup.loadDescriptions();
			
			settings = new Settings(config);
			settings.RESEARCHES_ENABLED = getResearchCfg().getBoolean("enable-researching");
			settings.SMELTERY_FIRE_BREAK_CHANCE = (Integer) Slimefun.getItemValue("SMELTERY", "chance.fireBreak");

			System.out.println("[Slimefun] Loading Researches...");
			ResearchSetup.setupResearches();

			MiscSetup.setupMisc();

			System.out.println("[Slimefun] Loading World Generators...");

			// Generating Oil as an OreGenResource (its a cool API)
			OreGenSystem.registerResource(new OilResource());
			OreGenSystem.registerResource(new NetherIceResource());

			// Setting up GitHub Connectors...

			GitHubSetup.setup();

			// All Slimefun Listeners
			new ArmorListener(this);
			new ItemListener(this);
			new BlockListener(this);
			new GearListener(this);
			new AutonomousToolsListener(this);
			new DamageListener(this);
			new BowListener(this);
			new ToolListener(this);
			new FurnaceListener(this);
			new TeleporterListener(this);
			new AndroidKillingListener(this);
			new NetworkListener(this);
			new ItemPickupListener(this);

			// Toggleable Listeners for performance
			if (config.getBoolean("items.talismans")) new TalismanListener(this);
			if (config.getBoolean("items.backpacks")) new BackpackListener(this);
			if (config.getBoolean("items.coolers")) new CoolerListener(this);

			// Handle Slimefun Guide being given on Join
			if (config.getBoolean("options.give-guide-on-first-join")) new GuideOnJoinListener(this);

			// Load/Unload Worlds in Slimefun
			new WorldListener(this);

			// Clear the Slimefun Guide History upon Player Leaving
			new PlayerQuitListener(this);

			// Initiating various Stuff and all Items with a slightly delay (0ms after the Server finished loading)
			getServer().getScheduler().scheduleSyncDelayedTask(this, () -> {
				Slimefun.emeraldenchants = getServer().getPluginManager().isPluginEnabled("EmeraldEnchants");
				MiscSetup.loadItems(settings);

				for (World world: Bukkit.getWorlds()) {
					new BlockStorage(world);
				}

				if (SlimefunItem.getByID("ANCIENT_ALTAR") != null) new AncientAltarListener((SlimefunStartup) instance);
			}, 0);

			getCommand("slimefun").setExecutor(new SlimefunCommand(this));
			getCommand("slimefun").setTabCompleter(new SlimefunTabCompleter());

			// Armor Update Task
			if (config.getBoolean("options.enable-armor-effects")) {
				getServer().getScheduler().runTaskTimer(this, () -> {
					for (Player p: Bukkit.getOnlinePlayers()) {
						for (ItemStack armor: p.getInventory().getArmorContents()) {
							if (armor != null && Slimefun.hasUnlocked(p, armor, true)) {
								if (SlimefunItem.getByItem(armor) instanceof SlimefunArmorPiece) {
									for (PotionEffect effect: ((SlimefunArmorPiece) SlimefunItem.getByItem(armor)).getEffects()) {
										p.removePotionEffect(effect.getType());
										p.addPotionEffect(effect);
									}
								}
								if (SlimefunManager.isItemSimiliar(armor, SlimefunItem.getItem("SOLAR_HELMET"), false) && p.getWorld().getTime() < 12300 || p.getWorld().getTime() > 23850 && p.getEyeLocation().getBlock().getLightFromSky() == 15) {
									ItemEnergy.chargeInventory(p, Float.valueOf(String.valueOf(Slimefun.getItemValue("SOLAR_HELMET", "charge-amount"))));
								}
							}
						}

						for (ItemStack radioactive: SlimefunItem.radioactive) {
							if (p.getInventory().containsAtLeast(radioactive, 1) || SlimefunManager.isItemSimiliar(p.getInventory().getItemInOffHand(), radioactive, true)) {
								// Check if player is wearing the hazmat suit
								// If so, break the loop
								if (SlimefunManager.isItemSimiliar(SlimefunItems.SCUBA_HELMET, p.getInventory().getHelmet(), true) &&
										SlimefunManager.isItemSimiliar(SlimefunItems.HAZMATSUIT_CHESTPLATE, p.getInventory().getChestplate(), true) &&
										SlimefunManager.isItemSimiliar(SlimefunItems.HAZMATSUIT_LEGGINGS, p.getInventory().getLeggings(), true) &&
										SlimefunManager.isItemSimiliar(SlimefunItems.RUBBER_BOOTS, p.getInventory().getBoots(), true)) {
									break;
								}

								// If the item is enabled in the world, then make radioactivity do its job
								if (Slimefun.isEnabled(p, radioactive, false)) {
									p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 400, 3));
									p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 400, 3));
									p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 400, 3));
									p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 400, 3));
									p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 400, 1));
									p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 400, 1));
									p.setFireTicks(400);
									break; // Break the loop to save some calculations
								}
							}
						}
					}
				}, 0L, config.getInt("options.armor-update-interval") * 20L);
			}

			ticker = new TickerTask();

			getServer().getScheduler().runTaskTimer(this, new PlayerAutoSaver(), 2000L, settings.BLOCK_AUTO_SAVE_DELAY * 60L * 20L);

			// Starting all ASYNC Tasks
			getServer().getScheduler().runTaskTimerAsynchronously(this, new BlockAutoSaver(), 2000L, settings.BLOCK_AUTO_SAVE_DELAY * 60L * 20L);
			getServer().getScheduler().runTaskTimerAsynchronously(this, ticker, 100L, config.getInt("URID.custom-ticker-delay"));

			getServer().getScheduler().runTaskTimerAsynchronously(this, () -> utilities.connectors.forEach(GitHubConnector::pullFile), 80L, 60 * 60 * 20L);

			// Hooray!
			System.out.println("[Slimefun] Finished!");
			hooks = new SlimefunHooks(this);
			
			OreWasher.items = new ItemStack[] {SlimefunItems.IRON_DUST, SlimefunItems.GOLD_DUST, SlimefunItems.ALUMINUM_DUST, SlimefunItems.COPPER_DUST, SlimefunItems.ZINC_DUST, SlimefunItems.TIN_DUST, SlimefunItems.LEAD_DUST, SlimefunItems.SILVER_DUST, SlimefunItems.MAGNESIUM_DUST};

			// Do not show /sf elevator command in our Log, it could get quite spammy
			CSCoreLib.getLib().filterLog("([A-Za-z0-9_]{3,16}) issued server command: /sf elevator (.{0,})");
		}
	}

	@Override
	public void onDisable() {
		Bukkit.getScheduler().cancelTasks(this);

		if (ticker != null) {
			// Finishes all started movements/removals of block data
			ticker.halted = true;
			ticker.run();
		}
		
		PlayerProfile.iterator().forEachRemaining(profile -> {
			if (profile.isDirty()) profile.save();
		});
		
		for (World world: Bukkit.getWorlds()) {
			try {
				BlockStorage storage = BlockStorage.getStorage(world);
				
				if (storage != null) {
					storage.save(true);
				}
				else {
					System.err.println("[Slimefun] Could not save Slimefun Blocks for World \"" + world.getName() + "\"");
				}
			} catch (Exception x) {
				x.printStackTrace();
			}
		}
		
		for (UniversalBlockMenu menu: BlockStorage.universal_inventories.values()) {
			menu.save();
		}
		
		SlimefunBackup.start();

		// Prevent Memory Leaks
		config = null;
		researches = null;
		items = null;
		whitelist = null;
		instance = null;
		Messages.local = null;
		Files.CONFIG = null;
		Files.DATABASE = null;
		Files.ITEMS = null;
		Files.RESEARCHES = null;
		Files.WHITELIST = null;
		MultiBlock.list = null;
		Research.list = null;
		SlimefunItem.all = null;
		SlimefunItem.items = null;
		SlimefunItem.map_id = null;
		SlimefunItem.handlers = null;
		SlimefunItem.radioactive = null;
		SlimefunCommand.arguments = null;
		SlimefunCommand.descriptions = null;
		SlimefunCommand.tabs = null;
		SlimefunItem.blockhandler = null;
		BlockMenuPreset.presets = null;
		BlockStorage.loaded_tickers = null;
		BlockStorage.ticking_chunks = null;
		BlockStorage.worlds = null;
		ChargableBlock.capacitors = null;
		ChargableBlock.max_charges = null;
		AContainer.processing = null;
		AContainer.progress = null;
		Slimefun.guide_handlers = null;
		EnergyNet.machines_input = null;
		EnergyNet.machines_output = null;
		EnergyNet.machines_storage = null;
		CargoNet.faces = null;
		BlockStorage.universal_inventories = null;
		PlayerProfile.profiles = null;
		OreWasher.items = null;

		for (Player p: Bukkit.getOnlinePlayers()) {
			p.closeInventory();
		}
	}

	private void createDir(String path) {
		File file = new File(path);
		if (!file.exists()) file.mkdirs();
	}

	public static Config getCfg() {
		return config;
	}

	public static Config getResearchCfg() {
		return researches;
	}

	public static Config getItemCfg() {
		return items;
	}

	public static Config getWhitelist() {
		return whitelist;
	}

	@Deprecated
	public static int randomize(int max) {
		if (max < 1) return 0;
		return CSCoreLib.randomizer().nextInt(max);
	}

	@Deprecated
	public static boolean chance(int max, int percentage) {
		if (max < 1) return false;
		return CSCoreLib.randomizer().nextInt(max) <= percentage;
	}

	public SlimefunHooks getHooks() {
		return hooks;
	}
	
	public Utilities getUtilities() {
		return utilities;
	}
	
	public Settings getSettings() {
		return settings;
	}

}