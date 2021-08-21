package io.gmijo.gmsw;


import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public final class GameModeSwitcher extends JavaPlugin {
    
	public void onEnable() {					
	}
	public void onDisable() {		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
			String prefix = (ChatColor.GRAY+"["+ChatColor.GOLD+"GMSW"+ChatColor.GRAY+"] ");
			Player targetPlayer = null;
			if(args.length == 1) {
				targetPlayer = Bukkit.getPlayer(args[0]);
			}
			
			switch (label) {
				case "gmc":
					if (sender instanceof Player) {
						Player p = (Player) sender;
						//executed by player
						if (args.length != 1) {
							if (p.getGameMode() == GameMode.CREATIVE) {
								sender.sendMessage(prefix + ChatColor.YELLOW + "Gamemode set already to "+ p.getGameMode());
							} else {
								p.setGameMode(GameMode.CREATIVE);
								sender.sendMessage(prefix + ChatColor.GREEN + "Gamemode set to "+ p.getGameMode());
							}
						} else if(targetPlayer != null && args.length == 1) {
							targetPlayer.setGameMode(GameMode.CREATIVE);
							targetPlayer.sendMessage(prefix + ChatColor.GREEN + "Your gamemode has been updated to "+ targetPlayer.getGameMode()+ " by Console");
							sender.sendMessage(prefix + ChatColor.GREEN+ targetPlayer.getName()+"'s gamemode has been updated to "+ targetPlayer.getGameMode());
						} else {
							sender.sendMessage(prefix + ChatColor.RED + "Player not found!");
						}
							
					}else {
						//executed by console & etc
						if(targetPlayer != null && args.length == 1) {
							targetPlayer.setGameMode(GameMode.CREATIVE);
							targetPlayer.sendMessage(prefix + ChatColor.GREEN + "Your gamemode has been updated to "+ targetPlayer.getGameMode()+ " by Console");
							Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.GREEN+ targetPlayer.getName()+"'s gamemode has been updated to "+ targetPlayer.getGameMode());
						} else if(targetPlayer == null && args.length == 1) {
							Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.RED + "Player not found!");
						}else {
							Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.RED+ "Command can't be executed using console!");
							return false;
						}
					}
					break;
				case "gms":
					if (sender instanceof Player) {
						Player p = (Player) sender;
						//executed by player
						if (args.length != 1) {
							if (p.getGameMode() == GameMode.SURVIVAL) {
								sender.sendMessage(prefix + ChatColor.YELLOW + "Gamemode set already to "+ p.getGameMode());
							} else {
								p.setGameMode(GameMode.SURVIVAL);
								sender.sendMessage(prefix + ChatColor.GREEN + "Gamemode set to "+ p.getGameMode());
							}
						} else if(targetPlayer != null && args.length == 1) {
							targetPlayer.setGameMode(GameMode.SURVIVAL);
							targetPlayer.sendMessage(prefix + ChatColor.GREEN + "Your gamemode has been updated to "+ targetPlayer.getGameMode()+ " by Console");
							sender.sendMessage(prefix + ChatColor.GREEN+ targetPlayer.getName()+"'s gamemode has been updated to "+ targetPlayer.getGameMode());
						} else {
							sender.sendMessage(prefix + ChatColor.RED + "Player not found!");
						}
							
					}else {
						//executed by console & etc
						if(targetPlayer != null && args.length == 1) {
							targetPlayer.setGameMode(GameMode.SURVIVAL);
							targetPlayer.sendMessage(prefix + ChatColor.GREEN + "Your gamemode has been updated to "+ targetPlayer.getGameMode()+ " by Console");
							Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.GREEN+ targetPlayer.getName()+"'s gamemode has been updated to "+ targetPlayer.getGameMode());
						} else if(targetPlayer == null && args.length == 1) {
							Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.RED + "Player not found!");
						}else {
							Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.RED+ "Command can't be executed using console!");
							return false;
						}
					}
					break;
				case "gmsp":
					if (sender instanceof Player) {
						Player p = (Player) sender;
						//executed by player
						if (args.length != 1) {
							if (p.getGameMode() == GameMode.SPECTATOR) {
								sender.sendMessage(prefix + ChatColor.YELLOW + "Gamemode set already to "+ p.getGameMode());
							} else {
								p.setGameMode(GameMode.SPECTATOR);
								sender.sendMessage(prefix + ChatColor.GREEN + "Gamemode set to "+ p.getGameMode());
							}
						} else if(targetPlayer != null && args.length == 1) {
							targetPlayer.setGameMode(GameMode.SPECTATOR);
							targetPlayer.sendMessage(prefix + ChatColor.GREEN + "Your gamemode has been updated to "+ targetPlayer.getGameMode()+ " by Console");
							sender.sendMessage(prefix + ChatColor.AQUA+ targetPlayer.getName()+"'s gamemode has been updated to "+ targetPlayer.getGameMode());
						} else {
							sender.sendMessage(prefix + ChatColor.RED + "Player not found!");
						}
							
					}else {
						//executed by console & etc
						if(targetPlayer != null && args.length == 1) {
							targetPlayer.setGameMode(GameMode.SPECTATOR);
							targetPlayer.sendMessage(prefix + ChatColor.GREEN + "Your gamemode has been updated to "+ targetPlayer.getGameMode()+ " by Console");
							Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.GREEN+ targetPlayer.getName()+"'s gamemode has been updated to "+ targetPlayer.getGameMode());
						} else if(targetPlayer == null && args.length == 1) {
							Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.RED + "Player not found!");
						}else {
							Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.RED+ "Command can't be executed using console!");
							return false;
						}
					}
					break;
				case "gma":
					if (sender instanceof Player) {
						Player p = (Player) sender;
						//executed by player
						if (args.length != 1) {
							if (p.getGameMode() == GameMode.ADVENTURE) {
								sender.sendMessage(prefix + ChatColor.YELLOW + "Gamemode set already to "+ p.getGameMode());
							} else {
								p.setGameMode(GameMode.ADVENTURE);
								sender.sendMessage(prefix + ChatColor.GREEN + "Gamemode set to "+ p.getGameMode());
							}
						} else if(targetPlayer != null && args.length == 1) {
							targetPlayer.setGameMode(GameMode.ADVENTURE);
							targetPlayer.sendMessage(prefix + ChatColor.GREEN + "Your gamemode has been updated to "+ targetPlayer.getGameMode()+ " by Console");
							sender.sendMessage(prefix + ChatColor.GREEN+ targetPlayer.getName()+"'s gamemode has been updated to "+ targetPlayer.getGameMode());
						} else {
							sender.sendMessage(prefix + ChatColor.RED + "Player not found!");
						}
							
					}else {
						//executed by console & etc
						if(targetPlayer != null && args.length == 1) {
							targetPlayer.setGameMode(GameMode.ADVENTURE);
							targetPlayer.sendMessage(prefix + ChatColor.AQUA + "Your gamemode has been updated to "+ targetPlayer.getGameMode()+ " by Console");
							Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.AQUA+ targetPlayer.getName()+"'s gamemode has been updated to "+ targetPlayer.getGameMode());
						} else if(targetPlayer == null && args.length == 1) {
							Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.RED + "Player not found!");
						}else {
							Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.RED+ "Command can't be executed using console!");
							return false;
						}
					}
					break;
				default:
					break;
			}
			return true;
			
		}
		
}
