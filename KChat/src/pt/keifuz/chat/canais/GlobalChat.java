package pt.keifuz.chat.canais;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.maxgamer.maxbans.MaxBans;
import org.maxgamer.maxbans.banmanager.TempMute;
import org.maxgamer.maxbans.util.Util;

import com.massivecraft.factions.entity.Faction;
import com.massivecraft.factions.entity.MPlayer;

import pt.keifuz.economy.Main;
import pt.keifuz.economy.system.PMoney;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

import java.util.ArrayList;

public class GlobalChat implements CommandExecutor {

	ArrayList<Player> lista = new ArrayList<>();

	@Override
	public boolean onCommand(CommandSender s, Command c, String label, String[] args) {

		if (s instanceof Player) {
			Player p = (Player) s;

			if (c.getName().equalsIgnoreCase("g")) {

				if (args.length == 0) {
					p.sendMessage("§cDigite /g (mensagem)");
					return true;
				}
				TempMute ban = (TempMute) MaxBans.instance.getBanManager().getMute(p.getName());
				
				if (ban != null) {
					p.sendMessage("§cVocê foi silenciado por " + Util.getTimeUntil(ban.getExpires()));
					return true;
				}
				

				String mensagem = "";
				for (int i = 0; i < args.length; i++) {
					if (p.hasPermission("chat.cores")) {
						mensagem = mensagem + " " + args[i].replace("&", "§");
					} else {
						mensagem = mensagem + " " + args[i];
					}
				}

				PermissionUser user = PermissionsEx.getUser(p);
				String prefix = user.getPrefix().replace("&", "§");

				if (!ChatOnOff.chat) {
					p.sendMessage("§cO chat encontra-se desativado.");
					return true;
				} else {

					for (Player all : Bukkit.getOnlinePlayers()) {

						MPlayer mp = MPlayer.get(p);
						Faction fac = mp.getFaction();
						PMoney player = Main.getMoneyCore().getTopList().get(0);

						if (player.getPlayer().equals(p.getName())) {
							if (mp.hasFaction()) {
								all.sendMessage("§7[G] §2[$] §7[" + mp.getFactionTag() + "] " + prefix + " §f"
										+ p.getName() + ":§7" + mensagem);
							} else {
								all.sendMessage("§7[G] §2[$] " + prefix + " §f" + p.getName() + ":§7" + mensagem);
							}
						} else {

							if (mp.hasFaction()) {
								all.sendMessage("§7[G] §7[" + fac.getTag() + "] " + prefix + " §f" + p.getName() + "§7:"
										+ mensagem);
							} else {
								all.sendMessage("§7[G] §7" + prefix + " §f" + p.getName() + "§7:" + mensagem);
							}
						}

					}
				}

			}

		} else {
			s.sendMessage("§cApenas jogadores podem executar este comando.");
		}

		return false;
	}

}
