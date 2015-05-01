package com.gmail.gandalfphysicist;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.gmail.gandalfphysicist.RecipeLists.CheckSalveitemList;

public class SalveCraftingListener implements Listener {

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {

        Inventory inventory = event.getInventory();
        ItemStack item = event.getCurrentItem();
        ItemStack cursor = event.getCursor();
        // 14
        // 15
        // 16
        ArrayList<String> Lore = new ArrayList<String>();
        Lore.add("MagicOverhaul GUI");
        if (inventory.getName().contains(ChatColor.DARK_AQUA + "Salve Crafting")) {
            if (item != null) {
                if (item.equals(ItemStacks.glass())) {
                    if (cursor.getType() != Material.AIR) {
                    	if(CheckSalveitemList.checkList(cursor)) {
                    		if(inventory.getItem(14).equals(ItemStacks.glass1())) {
                    			cursor.getItemMeta().setLore(Lore);
                    			inventory.setItem(14, cursor);
                    			event.getView().setCursor(null);
                    		}
                    	}
                    }
                }
            }
        }
    }
}