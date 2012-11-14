package edu.unca.nrodrigu.SpoutDemo;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.getspout.spoutapi.player.SpoutPlayer;


public class SpoutDemoListener implements Listener {
	
	 /*
     * reduce effects of gravity for all players as they join
     */
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
    	Player player = event.getPlayer();
		((SpoutPlayer) player).setGravityMultiplier(.1);
		((SpoutPlayer) player).setJumpingMultiplier(8);
    }

	public boolean checkPacket(Player arg0, Object arg1) {
		// TODO Auto-generated method stub
		return false;
	}
}
