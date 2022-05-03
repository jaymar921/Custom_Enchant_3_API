package me.jaymar.ce3.Data.EntityData;

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

/*
    Class: PlayerAdapter

    I highly required developers to use this class instead of CE_Player,
    you can use this class to get the Player and the CE_Player data

    how to use this class:
        Lets put in scenario you want to get the intelligence level of the player from an event

        @EventHandler
        private void exampleEvent(SampleEvent event){
            if(event.getEntity() instance of Player){

                PlayerAdapter player = new PlayerAdapter((Player)event.getEntity());

                if(player.getSkills().INTELLIGENCE > 1){
                    player.getPlayer().sendMessage("Your intelligence level is above 1");
                }
            }
        }
 */
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
    
    public String getName(){
        return player.getName();
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
        
    }

    public double getMagicResist(){
        return 0;
    }

    public double getPhysicalResistance(){
        return 0;
    }

    public Map<Enchantment,Integer> getEnchants(ItemStack item){
        Map<Enchantment, Integer> enchants = new HashMap<>();
        // ...
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

    public void sendMessage(String messages){
        
    }

    public void deductLevel(int level){
        
    }

    public int getLevel(){
        return getPlayer().getLevel();
    }

    public int getSkillLevel(){
        return getCE_Player().getSkills().LEVEL;
    }

    public void sendTitle(String title, String subtitle, int fadeIn, int stay, int fadeOut){
        player.sendTitle(title,subtitle,fadeIn,stay,fadeOut);
    }

    /**
     * Add Movement Speed
     * @deprecated
     * methods {@link PlayerAdapter#addMovementSpeed(double)} and {@link PlayerAdapter#deductMovementSpeed(double)} are deprecated.
     * <p> Use {@link PlayerAdapter#addMovementSpeed(double,int)} instead.
     *
     * @param ms double - movement speed
     */
    @Deprecated
    public void addMovementSpeed(double ms){
        ce_player.setMovementSpeed(ms + getMovementSpeed());
    }

    /**
     * Deduct Movement Speed
     * @deprecated
     * methods {@link PlayerAdapter#addMovementSpeed(double)} and {@link PlayerAdapter#deductMovementSpeed(double)} are deprecated.
     * <p> Use {@link PlayerAdapter#addMovementSpeed(double,int)} instead.
     *
     * @param ms double - movement speed
     */
    @Deprecated
    public void deductMovementSpeed(double ms){
        ce_player.setMovementSpeed(getMovementSpeed() - ms);
    }

    public void addMovementSpeed(double ms, int time){
        ce_player.setMovementSpeed(ms + getMovementSpeed());
        new BukkitRunnable(){
            public void run(){
                ce_player.setMovementSpeed(getMovementSpeed() - ms);
            }
        }.runTaskLater(PluginCore.getPlugin(PluginCore.class),time*20L);
    }

    public void addManaRegen(double manaRegen,int time){
        ce_player.setManaRegen(manaRegen + getManaRegen());
        new BukkitRunnable(){
            public void run(){
                ce_player.setManaRegen(getManaRegen()-manaRegen);
            }
        }.runTaskLater(PluginCore.getPlugin(PluginCore.class), 20L * time);
    }

    public void setAttackSpeed(double value){
        getPlayer().getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(4 + value);
    }
    public World getWorld(){
        return player.getWorld();
    }

    public Classes getPlayerClass(){
        return Classes.valueOf(ce_player.getPlayer_class());
    }

    public boolean nearEntity(String name){
        for(Entity entity : player.getWorld().getNearbyEntities(player.getLocation(),8,8,8)){
            if(entity instanceof LivingEntity){
                if(entity.getType().name().contains(name))
                    return true;
                if(entity.getName().contains(name))
                    return true;
                if(entity.getCustomName() != null)
                    if(entity.getCustomName().contains(name))
                        return true;
            }
        }
        return false;
    }

    public void playSound(Sound sound){
        player.playSound(getLocation(),sound,1.0f,1.0f);
    }


}
