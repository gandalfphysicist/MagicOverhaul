package com.gmail.gandalfphysicist.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.gmail.gandalfphysicist.Utils.ItemStacks;

public class MortarAndPestleSalveCompleteGUIListener implements Listener {

	public Inventory createInventory(Player player) {
        return Bukkit.getServer().createInventory(player, 27, ChatColor.BLUE + "Complete Salve");
    }
	
	@EventHandler
	public void onPlayerInteractEvent(PlayerInteractEvent event) {
		
		Player user = event.getPlayer();
		Action action = event.getAction();
		ItemStack item = user.getItemInHand();
		
		Inventory inventory = this.createInventory(user);
		
		inventory.setItem(0, ItemStacks.bricks());
		inventory.setItem(1, ItemStacks.bricks());
		inventory.setItem(2, ItemStacks.bricks());
		inventory.setItem(3, ItemStacks.planks());
		inventory.setItem(4, ItemStacks.planks());
		inventory.setItem(5, ItemStacks.planks());
		inventory.setItem(6, ItemStacks.andesite());
		inventory.setItem(7, ItemStacks.andesite());
		inventory.setItem(8, ItemStacks.andesite());
		inventory.setItem(9, ItemStacks.bricks());
		inventory.setItem(10, ItemStacks.clear());
		inventory.setItem(11, ItemStacks.bricks());
		inventory.setItem(12, ItemStacks.planks());
		inventory.setItem(13, ItemStacks.mix());
		inventory.setItem(14, ItemStacks.planks());
		inventory.setItem(15, ItemStacks.andesite());
		inventory.setItem(16, ItemStacks.wool());
		inventory.setItem(17, ItemStacks.andesite());
		inventory.setItem(18, ItemStacks.bricks());
		inventory.setItem(19, ItemStacks.bricks());
		inventory.setItem(20, ItemStacks.bricks());
		inventory.setItem(21, ItemStacks.planks());
		inventory.setItem(22, ItemStacks.planks());
		inventory.setItem(23, ItemStacks.planks());
		inventory.setItem(24, ItemStacks.andesite());
		inventory.setItem(25, ItemStacks.andesite());
		inventory.setItem(26, ItemStacks.andesite());
		
		if(item.hasItemMeta() && item.getItemMeta().hasLore() && item.getItemMeta().getLore().contains("Ingredients Added:")) {
			if(item.getAmount() == 1) {
				if(action.equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
					user.openInventory(inventory);
				}
			}
		}
	}
}
