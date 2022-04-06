package aspectx.poggram.commands;

import aspectx.poggram.Items.itemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command!");
            return true;
        }

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("start")) {
            player.getInventory().addItem(itemManager.StarterPickaxe);
        }
        return true;
    }
}
