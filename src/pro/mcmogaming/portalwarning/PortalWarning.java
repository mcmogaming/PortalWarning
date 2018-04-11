package pro.mcmogaming.portalwarning;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class PortalWarning extends JavaPlugin implements Listener{
	
	FileConfiguration config = this.getConfig();
	
	
	@Override
	public void onEnable() {
		config.addDefault("Prefix","[Quietdayz]");
		config.addDefault("Message for Player", " Beware, you can loose your items in this new dimension");
		config.options().copyDefaults(true);
	    saveConfig();
		
		getServer().getPluginManager().registerEvents(this, this);
		
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	@EventHandler
	public void onPortalEvent(PlayerPortalEvent event) {
		
		
			event.getPlayer().sendMessage( ChatColor.RED + config.getString("Prefix") + ChatColor.WHITE + config.get("Message for Player"));	
		
	}
	
	

}
