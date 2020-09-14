package pt.keifuz.chat.canais;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatOnOff implements CommandExecutor {
	
	public static boolean chat = true;
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
		
		if (s instanceof Player) {
			
			Player p = (Player) s;
			
			if (c.getName().equalsIgnoreCase("chat")) {
				
				if (args.length == 0) {
					p.sendMessage("§cDigite /chat on/off");
				}
				
				if (args[0].equalsIgnoreCase("on")) {
					chat = true;
					p.sendMessage("§aVocê ativou o chat Global.");
					Bukkit.broadcastMessage("§eO jogador §f" + p.getName() + " §eativou o chat Global");
				}
				
				if (args[0].equalsIgnoreCase("off")) {
					chat = false;
					p.sendMessage("§cVocê desativou o chat Global.");
					Bukkit.broadcastMessage("§eO jogador §f" + p.getName() + " §edesativou o chat Global");
				}
			}
			
		}
		
		return false;
	}

}
