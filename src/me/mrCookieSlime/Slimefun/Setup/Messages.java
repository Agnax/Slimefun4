package me.mrCookieSlime.Slimefun.Setup;

import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Localization;

public final class Messages {
	
	private Messages() {}
	
	public static Localization local;
	
	public static void setup() {
		local.setPrefix("&aSlimefun &7> ");

		local.setDefault("commands.help", "Muestra esta pantalla de ayuda");
		local.setDefault("commands.cheat", "Te permite hacer trampas");
		local.setDefault("commands.give", "Darle a alguien algunos artículos Slimefun");
		local.setDefault("commands.research.desc", "Desbloquear una investigación para un jugador");
		local.setDefault("commands.guide", "Te das una guía Slimefun");
		local.setDefault("commands.timings", "Lag-Info sobre su servidor");
		local.setDefault("commands.teleporter", "Ver puntos de referencia de otros jugadores");
		local.setDefault("commands.versions", "Enumera todos los complementos instalados");
		local.setDefault("commands.open_guide", "Abre la guía de Slimefun sin usar el libro");
		local.setDefault("commands.stats", "Muestra algunas estadísticas sobre un jugador");
		local.setDefault("commands.research.reset", "&cHas restablecido el conocimiento de %player%");
		local.setDefault("commands.research.reset-target", "&cTu conocimiento ha sido restablecido");

		local.setDefault("messages.not-researched", "&4No tienes suficiente conocimiento para entender esto");
		local.setDefault("messages.not-enough-xp", "&4No tienes suficiente XP para desbloquear esto.");
		local.setDefault("messages.unlocked", "&bHas desbloqueado &7\"%research%\"");
		local.setDefault("messages.fortune-cookie", "&7Help me, I am trapped in a Fortune Cookie Factory!", "&7You will die tomorrow...     by a Creeper", "&7At some Point in your Life something bad will happen!!!", "&7Next week you will notice that this is not the real World, you are in a kind of \"Matrix\" or lets call it Computer game. Yes you are in a Computer Game", "&7This Cookie will taste good in a few seconds", "&7You will die soon and the last word you will hear is gonna be \"EXTERMINATE!!!\"", "&7Whatever you do, do not hug a Creeper... I tried it. It feels good, but it's not worth it.");
		local.setDefault("messages.only-players", "&4Este comando es solo para jugadores");
		local.setDefault("messages.no-permission", "&4No tiene el permiso requerido para hacer esto");
		local.setDefault("messages.usage", "&4Uso: &c%usage%");
		local.setDefault("messages.not-online", "&c¡&4%player% &cNo esta conectado!");
		local.setDefault("messages.not-valid-item", "&c¡&4%item% &cno es un artículo válido!");
		local.setDefault("messages.not-valid-amount", "&4%amount% &cno es una cantidad válida: debe ser mayor a 0!");
		local.setDefault("messages.given-item", "&bTe han dado &a%amount% &b de &7\"%item%&7\"");
		local.setDefault("messages.give-item", "&bTu has dado a %player% &a%amount% de &7\"%item%&7\"");
		local.setDefault("messages.not-valid-research", "&c¡&4%research% &cno es una investigación válida!");
		local.setDefault("messages.give-research", "&bYou have given %player% the Research &7\"%research%&7\"");
		local.setDefault("messages.battery.add", "&2+ &7%charge% J &8(%machine%)");
		local.setDefault("messages.battery.remove", "&4- &7%charge% J &8(%machine%)");
		local.setDefault("messages.hungry", "&cYou are too hungry to do that!");
		local.setDefault("messages.mode-change", "&bSe ha cambiado el modo del %device%: &9%mode%");
		local.setDefault("messages.disabled-in-world", "&4&lThis Item has been disabled in this World");
		local.setDefault("messages.talisman.anvil", "&a&oYour Talisman saved your Tool from breaking");
		local.setDefault("messages.talisman.miner", "&a&oYour Talisman just doubled your Drops");
		local.setDefault("messages.talisman.hunter", "&a&oYour Talisman just doubled your Drops");
		local.setDefault("messages.talisman.lava", "&a&oYour Talisman saved you from burning to death");
		local.setDefault("messages.talisman.water", "&a&oYour Talisman saved you from drowning");
		local.setDefault("messages.talisman.angel", "&a&oYour Talisman saved you from taking Fall Damage");
		local.setDefault("messages.talisman.fire", "&a&oYour Talisman saved you from burning to death");
		local.setDefault("messages.talisman.magician", "&a&oYour Talisman gave you an additional Enchantment");
		local.setDefault("messages.talisman.traveller", "&a&oYour Talisman gave you a Speed Boost");
		local.setDefault("messages.talisman.warrior", "&a&oYour Talisman has improved your Strength for a While");
		local.setDefault("messages.talisman.knight", "&a&oYour Talisman gave you 5 Seconds of Regeneration");
		local.setDefault("messages.talisman.whirlwind", "&a&oYour Talisman reflected the Projectile");
		local.setDefault("messages.talisman.wizard", "&a&oYour Talisman has given you a better Fortune Level but maybe also lowered some other Enchantment Levels");
		local.setDefault("messages.soulbound-rune.fail", "&cYou can only bind one item to your soul at a time.");
		local.setDefault("messages.soulbound-rune.success", "&aYou have successfully bound this item to your soul! You will keep it when you die.");
		local.setDefault("messages.broken-leg", "&c&oSeems like you broke your Leg, maybe a Splint could help?");
		local.setDefault("messages.fixed-leg", "&a&oThe Splint helps. It feels better now.");
		local.setDefault("messages.start-bleeding", "&c&oYou started to bleed. Maybe a Bandage could help?");
		local.setDefault("messages.stop-bleeding", "&a&oThe Bandage helps. The Bleeding has stopped!");
		local.setDefault("messages.disabled-item", "&4&lThis Item has been disabled! How did you even get that?");
		local.setDefault("messages.research.start", "&7The Ancient Spirits whisper mysterious Words into your Ear!");
		local.setDefault("messages.research.progress", "&7You start to wonder about &b%research% &e(%progress%)");
		local.setDefault("messages.fire-extinguish", "&7You have extinguished yourself");
		local.setDefault("messages.cannot-place" ,"&cYou cannot place that block there!");
		local.setDefault("messages.no-pvp" ,"&cYou cannot pvp in here!");

		local.setDefault("tooltips.item-permission", "", "&rYou do not have Permission", "&rto access this Item");

		local.setDefault("machines.pattern-not-found", "&eSorry, I could not recognize this Pattern. Please place the Items in the correct Pattern into the Dispenser.");
		local.setDefault("machines.unknown-material", "&eSorry, I could not recognize the Item in my Dispenser. Please put something in that I know.");
		local.setDefault("machines.wrong-item", "&eSorry, I could not recognize the Item you right clicked me with. Check the Recipes and see which Items you can use.");
		local.setDefault("machines.full-inventory", "&eSorry, my Inventory is too full!");
		local.setDefault("machines.in-use", "&cThis Block's Inventory is currently opened by a different Player.");
		local.setDefault("machines.ignition-chamber-no-flint", "&cIgnition Chamber is missing Flint and Steel.");
		local.setDefault("anvil.not-working", "&4You cannot use Slimefun Items in an Anvil");
		local.setDefault("backpack.already-open", "&cSorry, this backpack is open somewhere else!");
		local.setDefault("backpack.no-stack", "&cYou cannot stack Backpacks");
		local.setDefault("miner.no-ores", "&eSorry, I could not find any Ores nearby!");
		local.setDefault("workbench.not-enhanced", "&4You cannot use Slimefun Items in a normal Workbench");

		local.setDefault("machines.ANCIENT_ALTAR.not-enough-pedestals", "&4The Altar is not surrounded by the needed Amount of Pedestals &c(%pedestals% / 8)");
		local.setDefault("machines.ANCIENT_ALTAR.unknown-catalyst", "&4Unknown Catalyst! &cUse the correct Recipe instead!");
		local.setDefault("machines.ANCIENT_ALTAR.unknown-recipe", "&4Unknown Recipe! &cUse the correct Recipe instead!");
		local.setDefault("machines.ANCIENT_PEDESTAL.obstructed", "&4Pedestal is obstructed! &cRemove anything above the pedestal!");
		local.setDefault("machines.HOLOGRAM_PROJECTOR.enter-text", "&7Please enter your desired Hologram Text in your Chat. &r(Color Codes are supported!)");
		local.setDefault("machines.ELEVATOR.no-destinations", "&4No Destinations found");
		local.setDefault("machines.CARGO_NODES.must-be-placed", "&4Must be placed onto a Chest or Machine");

		local.setDefault("gps.waypoint.new", "&ePlease type in a Name for your new Waypoint in the Chat. &7(Color Codes supported!)");
		local.setDefault("gps.waypoint.added", "&aSuccessfully added a new Waypoint");
		local.setDefault("gps.waypoint.max", "&4You have reached the Maximum Amount of Waypoints");
		local.setDefault("gps.insufficient-complexity", "&4Insufficient GPS Network Complexity: &c%complexity%", "&4a) You do not have a GPS Network setup yet", "&4b) Your GPS Network is not complex enough");
		local.setDefault("gps.geo.scan-required", "&4GEO-Scan required! &cScan this Chunk using a GEO-Scanner first!");
		
		local.setDefault("robot.started", "&7Your Robot resumed running its Script");
		local.setDefault("robot.stopped", "&7Your Robot has paused its Script");
		local.setDefault("inventory.no-access", "&4You are not permitted to access this Block");

		local.setDefault("android.scripts.already-uploaded", "&4This Script has already been uploaded.");
		local.setDefault("android.scripts.enter-name", "", "&ePlease type in a Name for your Script", "");
		local.setDefault("android.scripts.uploaded", "&bUploading...", "&aSuccessfully uploaded your Script!");
		local.setDefault("android.scripts.rating.own", "&4You cannot rate your own Script!");
		local.setDefault("android.scripts.rating.already", "&4You have already left a Rating for this Script!");
		
		local.save();
	}

}
