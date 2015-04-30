package com.gmail.gandalfphysicist.WeaponEffects;

import com.gmail.gandalfphysicist.Utils.RomanNumerals;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Poison {

    public static ItemStack addPoison(ItemStack is, int level, Player user) {
        ArrayList<Material> allowedList = new ArrayList<Material>();
        allowedList.add(Material.WOOD_AXE);
        allowedList.add(Material.STONE_AXE);
        allowedList.add(Material.GOLD_AXE);
        allowedList.add(Material.IRON_AXE);
        allowedList.add(Material.DIAMOND_AXE);
        allowedList.add(Material.WOOD_SWORD);
        allowedList.add(Material.STONE_SWORD);
        allowedList.add(Material.GOLD_SWORD);
        allowedList.add(Material.IRON_SWORD);
        allowedList.add(Material.DIAMOND_SWORD);
        if (allowedList.contains(is.getType())) {
            ItemMeta meta = is.getItemMeta();
            List<String> lore = meta.getLore();
            if (lore == null || lore.isEmpty()) {
                ArrayList<String> newLore = new ArrayList<String>();
                newLore.add(ChatColor.DARK_PURPLE + "Poison " + RomanNumerals.getRomanNumeral(level));
                meta.setLore(newLore);
                is.setItemMeta(meta);
                user.sendMessage(ChatColor.GOLD + "Poison " + RomanNumerals.getRomanNumeral(level) + " has been added to your tool.");
                return is;
            } else {
                lore.add(ChatColor.DARK_PURPLE + "Poison " + RomanNumerals.getRomanNumeral(level));
                meta.setLore(lore);
                is.setItemMeta(meta);
                user.sendMessage(ChatColor.GOLD + "Poison " + RomanNumerals.getRomanNumeral(level) + " has been added to your tool.");
                return is;
            }
        } else {
            user.sendMessage(ChatColor.DARK_RED + "This effect can not be added to this item.");
        }
        return is;
    }
}

