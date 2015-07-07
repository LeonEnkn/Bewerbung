package tv.jackifurz.bewerbung.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;

import tv.jackifurz.bewerbung.Main;

public class PlayerKickManager implements Listener
{
    public Main plugin;
    public PlayerKickManager(Main plugin){this.plugin = plugin;}
	
   @EventHandler
   public void onJoin(PlayerKickEvent e)
   {
	   Player p = e.getPlayer();
	   
	   plugin.online.remove(p);
	   
	   /** If the members already have colored prefixes, use this code:*/
	   e.setLeaveMessage("�7>> Der Spieler " + p.getDisplayName() + " �7verl�sst den Server![�4-]");
	   
	   /**If not, use: e.setJoinMessage("�7>> Der Spieler �e" + p.getName() + " �7verl�sst den server!"); */
	   
	   for(int i = 0; i >= 100; i++)
	   {
		   p.sendMessage("                                       ");
	   }

   }
}
