package tv.jackifurz.bewerbung;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
   /** Objects */
	
	public Server _SERVER = Bukkit.getServer();
	public ConsoleCommandSender _CONSOLE = _SERVER.getConsoleSender();
	
   /**--END--*/
	
	
   @Override
   public void onEnable()
   {
	   _CONSOLE.sendMessage("§4Lobby§fTools §6succesfully §aactivated!");
   }
   
   @Override
   public void onDisable()
   {
	   _CONSOLE.sendMessage("§4Lobby§fTools §6succesfully §4stopped!!");
   }
}
