package tv.jackifurz.bewerbung.events;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemManager implements Listener
{

	/**-----ITEMS-----*/
	
	public ItemStack browselobby = new ItemStack(Material.NETHER_STAR);
	public ItemStack browsegame = new ItemStack(Material.COMPASS);
	public ItemStack website = new ItemStack(Material.GOLD_NUGGET);
	public ItemStack friends = new ItemStack(Material.SKULL);
	
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
		browselobbymeta.setDisplayName("§e§lSelect Lobby");
		browsegamemeta.setDisplayName("§1§lChoose Game");
		websitemeta.setDisplayName("§2KeinLeben.net's Website");
		friendmeta.setDisplayName("§5§lFriends");
		
		ArrayList<String> websitelore = new ArrayList<String>();
		websitemeta.setLore(websitelore);
	}
	
	/**-----END-----*/







}
