package me.jaymar.ce3.Utility;

import me.jaymar.ce3.Data.EntityData.CE_Player;
import me.jaymar.ce3.Data.EntityData.PlayerSkills;
import me.jaymar.ce3.Enum.Skill;
import me.jaymar.ce3.Enum.Skills.AGILITY;
import me.jaymar.ce3.Enum.Skills.INTELLIGENCE;
import me.jaymar.ce3.Enum.Skills.STRENGTH;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.checkerframework.checker.units.qual.C;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CE_Utility {



    public static boolean Registered(Player player){
        return true;
    }

    public static void registerPlayer(Player player){

    }

    public static CE_Player getPlayer(Player player){
        return new CE_Player();
    }


    // max of 1000 levels, player will no longer getting points if it reaches 185 levels and above
    public static void giveExp(Player player, double exp){

    }


    public static String getRankIcon(CE_Player player){
        return "";
    }


    public static void giveItem(Player player, ItemStack itemStack){
        if(player.getInventory().firstEmpty() != -1)
            player.getInventory().addItem(itemStack);
        else
            player.getWorld().dropItemNaturally(player.getLocation(),itemStack);
    }

    public static void removeItem(Player player, ItemStack item){
        ItemStack[] items = player.getInventory().getContents();
        ItemStack[] items_clone = new ItemStack[items.length];
        for(int i = 0; i < items.length; i++){
            items_clone[i] = items[i];
            if(items[i]!=null){
                if(items[i].equals(item)){
                    items_clone[i] = null;
                }
            }
        }
        player.getInventory().setContents(items_clone);
    }

}
