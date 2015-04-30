package com.gmail.gandalfphysicist;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Iterator;
import java.util.logging.Level;

public class MagicOverhaulMain extends JavaPlugin {

    public void onEnable() {

        //Listeners
        getServer().getPluginManager().registerEvents(new ArcaneCraftingTableListener(), this);
        getServer().getPluginManager().registerEvents(new InventoryClickCancelListener(), this);
        getServer().getPluginManager().registerEvents(new MortarAndPestleGUIListener(), this);
        getServer().getPluginManager().registerEvents(new GatherPoisonFromSpider(), this);
        getServer().getPluginManager().registerEvents(new PreventPotionUasage(), this);

        ShapelessRecipe MAP = new ShapelessRecipe(ItemStacks.map()).addIngredient(Material.BOWL).addIngredient(Material.STICK);
        getServer().addRecipe(MAP);

        //Disable Enchanting Table Recipe
        Iterator<Recipe> it = getServer().recipeIterator();
        Recipe recipe;
        while(it.hasNext()) {
            recipe = it.next();
            if (recipe != null && recipe.getResult().getType().equals(Material.ENCHANTMENT_TABLE)) {
                it.remove();
            }
        }

    }

    public void onDisable() {

        //Unregister Recipes
        getServer().clearRecipes();

        //Log Plugin Disabled
        getLogger().log(Level.INFO, ChatColor.DARK_RED + "Plugin Disabled.");

        //Test
    }
}