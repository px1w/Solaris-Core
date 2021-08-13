package com.solaris.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {  return true; }
        Player player = (Player) sender;
        if (player.hasPermission("solariscore.feed")) {

            // Feed command
            if (cmd.getName().equalsIgnoreCase("feed"))
                player.setFoodLevel(20);
            player.sendMessage(ChatColor.LIGHT_PURPLE + "Player has been fed!");

            return true;
        }
        return true;
    }
}