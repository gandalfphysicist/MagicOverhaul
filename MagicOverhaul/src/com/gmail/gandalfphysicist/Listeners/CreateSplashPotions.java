package com.gmail.gandalfphysicist.Listeners;

import com.gmail.gandalfphysicist.MagicOverhaulMain;
import com.gmail.gandalfphysicist.Utils.ItemStacks;
import com.gmail.gandalfphysicist.Utils.RemoveItemsFromInventory;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Furnace;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.util.Vector;

import java.util.HashMap;

public class CreateSplashPotions implements Listener {

    MagicOverhaulMain plugin;

    public CreateSplashPotions(MagicOverhaulMain instance) {
        plugin = instance;
    }

    @SuppressWarnings("deprecation")
    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        Player user = event.getPlayer();
        final Block eblock = event.getClickedBlock();
        if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (user.getItemInHand() != null && user.getItemInHand().getType() != Material.AIR) {
                if (user.getItemInHand().equals(ItemStacks.heal2Potion())) {
                    if (event.getClickedBlock().getType().equals(Material.FURNACE)) {
                        event.setCancelled(true);
                        if (event.getClickedBlock().getState().hasMetadata("HasPotions")) {
                            user.sendMessage(ChatColor.AQUA + "There is already a potion preparing.");
                            return;
                        }
                        if (event.getClickedBlock().getState() instanceof InventoryHolder) {
                            InventoryHolder ih = ((InventoryHolder) event.getClickedBlock().getState());
                            Inventory inv = ih.getInventory();
                            if (hasFuel(inv)) {
                                ItemStack fuel = inv.getItem(1);
                                int fuelAmount = fuel.getAmount();
                                if (fuelAmount > 1) {
                                    fuel.setAmount(fuelAmount - 1);
                                } else {
                                    fuel.setType(Material.AIR);
                                }
                                ItemStack potion = new ItemStack(Material.POTION, 1, (short) 8229);
                                RemoveItemsFromInventory.removeInventoryItems(user.getInventory(), Material.POTION, 1, (short) 8229);
                                Furnace furnace = (Furnace) event.getClickedBlock().getState().getData();
                                final BlockFace facing = furnace.getFacing();
                                Location loc = event.getClickedBlock().getLocation();
                                loc.add(0.5, 1.2, 0.5);
                                final Item item = loc.getWorld().dropItem(loc, potion);
                                item.setMetadata("Pickup", new FixedMetadataValue(plugin, true));
                                item.setVelocity(new Vector(0, 0, 0));
                                item.teleport(loc);
                                event.getClickedBlock().getState().setMetadata("HasPotions", new FixedMetadataValue(plugin, true));
                                final HashMap<Integer, ItemStack> saveInvList = new HashMap<Integer, ItemStack>();
                                for (int i = 0; i < inv.getSize(); i++) {
                                    if (inv.getItem(i) != null && inv.getItem(1).getType() != Material.AIR) {
                                        saveInvList.put(i, inv.getItem(i));
                                    }
                                }
                                inv.clear();
                                event.getClickedBlock().setType(Material.BURNING_FURNACE);
                                event.getClickedBlock().setData((byte) getFacing(facing));
                                plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                    @Override
                                    public void run() {
                                        if (eblock.getState().getType().equals(Material.BURNING_FURNACE)) {
                                            item.remove();
                                            ItemStack replacePotion = new ItemStack(Material.POTION, 1, (short) 16421);
                                            Location loc = item.getLocation();
                                            Item replaceItem = loc.getWorld().dropItem(loc, replacePotion);
                                            replaceItem.setVelocity(new Vector(0, 0, 0));
                                            item.teleport(loc);
                                            eblock.getState().removeMetadata("HasPotions", plugin);
                                            eblock.setType(Material.FURNACE);
                                            eblock.setData((byte) getFacing(facing));
                                            if (eblock.getState() instanceof InventoryHolder) {
                                                InventoryHolder ih = ((InventoryHolder) eblock.getState());
                                                Inventory inv = ih.getInventory();
                                                for (int i = 0; i < inv.getSize(); i++) {
                                                    inv.setItem(i, saveInvList.get(i));
                                                    saveInvList.remove(i);
                                                }
                                            }

                                        } else {
                                            item.removeMetadata("Pickup", plugin);
                                        }
                                    }
                                }, 20 * 5L);
                                return;
                            }
                            user.sendMessage(ChatColor.AQUA + "No fuel found");
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onClickBlock(PlayerInteractEvent event) {
        if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (event.getClickedBlock().getType().equals(Material.BURNING_FURNACE)) {
                if (event.getClickedBlock().getState().hasMetadata("HasPotions")) {
                    event.setCancelled(true);
                }
            }
        }
    }

    @EventHandler
    public void onClickWithAlchemicalFuel(PlayerInteractEvent event) {
        Player user = event.getPlayer();
        if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (event.getClickedBlock().getType().equals(Material.FURNACE)) {
                if (user.isSneaking()) {
                    if (user.getItemInHand().isSimilar(ItemStacks.alchemicalFlame())) {
                        if (event.getClickedBlock().getState() instanceof InventoryHolder) {
                            InventoryHolder inventoryHolder = (InventoryHolder) event.getClickedBlock().getState();
                            Inventory inventory = inventoryHolder.getInventory();
                            if (!event.getClickedBlock().getState().hasMetadata("HasPotions")) {
                                if (inventory.getItem(1) != null && inventory.getItem(1).getType() != Material.AIR) {
                                    if (inventory.getItem(1).isSimilar(ItemStacks.alchemicalFlame())) {
                                        int fuelAmount = inventory.getItem(1).getAmount();
                                        int addAmount = 64 - inventory.getItem(1).getAmount();
                                        int playerHandAmount = user.getItemInHand().getAmount();
                                        if (playerHandAmount < addAmount) {
                                            inventory.getItem(1).setAmount(fuelAmount + playerHandAmount);
                                            user.setItemInHand(new ItemStack(Material.AIR));
                                        } else {
                                            inventory.getItem(1).setAmount(fuelAmount + addAmount);
                                            user.getItemInHand().setAmount(playerHandAmount - addAmount);
                                        }
                                    } else {
                                        user.sendMessage(ChatColor.AQUA + "You must remove the other fuel before you can add the Alchemical Flame.");
                                    }
                                } else {
                                    inventory.setItem(1, new ItemStack(ItemStacks.alchemicalFlame()));
                                    inventory.getItem(1).setAmount(user.getItemInHand().getAmount());
                                    user.setItemInHand(new ItemStack(Material.AIR));
                                }
                            } else {
                                user.sendMessage("This furnace is marked as 'HasPotions'");
                            }
                        }
                    }
                }
            }
        }
    }


    @EventHandler
    public void onPickupItem(PlayerPickupItemEvent event) {
        if (event.getItem().hasMetadata("Pickup")) {
            event.setCancelled(true);
        }
    }

    public boolean hasFuel(Inventory inventory) {
        if (inventory.getItem(1) != null && inventory.getItem(1).getType() != Material.AIR) {
            if (inventory.getItem(1).isSimilar(ItemStacks.alchemicalFlame())) {
                return true;
            }
        }
        return false;
    }

    public Integer getFuel(Inventory inventory) {
        for (int i = 0; i < inventory.getSize(); i++) {
            if (inventory.getItem(i) != null && inventory.getItem(i).getType() != Material.AIR) {
                ItemStack is = inventory.getItem(i);
                if (is.isSimilar(ItemStacks.alchemicalFlame())) {
                    return is.getAmount();
                }
            }
        }
        return null;
    }

    public Integer getFuelSlot(Inventory inventory) {
        for (int i = 0; i < inventory.getSize(); i++) {
            if (inventory.getItem(i) != null && inventory.getItem(i).getType() != Material.AIR) {
                ItemStack is = inventory.getItem(i);
                if (is.isSimilar(ItemStacks.alchemicalFlame())) {
                    return i;
                }
            }
        }
        return null;
    }

    public int getFacing(BlockFace facing) {
        if (facing.equals(BlockFace.NORTH)) {
            return 2;
        }
        if (facing.equals(BlockFace.SOUTH)) {
            return 3;
        }
        if (facing.equals(BlockFace.WEST)) {
            return 4;
        }
        if (facing.equals(BlockFace.EAST)) {
            return 5;
        }
        return 2;
    }

}