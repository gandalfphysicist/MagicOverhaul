package com.gmail.gandalfphysicist.Recipes;

import com.gmail.gandalfphysicist.MagicOverhaulMain;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

import java.util.Iterator;

public class RemoveRecipes {

    MagicOverhaulMain plugin;

    public RemoveRecipes(MagicOverhaulMain instance) {
        plugin = instance;
    }

    public static void removeRecipes(Material mat, int durability) {
        Iterator<Recipe> it = Bukkit.getServer().recipeIterator();
        Recipe recipe;
        ItemStack result;
        Material resultType;
        while (it.hasNext()) {
            recipe = it.next();
            if (recipe != null) {
                result = recipe.getResult();
                resultType = result.getType();
                if (resultType.equals(mat) && result.getDurability() == durability) {
                    it.remove();
                }

            }
        }
    }
}

