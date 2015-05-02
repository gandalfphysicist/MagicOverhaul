package com.gmail.gandalfphysicist.Utils;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class RemoveItemsFromInventory {

    public static void removeInventoryItems(PlayerInventory inv, Material type, int amount, short damage) {
        ItemStack[] items = inv.getContents();
        for (int i = 0; i < items.length; i++) {
            ItemStack is = items[i];
            if (is != null && is.getType() == type && is.getDurability() == damage) {
                int newamount = is.getAmount() - amount;
                if (newamount > 0) {
                    is.setAmount(newamount);
                    break;
                } else {
                    items[i] = new ItemStack(Material.AIR);
                    amount = -newamount;
                    if (amount == 0) break;
                }
            }
        }
        inv.setContents(items);
    }
}
