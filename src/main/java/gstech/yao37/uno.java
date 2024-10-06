package gstech.yao37;

import org.bukkit.plugin.java.JavaPlugin;

public final class uno extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("uno").setExecutor(new CommandUno());
        getServer().getPluginManager().registerEvents(new MyListener(), this);
        // Plugin startup logic
        System.out.println("------------------------------------------------");
        System.out.println("Enabled");
        System.out.println("Version: " + getDescription().getVersion());
        System.out.println("Author: " + getDescription().getAuthors());
        System.out.println("------------------------------------------------");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("------------------------------------------------");
        System.out.println("Disabled");
        System.out.println("Good night bro...");
        System.out.println("------------------------------------------------");
    }
}
