package me.jaymar.ce3.Data.Enchantments;

import me.jaymar.ce3.Enum.ItemClass;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class CustomEnchantWrapper extends Enchantment {

    private final String name;
    private final int maxLvl;
    private final ItemClass itemClass;
    private final ChatColor color;


    public CustomEnchantWrapper(String namespace, String name, int lvl, ItemClass itemClass, ChatColor color){
        super(NamespacedKey.minecraft(namespace));
        this.name = name;
        maxLvl = lvl;
        this.itemClass = itemClass;
        this.color = color;
    }
    @Override
    public @NotNull
    String getName() {
        return name;
    }

    @Override
    public int getMaxLevel() {
        return maxLvl;
    }

    @Override
    public int getStartLevel() {
        return 0;
    }

    @Override
    public @NotNull
    EnchantmentTarget getItemTarget() {
        return null;
    }

    @Override
    public boolean isTreasure() {
        return false;
    }

    @Override
    public boolean isCursed() {
        return false;
    }

    @Override
    public boolean conflictsWith(@NotNull Enchantment other) {
        return false;
    }

    @Override
    public boolean canEnchantItem(@NotNull ItemStack item) {
        return false;
    }

    public ItemClass getItemClass(){return itemClass;}

    public ChatColor getColor(){return color;}
}
