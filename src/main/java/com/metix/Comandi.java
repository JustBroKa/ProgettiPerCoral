package com.metix;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Comandi implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String nomeComando, String[] args) {
        if (sender instanceof Player) {
            if (cmd.getName().equalsIgnoreCase("pvplobby")) {
                Player p = (Player) sender;
                Gui gui = new Gui(p);
                gui.open();
            }
        }
        return false;
    }
}

