package pt.keifuz.vender.eventos;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import pt.keifuz.vender.utils.ActionBar;

public class Inventario implements Listener {
	
	@EventHandler
	public void aoClicar(InventoryClickEvent e) {
		if (!e.getInventory().getName().equals("§7Clique no Beacon")) return;
		e.setCancelled(true);
		Player p = (Player) e.getWhoClicked();
		
		if (e.getCurrentItem().getType() == Material.BEACON) {
			
			for (ItemStack itens : p.getInventory().getContents()) {
				int contagem = 0;
				int precoouro = 30;
				int precoferro = 25;
				int precocarvao = 3;
				int precoredstone = 4;
				int precodima = 80;
				int precoesmeralda = 100;
				int precoblockouro = 270;
				int precoblockferro = 225;
				int precoblockcarvao = 27;
				int precoblockredstone = 36;
				int precoblockdima = 720;
				int precoblockesmeralda = 900;
				int precocarne = 3;
				int precocarneassada = 3;
				int precocouro = 4;
				int precocarnezombie = 6;
				int precoosso = 6;
				int precoflecha = 7;
				int precolinha = 8;
				int precoolho = 9;
				int precoblaze = 18;
				
				
				if (itens == null) continue;
				
				
				
				if (p.getItemInHand().getType() == Material.GOLD_INGOT) {
					if (itens.getType() == Material.GOLD_INGOT) {
						int totalouro = contagem + itens.getAmount();
						p.getInventory().remove(Material.GOLD_INGOT);
						int ouro = totalouro * precoouro;
						ActionBar.sendAction(p, "§aVocê vendeu os ouros por " + ouro + " §acoins.");
						p.closeInventory();
					}
				}
				
				if (p.getItemInHand().getType() == Material.IRON_INGOT) {
					if (itens.getType() == Material.IRON_INGOT) {
						int totalferro = contagem + itens.getAmount();
						p.getInventory().remove(Material.IRON_INGOT);
						int ferro = totalferro * precoferro;
						p.closeInventory();
						ActionBar.sendAction(p, "§aVocê vendeu os ferros por " + ferro + " §acoins.");
					
					}
				}
				
				
				if (p.getItemInHand().getType() == Material.COAL) {
					if (itens.getType() == Material.COAL) {
						int totalcarvao = contagem + itens.getAmount();
						p.getInventory().remove(Material.COAL);
						int carvao = totalcarvao * precocarvao;
						ActionBar.sendAction(p, "§aVocê vendeu os carvões por " + carvao + " §acoins.");
						p.closeInventory();
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.REDSTONE) {
					if (itens.getType() == Material.REDSTONE) {
						int totalredstone = contagem + itens.getAmount();
						p.getInventory().remove(Material.REDSTONE);
						int redstone = totalredstone * precoredstone;
						ActionBar.sendAction(p, "§aVocê vendeu as redstones por " + redstone + " §acoins.");
						p.closeInventory();
					}
				}
				
				if (p.getItemInHand().getType() == Material.DIAMOND) {
					if (itens.getType() == Material.DIAMOND) {
						int totaldima = contagem + itens.getAmount();
						p.getInventory().remove(Material.DIAMOND);
						int dima = totaldima * precodima;
						p.closeInventory();
						ActionBar.sendAction(p, "§aVocê vendeu os diamantes por " + dima + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.EMERALD) {
					if (itens.getType() == Material.EMERALD) {
						int totalesmeralda = contagem + itens.getAmount();
						p.getInventory().remove(Material.EMERALD);
						int esmeralda = totalesmeralda * precoesmeralda;
						p.closeInventory();
						ActionBar.sendAction(p, "§aVocê vendeu as esmeraldas apor " + esmeralda + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.GOLD_BLOCK) {
					if (itens.getType() == Material.GOLD_BLOCK) {
						int totalouro = contagem + itens.getAmount();
						p.getInventory().remove(Material.GOLD_BLOCK);
						int ouro = totalouro * precoblockouro;
						p.closeInventory();
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de ouro por " + ouro + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.IRON_BLOCK) {
					if (itens.getType() == Material.IRON_BLOCK) {
						int totalferro = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.IRON_BLOCK);
						int ferro = totalferro * precoblockferro;
					
						ActionBar.sendAction(p, "§aVocê vendeu os ferros por " + ferro + " §acoins.");
					
					}
				}
				
				
				if (p.getItemInHand().getType() == Material.COAL_BLOCK) {
					if (itens.getType() == Material.COAL_BLOCK) {
						p.closeInventory();
						int totalcarvao = contagem + itens.getAmount();
						p.getInventory().remove(Material.COAL_BLOCK);
						int carvao = totalcarvao * precoblockcarvao;
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de carvão por " + carvao + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.REDSTONE_BLOCK) {
					if (itens.getType() == Material.REDSTONE_BLOCK) {
						int totalredstone = contagem + itens.getAmount();
						p.getInventory().remove(Material.REDSTONE_BLOCK);
						int redstone = totalredstone * precoblockredstone;
						p.closeInventory();
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de redstone por " + redstone + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.DIAMOND_BLOCK) {
					if (itens.getType() == Material.DIAMOND_BLOCK) {
						int totaldima = contagem + itens.getAmount();
						p.getInventory().remove(Material.DIAMOND_BLOCK);
						p.closeInventory();
						int dima = totaldima * precoblockdima;
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de diamante por " + dima + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.EMERALD_BLOCK) {
					if (itens.getType() == Material.EMERALD_BLOCK) {
						int totalesmeralda = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.EMERALD_BLOCK);
						int esmeralda = totalesmeralda * precoblockesmeralda;
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de esmeralda por " + esmeralda + " §acoins.");
					}
				}
					
				
				
				
				if (p.getItemInHand().getType() == Material.LEATHER) {
					if (itens.getType() == Material.LEATHER) {
						int totalredstone = contagem + itens.getAmount();
						p.getInventory().remove(Material.LEATHER);
						p.closeInventory();
						int redstone = totalredstone * precocouro;
						ActionBar.sendAction(p, "§aVocê vendeu os couros por " + redstone + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.COOKED_BEEF) {
					if (itens.getType() == Material.COOKED_BEEF) {
						int totaldima = contagem + itens.getAmount();
						p.getInventory().remove(Material.COOKED_BEEF);
						int dima = totaldima * precocarneassada;
						p.closeInventory();
						ActionBar.sendAction(p, "§aVocê vendeu os bifes por " + dima + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.RAW_BEEF) {
					if (itens.getType() == Material.RAW_BEEF) {
						int totalesmeralda = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.RAW_BEEF);
						int esmeralda = totalesmeralda * precocarne;
						ActionBar.sendAction(p, "§aVocê vendeu as carnes apor " + esmeralda + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.STRING) {
					if (itens.getType() == Material.STRING) {
						int totalouro = contagem + itens.getAmount();
						p.getInventory().remove(Material.STRING);
						p.closeInventory();
						int ouro = totalouro * precolinha;
						ActionBar.sendAction(p, "§aVocê vendeu as linhas por " + ouro + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.SPIDER_EYE) {
					if (itens.getType() == Material.SPIDER_EYE) {
						int totalferro = contagem + itens.getAmount();
						p.getInventory().remove(Material.SPIDER_EYE);
						p.closeInventory();
						int ferro = totalferro * precoolho;
					
						ActionBar.sendAction(p, "§aVocê vendeu os olhos de aranha por " + ferro + " §acoins.");
					
					}
				}
				
				
				if (p.getItemInHand().getType() == Material.BONE) {
					if (itens.getType() == Material.BONE) {
						int totalcarvao = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.BONE);
						int carvao = totalcarvao * precoosso;
						ActionBar.sendAction(p, "§aVocê vendeu os ossos por " + carvao + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.ROTTEN_FLESH) {
					if (itens.getType() == Material.ROTTEN_FLESH) {
						int totalredstone = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.ROTTEN_FLESH);
						int redstone = totalredstone * precocarnezombie;
						ActionBar.sendAction(p, "§aVocê vendeu as carnes de zumbie por " + redstone + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.ARROW) {
					if (itens.getType() == Material.ARROW) {
						int totaldima = contagem + itens.getAmount();
						p.getInventory().remove(Material.ARROW);
						int dima = totaldima * precoflecha;
						p.closeInventory();
						ActionBar.sendAction(p, "§aVocê vendeu as flechas por " + dima + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.BLAZE_ROD) {
					if (itens.getType() == Material.BLAZE_ROD) {
						int totalesmeralda = contagem + itens.getAmount();
						p.getInventory().remove(Material.BLAZE_ROD);
						p.closeInventory();
						int esmeralda = totalesmeralda * precoblaze;
						ActionBar.sendAction(p, "§aVocê vendeu as varas de blaze por " + esmeralda + " §acoins.");
					}
				}
					

				
			}
			
			
		}else {
			p.closeInventory();
			p.sendMessage("§cVocê errou o Captcha");
			p.playSound(p.getLocation(), Sound.BAT_DEATH, 1, 1);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	@EventHandler
	public void aoClicard(InventoryClickEvent e) {
		if (!e.getInventory().getName().equals("§7Clique na Maçã")) return;
		e.setCancelled(true);
		Player p = (Player) e.getWhoClicked();
		
		if (e.getCurrentItem().getType() == Material.APPLE) {
			
			for (ItemStack itens : p.getInventory().getContents()) {
				int contagem = 0;
				int precoouro = 30;
				int precoferro = 25;
				int precocarvao = 3;
				int precoredstone = 4;
				int precodima = 80;
				int precoesmeralda = 100;
				int precoblockouro = 270;
				int precoblockferro = 225;
				int precoblockcarvao = 27;
				int precoblockredstone = 36;
				int precoblockdima = 720;
				int precoblockesmeralda = 900;
				int precocarne = 3;
				int precocarneassada = 3;
				int precocouro = 4;
				int precocarnezombie = 6;
				int precoosso = 6;
				int precoflecha = 7;
				int precolinha = 8;
				int precoolho = 9;
				int precoblaze = 18;
				
				
				if (itens == null) continue;
				
				
				if (p.getItemInHand().getType() == Material.GOLD_INGOT) {
					if (itens.getType() == Material.GOLD_INGOT) {
						int totalouro = contagem + itens.getAmount();
						p.getInventory().remove(Material.GOLD_INGOT);
						p.closeInventory();
						int ouro = totalouro * precoouro;
						ActionBar.sendAction(p, "§aVocê vendeu os ouros por " + ouro + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.IRON_INGOT) {
					if (itens.getType() == Material.IRON_INGOT) {
						int totalferro = contagem + itens.getAmount();
						p.getInventory().remove(Material.IRON_INGOT);
						p.closeInventory();
						int ferro = totalferro * precoferro;
					
						ActionBar.sendAction(p, "§aVocê vendeu os ferros por " + ferro + " §acoins.");
					
					}
				}
				
				
				if (p.getItemInHand().getType() == Material.COAL) {
					if (itens.getType() == Material.COAL) {
						p.closeInventory();
						int totalcarvao = contagem + itens.getAmount();
						p.getInventory().remove(Material.COAL);
						int carvao = totalcarvao * precocarvao;
						ActionBar.sendAction(p, "§aVocê vendeu os carvões por " + carvao + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.REDSTONE) {
					if (itens.getType() == Material.REDSTONE) {
						int totalredstone = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.REDSTONE);
						int redstone = totalredstone * precoredstone;
						ActionBar.sendAction(p, "§aVocê vendeu as redstones por " + redstone + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.DIAMOND) {
					if (itens.getType() == Material.DIAMOND) {
						int totaldima = contagem + itens.getAmount();
						p.getInventory().remove(Material.DIAMOND);
						p.closeInventory();
						int dima = totaldima * precodima;
						ActionBar.sendAction(p, "§aVocê vendeu os diamantes por " + dima + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.EMERALD) {
					if (itens.getType() == Material.EMERALD) {
						int totalesmeralda = contagem + itens.getAmount();
						p.getInventory().remove(Material.EMERALD);
						p.closeInventory();
						int esmeralda = totalesmeralda * precoesmeralda;
						ActionBar.sendAction(p, "§aVocê vendeu as esmeraldas apor " + esmeralda + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.GOLD_BLOCK) {
					if (itens.getType() == Material.GOLD_BLOCK) {
						int totalouro = contagem + itens.getAmount();
						p.getInventory().remove(Material.GOLD_BLOCK);
						p.closeInventory();
						int ouro = totalouro * precoblockouro;
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de ouro por " + ouro + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.IRON_BLOCK) {
					if (itens.getType() == Material.IRON_BLOCK) {
						int totalferro = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.IRON_BLOCK);
						int ferro = totalferro * precoblockferro;
					
						ActionBar.sendAction(p, "§aVocê vendeu os ferros por " + ferro + " §acoins.");
					
					}
				}
				
				
				if (p.getItemInHand().getType() == Material.COAL_BLOCK) {
					if (itens.getType() == Material.COAL_BLOCK) {
						int totalcarvao = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.COAL_BLOCK);
						int carvao = totalcarvao * precoblockcarvao;
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de carvão por " + carvao + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.REDSTONE_BLOCK) {
					if (itens.getType() == Material.REDSTONE_BLOCK) {
						p.closeInventory();
						int totalredstone = contagem + itens.getAmount();
						p.getInventory().remove(Material.REDSTONE_BLOCK);
						int redstone = totalredstone * precoblockredstone;
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de redstone por " + redstone + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.DIAMOND_BLOCK) {
					if (itens.getType() == Material.DIAMOND_BLOCK) {
						int totaldima = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.DIAMOND_BLOCK);
						int dima = totaldima * precoblockdima;
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de diamante por " + dima + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.EMERALD_BLOCK) {
					if (itens.getType() == Material.EMERALD_BLOCK) {
						int totalesmeralda = contagem + itens.getAmount();
						p.getInventory().remove(Material.EMERALD_BLOCK);
						p.closeInventory();
						int esmeralda = totalesmeralda * precoblockesmeralda;
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de esmeralda por " + esmeralda + " §acoins.");
					}
				}
					
				
				
				
				if (p.getItemInHand().getType() == Material.LEATHER) {
					if (itens.getType() == Material.LEATHER) {
						int totalredstone = contagem + itens.getAmount();
						p.getInventory().remove(Material.LEATHER);
						int redstone = totalredstone * precocouro;
						p.closeInventory();
						ActionBar.sendAction(p, "§aVocê vendeu os couros por " + redstone + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.COOKED_BEEF) {
					if (itens.getType() == Material.COOKED_BEEF) {
						int totaldima = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.COOKED_BEEF);
						int dima = totaldima * precocarneassada;
						ActionBar.sendAction(p, "§aVocê vendeu os bifes por " + dima + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.RAW_BEEF) {
					if (itens.getType() == Material.RAW_BEEF) {
						p.closeInventory();
						int totalesmeralda = contagem + itens.getAmount();
						p.getInventory().remove(Material.RAW_BEEF);
						int esmeralda = totalesmeralda * precocarne;
						ActionBar.sendAction(p, "§aVocê vendeu as carnes apor " + esmeralda + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.STRING) {
					if (itens.getType() == Material.STRING) {
						int totalouro = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.STRING);
						int ouro = totalouro * precolinha;
						ActionBar.sendAction(p, "§aVocê vendeu as linhas por " + ouro + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.SPIDER_EYE) {
					if (itens.getType() == Material.SPIDER_EYE) {
						p.closeInventory();
						int totalferro = contagem + itens.getAmount();
						p.getInventory().remove(Material.SPIDER_EYE);
						int ferro = totalferro * precoolho;
					
						ActionBar.sendAction(p, "§aVocê vendeu os olhos de aranha por " + ferro + " §acoins.");
					
					}
				}
				
				
				if (p.getItemInHand().getType() == Material.BONE) {
					if (itens.getType() == Material.BONE) {
						int totalcarvao = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.BONE);
						int carvao = totalcarvao * precoosso;
						ActionBar.sendAction(p, "§aVocê vendeu os ossos por " + carvao + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.ROTTEN_FLESH) {
					if (itens.getType() == Material.ROTTEN_FLESH) {
						int totalredstone = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.ROTTEN_FLESH);
						int redstone = totalredstone * precocarnezombie;
						ActionBar.sendAction(p, "§aVocê vendeu as carnes de zumbie por " + redstone + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.ARROW) {
					if (itens.getType() == Material.ARROW) {
						int totaldima = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.ARROW);
						int dima = totaldima * precoflecha;
						ActionBar.sendAction(p, "§aVocê vendeu as flechas por " + dima + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.BLAZE_ROD) {
					if (itens.getType() == Material.BLAZE_ROD) {
						int totalesmeralda = contagem + itens.getAmount();
						p.getInventory().remove(Material.BLAZE_ROD);
						p.closeInventory();
						int esmeralda = totalesmeralda * precoblaze;
						ActionBar.sendAction(p, "§aVocê vendeu as varas de blaze por " + esmeralda + " §acoins.");
					}
				}
					

				
			}
			
			
		}else {
			p.closeInventory();
			p.sendMessage("§cVocê errou o Captcha");
			p.playSound(p.getLocation(), Sound.BAT_DEATH, 1, 1);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	@EventHandler
	public void aoClicare(InventoryClickEvent e) {
		if (!e.getInventory().getName().equals("§7Clique na Terra")) return;
		e.setCancelled(true);
		Player p = (Player) e.getWhoClicked();
		
		if (e.getCurrentItem().getType() == Material.GRASS) {
			
			for (ItemStack itens : p.getInventory().getContents()) {
				int contagem = 0;
				int precoouro = 30;
				int precoferro = 25;
				int precocarvao = 3;
				int precoredstone = 4;
				int precodima = 80;
				int precoesmeralda = 100;
				int precoblockouro = 270;
				int precoblockferro = 225;
				int precoblockcarvao = 27;
				int precoblockredstone = 36;
				int precoblockdima = 720;
				int precoblockesmeralda = 900;
				int precocarne = 3;
				int precocarneassada = 3;
				int precocouro = 4;
				int precocarnezombie = 6;
				int precoosso = 6;
				int precoflecha = 7;
				int precolinha = 8;
				int precoolho = 9;
				int precoblaze = 18;
				
				
				if (itens == null) continue;
				
				
				if (p.getItemInHand().getType() == Material.GOLD_INGOT) {
					if (itens.getType() == Material.GOLD_INGOT) {
						int totalouro = contagem + itens.getAmount();
						p.getInventory().remove(Material.GOLD_INGOT);
						p.closeInventory();
						int ouro = totalouro * precoouro;
						ActionBar.sendAction(p, "§aVocê vendeu os ouros por " + ouro + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.IRON_INGOT) {
					if (itens.getType() == Material.IRON_INGOT) {
						int totalferro = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.IRON_INGOT);
						int ferro = totalferro * precoferro;
					
						ActionBar.sendAction(p, "§aVocê vendeu os ferros por " + ferro + " §acoins.");
					
					}
				}
				
				
				if (p.getItemInHand().getType() == Material.COAL) {
					if (itens.getType() == Material.COAL) {
						int totalcarvao = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.COAL);
						int carvao = totalcarvao * precocarvao;
						ActionBar.sendAction(p, "§aVocê vendeu os carvões por " + carvao + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.REDSTONE) {
					if (itens.getType() == Material.REDSTONE) {
						int totalredstone = contagem + itens.getAmount();
						p.getInventory().remove(Material.REDSTONE);
						p.closeInventory();
						int redstone = totalredstone * precoredstone;
						ActionBar.sendAction(p, "§aVocê vendeu as redstones por " + redstone + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.DIAMOND) {
					if (itens.getType() == Material.DIAMOND) {
						int totaldima = contagem + itens.getAmount();
						p.getInventory().remove(Material.DIAMOND);
						p.closeInventory();
						int dima = totaldima * precodima;
						ActionBar.sendAction(p, "§aVocê vendeu os diamantes por " + dima + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.EMERALD) {
					if (itens.getType() == Material.EMERALD) {
						int totalesmeralda = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.EMERALD);
						int esmeralda = totalesmeralda * precoesmeralda;
						ActionBar.sendAction(p, "§aVocê vendeu as esmeraldas apor " + esmeralda + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.GOLD_BLOCK) {
					if (itens.getType() == Material.GOLD_BLOCK) {
						int totalouro = contagem + itens.getAmount();
						p.getInventory().remove(Material.GOLD_BLOCK);
						p.closeInventory();
						int ouro = totalouro * precoblockouro;
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de ouro por " + ouro + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.IRON_BLOCK) {
					if (itens.getType() == Material.IRON_BLOCK) {
						int totalferro = contagem + itens.getAmount();
						p.getInventory().remove(Material.IRON_BLOCK);
						p.closeInventory();
						int ferro = totalferro * precoblockferro;
					
						ActionBar.sendAction(p, "§aVocê vendeu os ferros por " + ferro + " §acoins.");
					
					}
				}
				
				
				if (p.getItemInHand().getType() == Material.COAL_BLOCK) {
					if (itens.getType() == Material.COAL_BLOCK) {
						int totalcarvao = contagem + itens.getAmount();
						p.getInventory().remove(Material.COAL_BLOCK);
						p.closeInventory();
						int carvao = totalcarvao * precoblockcarvao;
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de carvão por " + carvao + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.REDSTONE_BLOCK) {
					if (itens.getType() == Material.REDSTONE_BLOCK) {
						int totalredstone = contagem + itens.getAmount();
						p.getInventory().remove(Material.REDSTONE_BLOCK);
						p.closeInventory();
						int redstone = totalredstone * precoblockredstone;
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de redstone por " + redstone + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.DIAMOND_BLOCK) {
					if (itens.getType() == Material.DIAMOND_BLOCK) {
						int totaldima = contagem + itens.getAmount();
						p.getInventory().remove(Material.DIAMOND_BLOCK);
						p.closeInventory();
						int dima = totaldima * precoblockdima;
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de diamante por " + dima + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.EMERALD_BLOCK) {
					if (itens.getType() == Material.EMERALD_BLOCK) {
						int totalesmeralda = contagem + itens.getAmount();
						p.getInventory().remove(Material.EMERALD_BLOCK);
						p.closeInventory();
						int esmeralda = totalesmeralda * precoblockesmeralda;
						ActionBar.sendAction(p, "§aVocê vendeu os blocos de esmeralda por " + esmeralda + " §acoins.");
					}
				}
					
				
				
				
				if (p.getItemInHand().getType() == Material.LEATHER) {
					if (itens.getType() == Material.LEATHER) {
						int totalredstone = contagem + itens.getAmount();
						p.getInventory().remove(Material.LEATHER);
						int redstone = totalredstone * precocouro;
						p.closeInventory();
						ActionBar.sendAction(p, "§aVocê vendeu os couros por " + redstone + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.COOKED_BEEF) {
					if (itens.getType() == Material.COOKED_BEEF) {
						int totaldima = contagem + itens.getAmount();
						p.getInventory().remove(Material.COOKED_BEEF);
						p.closeInventory();
						int dima = totaldima * precocarneassada;
						ActionBar.sendAction(p, "§aVocê vendeu os bifes por " + dima + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.RAW_BEEF) {
					if (itens.getType() == Material.RAW_BEEF) {
						int totalesmeralda = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.RAW_BEEF);
						int esmeralda = totalesmeralda * precocarne;
						ActionBar.sendAction(p, "§aVocê vendeu as carnes apor " + esmeralda + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.STRING) {
					if (itens.getType() == Material.STRING) {
						int totalouro = contagem + itens.getAmount();
						p.getInventory().remove(Material.STRING);
						int ouro = totalouro * precolinha;
						p.closeInventory();
						ActionBar.sendAction(p, "§aVocê vendeu as linhas por " + ouro + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.SPIDER_EYE) {
					if (itens.getType() == Material.SPIDER_EYE) {
						int totalferro = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.SPIDER_EYE);
						int ferro = totalferro * precoolho;
					
						ActionBar.sendAction(p, "§aVocê vendeu os olhos de aranha por " + ferro + " §acoins.");
					
					}
				}
				
				
				if (p.getItemInHand().getType() == Material.BONE) {
					if (itens.getType() == Material.BONE) {
						int totalcarvao = contagem + itens.getAmount();
						p.getInventory().remove(Material.BONE);
						int carvao = totalcarvao * precoosso;
						p.closeInventory();
						ActionBar.sendAction(p, "§aVocê vendeu os ossos por " + carvao + " §acoins.");
					}
				}
				
				
				
				if (p.getItemInHand().getType() == Material.ROTTEN_FLESH) {
					if (itens.getType() == Material.ROTTEN_FLESH) {
						int totalredstone = contagem + itens.getAmount();
						p.getInventory().remove(Material.ROTTEN_FLESH);
						p.closeInventory();
						int redstone = totalredstone * precocarnezombie;
						ActionBar.sendAction(p, "§aVocê vendeu as carnes de zumbie por " + redstone + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.ARROW) {
					if (itens.getType() == Material.ARROW) {
						int totaldima = contagem + itens.getAmount();
						p.getInventory().remove(Material.ARROW);
						p.closeInventory();
						int dima = totaldima * precoflecha;
						ActionBar.sendAction(p, "§aVocê vendeu as flechas por " + dima + " §acoins.");
					}
				}
				
				if (p.getItemInHand().getType() == Material.BLAZE_ROD) {
					if (itens.getType() == Material.BLAZE_ROD) {
						int totalesmeralda = contagem + itens.getAmount();
						p.closeInventory();
						p.getInventory().remove(Material.BLAZE_ROD);
						int esmeralda = totalesmeralda * precoblaze;
						ActionBar.sendAction(p, "§aVocê vendeu as varas de blaze por " + esmeralda + " §acoins.");
					}
				}
					

				
			}
			
			
		}else {
			p.closeInventory();
			p.sendMessage("§cVocê errou o Captcha");
			p.playSound(p.getLocation(), Sound.BAT_DEATH, 1, 1);
		}
		
		
		
	}

}
