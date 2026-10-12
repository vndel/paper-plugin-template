package com.fivemcodehub.template;

import org.bukkit.plugin.java.JavaPlugin;

public final class ExamplePlugin extends JavaPlugin {
    @Override public void onEnable() {
        saveDefaultConfig();
        getLogger().info("Example plugin enabled");
    }

    @Override public void onDisable() {
        getLogger().info("Example plugin disabled");
    }
}
