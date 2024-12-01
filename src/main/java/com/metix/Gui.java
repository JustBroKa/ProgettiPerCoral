package com.metix;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class Gui {
    private Player p;
    public Gui(Player p) {
        this.p = p;
    }
    public ItemStack createButton(Material id, int amount, String display) {
        ItemStack Item = new ItemStack(id, amount);
        ItemMeta meta = Item.getItemMeta();
        meta.setDisplayName(display);
        Item.setItemMeta(meta);
        return Item;
    }

    public void open() {
        Inventory invPvp = Bukkit.createInventory(null, 27, "Lobby Pvp");
        invPvp.setItem(13, createButton(Material.END_CRYSTAL, 1, "Crystal Pvp"));
        this.p.openInventory(invPvp);
    }
}