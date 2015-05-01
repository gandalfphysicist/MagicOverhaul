package com.gmail.gandalfphysicist.RecipeLists;

import org.bukkit.inventory.ItemStack;

public class CheckSalveitemList {

    public static boolean checkList(ItemStack is) {

        for (ItemStack s : SalveitemList.salveitemList()) {
            if (is.equals(s)) {
                return true;
            }
        }

        return false;

    }

}
