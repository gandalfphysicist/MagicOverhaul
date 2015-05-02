package com.gmail.gandalfphysicist.Listeners;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.gmail.gandalfphysicist.Utils.ItemStacks;

public class MortarAndPestleSalveCompleteInventoryClickListener implements Listener {

	@EventHandler
	public void onInventoryClickEvent(InventoryClickEvent event) {
		
		Inventory inventory = event.getInventory();
		ItemStack item = event.getCurrentItem();
		Player user = (Player) event.getWhoClicked();
		
		if(inventory.getName().contains(ChatColor.BLUE + "Complete Salve")) {
			if(item != null) {
				if(item.equals(ItemStacks.clear())) {
					if(user.getItemInHand().getAmount() == 1) {
						user.getInventory().remove(user.getItemInHand());
						user.getInventory().setItemInHand(ItemStacks.map());
						user.closeInventory();
					}
				}
			}
		}
	}
}