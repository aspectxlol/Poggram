package aspectx.poggram;

import aspectx.poggram.Items.itemManager;
import aspectx.poggram.commands.commands;
import aspectx.poggram.events.events;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Poggram extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new events(), this);
        Objects.requireNonNull(getCommand("start")).setExecutor(new commands());
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[PogGram] activated");
        itemManager.init();
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[PogGram] deactivated");
    }
}
