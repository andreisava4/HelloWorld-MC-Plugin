package me.andreisava4.HelloWorld;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		// startup
		// reloads
		// plugin reloads
	}
	
	@Override
	public void onDisable() {
		//shutdown
		// reloads
		// plugin reloads
	}
	
	// /hello <-- Hey welcome!
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("hello")) {
			if (sender instanceof Player) {
				// player
				Player player = (Player) sender;
				if (player.hasPermission("hello.use")) {
					player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Hey welcome to the server!");
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&1H&2a&3v&4e &5f&6u&7n&8!"));
					return true;
				}
				player.sendMessage(ChatColor.DARK_RED + "You do not have permission to use this command!");
				return true;
			}
			else {
				// console
				sender.sendMessage("Hey console!");
				return true;
			}
		}
		
		return false;
	}

}
