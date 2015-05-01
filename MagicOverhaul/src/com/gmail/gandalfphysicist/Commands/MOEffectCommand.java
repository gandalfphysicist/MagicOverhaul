package com.gmail.gandalfphysicist.Commands;

import com.gmail.gandalfphysicist.MagicOverhaulMain;
import com.gmail.gandalfphysicist.Utils.CustomEffectCheck;
import com.gmail.gandalfphysicist.Utils.ItemStacks;
import com.gmail.gandalfphysicist.WeaponEffects.AddEffect;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;
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
                if (user.getItemInHand().getItemMeta().hasLore()) {
                    List<String> lore = user.getItemInHand().getItemMeta().getLore();
                    if (!CustomEffectCheck.hasCustomEffect(lore)) {
                        AddEffect.applyEffect(user, args[0], i);
                    } else {
                        user.sendMessage(ChatColor.DARK_RED + "This tool already has an effect.");
                        return true;
                    }
                }
                AddEffect.applyEffect(user, args[0], i);
            }
        }
        return true;
    }
}