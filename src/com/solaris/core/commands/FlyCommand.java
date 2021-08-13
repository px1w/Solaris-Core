package com.solaris.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.ServerOperator;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;
        if (player.hasPermission("solariscore.fly")) {

            // Fly Command
            if (cmd.getName().equalsIgnoreCase("fly"))
                player.setAllowFlight(true);
            {
                player.sendMessage(ChatColor.LIGHT_PURPLE + "Fly enabled!");
            }
            return true;
        }
    return true;
    }
}
