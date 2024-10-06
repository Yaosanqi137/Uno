package gstech.yao37;

import org.bukkit.plugin.java.JavaPlugin;

public final class uno extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("uno").setExecutor(new CommandUno());
        getServer().getPluginManager().registerEvents(new MyListener(), this);
        // Plugin startup logic
        System.out.println("------------------------------------------------");
        System.out.println("[Uno] Enabled");
        System.out.println("[Uno] Version: " + getDescription().getVersion());
        System.out.println("[Uno] Author: " + getDescription().getAuthors());
        System.out.println("------------------------------------------------");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("------------------------------------------------");
        System.out.println("[Uno] Disabled");
        System.out.println("[Uno] Good night bro...");
        System.out.println("------------------------------------------------");
    }
}
