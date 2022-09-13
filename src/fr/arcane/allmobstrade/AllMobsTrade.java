package fr.arcane.allmobstrade;


import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public class AllMobsTrade extends JavaPlugin {
	public void onEnable() {
		System.out.println("[AllMobsTrade] Started.");
		getCommand("credit").setExecutor(new CreditsCommand());
		
		Bukkit.getServer().getPluginManager().registerEvents(new TradeListeners(), (Plugin) this);
	}
	
	public void onDisable() {
		System.out.println("[AllMobsTrade] Stoped");
	}

}
