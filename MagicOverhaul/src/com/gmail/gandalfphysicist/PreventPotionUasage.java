package com.gmail.gandalfphysicist;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PreventPotionUasage implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            Player user = event.getPlayer();
            if (user.getInventory().getItemInHand().equals(ItemStacks.poisonVial())) {
                event.setCancelled(true);
            }
        }
    }

}
