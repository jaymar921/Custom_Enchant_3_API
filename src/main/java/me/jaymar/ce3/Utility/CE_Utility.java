package me.jaymar.ce3.Utility;

import me.jaymar.ce3.Config.CEConfiguration;
import me.jaymar.ce3.Config.PlayerDataConfig.PlayerDataConfig;
import me.jaymar.ce3.Data.DataHolder;
import me.jaymar.ce3.Data.Enchantments.EnchantmentWrapper;
import me.jaymar.ce3.Data.EntityData.CE_Player;
import me.jaymar.ce3.Data.EntityData.PlayerSkills;
import me.jaymar.ce3.Data.Language.LanguageData;
import me.jaymar.ce3.Enum.Skill;
import me.jaymar.ce3.Enum.Skills.AGILITY;
import me.jaymar.ce3.Enum.Skills.INTELLIGENCE;
import me.jaymar.ce3.Enum.Skills.STRENGTH;
import me.jaymar.ce3.PluginCore;
import me.jaymar.ce3.UI.SkillTree;
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

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class CE_Utility {

    public static final PlayerDataConfig playerDataConfig;
    private static final DecimalFormat fmt = new DecimalFormat("#,###.#");
    static {
        playerDataConfig = new PlayerDataConfig(PluginCore.getPlugin(PluginCore.class));
    }

    public static boolean Registered(Player player){
        UUID uuid = player.getUniqueId();
        for(CE_Player ce_player : DataHolder.getPlayerList()){
            if(ce_player.getUUID().equals(uuid.toString())) {
                return true;
            }
        }
        PluginCore.getPlugin(PluginCore.class).getLogger().info("FALSE");
        return false;
    }

    public static void registerPlayer(Player player){
        CE_Player new_player = new CE_Player().create(
                player.getUniqueId().toString(),
                0,
                0,
                0,
                new PlayerSkills(1,200,0,0,0,0,0,0,0,0,0,0,0,0,0)
        );
        DataHolder.getPlayerList().add(new_player);
        PluginCore.getPlugin(PluginCore.class).getLogger().info(ChatColor.YELLOW+"Player -> "+player.getName()+" is now registered");
    }

    public static CE_Player getPlayer(Player player){
        if(Registered(player)){
            for(CE_Player ce_player : DataHolder.getPlayerList()){
                if(ce_player.getUUID().equals(player.getUniqueId().toString()))
                    return ce_player;
            }
        }
        return null;
    }

    public static int ExpGoal(CE_Player player){
        return (int) (player.getSkills().LEVEL * CEConfiguration.SkillPointXP * CEConfiguration.SkillPointMultiplier);
    }

    // max of 1000 levels, player will no longer getting points if it reaches 185 levels and above
    public static void giveExp(Player player, double exp){
        CE_Player ce_player = getPlayer(player);
        assert ce_player != null;

        double xp = ce_player.getSkills().XP;
        double add_exp = 0;

        if(ce_player.getSkills().LEVEL<1000)
            add_exp = xp+exp;

        if(add_exp>=ExpGoal(ce_player)){
            ce_player.getSkills().XP = (int)(add_exp - ExpGoal(ce_player));
            if(ce_player.getSkills().LEVEL<1000)
                ce_player.getSkills().LEVEL+=1;
            if(ce_player.getSkills().LEVEL<=185)
                ce_player.getSkills().POINTS+=1;
            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP,1.0F,1.0F);
            player.sendMessage(ChatColor.AQUA+StringUtil.fill_append(LanguageData.get("LevelUp"),String.valueOf(ce_player.getSkills().POINTS)));
        }else{
            ce_player.getSkills().XP = (int)add_exp;
        }
    }



    public static void buySkill(Player player, String name){
        CE_Player ce_player = getPlayer(player);
        assert ce_player != null;

       Object skill = Skill.getSkill(name);
       if(skill == null)
           return;

       // check if player is legible
        if(skill instanceof Skill){
            Skill SKILL = (Skill) skill;
            if(ce_player.getSkills().POINTS>0 && (ce_player.getSkills().STRENGTH!=50||ce_player.getSkills().AGILITY!=50||ce_player.getSkills().INTELLIGENCE!=50)){

                if(SKILL.equals(Skill.ROOT_STRENGTH) && ce_player.getSkills().STRENGTH!=50) {
                    ce_player.getSkills().STRENGTH += 1;
                    player.sendMessage(ChatColor.GREEN+StringUtil.fill_append(LanguageData.get("BoughtSkill"),LanguageData.get(SKILL.getValue()).toLowerCase(),"1 "+LanguageData.get("Points").toLowerCase()));
                    ce_player.getSkills().POINTS-=1;
                }
                else if(SKILL.equals(Skill.ROOT_AGILITY) && ce_player.getSkills().AGILITY!=50) {
                    ce_player.getSkills().AGILITY += 1;
                    player.sendMessage(ChatColor.GREEN+StringUtil.fill_append(LanguageData.get("BoughtSkill"),LanguageData.get(SKILL.getValue()).toLowerCase(),"1 "+LanguageData.get("Points").toLowerCase()));
                    ce_player.getSkills().POINTS-=1;
                }else if (SKILL.equals(Skill.ROOT_INTELLIGENCE) && ce_player.getSkills().INTELLIGENCE!=50) {
                    ce_player.getSkills().INTELLIGENCE += 1;
                    player.sendMessage(ChatColor.GREEN+StringUtil.fill_append(LanguageData.get("BoughtSkill"),LanguageData.get(SKILL.getValue()).toLowerCase(),"1 "+LanguageData.get("Points").toLowerCase()));
                    ce_player.getSkills().POINTS-=1;
                }
            }else if(ce_player.getSkills().POINTS>0 && (ce_player.getSkills().STRENGTH==50||ce_player.getSkills().AGILITY==50||ce_player.getSkills().INTELLIGENCE==50)){
                player.sendMessage(ChatColor.GOLD+LanguageData.get("MaxSkill"));
            }else{
                player.sendMessage(ChatColor.RED+LanguageData.get("NoSkillPoint"));
            }
        }else {
            if(SkillTree.CanBuySkill(ce_player,skill)){
                if(ce_player.getSkills().POINTS>0){
                    if(skill instanceof STRENGTH){
                        STRENGTH strength = (STRENGTH) skill;
                        player.sendMessage(ChatColor.GREEN+StringUtil.fill_append(LanguageData.get("BoughtSkill"),LanguageData.get(strength.name()).toLowerCase(),"1 "+LanguageData.get("Points").toLowerCase()));
                        if(SkillTree.CanBuySkill(ce_player,skill)){
                            if(strength.equals(STRENGTH.TANK))
                                ce_player.getSkills().TANK+=1;
                            else if(strength.equals(STRENGTH.FURY))
                                ce_player.getSkills().FURY+=1;
                            else if(strength.equals(STRENGTH.BERSERK))
                                ce_player.getSkills().BERSERK+=1;
                            ce_player.getSkills().POINTS-=1;
                        }
                    }else if(skill instanceof AGILITY){
                        AGILITY agility = (AGILITY) skill;
                        player.sendMessage(ChatColor.GREEN+StringUtil.fill_append(LanguageData.get("BoughtSkill"),LanguageData.get(agility.name()).toLowerCase(),"1 "+LanguageData.get("Points").toLowerCase()));
                        if(SkillTree.CanBuySkill(ce_player,skill)){
                            if(agility.equals(AGILITY.PRECISION))
                                ce_player.getSkills().PRECISION+=1;
                            else if(agility.equals(AGILITY.IMPACT))
                                ce_player.getSkills().IMPACT+=1;
                            else if(agility.equals(AGILITY.RECOVER))
                                ce_player.getSkills().RECOVER+=1;
                            ce_player.getSkills().POINTS-=1;
                        }
                    }else if(skill instanceof INTELLIGENCE){
                        INTELLIGENCE intelligence = (INTELLIGENCE) skill;
                        player.sendMessage(ChatColor.GREEN+StringUtil.fill_append(LanguageData.get("BoughtSkill"),LanguageData.get(intelligence.name()).toLowerCase(),"1 "+LanguageData.get("Points").toLowerCase()));
                        if(SkillTree.CanBuySkill(ce_player,skill)){
                            if(intelligence.equals(INTELLIGENCE.SORCERER))
                                ce_player.getSkills().SORCERER+=1;
                            else if(intelligence.equals(INTELLIGENCE.SPELLBIND))
                                ce_player.getSkills().SPELLBIND+=1;
                            else if(intelligence.equals(INTELLIGENCE.MAGE))
                                ce_player.getSkills().MAGE+=1;
                            ce_player.getSkills().POINTS-=1;
                        }
                    }
                }
            }
        }
        DataHolder.saveAndOpenUI(player, SkillTree.getSkillTreeUI(player));
    }

    public static String getRankIcon(CE_Player player){
        int strength = player.getSkills().STRENGTH;
        int agility = player.getSkills().AGILITY;
        int intelligence = player.getSkills().INTELLIGENCE;

        if((strength > agility) && (strength > intelligence)){
            return "["+ChatColor.RED+"⛨ "+strength+ChatColor.RESET+"] ";
        }else if((agility > strength) && (agility > intelligence)){
            return  "["+ChatColor.GREEN+"\uD83C\uDFF9 "+agility+ChatColor.RESET+"] ";
        }else if((intelligence > agility) && (intelligence > strength)){
            return "["+ChatColor.AQUA+"⚡ "+intelligence+ChatColor.RESET+"] ";
        }else {
            return "["+ChatColor.LIGHT_PURPLE+"◎ "+(player.getSkills().LEVEL)+ChatColor.RESET+"] ";
        }
    }

    public static void ShowStats(Player player, int mana, int max, double hps, double mss){
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR,TextComponent.fromLegacyText(ChatColor.RED+"❤ "+fmt.format(hps)+"hp/s  "+ChatColor.GREEN+"⬆ +"+fmt.format(mss)+"%ms  "+ChatColor.AQUA+"⚡ "+mana+"/"+max+"  "));
    }

    public static ItemStack getBook(EnchantmentWrapper enchantment){
        ItemStack itemStack = new ItemStack(Material.ENCHANTED_BOOK);
        ItemMeta meta = itemStack.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.LIGHT_PURPLE+""+ChatColor.BOLD+LanguageData.getEnchantmentName(enchantment,false));
        meta.addEnchant(enchantment,1,true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.AQUA+LanguageData.get("RightClick1"));
        lore.add(ChatColor.AQUA+LanguageData.get("RightClick2"));
        lore.add(ChatColor.AQUA+LanguageData.get("RightClick3"));
        meta.setLore(lore);
        meta.getPersistentDataContainer().set(new NamespacedKey(PluginCore.getPlugin(PluginCore.class),"CE3_R_DATA"), PersistentDataType.INTEGER, new Random().nextInt(999999));
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static void buyEnchant(Player player, EnchantmentWrapper enchantment, int price){
        player.setLevel(player.getLevel()-price);
        giveItem(player,getBook(enchantment));
        player.playSound(player.getLocation(),Sound.ENTITY_VILLAGER_YES,1.0f,1.0f);
        player.sendMessage(ChatColor.GREEN+StringUtil.fill_append(LanguageData.get("BoughtEnchant"),ChatColor.LIGHT_PURPLE+LanguageData.getEnchantmentName(enchantment,false)+ChatColor.GREEN,ChatColor.GOLD+""+price+ChatColor.GREEN));
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
