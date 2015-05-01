package com.gmail.gandalfphysicist;

import org.bukkit.ChatColor;
import org.bukkit.Material;
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
		ItemStack I = inventory.getItem(37);
		ItemStack II = inventory.getItem(38);
		ItemStack III = inventory.getItem(39);
		int IAmount = I.getAmount();
		int IIAmount = II.getAmount();
		int IIIAmount = III.getAmount();
		if(inventory.getName().contains(ChatColor.DARK_GREEN + "Mortar and Pestle")) {
			if(item != null) {
				if(item.equals(ItemStacks.pestle())) {
					if(I != null) {
						if(I.equals(Material.BLAZE_ROD)) {
							if(IAmount > 1) {
								I.setAmount(IAmount -1);
							}else{
								inventory.setItem(37, new ItemStack(Material.AIR));
							}
							
						}
					}
				}
			}
		}
	}
}
