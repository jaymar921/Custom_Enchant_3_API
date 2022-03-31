package me.jaymar.ce3.Data.EntityData;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class PlayerSkills implements ConfigurationSerializable {

    public int LEVEL;
    public int POINTS;
    public double XP;

    public int AGILITY;
    public int INTELLIGENCE;
    public int STRENGTH;

    public int TANK;
    public int FURY;
    public int BERSERK;

    public int PRECISION;
    public int IMPACT;
    public int RECOVER;

    public int SORCERER;
    public int SPELLBIND;
    public int MAGE;

    public PlayerSkills(int l, int points, double xp, int a, int i, int s, int t, int f, int b, int p, int ii, int r, int so, int sb, int m){
        LEVEL = l;
        POINTS = points;
        XP = xp;
        AGILITY = a;
        INTELLIGENCE = i;
        STRENGTH = s;
        TANK = t;
        FURY = f;
        BERSERK = b;
        PRECISION = p;
        IMPACT = ii;
        RECOVER = r;
        SORCERER = so;
        SPELLBIND = sb;
        MAGE = m;
    }

    @NotNull
    @Override
    public Map<String, Object> serialize() {
        Map<String, Object> data = new HashMap<>();
        data.put("LEVEL", LEVEL);
        data.put("POINTS", POINTS);
        data.put("XP",XP);

        data.put("AGILITY", AGILITY);
        data.put("INTELLIGENCE", INTELLIGENCE);
        data.put("STRENGTH", STRENGTH);

        data.put("TANK", TANK);
        data.put("FURY", FURY);
        data.put("BERSERK", BERSERK);

        data.put("PRECISION", PRECISION);
        data.put("IMPACT", IMPACT);
        data.put("RECOVER", RECOVER);

        data.put("SORCERER",SORCERER);
        data.put("SPELLBIND",SPELLBIND);
        data.put("MAGE",MAGE);
        return data;
    }

    public static PlayerSkills deserialize (@NotNull Map<String, Object> arg){
        return new PlayerSkills(
                (int)arg.get("LEVEL"),(int)arg.get("POINTS"),(double)arg.get("XP"),(int)arg.get("AGILITY"),(int)arg.get("INTELLIGENCE"),(int)arg.get("STRENGTH"),
                (int)arg.get("TANK"),(int)arg.get("FURY"),(int)arg.get("BERSERK"),(int)arg.get("PRECISION"),
                (int)arg.get("IMPACT"),(int)arg.get("RECOVER"),(int)arg.get("SORCERER"),(int)arg.get("SPELLBIND"),(int)arg.get("MAGE")
        );
    }
}
