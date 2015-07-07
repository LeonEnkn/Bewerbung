package tv.jackifurz.bewerbung.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import tv.jackifurz.bewerbung.Main;

public class PlayerJoinManager implements Listener
{
   public Main plugin;
   public PlayerJoinManager(Main plugin){this.plugin = plugin;}
   @EventHandler
   public void onJoin(PlayerJoinEvent e)
   {
	   Player p = e.getPlayer();
	   
	   plugin.online.add(p);
	   
	   /** If the members already have colored prefixes, use this code:*/
	   e.setJoinMessage("§7>> Der Spieler " + p.getDisplayName() + " §7betritt den Server![§a+]");
	   
	   /**If not, use: e.setJoinMessage("§7>> Der Spieler §e" + p.getName() + " §7betritt den server!"); */
	   
	   for(int i = 0; i >= 100; i++)
	   {
		   p.sendMessage("                                       ");
	   }
	   
	   p.sendMessage("§6 §kll  §5Willkommen auf §cKein§aLeben§7.net§r  §6§kll ");
	   
   }
}
