package com.gmail.gandalfphysicist;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MortarAndPestleUseListener implements Listener {
	
	@EventHandler
	public void onInventoryClickEvent(InventoryClickEvent event) {
	
		Inventory inventory = event.getInventory();
		ItemStack item = event.getCurrentItem();
		if(inventory.getName().contains(ChatColor.DARK_GREEN + "Mortar and Pestle")) {
			if(item != null) {
				if(item.equals(ItemStacks.pestle())) {
				}
			}
		}
	}
}
