package com.gmail.gandalfphysicist.GUI;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.gmail.gandalfphysicist.Utils.ItemStacks;

public class MortarAndPestleGUIListener implements Listener {

    public Inventory createInventory(Player player) {
        return Bukkit.getServer().createInventory(player, 27, ChatColor.BLUE + "Mortar and Pestle");
    }

    public Inventory createInventory1(Player player) {
        return Bukkit.getServer().createInventory(player, 54, ChatColor.DARK_GREEN + "Mortar and Pestle");
    }

    public Inventory createInventory2(Player player) {
        return Bukkit.getServer().createInventory(player, 27, ChatColor.DARK_AQUA + "Salve Crafting");
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {

        Player user = event.getPlayer();

        Inventory MaP = this.createInventory(user);

        MaP.setItem(0, ItemStacks.bricks());
        MaP.setItem(1, ItemStacks.bricks());
        MaP.setItem(2, ItemStacks.bricks());
        MaP.setItem(3, ItemStacks.andesite());
        MaP.setItem(4, ItemStacks.andesite());
        MaP.setItem(5, ItemStacks.andesite());
        MaP.setItem(6, ItemStacks.bricks1());
        MaP.setItem(7, ItemStacks.bricks1());
        MaP.setItem(8, ItemStacks.bricks1());
        MaP.setItem(9, ItemStacks.bricks());
        MaP.setItem(10, ItemStacks.MAP());
        MaP.setItem(11, ItemStacks.bricks());
        MaP.setItem(12, ItemStacks.andesite());
        MaP.setItem(13, ItemStacks.andesite());
        MaP.setItem(14, ItemStacks.andesite());
        MaP.setItem(15, ItemStacks.bricks1());
        MaP.setItem(16, ItemStacks.salve());
        MaP.setItem(17, ItemStacks.bricks1());
        MaP.setItem(18, ItemStacks.bricks());
        MaP.setItem(19, ItemStacks.bricks());
        MaP.setItem(20, ItemStacks.bricks());
        MaP.setItem(21, ItemStacks.andesite());
        MaP.setItem(22, ItemStacks.andesite());
        MaP.setItem(23, ItemStacks.andesite());
        MaP.setItem(24, ItemStacks.bricks1());
        MaP.setItem(25, ItemStacks.bricks1());
        MaP.setItem(26, ItemStacks.bricks1());

        Action action = event.getAction();

        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (user.getInventory().getItemInHand().equals(ItemStacks.map()) && user.hasPermission("MagicOverhaul.mortarandpestle")) {
            	if(user.getItemInHand().getAmount() == 1) {
            		user.openInventory(MaP);
            	}
            }
        }
    }

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {

        Player user = (Player) event.getWhoClicked();
        ItemStack item = event.getCurrentItem();

        Inventory MaP = this.createInventory1(user);
        Inventory Salve = this.createInventory2(user);
        Inventory inventory = event.getInventory();
        
        if(inventory.getName().contains(ChatColor.BLUE + "Mortar and Pestle")) {
	        if (item != null) {
	            if (item.equals(ItemStacks.MAP())) {
	                MaP.setItem(0, ItemStacks.andesite());
	                MaP.setItem(1, ItemStacks.andesite());
	                MaP.setItem(2, ItemStacks.andesite());
	                MaP.setItem(3, ItemStacks.andesite());
	                MaP.setItem(4, ItemStacks.andesite());
	                MaP.setItem(5, ItemStacks.diorite());
	                MaP.setItem(6, ItemStacks.diorite());
	                MaP.setItem(7, ItemStacks.diorite());
	                MaP.setItem(8, ItemStacks.diorite());
	                MaP.setItem(9, ItemStacks.andesite());
	                MaP.setItem(10, ItemStacks.andesite());
	                MaP.setItem(11, ItemStacks.andesite());
	                MaP.setItem(12, ItemStacks.andesite());
	                MaP.setItem(13, ItemStacks.pestle());
	                MaP.setItem(14, ItemStacks.diorite());
	                MaP.setItem(15, null);
	                MaP.setItem(16, null);
	                MaP.setItem(17, ItemStacks.diorite());
	                MaP.setItem(18, ItemStacks.andesite());
	                MaP.setItem(19, ItemStacks.andesite());
	                MaP.setItem(20, ItemStacks.andesite());
	                MaP.setItem(21, ItemStacks.pestle());
	                MaP.setItem(22, ItemStacks.andesite());
	                MaP.setItem(23, ItemStacks.diorite());
	                MaP.setItem(24, null);
	                MaP.setItem(25, null);
	                MaP.setItem(26, ItemStacks.diorite());
	                MaP.setItem(27, ItemStacks.andesite());
	                MaP.setItem(28, ItemStacks.andesite());
	                MaP.setItem(29, ItemStacks.pestle());
	                MaP.setItem(30, ItemStacks.andesite());
	                MaP.setItem(31, ItemStacks.andesite());
	                MaP.setItem(32, ItemStacks.diorite());
	                MaP.setItem(33, ItemStacks.diorite());
	                MaP.setItem(34, ItemStacks.diorite());
	                MaP.setItem(35, ItemStacks.diorite());
	                MaP.setItem(36, ItemStacks.planks());
	                MaP.setItem(37, null);
	                MaP.setItem(38, null);
	                MaP.setItem(39, null);
	                MaP.setItem(40, ItemStacks.planks());
	                MaP.setItem(41, ItemStacks.diorite());
	                MaP.setItem(42, ItemStacks.diorite());
	                MaP.setItem(43, ItemStacks.diorite());
	                MaP.setItem(44, ItemStacks.diorite());
	                MaP.setItem(45, ItemStacks.andesite());
	                MaP.setItem(46, ItemStacks.planks());
	                MaP.setItem(47, ItemStacks.planks());
	                MaP.setItem(48, ItemStacks.planks());
	                MaP.setItem(49, ItemStacks.andesite());
	                MaP.setItem(50, ItemStacks.diorite());
	                MaP.setItem(51, ItemStacks.diorite());
	                MaP.setItem(52, ItemStacks.diorite());
	                MaP.setItem(53, ItemStacks.diorite());
	
	                user.closeInventory();
	                user.openInventory(MaP);
	            }
	            if (item.equals(ItemStacks.salve())) {
	                Salve.setItem(0, ItemStacks.andesite());
	                Salve.setItem(1, ItemStacks.andesite());
	                Salve.setItem(2, ItemStacks.andesite());
	                Salve.setItem(3, ItemStacks.andesite());
	                Salve.setItem(4, ItemStacks.andesite());
	                Salve.setItem(5, ItemStacks.andesite());
	                Salve.setItem(6, ItemStacks.andesite());
	                Salve.setItem(7, ItemStacks.andesite());
	                Salve.setItem(8, ItemStacks.andesite());
	                Salve.setItem(9, ItemStacks.planks());
	                Salve.setItem(10, ItemStacks.glass());
	                Salve.setItem(11, ItemStacks.glass());
	                Salve.setItem(12, ItemStacks.planks());
	                Salve.setItem(13, ItemStacks.andesite());
	                Salve.setItem(14, ItemStacks.glass1());
	                Salve.setItem(15, ItemStacks.glass1());
	                Salve.setItem(16, ItemStacks.glass1());
	                Salve.setItem(17, ItemStacks.andesite());
	                Salve.setItem(18, ItemStacks.andesite());
	                Salve.setItem(19, ItemStacks.planks());
	                Salve.setItem(20, ItemStacks.planks());
	                Salve.setItem(21, ItemStacks.andesite());
	                Salve.setItem(22, ItemStacks.andesite());
	                Salve.setItem(23, ItemStacks.andesite());
	                Salve.setItem(24, ItemStacks.andesite());
	                Salve.setItem(25, ItemStacks.andesite());
	                Salve.setItem(26, ItemStacks.andesite());
	
	                user.closeInventory();
	                user.openInventory(Salve);
	            }
            }
        }else{
        	if(inventory.getName().contains(ChatColor.BLUE + "Complete Salve")) {
        		if(item != null) {
        			if(item.equals(ItemStacks.wool())) {
        				List<String> lore = user.getItemInHand().getItemMeta().getLore();
						user.openInventory(Salve);
						lore.get(1); //Left Off Here
        			}
        		}
        	}
        }
    }
}