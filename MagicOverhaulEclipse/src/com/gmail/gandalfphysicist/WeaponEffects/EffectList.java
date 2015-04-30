package com.gmail.gandalfphysicist.WeaponEffects;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class EffectList {

    public static List<String> effects() {

        List<String> effectList = new ArrayList<String>();
        effectList.add(ChatColor.DARK_PURPLE + "Poison");

        return effectList;
    }

}