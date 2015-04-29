package com.gmail.gandalfphysicist;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class MagicOverhaulMain extends JavaPlugin {

    public void onEnable() {

        //Command Executors !RAWR!

        //Listeners
        getServer().getPluginManager().registerEvents(new ArcaneCraftingTableListener(), this);
        getServer().getPluginManager().registerEvents(new InventoryClickCancelListener(), this);
        getServer().getPluginManager().registerEvents(new MortarAndPestleGUIListener(), this);

        ShapelessRecipe MAP = new ShapelessRecipe(ItemStacks.map()).addIngredient(Material.BOWL).addIngredient(Material.STICK);
        getServer().addRecipe(MAP);
    }

    public void onDisable() {

        getLogger().log(Level.INFO, ChatColor.DARK_RED + "Plugin Disabled.");

    }
}