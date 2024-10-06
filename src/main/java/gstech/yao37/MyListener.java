package gstech.yao37;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class MyListener implements Listener {
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.broadcastMessage("+ " + event.getPlayer().getName());
    }
}
