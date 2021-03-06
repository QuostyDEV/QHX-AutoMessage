package xyz.quosty.plugin.util;

import org.bukkit.ChatColor;

public class ChatUtil
{
    public static String colored(String s){
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
