package pt.keifuz.vender;

import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import net.milkbowl.vault.economy.Economy;
import pt.keifuz.vender.comandos.Vender;
import pt.keifuz.vender.eventos.Inventario;

public class Main extends JavaPlugin {
	
	public static Economy econ = null;
	
	@Override
	public void onEnable() {
		setupEconomy();
		registro();
	}
	
	@Override
	public void onDisable() {
	}
	
	public void registro() {
		getCommand("vender").setExecutor(new Vender());
		Bukkit.getPluginManager().registerEvents(new Inventario(), this);
	}
	
	private boolean setupEconomy() {
	     if (getServer().getPluginManager().getPlugin("Vault") == null) {
	       return false;
	     }
	     RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
	     if (rsp == null) {
	       return false;
	     }
	     econ = (Economy)rsp.getProvider();
	     return (econ != null);

}

}
