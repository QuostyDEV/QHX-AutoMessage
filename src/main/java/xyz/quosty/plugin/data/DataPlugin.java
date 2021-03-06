package xyz.quosty.plugin.data;

import org.bukkit.configuration.file.FileConfiguration;
import xyz.quosty.plugin.QHXPlugin;

import java.util.List;

public class DataPlugin implements Data
{

    private Config config;
    private QHXPlugin plugin;

    public DataPlugin() {
        this.config = Config.getInstance();
    }

    @Override
    public void load() {

        (this.plugin = (QHXPlugin) QHXPlugin.getPlugin((Class)QHXPlugin.class)).saveDefaultConfig();

        FileConfiguration configuration = this.plugin.getConfig();

        this.config.autoMessages = configuration.getStringList("autoMessages");
    }
}