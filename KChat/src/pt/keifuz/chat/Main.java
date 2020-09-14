package pt.keifuz.chat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import pt.keifuz.chat.canais.ChatOnOff;
import pt.keifuz.chat.canais.GlobalChat;
import pt.keifuz.chat.canais.LocalChat;
import pt.keifuz.chat.canais.StaffChat;
import pt.keifuz.chat.canais.TellChat;

public class Main extends JavaPlugin {
	
	public static Main instance;
	
	@Override
	public void onEnable() {
		instance = this;
		registro();
	}
	
	@Override
	public void onDisable() {
	}
	
	public void registro() {
		getCommand("s").setExecutor(new StaffChat());
		getCommand("g").setExecutor(new GlobalChat());
		getCommand("tell").setExecutor(new TellChat());
		getCommand("chat").setExecutor(new ChatOnOff());
		Bukkit.getPluginManager().registerEvents(new LocalChat(), this);
	}
	
	public static Main getInstance() {
		return instance;
	}

}
