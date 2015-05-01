package com.gmail.gandalfphysicist.Listeners;

import java.util.ArrayList;

import com.gmail.gandalfphysicist.Utils.ItemStacks;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.gmail.gandalfphysicist.RecipeLists.CheckSalveitemList;

public class SalveCraftingListener implements Listener {

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {

        Inventory inventory = event.getInventory();
        ItemStack item = event.getCurrentItem();
        ItemStack cursor = event.getCursor();
        ItemMeta mcursor = cursor.getItemMeta();
        ArrayList<String> Lore = new ArrayList<String>();
        Lore.add("MagicOverhaul GUI");
        if (inventory.getName().contains(ChatColor.DARK_AQUA + "Salve Crafting")) {
            if (item != null) {
                if (item.equals(ItemStacks.glass())) {
                    if (cursor.getType() != Material.AIR) {
                    	if(CheckSalveitemList.checkList(cursor)) {
                    		if(inventory.getItem(14).equals(ItemStacks.glass1())) {
                    			inventory.setItem(14, cursor);
                    			if(cursor.getAmount() > 1) {
                    				cursor.setAmount(cursor.getAmount() - 1);
                    			}else{
                    			event.getView().setCursor(null);
                    			}
                    			mcursor.setLore(Lore);
                    			inventory.getItem(14).setItemMeta(mcursor);
                    		}else{
                    			if(inventory.getItem(15).equals(ItemStacks.glass1())) {
                        			inventory.setItem(15, cursor);
                        			if(cursor.getAmount() > 1) {
                        				cursor.setAmount(cursor.getAmount() - 1);
                        			}else{
                        			event.getView().setCursor(null);
                        			}
                        			mcursor.setLore(Lore);
                        			inventory.getItem(15).setItemMeta(mcursor);
                    			}else{
                    				if(inventory.getItem(16).equals(ItemStacks.glass1())) {
                            			inventory.setItem(16, cursor);
                            			if(cursor.getAmount() > 1) {
                            				cursor.setAmount(cursor.getAmount() - 1);
                            			}else{
                            			event.getView().setCursor(null);
                            			}
                            			mcursor.setLore(Lore);
                            			inventory.getItem(16).setItemMeta(mcursor);
                    				}
                    			}
                    		}
                    	}
                    }
                }
            }
        }
    }
}