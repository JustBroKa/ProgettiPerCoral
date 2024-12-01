package com.metix;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

@SuppressWarnings("deprecation")
public class Listeners implements Listener {
    @EventHandler
    public void OnJoin(PlayerJoinEvent pJoin) {
        Bukkit.getServer().broadcastMessage(pJoin.getPlayer().getName() + " è entrato nel server");
    }

    @EventHandler
    public void CheCazzoEMeglio(PlayerInteractEvent e) {
        if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (e.getPlayer().getInventory().getItemInHand() != null && !e.getPlayer().getInventory().getItemInHand().getType().equals(Material.AIR)) {
                e.getPlayer().sendMessage("hai in mano un: " + e.getPlayer().getInventory().getItemInHand().toString());
            }
        }
    }
    @EventHandler
    public void OnClickInventory(InventoryClickEvent clickInv) {
    if (clickInv.getCurrentItem()==null) {
        return;
        }
        if(clickInv.getClickedInventory().equals("Lobby Pvp")) {
            clickInv.setCancelled(true);
            if (clickInv.getCurrentItem().getItemMeta().getDisplayName().equals("Crystal Pvp")) {
                System.out.println("hai appena cliccato il crystal");
                clickInv.setCancelled(true);
                }
            }
        }
    @EventHandler
    public void OpenInv(InventoryOpenEvent clickInv) {
        OnClickInventory();
    }





}



