package tv.jackifurz.bewerbung.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import tv.jackifurz.bewerbung.Main;

public class ItemManager implements Listener
{
	Main plugin;
	public ItemManager(Main plugin)
	{
		this.plugin = plugin;
	}
	/**-----ITEMS-----*/
	
	public ItemStack browselobby = new ItemStack(Material.NETHER_STAR);
	public ItemStack browsegame = new ItemStack(Material.COMPASS);
	public ItemStack website = new ItemStack(Material.GOLD_NUGGET);
	public ItemStack friends = new ItemStack(Material.SKULL_ITEM);
	
	/**-----END-----*/
	
	
	
	/**-----ItemMetas-----*/
	
	public ItemMeta browselobbymeta = browselobby.getItemMeta();
	public ItemMeta browsegamemeta = browsegame.getItemMeta();
	public ItemMeta websitemeta = website.getItemMeta();
	public ItemMeta friendmeta = friends.getItemMeta();
	
	/**-----End-----*/

    
	
	
	/**-----ItemMeta-Configuration-----*/
	
	public void initItems()
	{
		browselobbymeta.setDisplayName(plugin.getConfiguration().getString("LobbyBrowserItem", "name"));
	    browsegamemeta.setDisplayName(plugin.getConfiguration().getString("GameBrowserItem", "name"));
		websitemeta.setDisplayName(plugin.getConfiguration().getString("WebsiteItem", "name"));
		friendmeta.setDisplayName(plugin.getConfiguration().getString("FriendItem", "name"));
		
		browselobby.setItemMeta(browselobbymeta);
		browsegame.setItemMeta(browsegamemeta);
		website.setItemMeta(websitemeta);
		friends.setItemMeta(friendmeta);
	}
	
	/**-----END-----*/



	public void giveItems(Player p)
	{
		p.getInventory().clear();
		p.getInventory().setItem(0, browselobby);
		p.getInventory().setItem(2, browsegame);
		p.getInventory().setItem(6, website);
		p.getInventory().setItem(8, friends);
	}




}
