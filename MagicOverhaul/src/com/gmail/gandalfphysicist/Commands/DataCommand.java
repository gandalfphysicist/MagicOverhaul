package com.gmail.gandalfphysicist.Commands;

import com.gmail.gandalfphysicist.MagicOverhaulMain;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class DataCommand implements CommandExecutor {

    MagicOverhaulMain plugin;

    public DataCommand(MagicOverhaulMain instance) {
        plugin = instance;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        if (sender instanceof Player) {
            UUID UUIDp = ((Player) sender).getUniqueId();
            Player user = Bukkit.getPlayer(UUIDp);

            if (commandLabel.equalsIgnoreCase("data")) {
                if (user.getItemInHand() != null && user.getItemInHand().getType() != Material.AIR) {
                    user.sendMessage("Material Data is: " + user.getItemInHand().getData().toString());
                    user.sendMessage("Material is: " + user.getItemInHand().getType());
                    user.sendMessage("Material Damage is: " + user.getItemInHand().getDurability());

                    return true;
                }
            }

        }
        return false;
    }
}