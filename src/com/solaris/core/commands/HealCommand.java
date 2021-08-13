package com.solaris.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;


        // Heal command
        if (cmd.getName().equalsIgnoreCase("heal"))
            player.setHealth(20);
        player.sendMessage(ChatColor.LIGHT_PURPLE + "Player healed!");

        return true;
    }
}
