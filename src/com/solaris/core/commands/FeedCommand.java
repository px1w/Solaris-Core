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

        // Feed command
        if (cmd.getName().equalsIgnoreCase("feed"))
            player.setFoodLevel(20);

        return true;
    }
}