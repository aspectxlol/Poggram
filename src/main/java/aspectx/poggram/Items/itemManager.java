package aspectx.poggram.Items;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class itemManager {
    public static ItemStack StarterPickaxe;

    public static void init() {
        createStarterPickaxe();
    }

    public static void createStarterPickaxe() {
        ItemStack item = new ItemStack(Material.WOODEN_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        Objects.requireNonNull(meta).setDisplayName("§6starter Pickaxe");
        List<String> lore = new ArrayList<>();
        lore.add("§7Your first item");
        lore.add("");
        lore.add("§6Legendary");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);

        StarterPickaxe = item;
    }
}
