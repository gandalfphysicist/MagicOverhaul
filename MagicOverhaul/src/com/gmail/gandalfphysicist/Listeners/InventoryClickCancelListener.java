package com.gmail.gandalfphysicist.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryClickCancelListener implements Listener {

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {

        ItemStack item = event.getCurrentItem();

        if (item != null) {
            if (item.hasItemMeta() && item.getItemMeta().hasLore() && item.getItemMeta().getLore().contains("MagicOverhaul GUI")) {
                event.setCancelled(true);
            }
        }
    }
}