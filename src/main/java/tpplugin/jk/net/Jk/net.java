package tpplugin.jk.net.Jk;

import org.bukkit.plugin.java.JavaPlugin;

public final class net extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        String name;
        getCommand(name "customtp").setExecutor(new Teleport());

    }

}
