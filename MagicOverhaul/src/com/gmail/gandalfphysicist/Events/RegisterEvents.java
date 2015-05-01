package com.gmail.gandalfphysicist.Events;

import com.gmail.gandalfphysicist.*;
import com.gmail.gandalfphysicist.GUI.ArcaneCraftingTableListener;
import com.gmail.gandalfphysicist.GUI.MortarAndPestleGUIListener;
import com.gmail.gandalfphysicist.Listeners.*;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

public class RegisterEvents implements Listener{

    MagicOverhaulMain plugin;
    public RegisterEvents(MagicOverhaulMain instance) {
        plugin = instance;
    }

    public void registerEvents() {

        PluginManager pm = plugin.getServer().getPluginManager();

        pm.registerEvents(new ArcaneCraftingTableListener(), plugin);
        pm.registerEvents(new InventoryClickCancelListener(), plugin);
        pm.registerEvents(new MortarAndPestleGUIListener(), plugin);
        pm.registerEvents(new GatherPoisonFromSpider(), plugin);
        pm.registerEvents(new PreventPotionUasage(), plugin);
        pm.registerEvents(new EntityAddWeaponEffect(), plugin);
        pm.registerEvents(new SalveCraftingListener(), plugin);
        pm.registerEvents(new MortarAndPestleUseListener(), plugin);

    }

}
