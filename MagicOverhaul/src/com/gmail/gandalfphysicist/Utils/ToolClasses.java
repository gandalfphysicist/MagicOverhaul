package com.gmail.gandalfphysicist.Utils;

import org.bukkit.Material;

import java.util.ArrayList;

public class ToolClasses {

    public static ArrayList<Material> swords() {
        ArrayList<Material> swordList = new ArrayList<Material>();
        swordList.add(Material.WOOD_SWORD);
        swordList.add(Material.STONE_SWORD);
        swordList.add(Material.IRON_SWORD);
        swordList.add(Material.GOLD_SWORD);
        swordList.add(Material.DIAMOND_SWORD);

        return swordList;
    }

    public static ArrayList<Material> axes() {
        ArrayList<Material> axeList = new ArrayList<Material>();
        axeList.add(Material.WOOD_AXE);
        axeList.add(Material.STONE_AXE);
        axeList.add(Material.IRON_AXE);
        axeList.add(Material.GOLD_AXE);
        axeList.add(Material.DIAMOND_AXE);

        return axeList;
    }

}
