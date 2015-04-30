package com.gmail.gandalfphysicist.WeaponEffects;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class AddEffect {

    public static ItemStack applyEffect(Player user, String effect, int i) {
        ItemStack item = user.getItemInHand();
        if (effect.equalsIgnoreCase("poison")) {
            if (i > 0 && i < 3) {
                Poison.addPoison(item, i, user);
            }
        } else {
            user.sendMessage(ChatColor.DARK_RED + "No such effect.");
        }
        return item;
    }

}
