package com.gmail.gandalfphysicist;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemStacks {

    public static ItemStack map() {

        ItemStack map = new ItemStack(Material.BOWL);
        ItemMeta mmap = map.getItemMeta();
        mmap.setDisplayName(ChatColor.BLUE + "Mortar and Pestle");
        ArrayList<String> mapLore = new ArrayList<String>();
        mapLore.add("MagicOverhaul");
        mmap.setLore(mapLore);
        map.setItemMeta(mmap);

        return map;
    }

    public static ItemStack MAP() {
        ItemStack MAP = new ItemStack(Material.BOWL);
        ItemMeta mMAP = MAP.getItemMeta();
        mMAP.setDisplayName(ChatColor.DARK_GREEN + "Mortar and Pestle");
        ArrayList<String> MAPLore = new ArrayList<String>();
        MAPLore.add("MagicOverhaul GUI");
        mMAP.setLore(MAPLore);
        MAP.setItemMeta(mMAP);

        return MAP;
    }

    public static ItemStack salve() {
        ItemStack salve = new ItemStack(Material.BOWL);
        ItemMeta msalve = salve.getItemMeta();
        msalve.setDisplayName(ChatColor.DARK_AQUA + "Salve Crafting");
        ArrayList<String> salveLore = new ArrayList<String>();
        salveLore.add("MagicOverhaul GUI");
        msalve.setLore(salveLore);
        salve.setItemMeta(msalve);

        return salve;
    }

    public static ItemStack bricks() {
        ItemStack bricks = new ItemStack(Material.SMOOTH_BRICK);
        ItemMeta mbricks = bricks.getItemMeta();
        mbricks.setDisplayName(" ");
        ArrayList<String> bricksLore = new ArrayList<String>();
        bricksLore.add("MagicOverhaul GUI");
        mbricks.setLore(bricksLore);
        bricks.setItemMeta(mbricks);

        return bricks;
    }

    public static ItemStack bricks1() {
        ItemStack bricks1 = new ItemStack(Material.SMOOTH_BRICK, 1, (short) 3);
        ItemMeta mbricks1 = bricks1.getItemMeta();
        mbricks1.setDisplayName(" ");
        ArrayList<String> bricks1Lore = new ArrayList<String>();
        bricks1Lore.add("MagicOverhaul GUI");
        mbricks1.setLore(bricks1Lore);
        bricks1.setItemMeta(mbricks1);

        return bricks1;
    }

    public static ItemStack andesite() {
        ItemStack andesite = new ItemStack(Material.STONE, 1, (short) 6);
        ItemMeta mandesite = andesite.getItemMeta();
        mandesite.setDisplayName(" ");
        ArrayList<String> andesiteLore = new ArrayList<String>();
        andesiteLore.add("MagicOverhaul GUI");
        mandesite.setLore(andesiteLore);
        andesite.setItemMeta(mandesite);

        return andesite;
    }
    
    public static ItemStack diorite() {
    	 ItemStack diorite = new ItemStack(Material.STONE, 1, (short) 4);
         ItemMeta mdiorite = diorite.getItemMeta();
         mdiorite.setDisplayName(" ");
         ArrayList<String> dioriteLore = new ArrayList<String>();
         dioriteLore.add("MagicOverhaul GUI");
         mdiorite.setLore(dioriteLore);
         diorite.setItemMeta(mdiorite);

         return diorite;
    }

    public static ItemStack planks() {
        ItemStack planks = new ItemStack(Material.WOOD, 1, (short) 1);
        ItemMeta mplanks = planks.getItemMeta();
        mplanks.setDisplayName(" ");
        ArrayList<String> planksLore = new ArrayList<String>();
        planksLore.add("MagicOverhaul GUI");
        mplanks.setLore(planksLore);
        planks.setItemMeta(mplanks);

        return planks;
    }

    public static ItemStack pestle() {
        ItemStack pestle = new ItemStack(Material.WOOD, 1, (short) 1);
        ItemMeta mpestle = pestle.getItemMeta();
        mpestle.setDisplayName(ChatColor.BLUE + "Pestle");
        ArrayList<String> pestleLore = new ArrayList<String>();
        pestleLore.add("MagicOverhaul GUI");
        mpestle.setLore(pestleLore);
        pestle.setItemMeta(mpestle);

        return pestle;
    }

    public static ItemStack glass() {
        ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE);
        ItemMeta mglass = glass.getItemMeta();
        mglass.setDisplayName(ChatColor.BLUE + "Add Ingredient");
        ArrayList<String> glassLore = new ArrayList<String>();
        glassLore.add("Place Ingredients Here");
        glassLore.add(" ");
        glassLore.add("MagicOverhaul GUI");
        mglass.setLore(glassLore);
        glass.setItemMeta(mglass);

        return glass;
    }

    public static ItemStack glass1() {
        ItemStack glass1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 11);
        ItemMeta mglass1 = glass1.getItemMeta();
        mglass1.setDisplayName(ChatColor.BLUE + "Ingredients Added");
        ArrayList<String> glass1LoreTest = new ArrayList<String>();
        glass1LoreTest.add("MagicOverhaul GUI");
        mglass1.setLore(glass1LoreTest);
        glass1.setItemMeta(mglass1);

        return glass1;
    }

    public static ItemStack poisonVial() {
        ItemStack PoisonBottle = new ItemStack(Material.POTION);
        PoisonBottle.setAmount(1);
        PoisonBottle.setDurability((short) 8196);
        ItemMeta PBMeta = PoisonBottle.getItemMeta();
        PBMeta.setDisplayName("Vial of Poison");
        ArrayList<String> PoisonBottleLore = new ArrayList<String>();
        PoisonBottleLore.add("MagicOverhaul Ingredient");
        PBMeta.setLore(PoisonBottleLore);
        PoisonBottle.setItemMeta(PBMeta);

        return PoisonBottle;
    }
}