package xyz.quosty.plugin.data;

import java.util.List;

public class Config
{
    private static Config instance;
    public List<String> autoMessages;

    public Config() {

        Config.instance = this;

    }

    public static Config getInstance() {

        if (Config.instance == null) {

            new Config();

        }
        return Config.instance;
    }
}
