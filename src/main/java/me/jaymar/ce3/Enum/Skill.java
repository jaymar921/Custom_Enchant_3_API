package me.jaymar.ce3.Enum;

import me.jaymar.ce3.Data.EntityData.PlayerAdapter;
import me.jaymar.ce3.Enum.Skills.AGILITY;
import me.jaymar.ce3.Enum.Skills.INTELLIGENCE;
import me.jaymar.ce3.Enum.Skills.STRENGTH;

public enum Skill {

    ROOT_STRENGTH("STRENGTH"),
    ROOT_AGILITY("AGILITY"),
    ROOT_INTELLIGENCE("INTELLIGENCE");

    private final String value;
    Skill(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public static Object getSkill(String name){
       return null;
    }

    public static double getManaCost(double mana_cost, int enchant_level, PlayerAdapter playerAdapter){
        return 0;
    }

}
