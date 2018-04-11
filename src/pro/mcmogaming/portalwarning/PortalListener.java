package pro.mcmogaming.portalwarning;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

public class PortalListener implements Listener{
	
	PortalWarning plugin = new PortalWarning();
	
	@EventHandler
	public void onPortalEvent(PlayerPortalEvent event) {
		
	    //event.getPlayer().sendMessage(plugin.getInstance().config.getString("Prefix") + plugin.getInstance().config.getString("Message for Player"));
		event.getPlayer().sendMessage("Hello");
		
	}
	
	

}
