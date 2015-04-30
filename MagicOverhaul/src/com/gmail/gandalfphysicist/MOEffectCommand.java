package com.gmail.gandalfphysicist;

import com.gmail.gandalfphysicist.WeaponEffects.Poison;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class MOEffectCommand implements CommandExecutor {

    MagicOverhaulMain plugin;

    public MOEffectCommand(MagicOverhaulMain instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        if (sender instanceof Player) {
            UUID UUIDp = ((Player) sender).getUniqueId();
            Player user = Bukkit.getPlayer(UUIDp);

            if (commandLabel.equalsIgnoreCase("moeffect")) {
                if (args.length < 2) {
                    user.sendMessage(ChatColor.DARK_RED + "Syntax is /moeffect <effect> <level>");
                    return true;
                }
                String string = args[1];
                Integer i;
                try {
                    i = Integer.parseInt(string);
                } catch (Exception e) {
                    user.sendMessage(ChatColor.DARK_RED + "Syntax is /moeffect <effect> <level>");
                    return true;
                }
                if (args[0].equalsIgnoreCase("poison")) {
                    if (i > 0 && i < 3) {
                        Poison.addPoison(user.getItemInHand(), i, user);
                    }
                } else {
                    user.sendMessage(ChatColor.DARK_RED + "No such effect.");
                }
            }

        }
        return true;
    }

}
