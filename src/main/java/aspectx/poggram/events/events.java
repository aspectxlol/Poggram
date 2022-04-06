package aspectx.poggram.events;

import aspectx.poggram.Items.itemManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class events implements Listener {
    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (Objects.equals(event.getItem().getItemMeta(), itemManager.StarterPickaxe.getItemMeta())) {
                    Player player = event.getPlayer();
                    player.sendMessage("§6Why are you right clicking it, its just a pickaxe. 0_o");
                }
            }
        }
    }
}

