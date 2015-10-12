package com.gmail.falistos.TestPlugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin {

    public void onEnable() {
        Bukkit.getLogger().info("Plugin enabled !");
    }

}
