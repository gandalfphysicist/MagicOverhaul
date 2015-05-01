package com.gmail.gandalfphysicist.Commands;

import com.gmail.gandalfphysicist.MagicOverhaulMain;
import org.bukkit.event.Listener;

public class RegisterCommands implements Listener {

    MagicOverhaulMain plugin;
    public RegisterCommands(MagicOverhaulMain instance) {
        plugin = instance;
    }

    public void registerCommands() {
        plugin.getCommand("moeffect").setExecutor(new MOEffectCommand(plugin));
        plugin.getCommand("data").setExecutor(new DataCommand(plugin));
    }
}
