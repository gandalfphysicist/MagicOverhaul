package com.gmail.gandalfphysicist;

import com.gmail.gandalfphysicist.Commands.RegisterCommands;
import com.gmail.gandalfphysicist.Events.RegisterEvents;
import com.gmail.gandalfphysicist.Listeners.CreateSplashPotions;
import com.gmail.gandalfphysicist.Recipes.ClearRecipes;
import com.gmail.gandalfphysicist.Recipes.DisableRecipes;
import com.gmail.gandalfphysicist.Recipes.RegisterRecipes;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class MagicOverhaulMain extends JavaPlugin {

    public void onEnable() {

        //Listeners
        RegisterEvents re = new RegisterEvents(this);
        re.registerEvents();

        //Commands
        RegisterCommands rc = new RegisterCommands(this);
        rc.registerCommands();

        //Add new Recipes
        RegisterRecipes rr = new RegisterRecipes(this);
        rr.registerShapelessRecipes();
        rr.registerFurnaceRecipes();

        //Disable Recipes
        DisableRecipes dr = new DisableRecipes(this);
        dr.disableRecipes();
    }

    public void onDisable() {

        //Unregister Recipes
        ClearRecipes cr = new ClearRecipes(this);
        cr.clearRecipes();

        //Log Plugin Disabled
        getLogger().log(Level.INFO, ChatColor.DARK_RED + "Plugin Disabled.");
    }
}