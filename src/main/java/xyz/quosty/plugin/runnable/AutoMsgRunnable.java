package xyz.quosty.plugin.runnable;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import xyz.quosty.plugin.QHXPlugin;
import xyz.quosty.plugin.data.Config;
import xyz.quosty.plugin.util.ChatUtil;

public class AutoMsgRunnable implements Runnable
{

    private Config config;
    private int index;

    public AutoMsgRunnable(QHXPlugin plugin) {

        config = Config.getInstance();

        Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, this, 20L, 100L);

    }

    @Override
    public void run() {

        if(index >= config.autoMessages.size()){

            index = 0;
        }

        for(Player p : Bukkit.getOnlinePlayers()){

            p.sendMessage(ChatUtil.colored(config.autoMessages.get(index)));

        }
        ++index;
    }
}
