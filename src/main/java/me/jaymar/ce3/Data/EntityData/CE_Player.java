package me.jaymar.ce3.Data.EntityData;

import me.jaymar.ce3.Errors.SkillDataNotFound;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/*
    CE_Players contains player data
    this includes the player's

    health regen
    mana regen
    movement speed
    player skills
 */

public class CE_Player implements ConfigurationSerializable {

    private String uuid;
    private double health_regen;
    private double mana_regen;
    private double movement_speed;
    private double mana;
    private double max_mana;

    private PlayerSkills skills;

    public CE_Player(){
        mana = 0;
        max_mana = 0;
    }


    public CE_Player create(
            String uuid,
            double hp_regen,
            double mana_regen,
            double ms,
            PlayerSkills skills
    ){
        this.uuid = uuid;
        health_regen = hp_regen;
        this.mana_regen = mana_regen;
        movement_speed = ms;
        this.skills = skills;
        return this;
    }

    public String getUUID(){
        return uuid;
    }

    public double getHealthRegen(){
        return health_regen;
    }

    public double getManaRegen(){
        return mana_regen;
    }

    public double getMovementSpeed(){
        return movement_speed;
    }

    public double getMana(){return mana;}

    public double getMaxMana(){return max_mana;}

    public void setMana(double mana){this.mana = mana;}

    public void setMaxMana(double mana){max_mana = mana;}

    public void setHealthRegen(double val){health_regen = val;}

    public void setMovementSpeed(double val){movement_speed = val;}

    public void setManaRegen(double val){mana_regen = val;}

    public @NotNull PlayerSkills getSkills(){
        if(skills!=null)
            return skills;
        skills = new PlayerSkills(1,1,0,0,0,0,0,0,0,0,0,0,0,0,0);
        return skills;
    }

    @NotNull
    @Override
    public Map<String, Object> serialize() {
        Map<String, Object> data = new HashMap<>();
        data.put("UUID", uuid);
        data.put("HealthRegen",health_regen);
        data.put("ManaRegen",mana_regen);
        data.put("MovementSpeed",movement_speed);
        data.put("Skills",skills);
        return data;
    }

    public static CE_Player deserialize(@NotNull Map<String, Object> args){
        return new CE_Player().create(
                (String)args.get("UUID"),
                (double) args.get("HealthRegen"),
                (double) args.get("ManaRegen"),
                (double) args.get("MovementSpeed"),
                (PlayerSkills) args.get("Skills")
        );
    }
}
