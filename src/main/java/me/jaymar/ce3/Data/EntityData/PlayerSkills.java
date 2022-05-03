package me.jaymar.ce3.Data.EntityData;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class PlayerSkills implements ConfigurationSerializable {

    public int LEVEL;
    public int ATTRIBUTE_POINT;
    public double XP;

    public int PASSIVE_POINT;

    public int AGILITY;
    public int INTELLIGENCE;
    public int STRENGTH;

    public int SWORD_MASTERY;
    public int BERSERK;
    public int PENETRATION;

    public int BOW_MASTERY;
    public int UNSWERVING_SHOT;
    public int SWIFT_ESCAPE;

    public int MANA_CHARGE;
    public int HOURGLASS;
    public int WIZARD_MASTERY;

    public int PLAYER_KILLS;
    public int MOB_KILLS;

    public PlayerSkills(int l, int points, int passive_point, double xp, int a, int i, int s, int t, int f, int b, int p, int ii, int r, int so, int sb, int m, int pk, int mk){
        LEVEL = l;
        ATTRIBUTE_POINT = points;
        PASSIVE_POINT = passive_point;
        XP = xp;

        AGILITY = a;
        INTELLIGENCE = i;
        STRENGTH = s;

        SWORD_MASTERY = t;
        BERSERK = f;
        PENETRATION = b;

        BOW_MASTERY = p;
        UNSWERVING_SHOT = ii;
        SWIFT_ESCAPE = r;

        MANA_CHARGE = so;
        HOURGLASS = sb;
        WIZARD_MASTERY = m;

        PLAYER_KILLS = pk;
        MOB_KILLS = mk;
    }

    @NotNull
    @Override
    public Map<String, Object> serialize() {
        Map<String, Object> data = new HashMap<>();
        data.put("LEVEL", LEVEL);
        data.put("POINTS", ATTRIBUTE_POINT);
        data.put("PASSIVE_POINTS", PASSIVE_POINT);
        data.put("XP",XP);

        data.put("AGILITY", AGILITY);
        data.put("INTELLIGENCE", INTELLIGENCE);
        data.put("STRENGTH", STRENGTH);

        data.put("SWORD_MASTERY", SWORD_MASTERY);
        data.put("BERSERK", BERSERK);
        data.put("PENETRATION", PENETRATION);

        data.put("BOW_MASTERY", BOW_MASTERY);
        data.put("UNSWERVING_SHOT", UNSWERVING_SHOT);
        data.put("SWIFT_ESCAPE", SWIFT_ESCAPE);

        data.put("WIZARD_MASTERY", WIZARD_MASTERY);
        data.put("MANA_CHARGE", MANA_CHARGE);
        data.put("HOURGLASS", HOURGLASS);

        data.put("PLAYER_KILLS",PLAYER_KILLS);
        data.put("MOB_KILLS",MOB_KILLS);
        return data;
    }

    public static PlayerSkills deserialize (@NotNull Map<String, Object> arg){
        return new PlayerSkills(
                (int)arg.get("LEVEL"),(int)arg.get("POINTS"),(int)arg.get("PASSIVE_POINTS"),(double)arg.get("XP"),(int)arg.get("AGILITY"),(int)arg.get("INTELLIGENCE"),(int)arg.get("STRENGTH"),
                (int)arg.get("SWORD_MASTERY"),(int)arg.get("BERSERK"),(int)arg.get("PENETRATION"),(int)arg.get("BOW_MASTERY"),
                (int)arg.get("UNSWERVING_SHOT"),(int)arg.get("SWIFT_ESCAPE"),(int)arg.get("WIZARD_MASTERY"),(int)arg.get("MANA_CHARGE"),(int)arg.get("HOURGLASS"),
                (int)arg.get("PLAYER_KILLS"),(int)arg.get("MOB_KILLS")
        );
    }
}
