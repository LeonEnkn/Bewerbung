package tv.jackifurz.bewerbung.io;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

import tv.jackifurz.bewerbung.Main;

public class Config 
{
    Main plugin;
	public Config(Main plugin)
	{
		this.plugin = plugin;
	}
	public File file;
	public YamlConfiguration configfile = new YamlConfiguration();
	
	public void load()
	{

		if(!new File("config.yml").exists())
		{
			file = new File("confi.yml");
		}
		
		try
        {
			configfile.load(file);
			plugin._CONSOLE.sendMessage("§aConfig successfully loaded!");
		} catch (IOException | InvalidConfigurationException e) 
		{
			plugin._CONSOLE.sendMessage("§4Error loading the Config File!");
		}
	}
	
	public void setString(String path, String name, String value)
	{
		configfile.set(path + "." + name, value);
		try 
		{
			configfile.save(file);
		} catch (IOException e) 
		{
			plugin._CONSOLE.sendMessage("§4Config cannot be saved!");
		}
	}
	
	public void setLocation(String path, String name, Location value)
	{
		configfile.set(path + "." + name, value.toVector());
		try 
		{
			configfile.save(file);
		} catch (IOException e) 
		{
			plugin._CONSOLE.sendMessage("§4Config cannot be saved!");
		}
	}
	
	public void setDouble(String path, String name, double value)
	{
		configfile.set(path + "." + name, value);
		try 
		{
			configfile.save(file);
		} catch (IOException e) 
		{
			plugin._CONSOLE.sendMessage("§4Config cannot be saved!");
		}
	}
	
	public String getString(String path, String name)
	{
		String string = configfile.getString(path + "." + name);
		return string;
	}
	
	public double getDouble(String path, String name)
	{
		double d = configfile.getDouble(path + "." + name);
		return d;
	}
	
	public Location getLocation(String path, String name)
	{
		double X = configfile.getVector(path + "." + name).getX();
		double Y = configfile.getVector(path + "." + name).getY();
		double Z = configfile.getVector(path + "." + name).getZ();
		
		World w = Bukkit.getWorld(getString("LobbyWorld", "name"));
		
		Location loc = new Location(w, Y, Z, X);
		
		return loc;
	}
	
}
