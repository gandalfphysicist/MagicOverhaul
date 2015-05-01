package com.gmail.gandalfphysicist.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ArcaneCraftingTableListener implements Listener {

    public Inventory createInventory(Player player) {
        return Bukkit.getServer().createInventory(player, 27, ChatColor.BLUE + "Arcane Crafting Table");
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {

        Player user = event.getPlayer();

        ItemStack BookCrafting = new ItemStack(Material.BOOK);
        ItemMeta mBookCrafting = BookCrafting.getItemMeta();
        mBookCrafting.setDisplayName(ChatColor.BLUE + "Book Crafting");
        ArrayList<String> BookCraftingLore = new ArrayList<String>();
        BookCraftingLore.add("MagicOverhaul GUI");
        mBookCrafting.setLore(BookCraftingLore);
        BookCrafting.setItemMeta(mBookCrafting);

        ItemStack Alchemy = new ItemStack(Material.BREWING_STAND_ITEM);
        ItemMeta mAlchemy = Alchemy.getItemMeta();
        mAlchemy.setDisplayName(ChatColor.BLUE + "Alchemy");
        ArrayList<String> AlchemyLore = new ArrayList<String>();
        AlchemyLore.add("MagicOverhaul GUI");
        mAlchemy.setLore(AlchemyLore);
        Alchemy.setItemMeta(mAlchemy);

        ItemStack Enchanting = new ItemStack(Material.ENCHANTMENT_TABLE);
        ItemMeta mEnchanting = Enchanting.getItemMeta();
        mEnchanting.setDisplayName(ChatColor.BLUE + "Enchanting");
        ArrayList<String> EnchantingLore = new ArrayList<String>();
        EnchantingLore.add("MagicOverhaul GUI");
        mEnchanting.setLore(EnchantingLore);
        Enchanting.setItemMeta(mEnchanting);

        ItemStack glass = new ItemStack(Material.STAINED_GLASS, 1, (short) 7);
        ItemMeta mglass = glass.getItemMeta();
        mglass.setDisplayName(" ");
        ArrayList<String> glassLore = new ArrayList<String>();
        glassLore.add("MagicOverhaul GUI");
        mglass.setLore(glassLore);
        glass.setItemMeta(mglass);

        ItemStack planks = new ItemStack(Material.WOOD, 1, (short) 1);
        ItemMeta mplanks = planks.getItemMeta();
        mplanks.setDisplayName(" ");
        ArrayList<String> planksLore = new ArrayList<String>();
        planksLore.add("MagicOverhaul GUI");
        mplanks.setLore(planksLore);
        planks.setItemMeta(mplanks);

        ItemStack andesite = new ItemStack(Material.STONE, 1, (short) 6);
        ItemMeta mandesite = andesite.getItemMeta();
        mandesite.setDisplayName(" ");
        ArrayList<String> andesiteLore = new ArrayList<String>();
        andesiteLore.add("MagicOverhaul GUI");
        mandesite.setLore(andesiteLore);
        andesite.setItemMeta(mandesite);

        ItemStack lapis = new ItemStack(Material.LAPIS_BLOCK);
        ItemMeta mlapis = lapis.getItemMeta();
        mlapis.setDisplayName(" ");
        ArrayList<String> lapisLore = new ArrayList<String>();
        lapisLore.add("MagicOverhaul GUI");
        mlapis.setLore(lapisLore);
        lapis.setItemMeta(mlapis);

        Inventory act = this.createInventory(user);

        act.setItem(0, glass);
        act.setItem(1, glass);
        act.setItem(2, glass);
        act.setItem(3, glass);
        act.setItem(4, glass);
        act.setItem(5, glass);
        act.setItem(6, glass);
        act.setItem(7, glass);
        act.setItem(8, glass);
        act.setItem(9, glass);
        act.setItem(10, glass);
        act.setItem(11, glass);
        act.setItem(12, glass);
        act.setItem(13, glass);
        act.setItem(14, glass);
        act.setItem(15, glass);
        act.setItem(16, glass);
        act.setItem(17, glass);
        act.setItem(18, glass);
        act.setItem(19, glass);
        act.setItem(20, glass);
        act.setItem(21, glass);
        act.setItem(22, glass);
        act.setItem(23, glass);
        act.setItem(24, glass);
        act.setItem(25, glass);
        act.setItem(26, glass);

        Action action = event.getAction();
        Block block = event.getClickedBlock();
        if (action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (block.getType() == Material.SMOOTH_BRICK) {
                if (user.isSneaking() && user.hasPermission("MagicOverhaul.crafting.use")) {
                    for (BlockFace blockface : BlockFace.values()) {
                        if (block.getRelative(blockface).getType() == Material.BREWING_STAND) {
                            act.setItem(0, andesite);
                            act.setItem(1, andesite);
                            act.setItem(2, andesite);
                            act.setItem(9, andesite);
                            act.setItem(10, Alchemy);
                            act.setItem(11, andesite);
                            act.setItem(18, andesite);
                            act.setItem(19, andesite);
                            act.setItem(20, andesite);
                        }
                        if (block.getRelative(blockface).getType() == Material.BOOKSHELF) {
                            act.setItem(3, planks);
                            act.setItem(4, planks);
                            act.setItem(5, planks);
                            act.setItem(12, planks);
                            act.setItem(13, BookCrafting);
                            act.setItem(14, planks);
                            act.setItem(21, planks);
                            act.setItem(22, planks);
                            act.setItem(23, planks);
                        }
                        if (block.getRelative(blockface).getType() == Material.ENCHANTMENT_TABLE) {
                            act.setItem(6, lapis);
                            act.setItem(7, lapis);
                            act.setItem(8, lapis);
                            act.setItem(15, lapis);
                            act.setItem(16, Enchanting);
                            act.setItem(17, lapis);
                            act.setItem(24, lapis);
                            act.setItem(25, lapis);
                            act.setItem(26, lapis);
                        }
                    }
                    user.openInventory(act);
                }
            }
        }
    }
}