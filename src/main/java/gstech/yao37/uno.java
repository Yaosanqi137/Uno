package gstech.yao37;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class uno extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        this.getCommand("uhelp").setExecutor(new CommandKit());
        getServer().getPluginManager().registerEvents(new MyListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
