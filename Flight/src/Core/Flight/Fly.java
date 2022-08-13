package Core.Flight;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {

    public void Fly() {
    }

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("Players can only use this");
            return false;
        }

        // Checks if said player has permissions
        Player player = (Player) commandSender;
        if (!player.hasPermission("Flight")) {
            player.sendMessage(Util.Color(ChatColor.RED + " You don't have permission"));
            return false;
        }
        // Gives Player Flight Permissions
        if (!player.getAllowFlight()) {
            player.setAllowFlight(true);
            player.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "[Core༉◠⋆] " + (ChatColor.GREEN + ": Fly has been enabled..."));

        } else {

            // Sets Flight Permissions to false
            player.setAllowFlight(false);
            player.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "[Core༉◠⋆] " + (ChatColor.GREEN + ": Fly has been disabled..."));

        }
        return true;

    }
}