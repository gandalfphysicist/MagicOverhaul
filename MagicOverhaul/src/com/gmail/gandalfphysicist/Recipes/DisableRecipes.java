package com.gmail.gandalfphysicist.Recipes;

import com.gmail.gandalfphysicist.MagicOverhaulMain;
import org.bukkit.Material;

public class DisableRecipes {

    MagicOverhaulMain plugin;
    public DisableRecipes(MagicOverhaulMain instance) {
        plugin = instance;
    }

    public void disableRecipes() {

        RemoveRecipes.removeRecipes(Material.ENCHANTMENT_TABLE, 0);
        RemoveRecipes.removeRecipes(Material.INK_SACK, 15);
        RemoveRecipes.removeRecipes(Material.BREWING_STAND_ITEM, 0);

    }

}
