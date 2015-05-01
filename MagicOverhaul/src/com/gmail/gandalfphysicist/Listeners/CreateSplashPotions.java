package com.gmail.gandalfphysicist.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.util.Vector;

import com.gmail.gandalfphysicist.MagicOverhaulMain;
import com.gmail.gandalfphysicist.Utils.ItemStacks;
import com.gmail.gandalfphysicist.Utils.RemoveItemsFromInventory;

public class CreateSplashPotions implements Listener {

    MagicOverhaulMain plugin;

    public CreateSplashPotions(MagicOverhaulMain instance) {
        plugin = instance;
    }

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        Player user = event.getPlayer();
        if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (user.getItemInHand() != null && user.getItemInHand().getType() != Material.AIR) {
                if (user.getItemInHand().equals(ItemStacks.heal2Potion())) {
                    if (event.getClickedBlock().getType().equals(Material.FURNACE)) {
                        ItemStack potion = new ItemStack(Material.POTION, 1, (short) 8229);
                        RemoveItemsFromInventory.removeInventoryItems(user.getInventory(), user.getItemInHand().getType(), 1);
                        Location loc = event.getClickedBlock().getLocation();
                        loc.add(0.5, 1.2, 0.5);
                        final Item item = loc.getWorld().dropItem(loc, potion);
                        item.setMetadata("Pickup", new FixedMetadataValue(plugin, true));
                        item.setVelocity(new Vector(0, 0, 0));
                        item.teleport(loc);
                        plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                            @Override
                            public void run() {
                                item.remove();
                                ItemStack replacePotion = new ItemStack(Material.POTION, 1, (short) 16421);
                                Location loc = item.getLocation();
                                loc.getWorld().dropItem(loc, replacePotion);

                            }
                        }, 20 * 5L);
                    }
                    user.sendMessage(ChatColor.AQUA + "Iron block must be lit below.");
                }
            }
        }
    }


    @EventHandler
    public void onPickupItem(PlayerPickupItemEvent event) {
        if (event.getItem().hasMetadata("Pickup")) {
            event.setCancelled(true);
        }
    }


}