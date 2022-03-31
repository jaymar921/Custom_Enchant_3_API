package me.jaymar.ce3.Enum;

import me.jaymar.ce3.Config.CEConfiguration;
import me.jaymar.ce3.Data.EntityData.PlayerAdapter;
import me.jaymar.ce3.Data.Language.LanguageData;
import me.jaymar.ce3.Enum.Skills.AGILITY;
import me.jaymar.ce3.Enum.Skills.INTELLIGENCE;
import me.jaymar.ce3.Enum.Skills.STRENGTH;

public enum Skill {

    ROOT_STRENGTH(LanguageData.get("STRENGTH")),
    ROOT_AGILITY(LanguageData.get("AGILITY")),
    ROOT_INTELLIGENCE(LanguageData.get("INTELLIGENCE"));

    private final String value;
    Skill(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public static Object getSkill(String name){
        if(name.contains(LanguageData.get("STRENGTH")))
            return ROOT_STRENGTH;
        if(name.contains(LanguageData.get("AGILITY")))
            return ROOT_AGILITY;
        if(name.contains(LanguageData.get("INTELLIGENCE")))
            return ROOT_INTELLIGENCE;
        if(name.contains(LanguageData.get("TANK")))
            return STRENGTH.TANK;
        if(name.contains(LanguageData.get("FURY")))
            return STRENGTH.FURY;
        if(name.contains(LanguageData.get("BERSERK")))
            return STRENGTH.BERSERK;
        if(name.contains(LanguageData.get("PRECISION")))
            return AGILITY.PRECISION;
        if(name.contains(LanguageData.get("IMPACT")))
            return AGILITY.IMPACT;
        if(name.contains(LanguageData.get("RECOVER")))
            return AGILITY.RECOVER;
        if(name.contains(LanguageData.get("SORCERER")))
            return INTELLIGENCE.SORCERER;
        if(name.contains(LanguageData.get("MAGE")))
            return INTELLIGENCE.MAGE;
        if(name.contains(LanguageData.get("SPELLBIND")))
            return INTELLIGENCE.SPELLBIND;
        return null;
    }

    public static double getManaCost(double mana_cost, int enchant_level, PlayerAdapter playerAdapter){
        double cost = (CEConfiguration.ManaCostMultiplierPerLevel * (enchant_level-1)) * mana_cost; // getting the mana cost plus multiplier per enchant level
        cost = cost>0 ? cost:mana_cost;
        cost = cost - (cost*(0.1*playerAdapter.getSkills().MAGE)); // cost reduction by 10% per level on mage skill
        return cost;
    }

}
