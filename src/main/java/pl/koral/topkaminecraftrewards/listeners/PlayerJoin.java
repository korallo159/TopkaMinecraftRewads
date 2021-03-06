package pl.koral.topkaminecraftrewards.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.koral.topkaminecraftrewards.Database;
import pl.koral.topkaminecraftrewards.TopkaMinecraftRewards;

public class PlayerJoin implements Listener {

    private final Database db = TopkaMinecraftRewards.getInstance().getDatabase();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent ev){
        Bukkit.getScheduler().runTaskAsynchronously(TopkaMinecraftRewards.getInstance(), () -> db.initPlayer(ev.getPlayer()));
    }
}
