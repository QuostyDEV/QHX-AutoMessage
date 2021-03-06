package xyz.quosty.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.quosty.plugin.data.DataPlugin;
import xyz.quosty.plugin.runnable.AutoMsgRunnable;

public class QHXPlugin extends JavaPlugin
{

    @Override
    public void onLoad() {

        DataPlugin dataPlugin = new DataPlugin();
        dataPlugin.load();

        super.onLoad();
    }

    @Override
    public void onEnable() {

        new AutoMsgRunnable(this);
        super.onEnable();
    }
}
