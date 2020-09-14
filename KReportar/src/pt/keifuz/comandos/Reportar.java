package pt.keifuz.comandos;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ClickEvent.Action;
import net.md_5.bungee.api.chat.TextComponent;


public class Reportar implements CommandExecutor {
	
	public String Mensagem(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < args.length; i++) {
			sb.append(args[i]);
			sb.append(" ");
	}
		return sb.toString();
}
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
		if (s instanceof Player) {
			Player p = (Player) s;
			
			// /reportar (jogador) (motivo)
			
			
			if (c.getName().equalsIgnoreCase("reportar")) {
				
				if (args.length == 0) {
					p.sendMessage("§cDigite /reportar (jogador) (motivo)");
				}
				
				if (args.length > 0) {
					Player reportado = Bukkit.getPlayer(args[0]);
					if (reportado == null) {
						p.sendMessage("§cEste jogador não está online!");
						return true;
					}
					String mensagem = Mensagem(args);
					for (Player players : Bukkit.getOnlinePlayers()) {
						if (players.hasPermission("reportar.ver")) {
							
							players.playSound(players.getLocation(), Sound.LEVEL_UP, 1, 1);
							players.sendMessage("§a§lNOVO REPORT");
							players.sendMessage("");
							players.sendMessage("§eVítima:§f " + p.getName());
							players.sendMessage("§eAcusado:§f " + reportado.getName());
							players.sendMessage("§eMotivo:§f " + mensagem);
							players.sendMessage("");
							TextComponent texto = new TextComponent("§eClique aqui para teleportar-se até o jogador!");
							ClickEvent clicar = new ClickEvent(Action.RUN_COMMAND, "/tp " + reportado.getName());
							texto.setClickEvent(clicar);
							players.spigot().sendMessage(texto);
							players.sendMessage("");
							
							}
						
						}
					
					p.sendMessage("§aVocê reportou o jogador " + reportado.getName() + " §acom sucesso!");

			
							
				}
			
			}
			
		}
				
		return false;
	}
	

}
