package me.jaymar.ce3.Data.Enchantments;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class EnchantsRegistry {

    public static void register(Enchantment enchantment) {
        boolean registered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(enchantment);

        if(!registered)
            registerEnchantment(enchantment);
    }

    public static void registerEnchantment(Enchantment enchantment) {
        try {
            Field f = Enchantment.class.getDeclaredField("acceptingNew");
            f.setAccessible(true);
            f.set(null, true);
            Enchantment.registerEnchantment(enchantment);

            //Add to list
            CustomEnchantment.ENCHANTMENTS_LIST.add((CustomEnchantWrapper) enchantment);
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("deprecation")
    public static void unRegister(Enchantment enchantment) {
        try {
            Field keyField = Enchantment.class.getDeclaredField("byKey");

            keyField.setAccessible(true);
            @SuppressWarnings("unchecked")
            HashMap<NamespacedKey, Enchantment> byKey = (HashMap<NamespacedKey, Enchantment>) keyField.get(null);

            if(byKey.containsKey(enchantment.getKey())) {
                byKey.remove(enchantment.getKey());
            }
            Field nameField = Enchantment.class.getDeclaredField("byName");

            nameField.setAccessible(true);
            @SuppressWarnings("unchecked")
            HashMap<String, Enchantment> byName = (HashMap<String, Enchantment>) nameField.get(null);

            if(byName.containsKey(enchantment.getName())) {
                byName.remove(enchantment.getName());
            }
        } catch (Exception ignored) { }
    }
}
