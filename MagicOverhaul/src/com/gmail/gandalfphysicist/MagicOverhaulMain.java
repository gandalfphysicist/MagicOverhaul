package com.gmail.gandalfphysicist;

import com.gmail.gandalfphysicist.GUI.ArcaneCraftingTableListener;
import com.gmail.gandalfphysicist.GUI.MortarAndPestleGUIListener;
import com.gmail.gandalfphysicist.Utils.RemoveRecipes;

import org.bukkit.ChatColor;
import org.bukkit.Material;
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
        getServer().getPluginManager().registerEvents(new PreventPotionUasage(), this);
        getServer().getPluginManager().registerEvents(new EntityAddWeaponEffect(), this);
        getServer().getPluginManager().registerEvents(new SalveCraftingListener(), this);
        getServer().getPluginManager().registerEvents(new MortarAndPestleUseListener(), this);

        //Commands
        getCommand("moeffect").setExecutor(new MOEffectCommand(this));

        ShapelessRecipe MAP = new ShapelessRecipe(ItemStacks.map()).addIngredient(Material.BOWL).addIngredient(Material.STICK);
        getServer().addRecipe(MAP);

        //Disable Recipes
        RemoveRecipes.removeRecipes(Material.ENCHANTMENT_TABLE, 0);
        RemoveRecipes.removeRecipes(Material.INK_SACK, 15);
    }

    public void onDisable() {

        //Unregister Recipes
        getServer().clearRecipes();

        //Log Plugin Disabled
        getLogger().log(Level.INFO, ChatColor.DARK_RED + "Plugin Disabled.");

        //Test
    }
}