package com.gmail.gandalfphysicist.Listeners;



import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.gmail.gandalfphysicist.Utils.ItemStacks;

public class SalveCraftingInventoryCloseListener implements Listener {

	@EventHandler
	public void onInventoryCloseEvent(InventoryCloseEvent event) {
		
		Inventory inventory = event.getInventory();
		Player user = (Player) event.getPlayer();
		
		ItemStack map = user.getItemInHand();
		ItemMeta mmap = map.getItemMeta();
		if(inventory.getName().contains(ChatColor.DARK_AQUA + "Salve Crafting")) {
			if(inventory.getItem(14).getType() == ItemStacks.glass1().getType() && inventory.getItem(15).getType() == ItemStacks.glass1().getType() && inventory.getItem(16).getType() == ItemStacks.glass1().getType()) {
				return;
			}else{
				ArrayList<String> mapLore = new ArrayList<String>();
				mapLore.add("Ingredients Added:");
				if(inventory.getItem(14).getType() != ItemStacks.glass1().getType()) {
					mapLore.add(inventory.getItem(14).getType().toString());
				}
				if(inventory.getItem(15).getType() != ItemStacks.glass1().getType()) {
					mapLore.add(inventory.getItem(15).getType().toString());
				}
				if(inventory.getItem(16).getType() != ItemStacks.glass1().getType()) {
					mapLore.add(inventory.getItem(16).getType().toString());
				}
				if(user.getItemInHand().getAmount() == 1) {
					mapLore.add(" ");
					mapLore.add("MagicOverhaul");
					mmap.setLore(mapLore);
					map.setItemMeta(mmap);
				}
			}
		}
	}
}