package io.github.chaechae;

import io.github.chaechae.admin.Quest;
import org.bukkit.plugin.java.JavaPlugin;

public final class FTtools extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("툴 플러그인이 활성화됨");
        getCommand("q").setExecutor(new Quest());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("비활성화됨");
        // Plugin shutdown logic
    }
}
