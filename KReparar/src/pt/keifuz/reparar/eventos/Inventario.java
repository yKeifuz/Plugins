package pt.keifuz.reparar.eventos;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import pt.keifuz.reparar.Main;

public class Inventario implements Listener {
	
	@EventHandler
	public void aoClicar(InventoryClickEvent e) {
		if (!e.getInventory().getName().equalsIgnoreCase("§7Reparar")) return;
		e.setCancelled(true);
		
		Player p = (Player) e.getWhoClicked();
		
		if (e.getSlot() == 11) {
			
			if (p.hasPermission("reparar.vip")) {
				if (p.getItemInHand().getDurability() != 0) {
					p.getItemInHand().setDurability((short) 0);
					
					p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
					p.closeInventory();
					p.sendMessage("§aVocê reparou o item.");
				}else {
					p.sendMessage("§cEste item já se encontra na sua durabilidade máxima.");
					p.closeInventory();
					p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
				}
			}else {
				
				if (Main.econ.getBalance(p) >= 10000) {
					if (p.getItemInHand().getDurability() != 0) {
						p.getItemInHand().setDurability((short) 0);
						
						p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						Main.econ.withdrawPlayer(p, 10000);
						p.closeInventory();
						p.sendMessage("§aVocê reparou o item com sucesso.");
					}else {
						p.sendMessage("§cEste item já se encontra na sua durabilidade máxima.");
						p.closeInventory();
						p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
					}
				}else {
					p.closeInventory();
					p.sendMessage("§cVocê não tem dinheiro o suficiente para reparar.");
					p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
				}
				
			}
			
			
			
		}
		
		if (e.getSlot() == 15) {
			p.closeInventory();
			p.sendMessage("§cVocê cancelou o reparo.");
			p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
		}
		
	}

}
