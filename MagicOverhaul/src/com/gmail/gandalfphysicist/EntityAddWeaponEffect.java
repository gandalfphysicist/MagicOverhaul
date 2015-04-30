package com.gmail.gandalfphysicist;

import com.gmail.gandalfphysicist.Utils.CustomEffectCheck;
import com.gmail.gandalfphysicist.Utils.ToolClasses;
import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class EntityAddWeaponEffect implements Listener {

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            if (event.getEntity() instanceof LivingEntity) {
                Player user = (Player) event.getDamager();
                LivingEntity le = (LivingEntity) event.getEntity();
                if (!(user.getItemInHand() == null)) {
                    if (user.getItemInHand().getItemMeta().hasLore()) {
                        ItemStack itemInHand = user.getItemInHand();
                        List<String> lore = itemInHand.getItemMeta().getLore();
                        if (CustomEffectCheck.hasCustomEffect(lore)) {
                            if (CustomEffectCheck.getEffect(lore).equalsIgnoreCase(ChatColor.DARK_PURPLE + "Poison")) {
                                if (ToolClasses.axes().contains(itemInHand.getType()) || (ToolClasses.swords().contains(itemInHand.getType()))) {
                                    int level = CustomEffectCheck.getEffectLevel(lore);
                                    user.sendMessage(ChatColor.GREEN + "Effect level is " + level);
                                    le.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 45 * 20 / level, level, false));
                                }
                            } else {
                                user.sendMessage("Weapon has no effect imbued.");
                            }
                        }
                    }
                }
            }
        }

    }
}
