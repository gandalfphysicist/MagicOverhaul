package com.gmail.gandalfphysicist;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class MagicOverhaulMain extends JavaPlugin {

    public void onEnable() {

        //Listeners
        getServer().getPluginManager().registerEvents(new ArcaneCraftingTableListener(), this);
        getServer().getPluginManager().registerEvents(new InventoryClickCancelListener(), this);
        getServer().getPluginManager().registerEvents(new MortarAndPestleGUIListener(), this);
        getServer().getPluginManager().registerEvents(new GatherPoisonFromSpider(), this);

        ShapelessRecipe MAP = new ShapelessRecipe(ItemStacks.map()).addIngredient(Material.BOWL).addIngredient(Material.STICK);
        getServer().addRecipe(MAP);

    }

    public void onDisable() {

        //Unregister Recipes
        getServer().clearRecipes();

        //Log Plugin Disabled
        getLogger().log(Level.INFO, ChatColor.DARK_RED + "Plugin Disabled.");

    }
}