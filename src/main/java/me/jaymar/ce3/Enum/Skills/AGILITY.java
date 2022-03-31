package me.jaymar.ce3.Enum.Skills;

public enum AGILITY {
    PRECISION,
    IMPACT,
    RECOVER;

    public static int getRequired(AGILITY skill, int RootLevel, int skillLevel){
        if(skill.equals(PRECISION)){
            if(RootLevel < 5 && skillLevel == 0)
                return 5;
            else if(RootLevel < 15 && skillLevel == 1)
                return 15;
            else if(RootLevel < 25 && skillLevel == 2)
                return 25;
            else if(RootLevel < 45 && skillLevel == 3)
                return 45;
            else if(RootLevel >= 45 && skillLevel == 4)
                return -1;
        }else if(skill.equals(IMPACT)){
            if(RootLevel < 10 && skillLevel == 0)
                return 10;
            else if(RootLevel < 30 && skillLevel == 1)
                return 30;
            else if(RootLevel < 50 && skillLevel == 2)
                return 50;
            else if(RootLevel >= 50 && skillLevel == 3)
                return -1;
        }else if(skill.equals(RECOVER)){
            if(RootLevel < 1 && skillLevel == 0)
                return 1;
            else if(RootLevel < 12 && skillLevel == 1)
                return 12;
            else if(RootLevel < 24 && skillLevel == 2)
                return 24;
            else if(RootLevel < 35 && skillLevel == 3)
                return 35;
            else if(RootLevel >= 35 && skillLevel == 4)
                return -1;
        }
        return 0;
    }
}
