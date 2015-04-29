package com.gmail.gandalfphysicist;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MortarAndPestleGUIListener implements Listener {

    public Inventory createInventory(Player player) {
        return Bukkit.getServer().createInventory(player, 27, ChatColor.BLUE + "Mortar and Pestle");
    }

    public Inventory createInventory1(Player player) {
        return Bukkit.getServer().createInventory(player, 54, ChatColor.DARK_GREEN + "Mortar and Pestle");
    }

    public Inventory createInventory2(Player player) {
        return Bukkit.getServer().createInventory(player, 27, ChatColor.DARK_AQUA + "Salve Crafting");
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {

        Player user = event.getPlayer();

        Inventory MaP = this.createInventory(user);

        MaP.setItem(0, ItemStacks.bricks());
        MaP.setItem(1, ItemStacks.bricks());
        MaP.setItem(2, ItemStacks.bricks());
        MaP.setItem(3, ItemStacks.andesite());
        MaP.setItem(4, ItemStacks.andesite());
        MaP.setItem(5, ItemStacks.andesite());
        MaP.setItem(6, ItemStacks.bricks1());
        MaP.setItem(7, ItemStacks.bricks1());
        MaP.setItem(8, ItemStacks.bricks1());
        MaP.setItem(9, ItemStacks.bricks());
        MaP.setItem(10, ItemStacks.MAP());
        MaP.setItem(11, ItemStacks.bricks());
        MaP.setItem(12, ItemStacks.andesite());
        MaP.setItem(13, ItemStacks.andesite());
        MaP.setItem(14, ItemStacks.andesite());
        MaP.setItem(15, ItemStacks.bricks1());
        MaP.setItem(16, ItemStacks.salve());
        MaP.setItem(17, ItemStacks.bricks1());
        MaP.setItem(18, ItemStacks.bricks());
        MaP.setItem(19, ItemStacks.bricks());
        MaP.setItem(20, ItemStacks.bricks());
        MaP.setItem(21, ItemStacks.andesite());
        MaP.setItem(22, ItemStacks.andesite());
        MaP.setItem(23, ItemStacks.andesite());
        MaP.setItem(24, ItemStacks.bricks1());
        MaP.setItem(25, ItemStacks.bricks1());
        MaP.setItem(26, ItemStacks.bricks1());

        Action action = event.getAction();

        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (user.getInventory().getItemInHand().equals(ItemStacks.map()) && user.hasPermission("MagicOverhaul.mortarandpestle")) {
                user.openInventory(MaP);
            }
        }
    }

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {

        Player user = (Player) event.getWhoClicked();
        ItemStack item = event.getCurrentItem();

        Inventory MaP = this.createInventory1(user);
        Inventory Salve = this.createInventory2(user);

        if (item != null) {
            if (item.equals(ItemStacks.MAP())) {
                MaP.setItem(0, null);
                MaP.setItem(1, null);
                MaP.setItem(2, ItemStacks.bricks());
                MaP.setItem(3, ItemStacks.andesite());
                MaP.setItem(4, ItemStacks.andesite());
                MaP.setItem(5, ItemStacks.andesite());
                MaP.setItem(6, ItemStacks.andesite());
                MaP.setItem(7, ItemStacks.andesite());
                MaP.setItem(8, ItemStacks.andesite());
                MaP.setItem(9, null);
                MaP.setItem(10, null);
                MaP.setItem(11, ItemStacks.bricks());
                MaP.setItem(12, ItemStacks.andesite());
                MaP.setItem(13, ItemStacks.andesite());
                MaP.setItem(14, ItemStacks.andesite());
                MaP.setItem(15, ItemStacks.pestle());
                MaP.setItem(16, ItemStacks.andesite());
                MaP.setItem(17, ItemStacks.andesite());
                MaP.setItem(18, ItemStacks.bricks());
                MaP.setItem(19, ItemStacks.bricks());
                MaP.setItem(20, ItemStacks.bricks());
                MaP.setItem(21, ItemStacks.andesite());
                MaP.setItem(22, ItemStacks.andesite());
                MaP.setItem(23, ItemStacks.pestle());
                MaP.setItem(24, ItemStacks.andesite());
                MaP.setItem(25, ItemStacks.andesite());
                MaP.setItem(26, ItemStacks.andesite());
                MaP.setItem(27, ItemStacks.andesite());
                MaP.setItem(28, ItemStacks.andesite());
                MaP.setItem(29, ItemStacks.andesite());
                MaP.setItem(30, ItemStacks.andesite());
                MaP.setItem(31, ItemStacks.pestle());
                MaP.setItem(32, ItemStacks.andesite());
                MaP.setItem(33, ItemStacks.andesite());
                MaP.setItem(34, ItemStacks.andesite());
                MaP.setItem(35, ItemStacks.andesite());
                MaP.setItem(36, ItemStacks.andesite());
                MaP.setItem(37, ItemStacks.andesite());
                MaP.setItem(38, ItemStacks.planks());
                MaP.setItem(39, null);
                MaP.setItem(40, null);
                MaP.setItem(41, null);
                MaP.setItem(42, ItemStacks.planks());
                MaP.setItem(43, ItemStacks.andesite());
                MaP.setItem(44, ItemStacks.andesite());
                MaP.setItem(45, ItemStacks.andesite());
                MaP.setItem(46, ItemStacks.andesite());
                MaP.setItem(47, ItemStacks.andesite());
                MaP.setItem(48, ItemStacks.planks());
                MaP.setItem(49, ItemStacks.planks());
                MaP.setItem(50, ItemStacks.planks());
                MaP.setItem(51, ItemStacks.andesite());
                MaP.setItem(52, ItemStacks.andesite());
                MaP.setItem(53, ItemStacks.andesite());

                user.closeInventory();
                user.openInventory(MaP);
            }
            if (item.equals(ItemStacks.salve())) {
                Salve.setItem(0, ItemStacks.andesite());
                Salve.setItem(1, ItemStacks.andesite());
                Salve.setItem(2, ItemStacks.andesite());
                Salve.setItem(3, ItemStacks.andesite());
                Salve.setItem(4, ItemStacks.andesite());
                Salve.setItem(5, ItemStacks.andesite());
                Salve.setItem(6, ItemStacks.andesite());
                Salve.setItem(7, ItemStacks.andesite());
                Salve.setItem(8, ItemStacks.andesite());
                Salve.setItem(9, ItemStacks.planks());
                Salve.setItem(10, ItemStacks.glass());
                Salve.setItem(11, ItemStacks.glass());
                Salve.setItem(12, ItemStacks.planks());
                Salve.setItem(13, ItemStacks.andesite());
                Salve.setItem(14, ItemStacks.glass1());
                Salve.setItem(15, ItemStacks.glass1());
                Salve.setItem(16, ItemStacks.glass1());
                Salve.setItem(17, ItemStacks.andesite());
                Salve.setItem(18, ItemStacks.andesite());
                Salve.setItem(19, ItemStacks.planks());
                Salve.setItem(20, ItemStacks.planks());
                Salve.setItem(21, ItemStacks.andesite());
                Salve.setItem(22, ItemStacks.andesite());
                Salve.setItem(23, ItemStacks.andesite());
                Salve.setItem(24, ItemStacks.andesite());
                Salve.setItem(25, ItemStacks.andesite());
                Salve.setItem(26, ItemStacks.andesite());

                user.closeInventory();
                user.openInventory(Salve);
            }
        }
    }
}