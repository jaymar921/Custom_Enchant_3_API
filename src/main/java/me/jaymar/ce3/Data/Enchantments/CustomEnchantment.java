package me.jaymar.ce3.Data.Enchantments;

import me.jaymar.ce3.Enum.ItemClass;
import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;

import java.util.ArrayList;
import java.util.List;


public class CustomEnchantment {

    public static final List<CustomEnchantWrapper> ENCHANTMENTS_LIST = new ArrayList<>();

    public static final Enchantment LIFE_STEAL = new CustomEnchantWrapper("life_steal","Life Steal",3, ItemClass.SWORD, ChatColor.RED);
    public static final Enchantment BLEED = new CustomEnchantWrapper("bleed","Bleed",3, ItemClass.SWORD,ChatColor.RED);
    public static final Enchantment CRITICAL = new CustomEnchantWrapper("critical","Critical",5, ItemClass.SWORD,ChatColor.WHITE);
    public static final Enchantment POISON = new CustomEnchantWrapper("poison","Poison",2, ItemClass.SWORD,ChatColor.GREEN);
    public static final Enchantment MAGIC_RESIST = new CustomEnchantWrapper("magic_resist","Magic Resist",4, ItemClass.ARMOR,ChatColor.AQUA);
    public static final Enchantment MANA_STEAL = new CustomEnchantWrapper("mana_steal","Mana Steal",5, ItemClass.SWORD,ChatColor.AQUA);
    public static final Enchantment EXECUTE = new CustomEnchantWrapper("execute","Execute",5, ItemClass.SWORD,ChatColor.DARK_RED);
    public static final Enchantment LIGHT_SPIRIT = new CustomEnchantWrapper("light_spirit","Light Spirit",5, ItemClass.SWORD,ChatColor.WHITE);
    public static final Enchantment SOUL_EATER = new CustomEnchantWrapper("soul_eater","Soul Eater",50001, ItemClass.SWORD,ChatColor.DARK_PURPLE);
    public static final Enchantment WIND_STRIKE = new CustomEnchantWrapper("wind_strike","Wind Strike",3, ItemClass.SWORD,ChatColor.GRAY);
    public static final Enchantment SUDDEN_BLOW = new CustomEnchantWrapper("sudden_blow","Sudden Blow",4, ItemClass.TRIDENT,ChatColor.AQUA);
    public static final Enchantment HAIL_STORM = new CustomEnchantWrapper("hail_storm","Hail Storm",3, ItemClass.TRIDENT,ChatColor.DARK_PURPLE);
    public static final Enchantment TANK = new CustomEnchantWrapper("tank","Tank",4, ItemClass.ARMOR,ChatColor.GRAY);
    public static final Enchantment REGAIN = new CustomEnchantWrapper("regain","Regain",1, ItemClass.CHESTPLATE,ChatColor.RED);
    public static final Enchantment POISONOUS_THORNS = new CustomEnchantWrapper("poisonous_thorns","Poisonous Thorns",6, ItemClass.CHESTPLATE,ChatColor.GREEN);
    public static final Enchantment FREEZE = new CustomEnchantWrapper("freeze","Freeze",3, ItemClass.LEGGINGS,ChatColor.DARK_AQUA);
    public static final Enchantment OMNI_VAMP = new CustomEnchantWrapper("omnivamp","Omni Vamp", 5, ItemClass.CHESTPLATE, ChatColor.RED);
    public static final Enchantment BLINDNESS = new CustomEnchantWrapper("blindness", "Blindness", 1, ItemClass.HELMET,ChatColor.DARK_GRAY);
    public static final Enchantment DOUBLE_JUMP = new CustomEnchantWrapper("double_jump", "Double Jump",1,ItemClass.BOOTS,ChatColor.GRAY);
    public static final Enchantment AUTO_FARM = new CustomEnchantWrapper("auto_farm","Auto Farm", 5, ItemClass.HOE,ChatColor.DARK_AQUA);
    public static final Enchantment VEIN_MINER = new CustomEnchantWrapper("vein_miner","Vein Miner", 5, ItemClass.PICKAXE,ChatColor.DARK_AQUA);
    public static final Enchantment DEFORESTATION = new CustomEnchantWrapper("deforestation","Deforestation", 5, ItemClass.AXE, ChatColor.DARK_AQUA);
    public static final Enchantment AUTO_REPAIR = new CustomEnchantWrapper("auto_repair", "Auto Repair", 5, ItemClass.GENERIC, ChatColor.GREEN);
    public static final Enchantment SUPER_NOVA = new CustomEnchantWrapper("super_nova", "Super Nova", 5, ItemClass.WAND, ChatColor.DARK_RED);
    public static final Enchantment LIGHTNING = new CustomEnchantWrapper("lightning","Lightning", 5, ItemClass.WAND,ChatColor.AQUA);
    public static final Enchantment HEALING = new CustomEnchantWrapper("healing","Healing", 3, ItemClass.WAND,ChatColor.RED);
    public static final Enchantment LEVITATE = new CustomEnchantWrapper("levitate","Levitate", 5, ItemClass.WAND,ChatColor.GREEN);
    public static final Enchantment NEBULA = new CustomEnchantWrapper("nebula","Nebula", 8, ItemClass.WAND,ChatColor.LIGHT_PURPLE);
    public static final Enchantment SHARP_ARROW = new CustomEnchantWrapper("sharp_arrow","Sharp Arrow", 10, ItemClass.BOW,ChatColor.GRAY);
    public static final Enchantment STUN = new CustomEnchantWrapper("stun","Stun", 3, ItemClass.BOW,ChatColor.GRAY);
    public static final Enchantment FROST_ARROW = new CustomEnchantWrapper("frost_arrow","Frost Arrow", 5, ItemClass.BOW,ChatColor.AQUA);
    public static final Enchantment FOCUS_FIRE = new CustomEnchantWrapper("focus_fire","Focus Fire", 3, ItemClass.BOW,ChatColor.BLUE);
    public static final Enchantment DEATH_ANGEL = new CustomEnchantWrapper("death_angel","Death Angel", 5, ItemClass.BOW,ChatColor.WHITE);
    public static final Enchantment IMPLANT = new CustomEnchantWrapper("implant","Implant", 5, ItemClass.BOW,ChatColor.DARK_PURPLE);
    public static final Enchantment STORM = new CustomEnchantWrapper("storm","Storm", 15, ItemClass.WAND,ChatColor.AQUA);
    public static final Enchantment MANA_SHIELD = new CustomEnchantWrapper("mana_shield","Mana Shield", 12, ItemClass.SHIELD,ChatColor.AQUA);
    public static final Enchantment MANA_BURN = new CustomEnchantWrapper("mana_burn","Mana Burn", 5, ItemClass.WAND,ChatColor.AQUA);
    public static final Enchantment STURDY = new CustomEnchantWrapper("sturdy","Sturdy", 5, ItemClass.SHIELD,ChatColor.DARK_BLUE);
    public static final Enchantment DEATH_RAY = new CustomEnchantWrapper("death_ray","Death Ray", 3, ItemClass.BOW,ChatColor.DARK_PURPLE);
    public static final Enchantment BLINK = new CustomEnchantWrapper("blink","Blink", 3, ItemClass.BOOTS,ChatColor.GREEN);
    public static final Enchantment JUGGERNAUT = new CustomEnchantWrapper("juggernaut","Juggernaut", 8, ItemClass.SWORD,ChatColor.DARK_RED);
    public static final Enchantment WIND_SLASHER = new CustomEnchantWrapper("wind_slasher","Wind Slasher", 3, ItemClass.SWORD,ChatColor.GRAY);
    public static final Enchantment FIREBALL = new CustomEnchantWrapper("fire_ball","Fire Ball", 10, ItemClass.WAND,ChatColor.RED);

    public static void registerEnchantments(){
        EnchantsRegistry.register(LIFE_STEAL);
        EnchantsRegistry.register(BLEED);
        EnchantsRegistry.register(CRITICAL);
        EnchantsRegistry.register(POISON);
        EnchantsRegistry.register(MAGIC_RESIST);
        EnchantsRegistry.register(MANA_STEAL);
        EnchantsRegistry.register(EXECUTE);
        EnchantsRegistry.register(LIGHT_SPIRIT);
        EnchantsRegistry.register(SOUL_EATER);
        EnchantsRegistry.register(WIND_STRIKE);
        EnchantsRegistry.register(SUDDEN_BLOW);
        EnchantsRegistry.register(HAIL_STORM);
        EnchantsRegistry.register(TANK);
        EnchantsRegistry.register(REGAIN);
        EnchantsRegistry.register(POISONOUS_THORNS);
        EnchantsRegistry.register(FREEZE);
        EnchantsRegistry.register(OMNI_VAMP);
        EnchantsRegistry.register(BLINDNESS);
        EnchantsRegistry.register(DOUBLE_JUMP);
        EnchantsRegistry.register(AUTO_FARM);
        EnchantsRegistry.register(VEIN_MINER);
        EnchantsRegistry.register(DEFORESTATION);
        EnchantsRegistry.register(AUTO_REPAIR);
        EnchantsRegistry.register(SUPER_NOVA);
        EnchantsRegistry.register(LIGHTNING);
        EnchantsRegistry.register(HEALING);
        EnchantsRegistry.register(LEVITATE);
        EnchantsRegistry.register(NEBULA);
        EnchantsRegistry.register(SHARP_ARROW);
        EnchantsRegistry.register(STUN);
        EnchantsRegistry.register(FROST_ARROW);
        EnchantsRegistry.register(FOCUS_FIRE);
        EnchantsRegistry.register(DEATH_ANGEL);
        EnchantsRegistry.register(IMPLANT);
        EnchantsRegistry.register(STORM);
        EnchantsRegistry.register(MANA_SHIELD);
        EnchantsRegistry.register(MANA_BURN);
        EnchantsRegistry.register(STURDY);
        EnchantsRegistry.register(DEATH_RAY);
        EnchantsRegistry.register(BLINK);
        EnchantsRegistry.register(JUGGERNAUT);
        EnchantsRegistry.register(WIND_SLASHER);
        EnchantsRegistry.register(FIREBALL);
    }

    public static void unregisterEnchantments(){
        EnchantsRegistry.unRegister(LIFE_STEAL);
        EnchantsRegistry.unRegister(BLEED);
        EnchantsRegistry.unRegister(CRITICAL);
        EnchantsRegistry.unRegister(POISON);
        EnchantsRegistry.unRegister(MAGIC_RESIST);
        EnchantsRegistry.unRegister(MANA_STEAL);
        EnchantsRegistry.unRegister(EXECUTE);
        EnchantsRegistry.unRegister(LIGHT_SPIRIT);
        EnchantsRegistry.unRegister(SOUL_EATER);
        EnchantsRegistry.unRegister(WIND_STRIKE);
        EnchantsRegistry.unRegister(SUDDEN_BLOW);
        EnchantsRegistry.unRegister(HAIL_STORM);
        EnchantsRegistry.unRegister(TANK);
        EnchantsRegistry.unRegister(REGAIN);
        EnchantsRegistry.unRegister(POISONOUS_THORNS);
        EnchantsRegistry.unRegister(FREEZE);
        EnchantsRegistry.unRegister(OMNI_VAMP);
        EnchantsRegistry.unRegister(BLINDNESS);
        EnchantsRegistry.unRegister(DOUBLE_JUMP);
        EnchantsRegistry.unRegister(AUTO_FARM);
        EnchantsRegistry.unRegister(VEIN_MINER);
        EnchantsRegistry.unRegister(DEFORESTATION);
        EnchantsRegistry.unRegister(AUTO_REPAIR);
        EnchantsRegistry.unRegister(SUPER_NOVA);
        EnchantsRegistry.unRegister(LIGHTNING);
        EnchantsRegistry.unRegister(HEALING);
        EnchantsRegistry.unRegister(LEVITATE);
        EnchantsRegistry.unRegister(NEBULA);
        EnchantsRegistry.unRegister(SHARP_ARROW);
        EnchantsRegistry.unRegister(STUN);
        EnchantsRegistry.unRegister(FROST_ARROW);
        EnchantsRegistry.unRegister(FOCUS_FIRE);
        EnchantsRegistry.unRegister(DEATH_ANGEL);
        EnchantsRegistry.unRegister(IMPLANT);
        EnchantsRegistry.unRegister(STORM);
        EnchantsRegistry.unRegister(MANA_SHIELD);
        EnchantsRegistry.unRegister(MANA_BURN);
        EnchantsRegistry.unRegister(STURDY);
        EnchantsRegistry.unRegister(DEATH_RAY);
        EnchantsRegistry.unRegister(BLINK);
        EnchantsRegistry.unRegister(JUGGERNAUT);
        EnchantsRegistry.unRegister(WIND_SLASHER);
        EnchantsRegistry.unRegister(FIREBALL);
    }

}
