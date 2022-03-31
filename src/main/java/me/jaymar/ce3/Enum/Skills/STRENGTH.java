package me.jaymar.ce3.Enum.Skills;

public enum STRENGTH {
    TANK,
    FURY,
    BERSERK;

    public static int getRequired(STRENGTH skill, int RootLevel, int skillLevel){
        if(skill.equals(STRENGTH.TANK)){
            if(RootLevel<5 && skillLevel == 0)
                return 5;
            else if (RootLevel < 10 && skillLevel == 1)
                return 10;
            else if(RootLevel < 20 && skillLevel == 2)
                return 20;
            else if(RootLevel < 30 && skillLevel == 3)
                return 30;
            else if(RootLevel < 40 && skillLevel == 4)
                return 40;
            else if(RootLevel >=40 && skillLevel == 5)
                return -1;
        }else if(skill.equals(STRENGTH.FURY)){
            if(RootLevel<10 && skillLevel == 0)
                return 10;
            else if (RootLevel < 20 && skillLevel == 1)
                return 20;
            else if(RootLevel < 30 && skillLevel == 2)
                return 30;
            else if(RootLevel < 40 && skillLevel == 3)
                return 40;
            else if(RootLevel < 50 && skillLevel == 4)
                return 50;
            else if(RootLevel >=50 && skillLevel == 5)
                return -1;
        }else if(skill.equals(STRENGTH.BERSERK)){
            if(RootLevel<15 && skillLevel == 0)
                return 15;
            else if (RootLevel < 35 && skillLevel == 1)
                return 35;
            else if(RootLevel < 48 && skillLevel == 2)
                return 48;
            else if(RootLevel >=48 && skillLevel == 3)
                return -1;
        }
        return 0;
    }
}
