package com.gmail.gandalfphysicist.Recipes;

import com.gmail.gandalfphysicist.MagicOverhaulMain;
import com.gmail.gandalfphysicist.Utils.ItemStacks;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class RegisterRecipes implements Listener {

    MagicOverhaulMain plugin;
    public RegisterRecipes(MagicOverhaulMain instance) {
        plugin = instance;
    }

    public void registerShapelessRecipes() {

        ShapelessRecipe MAP = new ShapelessRecipe(ItemStacks.map()).addIngredient(Material.BOWL).addIngredient(Material.STICK);
        plugin.getServer().addRecipe(MAP);

    }

    public void registerFurnaceRecipes() {
        FurnaceRecipe splashPotions = new FurnaceRecipe(new ItemStack(Material.BOOKSHELF), new ItemStack(Material.POTION, 1, (short)8229).getData());
        FurnaceRecipe test = new FurnaceRecipe(ItemStacks.heal2Potion(), ItemStacks.map().getData());
        plugin.getServer().addRecipe(splashPotions);
        plugin.getServer().addRecipe(test);
    }

}
