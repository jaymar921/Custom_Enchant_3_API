package me.jaymar.ce3.Data.EntityData;

import me.jaymar.ce3.Data.Enchantments.EnchantmentsHolder;
import me.jaymar.ce3.PluginCore;
import me.jaymar.ce3.Utility.CE_Utility;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PlayerAdapter{

    private final Player player;
    private final CE_Player ce_player;
    private final Map<Enchantment,Integer> current_enchants;
    private final Map<Enchantment,Integer> off_hand_current_enchants;

    public PlayerAdapter(Player player){
        this.player = player;
        ce_player = CE_Utility.getPlayer(player);
        current_enchants = new HashMap<>();
        off_hand_current_enchants = new HashMap<>();

        ItemStack item = player.getInventory().getItemInMainHand();
        ItemMeta meta = item.getItemMeta();
        if(meta != null){
            if(meta.hasEnchants()){
                for(Enchantment enchantment : meta.getEnchants().keySet()){
                    current_enchants.put(enchantment,meta.getEnchantLevel(enchantment));
                }
            }
        }

        item = player.getInventory().getItemInOffHand();
        meta = item.getItemMeta();
        if(meta != null){
            if(meta.hasEnchants()){
                for(Enchantment enchantment : meta.getEnchants().keySet()){
                    off_hand_current_enchants.put(enchantment,meta.getEnchantLevel(enchantment));
                }
            }
        }
    }

    public double getMaxHealth(){
        return Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).getValue();
    }

    public double getHealth(){
        return player.getHealth();
    }

    public PlayerSkills getSkills(){
        return ce_player.getSkills();
    }

    public double getHealthRegen(){
        return ce_player.getHealthRegen();
    }

    public double getManaRegen(){
        return ce_player.getManaRegen();
    }

    public double getMovementSpeed(){
        return ce_player.getMovementSpeed();
    }

    public double getMana(){
        return ce_player.getMana();
    }

    public double getHunger(){
        return player.getFoodLevel();
    }

    public double getMaxMana(){
        return ce_player.getMaxMana();
    }

    public void addHealth(double health){
        setHealth(Math.min(getMaxHealth(),getHealth()+health));
    }

    public void setHealth(double health){
        player.setHealth(health);
    }

    public void addMana(double mana){
        setMana(Math.min(getMaxMana(), getMana()+mana));
    }

    public void consumeMana(double mana){
        if(getMana()<=mana)
            setMana(0);
        else setMana(getMana()-mana);
    }

    public void setMana(double mana){
        ce_player.setMana(mana);
    }

    public Player getPlayer(){
        return player;
    }

    public CE_Player getCE_Player(){
        return ce_player;
    }

    public Map<Enchantment,Integer> MainHandEnchantments(){
        return current_enchants;
    }

    public Map<Enchantment,Integer> OffHandEnchantments(){
        return off_hand_current_enchants;
    }

    public void addMagicDamage(double damage, LivingEntity source){
        damage *= 3; // 1 magic damage = 3 physical damage
        if(source instanceof Player){// if attacker is a player
            damage += (damage * new PlayerAdapter((Player) source).getSkills().SORCERER * 0.05); // add damage by 0.05 per sorcerer level
            damage += (damage * new PlayerAdapter((Player) source).getSkills().MAGE * 0.3); // add damage by 0.3 per mage level
        }
        player.damage(damage - (damage * getMagicResist()),source);
    }

    public double getMagicResist(){
        // get helmet level enchant magic resist
        int helmet = 0;
        int chestplate = 0;
        int leggings = 0;
        int boots = 0;
        //helmet
        if(getEnchants(player.getInventory().getHelmet()).containsKey(EnchantmentsHolder.MAGIC_RESIST))
            helmet = getEnchants(player.getInventory().getHelmet()).get(EnchantmentsHolder.MAGIC_RESIST);
        //chestplate
        if(getEnchants(player.getInventory().getChestplate()).containsKey(EnchantmentsHolder.MAGIC_RESIST))
            chestplate = getEnchants(player.getInventory().getChestplate()).get(EnchantmentsHolder.MAGIC_RESIST);
        // leggings
        if(getEnchants(player.getInventory().getLeggings()).containsKey(EnchantmentsHolder.MAGIC_RESIST))
            leggings = getEnchants(player.getInventory().getLeggings()).get(EnchantmentsHolder.MAGIC_RESIST);
        // boots
        if(getEnchants(player.getInventory().getBoots()).containsKey(EnchantmentsHolder.MAGIC_RESIST))
            boots = getEnchants(player.getInventory().getBoots()).get(EnchantmentsHolder.MAGIC_RESIST);

        return (((double) (helmet+chestplate+leggings+boots)/16)*100*0.5)/100; // basically 16 total levels is equivalent to 50% magic resist
    }

    public double getPhysicalResistance(){
        // get helmet level enchant magic resist
        int helmet = 0;
        int chestplate = 0;
        int leggings = 0;
        int boots = 0;
        //helmet
        if(getEnchants(player.getInventory().getHelmet()).containsKey(EnchantmentsHolder.TANK))
            helmet = getEnchants(player.getInventory().getHelmet()).get(EnchantmentsHolder.TANK);
        //chestplate
        if(getEnchants(player.getInventory().getChestplate()).containsKey(EnchantmentsHolder.TANK))
            chestplate = getEnchants(player.getInventory().getChestplate()).get(EnchantmentsHolder.TANK);
        // leggings
        if(getEnchants(player.getInventory().getLeggings()).containsKey(EnchantmentsHolder.TANK))
            leggings = getEnchants(player.getInventory().getLeggings()).get(EnchantmentsHolder.TANK);
        // boots
        if(getEnchants(player.getInventory().getBoots()).containsKey(EnchantmentsHolder.TANK))
            boots = getEnchants(player.getInventory().getBoots()).get(EnchantmentsHolder.TANK);

        return (((double) (helmet+chestplate+leggings+boots)/16)*100*0.5)/100; // basically 16 total levels is equivalent to 50% physical resist
    }

    public Map<Enchantment,Integer> getEnchants(ItemStack item){
        Map<Enchantment, Integer> enchants = new HashMap<>();
        if(item != null){
            ItemMeta meta = item.getItemMeta();
            if(meta != null){
                if(meta.hasEnchants()){
                    for(Enchantment enchantment : meta.getEnchants().keySet()){
                        enchants.put(enchantment,meta.getEnchantLevel(enchantment));
                    }
                }
            }
        }
        return enchants;
    }

    public String getUUID(){
        return player.getUniqueId().toString();
    }

    public void addPotionEffect(PotionEffect potionEffect){
        player.addPotionEffect(potionEffect);
    }

    public Location getLocation(){
        return player.getLocation();
    }



}
