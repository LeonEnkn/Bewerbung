package tv.jackifurz.bewerbung;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import tv.jackifurz.bewerbung.events.PlayerJoinManager;
import tv.jackifurz.bewerbung.events.PlayerKickManager;
import tv.jackifurz.bewerbung.events.PlayerQuitManager;
import tv.jackifurz.bewerbung.io.Config;

public class Main extends JavaPlugin
{
   
	//Vorab :
	//Ich nenne die Haupklasse Main, weil ich das so irgendwie
	//uebersichtlicher finde.
		
   /** Objects */
	
	public Server _SERVER = Bukkit.getServer();
	public ConsoleCommandSender _CONSOLE = _SERVER.getConsoleSender();
	
	/**An ArrayList that manages all online Players because the Bukkit Method is deprecated!!*/
	public ArrayList<Player> online = new ArrayList<Player>();
	
	public PluginManager pm = Bukkit.getPluginManager();
	
	public Config config = new Config(this);
	
	public PlayerJoinManager joinlistener = new PlayerJoinManager(this);
	public PlayerQuitManager quitlistener = new PlayerQuitManager(this);
	public PlayerKickManager kicklistener = new PlayerKickManager(this);
	
   /**--END--*/
	
	
   @Override
   public void onEnable()
   {
	   _CONSOLE.sendMessage("§4Lobby§fTools §6successfully §aactivated!");
	   registerEvents();
	   config.load();
   }
   
   @Override
   public void onDisable()
   {
	   _CONSOLE.sendMessage("§4Lobby§fTools §6successfully §4stopped!!");
   }
   
   
   public void registerEvents()
   {
	   pm.registerEvents(joinlistener, this);
   }
}
