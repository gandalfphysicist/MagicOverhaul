package com.gmail.gandalfphysicist.WeaponEffects;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class RemoveEffect {

    public static ItemStack removeEffect(ItemStack Item) {
        ItemStack item = new ItemStack(Item);
        ItemMeta itemMeta = item.getItemMeta();
        List<String> lore = itemMeta.getLore();
        List<String> replaceLore = itemMeta.getLore();
        for (String s : lore) {
            for (String e : EffectList.effects()) {
                if (s.startsWith(e)) {
                    replaceLore.remove(s);
                }
            }
        }
        itemMeta.setLore(replaceLore);
        item.setItemMeta(itemMeta);

        return item;
    }

}
