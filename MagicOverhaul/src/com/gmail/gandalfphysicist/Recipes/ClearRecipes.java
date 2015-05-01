package com.gmail.gandalfphysicist.Recipes;

import com.gmail.gandalfphysicist.MagicOverhaulMain;
import org.bukkit.event.Listener;

public class ClearRecipes implements Listener {

    MagicOverhaulMain plugin;
    public ClearRecipes(MagicOverhaulMain instance) {
        plugin = instance;
    }

    public void clearRecipes() {

        plugin.getServer().clearRecipes();

    }

}
