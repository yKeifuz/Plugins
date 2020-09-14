package pt.keifuz.reportar;

import org.bukkit.plugin.java.JavaPlugin;

import pt.keifuz.comandos.Reportar;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getCommand("reportar").setExecutor(new Reportar());
	}
	
	@Override
	public void onDisable() {
	}
	

}
