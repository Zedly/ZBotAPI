package zedly.zbot.plugin;

import java.io.File;
import java.io.IOException;
import zedly.zbot.YamlConfiguration;
import zedly.zbot.self.Self;

public abstract class ZBotPlugin {

    private final YamlConfiguration pluginYml;
    private final ClassLoader loader;

    private YamlConfiguration config = null;

    public ZBotPlugin() {
        loader = getClass().getClassLoader();
        pluginYml = YamlConfiguration.read(loader.getResourceAsStream("plugin.yml"));
    }

    public String getName() {
        return pluginYml.getString("name", null);
    }

    public String getMainClass() {
        return pluginYml.getString("main", null);
    }

    public YamlConfiguration getConfig() {
        if (config == null) {
            reloadConfig();
        }
        return config;
    }

    public YamlConfiguration getDefaultConfig() {
        YamlConfiguration config = YamlConfiguration.read(loader.getResourceAsStream("config.yml"));
        return config;
    }

    public File getDataFolder() {
        return new File("plugins/" + getName());
    }

    public void createDataFolder() {
        getDataFolder().mkdir();
    }

    public void reloadConfig() {
        File file = new File(getDataFolder(), "config.yml");
        if (file.exists()) {
            config = YamlConfiguration.read(file);
        } else {
            config = getDefaultConfig();
        }
    }

    public void saveConfig() {
        try {
            config.save(new File(getDataFolder(), "config.yml"));
        } catch (IOException ex) {
            System.err.println("Could not save config for " + getName() + ": ");
            ex.printStackTrace();
        }
    }

    public void saveDefaultConfig(boolean overwrite) {
        File ymlFile = new File(getDataFolder(), "config.yml");
        if (!ymlFile.exists() || overwrite) {
            try {
                getDefaultConfig().save(ymlFile);
            } catch (IOException ex) {
                System.err.println("Could not save config for " + getName() + ": ");
                ex.printStackTrace();
            }
        }
    }

    public abstract void onEnable(Self self);

    public abstract void onDisable();

    public void onJoin() {
    }

    public void onQuit() {
    }

    public void onLoad() {
    }
}
