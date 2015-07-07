package tv.jackifurz.bewerbung.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import tv.jackifurz.bewerbung.Main;

public class PlayerQuitManager implements Listener
{
   public Main plugin;
   public PlayerQuitManager(Main plugin){this.plugin = plugin;}
   @EventHandler
   public void onJoin(PlayerQuitEvent e)
   {
	   Player p = e.getPlayer();
	   
	   plugin.online.remove(p);
	   
	   /** If the members already have colored prefixes, use this code:*/
	   e.setQuitMessage("§7>> Der Spieler " + p.getDisplayName() + " §7verlässt den Server![§4-]");
	   
	   /**If not, use: e.setJoinMessage("§7>> Der Spieler §e" + p.getName() + " §7verlässt den server!"); */
	   
	   for(int i = 0; i >= 100; i++)
	   {
		   p.sendMessage("                                       ");
	   }

   }
}
