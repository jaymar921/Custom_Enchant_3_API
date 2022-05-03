package me.jaymar.ce3.Enum;

import me.jaymar.ce3.Data.Language.LanguageData;

import java.util.List;

public enum Shops {

    SWORD(LanguageData.get("SwordEnchant")),
    BOW(LanguageData.get("BowEnchant")),
    MAGIC(LanguageData.get("GenericEnchant")),
    TOOL(LanguageData.get("ToolEnchant")),
    ARMOR(LanguageData.get("ArmorEnchant")),
    SHIELD(LanguageData.get("ShieldEnchant")),
    TRIDENT(LanguageData.get("TridentEnchant")),
    DUMMY("Dummy"),
    QUEST(LanguageData.get("QuestEntity")),
    DISENCHANT(LanguageData.get("Disenchant"));

    private final String value;
    Shops(String value){
        this.value = value;
    }

    public String toString(){
        return value;
    }


    public static List<Shops> getValues(){
        return List.of(SWORD,BOW,MAGIC,TOOL,ARMOR,SHIELD,TRIDENT,DUMMY,DISENCHANT);
    }
}
