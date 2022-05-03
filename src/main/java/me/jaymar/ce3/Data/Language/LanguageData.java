package me.jaymar.ce3.Data.Language;

import me.jaymar.ce3.Data.Enchantments.CustomEnchantWrapper;

import java.util.HashMap;
import java.util.Map;

public class LanguageData {

    private final static Map<String,String> lang;

    static {
        lang = new HashMap<>();
        set();
    }

    public static String get(String message){
        return lang.get(message);
    }

    public static void set(){
        setDefault();
    }


    private static void setDefault(){
        lang.put("SkillTree","Skill Tree");
        lang.put("PlayerClassesUI","Select a classification");
        lang.put("Player","Player");
        lang.put("Level","LEVEL");
        lang.put("Exp","EXP");
        lang.put("Power","Power");
        lang.put("Blocks","blocks");
        lang.put("Check","Check");
        lang.put("DISENCHANT_1","Place your item at the middle");
        lang.put("DISENCHANT_2","Click on 'check' to select enchantments to remove");
        lang.put("DISENCHANT_3","You'll pay _a levels for every removed enchantment");
        lang.put("PlayerRank","Player Ranks");
        lang.put("Points","ATTRIBUTE POINT/S");
        lang.put("ClassPoints","SKILL POINT/S");
        lang.put("EnchantLimit","You have reached the maximum enchant limit of _a");
        lang.put("SpecifyArg","Specify the arguments");
        lang.put("InvalidArg","Invalid Argument");
        lang.put("SpecifyPlayer","Please specify the player name");
        lang.put("NotFoundPlayer","Player not found, must be online!");
        lang.put("FoundPlayer","_a was added as your ally");
        lang.put("RemovedAlly","_a was removed as your ally");
        lang.put("FoundSelf","Try another name");
        lang.put("BuySkill","Spend a skill point");
        lang.put("BuySkillAttribute","Spend an attribute point");
        lang.put("NoSkillPoint","You don't have enough skill point/s");
        lang.put("NoLevelOnDisenchant","You don't have enough levels to disenchant item");
        lang.put("NoAttributePoint","You don't have enough attribute point/s");
        lang.put("RequiredSkill","Required _a to be level _b");
        lang.put("RequiredClass","You must be in _a class to acquire this skill");
        lang.put("PlayerClass","Class");
        lang.put("SelectClass","Select this class");
        lang.put("STRENGTH","STRENGTH");
        lang.put("STRENGTH_LORE","Increase physical damage by _a");
        lang.put("STRENGTH_LORE0","Increase physical defense by _a");
        lang.put("STRENGTH_LORE1","Increase health regen");
        lang.put("AGILITY","AGILITY");
        lang.put("AGILITY_LORE","Increase movement speed");
        lang.put("AGILITY_LORE0","Increase critical chance");
        lang.put("AGILITY_LORE1","Increase physical damage by _a");
        lang.put("INTELLIGENCE","INTELLIGENCE");
        lang.put("INTELLIGENCE_LORE","Increase mana");
        lang.put("INTELLIGENCE_LORE0","Increase magical damage");
        lang.put("INTELLIGENCE_LORE1","Increase magical defense by _a or _b% on Max INTELLIGENCE");

        lang.put("SWORD_MASTERY","SWORD MASTERY");
        lang.put("SWORD_MASTERY_LORE","Increases sword damage");
        lang.put("PENETRATION","PENETRATION");
        lang.put("PENETRATION_LORE","Ignore physical defense by 0.5");
        lang.put("BERSERK","BERSERK");
        lang.put("BERSERK_LORE","Increase damage by 0.2 for every hp lost");

        lang.put("BOW_MASTERY","BOW MASTERY");
        lang.put("BOW_MASTERY_LORE","Increase bow damage");
        lang.put("UNSWERVING_SHOT","UNSWERVING SHOT");
        lang.put("UNSWERVING_SHOT_LORE","Increases arrow’s flying speed");
        lang.put("SWIFT_ESCAPE","SWIFT ESCAPE");
        lang.put("SWIFT_ESCAPE_LORE","Increases Chance to Evade/Ignore Damage");

        lang.put("WIZARD_MASTERY","WIZARD MASTERY");
        lang.put("WIZARD_MASTERY_LORE","Increase casting range / spell radius by 0.2 blocks");
        lang.put("HOURGLASS","HOURGLASS");
        lang.put("HOURGLASS_LORE","Decrease Cooldown");
        lang.put("MANA_CHARGE","MANA CHARGE");
        lang.put("MANA_CHARGE_LORE","Increase mana regen by 0.125/s");

        lang.put("WARRIOR","Warrior");
        lang.put("WARRIOR_LORE","Settle in the southern area of the Taiga Biomes.");
        lang.put("WARRIOR_LORE0","They have the best in attacking ability and endurance,");
        lang.put("WARRIOR_LORE1","but they're slow in speed and is inaccurate.");
        lang.put("WARRIOR_LORE2","You'll be able to use Sword Enchantments)");
        lang.put("ARCHER","Archer");
        lang.put("ARCHER_LORE","Inhibit in the northern land of jungle biomes");
        lang.put("ARCHER_LORE0","They shun the use of heavy equipment as it");
        lang.put("ARCHER_LORE1","restricts their mobility and agility.");
        lang.put("ARCHER_LORE2","They are considered as the quickest");
        lang.put("ARCHER_LORE3","and fastest of all the classes.");
        lang.put("ARCHER_LORE4","(You'll be able to use Bow Enchantments)");
        lang.put("WIZARD","Wizard");
        lang.put("WIZARD_LORE","Occupies the lands of Snowy Plain.");
        lang.put("WIZARD_LORE0","They manifest less physical ability than");
        lang.put("WIZARD_LORE1","the other classes but has the strongest magical powers.");
        lang.put("WIZARD_LORE2","(You'll be able to use Magic Enchantments)");

        lang.put("Greeting","Hello _a!");
        lang.put("ClassIntroduction","This plugin embraces MMORPG gameplay and a class system. Skills are available only to the appropriate classes.\n\n\nChanging class is expensive, so be wise.");
        lang.put("SuccessJoinedClass","_a has successfully joined the _b class!");
        lang.put("WarnIncompatibleClass","Enchantment _a can only be used if you're in _b class");
        lang.put("MaxSkill","You have mastered this skill");
        lang.put("BoughtSkill","You have bought _a for _b");
        lang.put("LevelUp","You have leveled up, you have _a point/s to spend. Do _b to buy skill");
        lang.put("OpeningInClass","Opening Classes UI in _a second/s");
        lang.put("Shops","List of Shops");
        lang.put("ShopCreated","Created a shop");
        lang.put("Shop","Shop _a is at _b");
        lang.put("InvalidShopType","Invalid Shop Type");
        lang.put("EnterShopName","Enter the shop name");
        lang.put("Disenchant","Remove Enchantments");
        lang.put("RemoveEnchant","Remove Enchantment");

        lang.put("BoughtEnchant","You've bought _a for _b levels");

        lang.put("EnchantmentShop","Enchantment Shop");
        lang.put("WeaponEnchant","Weapons Enchantments");
        lang.put("ToolEnchant","Tools Enchantments");
        lang.put("ArmorEnchant","Armors Enchantments");
        lang.put("GenericEnchant","Generic and Magic Enchantments");
        lang.put("SwordEnchant","Sword Enchantments");
        lang.put("BowEnchant","Bow Enchantments");
        lang.put("ShieldEnchant","Shield Enchantments");
        lang.put("TridentEnchant","Trident Enchantments");
        lang.put("Back","Go back");
        lang.put("Cooldown","Cool Down");
        lang.put("MaxLevel","Max Level");
        lang.put("ARMOR","Armors");
        lang.put("BOW","Bows/Crossbows");
        lang.put("CHESTPLATE","Chestplates");
        lang.put("LEGGINGS","Leggings");
        lang.put("HELMET","Helmet");
        lang.put("BOOTS","Boots");
        lang.put("HOE","Hoe");
        lang.put("PICKAXE","Pickaxe");
        lang.put("AXE","Axe");
        lang.put("GENERIC","Weapons/Armors/Tools");
        lang.put("WAND","Magic Wands");
        lang.put("Allies","_a's Allies");

        lang.put("RightClick1","Step 1: Right Click this book");
        lang.put("RightClick2","Step 2: Switch on item to enchant");
        lang.put("RightClick3","Step 3: Right click the item");

        lang.put("AboutEnchant","Enchanting is ready, swap to item to enchant");
        lang.put("EnchantComplete","You have applied _a enchantment to _b");
        lang.put("EnchantMax","You already have the maximum level on this enchantment");
        lang.put("EnchantTimeout","Enchanting was cancelled due to timeout");
        lang.put("EnchantIncompatible","The enchantment cannot be applied to this item");
        lang.put("ConsumeMana","(Consumes _a mana)");
        lang.put("AppliesTo","(Applies to _a)");
        lang.put("IsCooldown","Enchantment _a is on cooldown: _b seconds");
        lang.put("RequiredMana","Enchantment _a requires: _b mana");
        lang.put("CoolDownRefreshed","_a is now ready");
        lang.put("SomeoneWand","_a's Magic Wand");
        lang.put("ManaBottle","Mana Potion");
        lang.put("ManaEnergy","Obtain _a mana when consumed");
        lang.put("SelectSpell","Right click to select a spell");
        lang.put("ResetElixir", "Reset Elixir");
        lang.put("ResetElixirLore","Reset your skill tree");
        lang.put("ResetMessage","Your skill tree was reset");

        lang.put("KILL","Kill _a");
        lang.put("KILL_NEAR","Kill _a near _b");
        lang.put("PLANT","Plant _a");
        lang.put("PLANT_NEAR","Plant _a near _b");
        lang.put("PLACE","Place _a");
        lang.put("PLACE_NEAR","Place _a near _b");
        lang.put("DESTROY","Mine _a");
        lang.put("DESTROY_NEAR","Mine _a near _b");
        lang.put("CONSUME","Consume _a");
        lang.put("CONSUME_NEAR","Consume _a near _b");
        lang.put("Something","something");

        lang.put("QUEST_CREATE_1","Enter the quest title. Type _a to cancel");
        lang.put("QUEST_CREATE_2","Quest Title: [_a]");
        lang.put("QUEST_CREATE_3","Type: _a -> _b");
        lang.put("QUEST_CREATE_4","Create your Quest Objective");
        lang.put("QUEST_CREATE_5","Quest type is the objective type");
        lang.put("QUEST_CREATE_6","Something_1 is the goal to complete the objective");
        lang.put("QUEST_CREATE_7","Something_2 is is the condition to complete the goal");
        lang.put("QUEST_CREATE_8","Something_2 should be an entity type!");
        lang.put("QUEST_CREATE_8.1","You also must provide the number of occurrence");
        lang.put("QUEST_CREATE_8.2","for a player to complete the quest");
        lang.put("QUEST_CREATE_9","Example Quest Objective:");
        lang.put("QUEST_CREATE_10","Separate your input with commas[_a]");
        lang.put("QUEST_CREATE_11","Invalid Goal and Condition may not cause any error messages but the quest will not work!");
        lang.put("QUEST_CREATE_12","QUEST: -> _a _b");
        lang.put("QUEST_CREATE_13","Enter quest description");
        lang.put("QUEST_CREATE_14","Description: _a");
        lang.put("QUEST_CREATE_15","Enter Quest Reward (CE Currency)");
        lang.put("QUEST_CREATE_16","Currency reward set to _a");
        lang.put("QUEST_CREATE_17","Hold any item in your main hand as your item reward and type _a");
        lang.put("QUEST_CREATE_18","Item reward was set");
        lang.put("QUEST_CREATE_19","Type the Quest ID's that you want for this quest entity to associate");
        lang.put("QUEST_CREATE_20","Separate with comma[,] example: 1000,1001,1002");
        lang.put("QUEST_CANCEL","You have cancelled creating a quest");
        lang.put("QUEST_VERIFY","Save Quest? _a to save or _b to cancel");
        lang.put("QUEST_CREATED","Quest was saved!");
        lang.put("QUEST_ENTITY_SET","Quest Entity Set!");
        lang.put("QUEST_ERROR","Invalid Input!! Error at _a");
        lang.put("QUEST_INFO_1","Title: _a");
        lang.put("QUEST_INFO_2","Objective: _a");
        lang.put("QUEST_INFO_3","Goal: _a");
        lang.put("QUEST_INFO_4","Condition: _a");
        lang.put("QUEST_INFO_5","Description:");
        lang.put("QUEST_INFO_6","REWARD: _aC and _b");
        lang.put("QUEST_REMOVE","Removed Quest _a");
        lang.put("QUEST_REWARDS","Rewards: _a _b");
        lang.put("QuestEntity","Quest Entity");
        lang.put("QUEST_LIST","List of Quests");
        lang.put("QUEST_OPTION","Type _a to accept, _b to deny quest");
        lang.put("QUEST_NOT_AVAILABLE","Sorry, please try again later...");
        lang.put("DENY_QUEST","You denied the quest");
        lang.put("ACCEPT_QUEST","You have accepted the quest");
        lang.put("NEAR","_a near _b");
        lang.put("QUEST_LOAD","Loading your quest...");
        lang.put("QUEST_REPEAT","Repeat _a times");
        lang.put("PLAYER_ON_QUEST","You are currently on a quest");
        lang.put("NO_ACTIVE_QUEST","You don't have any active quest");
        lang.put("QUEST_RETURN","Return to _a and claim your reward");
        lang.put("QUEST_COMPLETE","Quest _a Completed");

        lang.put("PLUGIN_INFO_1","Plugin Information");
        lang.put("PLUGIN_INFO_2","Plugin Version");
        lang.put("PLUGIN_INFO_3","Developed by");
        lang.put("PLUGIN_INFO_4","XP_MULTIPLIER");
        lang.put("PLUGIN_INFO_5","SKILL_POINT_MULTIPLIER");
        lang.put("PLUGIN_INFO_6","ENCHANTMENT_LIMIT");
        lang.put("PLUGIN_INFO_7","QUEST_XP_REWARD");
        lang.put("PLUGIN_INFO_8","DENY_QUEST_COOLDOWN");

        lang.put("LifeSteal","Life Steal");
        lang.put("LifeStealLore","Heal while attacking");
        lang.put("Bleed","Bleed");
        lang.put("BleedLore","Get a chance for enemy to bleed");
        lang.put("Critical","Critical");
        lang.put("CriticalLore","Deal critical damage to enemy");
        lang.put("Poison","Poison");
        lang.put("PoisonLore","Attack with poison effect");
        lang.put("ManaSteal","Mana Steal");
        lang.put("ManaStealLore","Steal mana from enemy");
        lang.put("Execute","Execute");
        lang.put("ExecuteLore","Deal huge damage on enemy with low health");
        lang.put("LightSpirit","Light Spirit");
        lang.put("LightSpiritLore","Spirit of light binds on your sword");
        lang.put("SoulEater","Soul Eater");
        lang.put("Souls","[Souls _a]");
        lang.put("MaxSouls","Max Souls");
        lang.put("SoulEaterLore","Spirit of darkness binds on your sword");
        lang.put("WindStrike","Wind Strike");
        lang.put("WindStrikeLore","Dashes to enemy, deal magic damage");
        lang.put("SuddenBlow","Sudden Blow");
        lang.put("SuddenBlowLore","Has chance to blind and stun the enemy");
        lang.put("HailStorm","Hail Storm");
        lang.put("HailStormLore","Cast a hail storm in the area");
        lang.put("MagicResist", "Magic Resist");
        lang.put("MagicResistLore","Gain magic damage resistance");
        lang.put("TankEnchant", "Tank");
        lang.put("TankEnchantLore","Gain physical damage resistance");
        lang.put("Regain", "Regain");
        lang.put("RegainLore","Get a second life!");
        lang.put("PoisonousThorns", "Poisonous Thorns");
        lang.put("PoisonousThornsLore","Get a chance to poison the attacker");
        lang.put("Freeze", "Freeze");
        lang.put("FreezeLore","Get a chance to freeze your attacker");
        lang.put("Omnivamp", "Omni Vamp");
        lang.put("OmnivampLore","Get a chance to heal when attacked");
        lang.put("Blindness", "Blindness");
        lang.put("BlindnessLore","When attacked, blind the enemy by chance");
        lang.put("DoubleJump", "Double Jump");
        lang.put("DoubleJumpLore","Sneak while on air to jump");
        lang.put("AutoFarm", "Auto Farm");
        lang.put("AutoFarmLore","Get a chance to replant harvested crops");
        lang.put("VeinMiner", "Vein Miner");
        lang.put("VeinMinerLore","Mine veins of ores");
        lang.put("Deforestation", "Deforestation");
        lang.put("DeforestationLore","Cut the whole vertical tree trunk");
        lang.put("AutoRepair", "Auto Repair");
        lang.put("AutoRepairLore","Slowly repair tool/weapon over time");
        lang.put("SuperNova", "Super Nova");
        lang.put("SuperNovaLore","Deal huge magic damage on surrounding area");
        lang.put("Lightning", "Lightning");
        lang.put("LightningLore","Strike lightning on surrounding area");
        lang.put("Healing", "Healing");
        lang.put("HealingLore","Heal allies nearby");
        lang.put("Levitate", "Levitate");
        lang.put("LevitateLore","Levitate Enemies and deal magic damage");
        lang.put("Nebula", "Nebula");
        lang.put("NebulaLore","Nebula explosion!");
        lang.put("SharpArrow", "Sharp Arrow");
        lang.put("SharpArrowLore","Deal more ranged damage");
        lang.put("Stun", "Stun");
        lang.put("StunLore","Get a chance to stun the enemy");
        lang.put("FrostArrow", "Frost Arrow");
        lang.put("FrostArrowLore","Slow your enemy by chance");
        lang.put("FocusFire", "Focus Fire");
        lang.put("FocusFireLore","Gain Quick MS and Invisibility on every success hit");
        lang.put("DeathAngel", "Death Angel");
        lang.put("DeathAngelLore","Fall a meteorite to where the arrow landed");
        lang.put("Implant", "Implant");
        lang.put("ImplantLore","The dark matter will give a strength to your bow");
        lang.put("Storm", "Storm");
        lang.put("StormLore","The power of wind and storm will bind your wand");
        lang.put("ManaShield", "Mana Shield");
        lang.put("ManaShieldLore","Absorb some damage and consume it as mana");
        lang.put("ManaBurn", "Mana Burn");
        lang.put("ManaBurnLore","Burn players mana when nearby");
        lang.put("Sturdy", "Sturdy");
        lang.put("SturdyLore","Obtain physical resistance when equipped");
        lang.put("DeathRay", "Death Ray");
        lang.put("DeathRayLore","Shoot laser on target");
        lang.put("Blink", "Blink");
        lang.put("BlinkLore","Shift + Right click to blink on short distance");
        lang.put("Juggernaut", "Juggernaut");
        lang.put("JuggernautLore","Deal armor penetration");
        lang.put("WindSlasher", "Wind Slasher");
        lang.put("WindSlasherLore","Gain Attack Speed");
        lang.put("WindSlasherLore0","Summon tornado by chance at AGILITY 40+");
        lang.put("FireBall", "Fire Ball");
        lang.put("FireBallLore","Shoot fireball");
    }

    public static String getEnchantmentName(CustomEnchantWrapper enchantment, boolean colored){
        if(enchantment.getName().equalsIgnoreCase("Life Steal")) {
            if(colored)
                return enchantment.getColor() + lang.get("LifeSteal");
            return lang.get("LifeSteal");
        }
        if(enchantment.getName().equalsIgnoreCase("Bleed")) {
            if(colored)
                return enchantment.getColor() + lang.get("Bleed");
            return lang.get("Bleed");
        }
        if(enchantment.getName().equalsIgnoreCase("Critical")) {
            if(colored)
                return enchantment.getColor() + lang.get("Critical");
            return lang.get("Critical");
        }
        if(enchantment.getName().equalsIgnoreCase("Poison")) {
            if(colored)
                return enchantment.getColor() + lang.get("Poison");
            return lang.get("Poison");
        }
        if(enchantment.getName().equalsIgnoreCase("Mana Steal")) {
            if(colored)
                return enchantment.getColor() + lang.get("ManaSteal");
            return lang.get("ManaSteal");
        }
        if(enchantment.getName().equalsIgnoreCase("Execute")) {
            if(colored)
                return enchantment.getColor() + lang.get("Execute");
            return lang.get("Execute");
        }
        if(enchantment.getName().equalsIgnoreCase("Light Spirit")) {
            if(colored)
                return enchantment.getColor() + lang.get("LightSpirit");
            return lang.get("LightSpirit");
        }
        if(enchantment.getName().equalsIgnoreCase("Soul Eater")) {
            if(colored)
                return enchantment.getColor() + lang.get("SoulEater");
            return lang.get("SoulEater");
        }
        if(enchantment.getName().equalsIgnoreCase("Wind Strike")) {
            if(colored)
                return enchantment.getColor() + lang.get("WindStrike");
            return lang.get("WindStrike");
        }
        if(enchantment.getName().equalsIgnoreCase("Sudden Blow")) {
            if(colored)
                return enchantment.getColor() + lang.get("SuddenBlow");
            return lang.get("SuddenBlow");
        }
        if(enchantment.getName().equalsIgnoreCase("Hail Storm")) {
            if(colored)
                return enchantment.getColor() + lang.get("HailStorm");
            return lang.get("HailStorm");
        }
        if(enchantment.getName().equalsIgnoreCase("Magic Resist")) {
            if(colored)
                return enchantment.getColor() + lang.get("MagicResist");
            return lang.get("MagicResist");
        }
        if(enchantment.getName().equalsIgnoreCase("Tank")) {
            if(colored)
                return enchantment.getColor() + lang.get("TankEnchant");
            return lang.get("TankEnchant");
        }
        if(enchantment.getName().equalsIgnoreCase("Regain")) {
            if(colored)
                return enchantment.getColor() + lang.get("Regain");
            return lang.get("Regain");
        }
        if(enchantment.getName().equalsIgnoreCase("Poisonous Thorns")) {
            if(colored)
                return enchantment.getColor() + lang.get("PoisonousThorns");
            return lang.get("PoisonousThorns");
        }
        if(enchantment.getName().equalsIgnoreCase("Freeze")) {
            if(colored)
                return enchantment.getColor() + lang.get("Freeze");
            return lang.get("Freeze");
        }
        if(enchantment.getName().equalsIgnoreCase("Omni Vamp")) {
            if(colored)
                return enchantment.getColor() + lang.get("Omnivamp");
            return lang.get("Omnivamp");
        }
        if(enchantment.getName().equalsIgnoreCase("Blindness")) {
            if(colored)
                return enchantment.getColor() + lang.get("Blindness");
            return lang.get("Blindness");
        }
        if(enchantment.getName().equalsIgnoreCase("Double Jump")) {
            if(colored)
                return enchantment.getColor() + lang.get("DoubleJump");
            return lang.get("DoubleJump");
        }
        if(enchantment.getName().equalsIgnoreCase("Auto Farm")) {
            if(colored)
                return enchantment.getColor() + lang.get("AutoFarm");
            return lang.get("AutoFarm");
        }
        if(enchantment.getName().equalsIgnoreCase("Vein Miner")) {
            if(colored)
                return enchantment.getColor() + lang.get("VeinMiner");
            return lang.get("VeinMiner");
        }
        if(enchantment.getName().equalsIgnoreCase("Deforestation")) {
            if(colored)
                return enchantment.getColor() + lang.get("Deforestation");
            return lang.get("Deforestation");
        }
        if(enchantment.getName().equalsIgnoreCase("Auto Repair")) {
            if(colored)
                return enchantment.getColor() + lang.get("AutoRepair");
            return lang.get("AutoRepair");
        }
        if(enchantment.getName().equalsIgnoreCase("Super Nova")) {
            if(colored)
                return enchantment.getColor() + lang.get("SuperNova");
            return lang.get("SuperNova");
        }
        if(enchantment.getName().equalsIgnoreCase("Lightning")) {
            if(colored)
                return enchantment.getColor() + lang.get("Lightning");
            return lang.get("Lightning");
        }
        if(enchantment.getName().equalsIgnoreCase("Healing")) {
            if(colored)
                return enchantment.getColor() + lang.get("Healing");
            return lang.get("Healing");
        }
        if(enchantment.getName().equalsIgnoreCase("Levitate")) {
            if(colored)
                return enchantment.getColor() + lang.get("Levitate");
            return lang.get("Levitate");
        }
        if(enchantment.getName().equalsIgnoreCase("Nebula")) {
            if(colored)
                return enchantment.getColor() + lang.get("Nebula");
            return lang.get("Nebula");
        }
        if(enchantment.getName().equalsIgnoreCase("Sharp Arrow")) {
            if(colored)
                return enchantment.getColor() + lang.get("SharpArrow");
            return lang.get("SharpArrow");
        }
        if(enchantment.getName().equalsIgnoreCase("Stun")) {
            if(colored)
                return enchantment.getColor() + lang.get("Stun");
            return lang.get("Stun");
        }
        if(enchantment.getName().equalsIgnoreCase("Frost Arrow")) {
            if(colored)
                return enchantment.getColor() + lang.get("FrostArrow");
            return lang.get("FrostArrow");
        }
        if(enchantment.getName().equalsIgnoreCase("Focus Fire")) {
            if(colored)
                return enchantment.getColor() + lang.get("FocusFire");
            return lang.get("FocusFire");
        }
        if(enchantment.getName().equalsIgnoreCase("Death Angel")) {
            if(colored)
                return enchantment.getColor() + lang.get("DeathAngel");
            return lang.get("DeathAngel");
        }
        if(enchantment.getName().equalsIgnoreCase("Implant")) {
            if(colored)
                return enchantment.getColor() + lang.get("Implant");
            return lang.get("Implant");
        }
        if(enchantment.getName().equalsIgnoreCase("Storm")) {
            if(colored)
                return enchantment.getColor() + lang.get("Storm");
            return lang.get("Storm");
        }
        if(enchantment.getName().equalsIgnoreCase("Mana Shield")) {
            if(colored)
                return enchantment.getColor() + lang.get("ManaShield");
            return lang.get("ManaShield");
        }
        if(enchantment.getName().equalsIgnoreCase("Mana Burn")) {
            if(colored)
                return enchantment.getColor() + lang.get("ManaBurn");
            return lang.get("ManaBurn");
        }
        if(enchantment.getName().equalsIgnoreCase("Sturdy")) {
            if(colored)
                return enchantment.getColor() + lang.get("Sturdy");
            return lang.get("Sturdy");
        }
        if(enchantment.getName().equalsIgnoreCase("Death Ray")) {
            if(colored)
                return enchantment.getColor() + lang.get("DeathRay");
            return lang.get("DeathRay");
        }
        if(enchantment.getName().equalsIgnoreCase("Blink")) {
            if(colored)
                return enchantment.getColor() + lang.get("Blink");
            return lang.get("Blink");
        }
        if(enchantment.getName().equalsIgnoreCase("Juggernaut")) {
            if(colored)
                return enchantment.getColor() + lang.get("Juggernaut");
            return lang.get("Juggernaut");
        }
        if(enchantment.getName().equalsIgnoreCase("Wind Slasher")) {
            if(colored)
                return enchantment.getColor() + lang.get("WindSlasher");
            return lang.get("WindSlasher");
        }
        if(enchantment.getName().equalsIgnoreCase("Fire Ball")) {
            if(colored)
                return enchantment.getColor() + lang.get("FireBall");
            return lang.get("FireBall");
        }
        return "";
    }


}
