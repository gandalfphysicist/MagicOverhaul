package com.gmail.gandalfphysicist;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import com.gmail.gandalfphysicist.Utils.RemoveItemsFromInventory;

import java.util.Random;

public class GatherPoisonFromSpider implements Listener {

    @EventHandler
    public void SpiderDeath(EntityDeathEvent event) {
        if (event.getEntity() instanceof CaveSpider) {
            if (event.getEntity().getLastDamageCause() instanceof EntityDamageByEntityEvent) {
                EntityDamageByEntityEvent DamageEvent = (EntityDamageByEntityEvent) event.getEntity().getLastDamageCause();
                if (DamageEvent.getDamager() instanceof Player) {
                    Player Damager = ((Player) DamageEvent.getDamager()).getPlayer();
                    Random r = new Random();
                    int rt = r.nextInt(10) + 1;
                    if (rt == 1) {
                        if (Damager.getInventory().contains(Material.GLASS_BOTTLE)) {
                            RemoveItemsFromInventory.removeInventoryItems(Damager.getInventory(), Material.GLASS_BOTTLE, 1);
                            World world = Damager.getWorld();
                            world.dropItem(Damager.getLocation(), ItemStacks.poisonBottle());
                        }
                    }
                }
            }
        }
    }

}
