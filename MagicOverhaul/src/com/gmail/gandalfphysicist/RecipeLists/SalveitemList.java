package com.gmail.gandalfphysicist.RecipeLists;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SalveitemList {

    public static List<ItemStack> salveitemList() {
        ArrayList<ItemStack> items = new ArrayList<ItemStack>();
        items.add(SalveitemList.fireSalts());
        items.add(SalveitemList.ghastTear());
        items.add(SalveitemList.glisteningMelon());
        items.add(SalveitemList.goldDust());
        items.add(SalveitemList.magmaCream());
        items.add(SalveitemList.slimeBall());

        return items;
    }

    public static ItemStack glisteningMelon() {
        ItemStack melon = new ItemStack(Material.SPECKLED_MELON);

        return melon;
    }

    public static ItemStack slimeBall() {
        ItemStack slime = new ItemStack(Material.SLIME_BALL);

        return slime;
    }

    public static ItemStack fireSalts() {
        ItemStack salts = new ItemStack(Material.INK_SACK);
        salts.setDurability((short) 14);
        ItemMeta meta = salts.getItemMeta();
        meta.setDisplayName("Fire Salts");
        ArrayList<String> lore = new ArrayList<String>();
        lore.add("MagicOverhaul Ingredient");
        meta.setLore(lore);
        salts.setItemMeta(meta);

        return salts;
    }

    public static ItemStack magmaCream() {
        ItemStack cream = new ItemStack(Material.MAGMA_CREAM);

        return cream;
    }

    public static ItemStack goldDust() {
        ItemStack dust = new ItemStack(Material.GLOWSTONE_DUST);
        ItemMeta meta = dust.getItemMeta();
        meta.setDisplayName("Gold Dust");
        ArrayList<String> lore = new ArrayList<String>();
        lore.add("MagicOverhaul Ingredient");
        meta.setLore(lore);
        dust.setItemMeta(meta);

        return dust;
    }

    public static ItemStack ghastTear() {
        ItemStack tear = new ItemStack(Material.GHAST_TEAR);

        return tear;
    }

}
