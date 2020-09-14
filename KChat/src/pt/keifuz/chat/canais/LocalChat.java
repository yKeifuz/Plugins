package pt.keifuz.chat.canais;


import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.maxgamer.maxbans.MaxBans;
import org.maxgamer.maxbans.banmanager.TempMute;

import com.massivecraft.factions.entity.MPlayer;

import pt.keifuz.economy.Main;
import pt.keifuz.economy.system.PMoney;
import pt.keifuz.punir.eventos.Inventario;
import ru.tehkode.permissions.bukkit.PermissionsEx;

@SuppressWarnings("deprecation")
public class LocalChat implements Listener{
	

	@EventHandler
	public void Local(PlayerChatEvent e) {
		Player p = e.getPlayer();
		PMoney player = Main.getMoneyCore().getTopList().get(0);
		
		e.setCancelled(true);
		MPlayer mp = MPlayer.get(p);
		String prefix = PermissionsEx.getUser(p).getPrefix().replace("&", "§");
		
		if (player.getPlayer().equals(p.getName())) {
			
			if (mp.hasFaction()) {
				e.setFormat("§e[L] §2[$] §7[" + mp.getFactionTag() + "] " + prefix + " §f" + p.getName() + ": §e" + e.getMessage());
			}else {
				e.setFormat("§e[L] §2[$] " +  prefix + " §f" + p.getName() + ": §e" + e.getMessage());
			}
			
		}else {
		
		if (mp.hasFaction()) {
			e.setFormat("§e[L] §7[" + mp.getFactionTag() + "] " + prefix + " §f" + p.getName() + ": §e" + e.getMessage());
		}else {
			e.setFormat("§e[L] " +  prefix + " §f" + p.getName() + ": §e" + e.getMessage());
		}
		}
		
		if (Inventario.hack.containsKey(p.getName())) {
			e.setCancelled(true);
			return;
		}
		
		if (Inventario.divulgrave.containsKey(p.getName())) {
			e.setCancelled(true);
			return;
		}
		
		if (Inventario.divulsimples.containsKey(p.getName())) {
			e.setCancelled(true);
			return;
		}
		
		if (Inventario.desavencas.containsKey(p.getName())) {
			e.setCancelled(true);
			return;
		}
		
		if (Inventario.flood.containsKey(p.getName())) {
			e.setCancelled(true);
			return;
		}
		
		if (Inventario.spam.containsKey(p.getName())) {
			e.setCancelled(true);
			return;
		}
		
		if (Inventario.racismo.containsKey(p.getName())) {
			e.setCancelled(true);
			return;
		}
		
		if (Inventario.abusobug.containsKey(p.getName())) {
			e.setCancelled(true);
			return;
		}
		
		if (Inventario.ofensasv.containsKey(p.getName())) {
			e.setCancelled(true);
			return;
		}
		
		if (Inventario.insulto.containsKey(p.getName())) {
			e.setCancelled(true);
			return;
		}
		
		
		TempMute ban = (TempMute) MaxBans.instance.getBanManager().getMute(p.getName());
		
		if (ban != null) {
			return;
		}
		
		
		if (p.getNearbyEntities(30, 30, 30).isEmpty()) {
			p.sendMessage(e.getFormat());
			p.sendMessage("§cNão há ninguém por perto para o ouvir.");
			return;
		}
		
		
		for (Entity ent : p.getNearbyEntities(30, 30, 30)) {
			
			if (ent instanceof Player) {
				Player all = (Player) ent;
				
				
				all.sendMessage(e.getFormat());
				p.sendMessage(e.getFormat());
				return;

			}
			
			
			
		}
		
		for (Entity ent : p.getNearbyEntities(30, 30, 30)) {
			
			if (!(ent instanceof Player)) {
			
			p.sendMessage(e.getFormat());
			p.sendMessage("§cNão há ninguém por perto para o ouvir.");
			return;
			}
		}
		
		
		
		
	}
}
		
		


