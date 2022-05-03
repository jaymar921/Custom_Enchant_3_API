package me.jaymar.ce3.Enum;

import me.jaymar.ce3.Data.EntityData.PlayerAdapter;
import me.jaymar.ce3.Data.Language.LanguageData;
import me.jaymar.ce3.Enum.Class.Classes;
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

        if(name.contains(LanguageData.get("SWORD_MASTERY")))
            return STRENGTH.SWORD_MASTERY;
        if(name.contains(LanguageData.get("BERSERK")))
            return STRENGTH.BERSERK;
        if(name.contains(LanguageData.get("PENETRATION")))
            return STRENGTH.PENETRATION;

        if(name.contains(LanguageData.get("BOW_MASTERY")))
            return AGILITY.BOW_MASTERY;
        if(name.contains(LanguageData.get("UNSWERVING_SHOT")))
            return AGILITY.UNSWERVING_SHOT;
        if(name.contains(LanguageData.get("SWIFT_ESCAPE")))
            return AGILITY.SWIFT_ESCAPE;

        if(name.contains(LanguageData.get("WIZARD_MASTERY")))
            return INTELLIGENCE.WIZARD_MASTERY;
        if(name.contains(LanguageData.get("HOURGLASS")))
            return INTELLIGENCE.HOURGLASS;
        if(name.contains(LanguageData.get("MANA_CHARGE")))
            return INTELLIGENCE.MANA_CHARGE;
        return null;
    }

    public static Classes getPlayerClass(String name){
        return Classes.valueOf(name);
    }

    public static double getManaCost(double mana_cost, int enchant_level, PlayerAdapter playerAdapter){
        double cost = 0;
        return cost;
    }

}
