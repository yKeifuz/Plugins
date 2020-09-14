package pt.keifuz.chat.canais;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class StaffChat implements CommandExecutor {
	
	public String Mensagem(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < args.length; i++) {
			sb.append(args[i]);
			sb.append(" ");
	}
		return sb.toString();
}
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
		
		if (s instanceof Player) {
			Player p = (Player) s;
			
			if (c.getName().equalsIgnoreCase("s")) {
				if (p.hasPermission("staff.chat")) {
				String mensagem = Mensagem(args);
				for (Player jogadores : Bukkit.getOnlinePlayers()) {
					if (jogadores.hasPermission("staff.chat")) {
						PermissionUser user = PermissionsEx.getUser(p);
						String prefix = user.getPrefix().replace("&", "§");
						jogadores.sendMessage("§f[S] " + prefix + " " + p.getName() + "§f: " + mensagem);
					}
				}
			}else {
				p.sendMessage("§cApenas staff tem permissão para executar este comando.");
			}
			}
			
		}else {
			s.sendMessage("§cApenas jogadores podem executar este comando.");
		}
		
		return false;
	}

}
