package com.metix;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PrimoPlugin extends JavaPlugin {

    public static PrimoPlugin primoplugin;

    @Override
    public void onEnable() {
        primoplugin = this;
        // Plugin startup logic
        System.out.println("Il tuo primo plugin è stato avviato con successo");
        getCommand("pvplobby").setExecutor(new Comandi());
        Bukkit.getPluginManager().registerEvents(new Listeners(), this);
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                System.out.println("questo plugin si è avviato dopo 100 secondi");
            }
        }, 100);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin chiuso con successo");
    }
}
