package Core.Flight;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        getCommand("Fly").setExecutor(new Fly());
    }
}