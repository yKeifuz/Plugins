package pt.keifuz.vender.comandos;

import java.util.concurrent.ThreadLocalRandom;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Vender implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
		
		if (s instanceof Player) {
			Player p = (Player) s;
			
			if (c.getName().equalsIgnoreCase("vender")) {
				if (p.hasPermission("vender.vip")) {
					
			
						
					
					
					
					int rdm = ThreadLocalRandom.current().nextInt(99);
					
					ItemStack beacon = new ItemStack(Material.BEACON);
					ItemStack maca = new ItemStack(Material.APPLE);
					ItemStack bau = new ItemStack(Material.CHEST);
					ItemStack grass = new ItemStack(Material.GRASS);
					
					if (rdm < 25) {
						Inventory inv = Bukkit.createInventory(null, 3*9, "§7Clique no Beacon");
						inv.setItem(10, maca);
						inv.setItem(12, beacon);
						inv.setItem(14, bau);
						inv.setItem(16, grass);
						
						p.openInventory(inv);
						
					}
					
					if (rdm >= 25 && rdm < 50) {
						Inventory inv = Bukkit.createInventory(null, 3*9, "§7Clique na Maçã");
						inv.setItem(10, bau);
						inv.setItem(12, grass);
						inv.setItem(14, maca);
						inv.setItem(16, beacon);
						
						p.openInventory(inv);
						
					}
					
					if (rdm >= 50 && rdm < 75) {
						Inventory inv = Bukkit.createInventory(null, 3*9, "§7Clique na Terra");
						inv.setItem(10, beacon);
						inv.setItem(12, bau);
						inv.setItem(14, grass);
						inv.setItem(16, maca);
						
						p.openInventory(inv);
						
					}
					
					if (rdm >= 75 && rdm < 100) {
						Inventory inv = Bukkit.createInventory(null, 3*9, "§7Clique no Beacon");
						inv.setItem(10, grass);
						inv.setItem(12, maca);
						inv.setItem(14, beacon);
						inv.setItem(16, bau);
						
						p.openInventory(inv);
						
					}
					
			}
			}
			
		}else {
			s.sendMessage("§cApenas jogadores podem executar este comando.");
		}
		
		return false;
	}

}
