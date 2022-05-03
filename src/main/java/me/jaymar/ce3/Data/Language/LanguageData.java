package me.jaymar.ce3.Data.Language;

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

}
