package xyz.quosty.plugin.data;

import org.bukkit.configuration.file.FileConfiguration;
import xyz.quosty.plugin.QHXPlugin;

public class DataPlugin
{

    private Config config;
    private QHXPlugin plugin;

    public DataPlugin() {
        this.config = Config.getInstance();
    }

    public void load() {

        (this.plugin = (QHXPlugin) QHXPlugin.getPlugin((Class)QHXPlugin.class)).saveDefaultConfig();

        FileConfiguration configuration = this.plugin.getConfig();

        this.config.autoMessages = configuration.getStringList("autoMessages");
    }
}