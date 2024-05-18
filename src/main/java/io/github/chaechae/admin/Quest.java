package io.github.chaechae.admin;



import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.awt.*;

import static javax.sound.sampled.FloatControl.Type.VOLUME;

public class Quest implements  CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Inventory gui = Bukkit.createInventory(null, 54, Color.green + "퀘스트");

            ItemStack item = new ItemStack(Material.DIAMOND);
            ItemMeta meta = item.getItemMeta();

            meta.setDisplayName(Color.ORANGE + "튜토리얼");
            item.setItemMeta(meta);
            gui.setItem(0, item);

            ((Player) sender).openInventory(gui);

            player.playSound(player.getLocation(), Sound.BLOCK_ENDER_CHEST_OPEN, 100f, 1.0f);
        }
        return true;
    }}



