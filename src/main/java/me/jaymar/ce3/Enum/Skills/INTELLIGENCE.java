package me.jaymar.ce3.Enum.Skills;

public enum INTELLIGENCE {
    SORCERER,
    SPELLBIND,
    MAGE;

    public static int getRequired(INTELLIGENCE skill, int RootLevel, int SkillLevel){
        if(skill.equals(SORCERER)){
            if(RootLevel < 5 && SkillLevel == 0)
                return 5;
            else if(RootLevel < 15 && SkillLevel == 1)
                return 15;
            else if(RootLevel < 25 && SkillLevel == 2)
                return 25;
            else if(RootLevel < 35 && SkillLevel == 3)
                return 35;
            else if(RootLevel < 45 && SkillLevel == 4)
                return 45;
            else if(RootLevel>=45 && SkillLevel == 5)
                return -1;
        }else if(skill.equals(SPELLBIND)){
            if(RootLevel < 10 && SkillLevel == 0)
                return 10;
            else if(RootLevel < 30 && SkillLevel == 1)
                return 30;
            else if(RootLevel < 45 && SkillLevel == 2)
                return 45;
            else if(RootLevel >= 45  && SkillLevel == 3)
                return -1;
        }else if(skill.equals(MAGE)){
            if(RootLevel < 20 && SkillLevel == 0)
                return 20;
            else if(RootLevel < 30 && SkillLevel == 1)
                return 30;
            else if(RootLevel < 50 && SkillLevel == 2)
                return 50;
            else if(RootLevel >=50 && SkillLevel == 3)
                return -1;
        }
        return 0;
    }
}
