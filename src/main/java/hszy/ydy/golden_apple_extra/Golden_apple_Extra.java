package hszy.ydy.golden_apple_extra;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Golden_apple_Extra extends JavaPlugin {
    static int t,lvl;
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("golden_apple_extra Prepared");
        saveDefaultConfig();
        FileConfiguration c = getConfig();
        lvl = (c.getInt("regenerationlvl"));
        t =((int)(20*c.getDouble("regenerationtime")));
        getServer().getPluginManager().registerEvents(new MyListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("finished");
    }
}
