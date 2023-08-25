package com.github.simaodiazz.mining;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    public static Main getInstance() {
        return instance;
    }
}
