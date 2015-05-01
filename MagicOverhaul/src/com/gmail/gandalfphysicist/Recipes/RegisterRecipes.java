package com.gmail.gandalfphysicist.Recipes;

import com.gmail.gandalfphysicist.Utils.ItemStacks;
import com.gmail.gandalfphysicist.MagicOverhaulMain;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ShapelessRecipe;

public class RegisterRecipes implements Listener{

    MagicOverhaulMain plugin;
    public RegisterRecipes(MagicOverhaulMain instance) {
        plugin = instance;
    }

    public void registerRecipes() {

        ShapelessRecipe MAP = new ShapelessRecipe(ItemStacks.map()).addIngredient(Material.BOWL).addIngredient(Material.STICK);
        plugin.getServer().addRecipe(MAP);

    }

}
