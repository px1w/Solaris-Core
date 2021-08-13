package com.solaris.core;


import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import com.solaris.core.commands.FlyCommand;
import com.solaris.core.commands.FeedCommand;
import com.solaris.core.commands.HealCommand;


public class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        FlyCommand flycommand = new FlyCommand();
        HealCommand healcommand = new HealCommand();
        FeedCommand feedcommand = new FeedCommand();

        getCommand("heal").setExecutor(healcommand);

        getCommand("feed").setExecutor(feedcommand);

        getCommand("fly").setExecutor(flycommand);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[SolarisCore]: Plugin is enabled!");

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[SolarisCore]: Plugin is disabled!");
    }
}
