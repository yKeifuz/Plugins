package pt.keifuz.reparar.comandos;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import pt.keifuz.reparar.utils.ItemBuilder;

public class Reparar implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
		
		if (s instanceof Player) {
			Player p = (Player) s;
			
			if (c.getName().equalsIgnoreCase("reparar")) {
				
				Inventory inv = Bukkit.createInventory(null, 3*9, "§7Reparar");
				
				ItemStack info = new ItemBuilder(Material.ANVIL)
						.setDisplayName("§aReparar")
						.setLore("", "§7Informações:", "", "§eCusto: §f10k coins.", "§5VIP Meteoro §7não paga para reparar. ")
						.build();
				
				ItemStack confirmar = new ItemBuilder(Material.WOOL, 1, (short) 5)
						.setDisplayName("§aConfirmar")
						.setLore("", "§7Clique aqui para reparar o seu item.", "")
						.build();
				
				ItemStack cancelar = new ItemBuilder(Material.WOOL, 1, (short) 14)
						.setDisplayName("§cCancelar")
						.setLore("", "§7Clique aqui para cancelar e fechar o inventário.", "")
						.build();
				
				inv.setItem(13, info);
				inv.setItem(11, confirmar);
				inv.setItem(15, cancelar);
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
				p.openInventory(inv);
				
			}
			
		}else {
			s.sendMessage("§cApenas jogadores podem executar este comando.");
		}
		
		return false;
	}

}
