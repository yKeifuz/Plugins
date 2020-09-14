package pt.keifuz.chat.canais;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class TellChat implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
		
		if (s instanceof Player) {
			Player p = (Player) s;
			
			if (c.getName().equalsIgnoreCase("tell")) {
				
				if (args.length < 2) {
					p.sendMessage("§cDigite /tell (jogador) (mensagem)");
					return true;
				}
				
				Player target = Bukkit.getPlayer(args[0]);
				
				if (target.isOnline() == false) {
					p.sendMessage("§cJogador offline!");
					return true;
				}
				
				String mensagem = "";
				for (int i = 1; i < args.length; i++) {
					mensagem = mensagem + " " + args[i];
				}
				
				PermissionUser user = PermissionsEx.getUser(p);
				String prefix = user.getPrefix().replace("&", "§");
				
				PermissionUser target2 = PermissionsEx.getUser(target);
				String prefixtarget = target2.getPrefix().replace("&", "§");
				
				target.sendMessage("§8Mensagem de §6" + prefix + " §6" + p.getName() + "§7: " + mensagem);
				p.sendMessage("§8Mensagem para §6" + prefixtarget + " §6" + target.getName() + "§7: " + mensagem);
				
				
				
			}
			
			
		}else {
			s.sendMessage("§cApenas jogadores podem executar este comando.");
		}
		
		
		return false;
	}

}
