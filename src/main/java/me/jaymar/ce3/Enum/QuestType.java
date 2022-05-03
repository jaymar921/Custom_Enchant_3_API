package me.jaymar.ce3.Enum;

import me.jaymar.ce3.Data.Language.LanguageData;

import java.util.List;

public enum QuestType{

    KILL(LanguageData.get("KILL")),
    KILL_NEAR(LanguageData.get("KILL_NEAR")),
    PLANT(LanguageData.get("PLANT")),
    PLANT_NEAR(LanguageData.get("PLANT_NEAR")),
    PLACE_NEAR(LanguageData.get("PLACE_NEAR")),
    PLACE(LanguageData.get("PLACE")),
    MINE(LanguageData.get("DESTROY")),
    MINE_NEAR(LanguageData.get("DESTROY_NEAR")),
    CONSUME(LanguageData.get("CONSUME")),
    CONSUME_NEAR(LanguageData.get("CONSUME_NEAR")),
    NONE("");

    public final String value;
    QuestType(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }

    public static List<QuestType> getTypes(){
        return List.of(
                KILL,KILL_NEAR,
                PLANT,PLANT_NEAR,
                PLACE,
                PLACE_NEAR,
                MINE,
                MINE_NEAR,
                CONSUME,
                CONSUME_NEAR);
    }

    public static boolean hasCondition(QuestType questType){
        return questType.name().contains("NEAR");
    }

}
