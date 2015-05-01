package com.gmail.gandalfphysicist;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class SalveCraftingListener implements Listener {
	
	@EventHandler
	public void onInventoryClickEvent(InventoryClickEvent event) {
		
		Inventory inventory = event.getInventory();
		ItemStack item = event.getCurrentItem();
		ItemStack cursor = event.getCursor();
		//int cursoramount = cursor.getAmount();
		
		if(inventory.getName().contains(ChatColor.DARK_AQUA + "Salve Crafting")) {
			if(item != null) {
				if(item.equals(ItemStacks.glass())) {
					if(cursor.getType() != Material.AIR) {
						
					}
				}
			}
		}
	}
}
