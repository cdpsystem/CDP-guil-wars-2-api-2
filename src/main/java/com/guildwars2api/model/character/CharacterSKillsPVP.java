package com.guildwars2api.model.character;

import com.google.gson.annotations.SerializedName;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CharacterSKillsPVP {
    @SerializedName("heal")
    public int heal;

    @SerializedName("elite")
    int elite;

    @SerializedName("utilities")
    public ArrayList<Integer> utilities;

    public CharacterSKillsPVP(){}

    public CharacterSKillsPVP(int heal, int elite, ArrayList<Integer> utilities) {
        this.heal = heal;
        this.elite = elite;
        this.utilities = utilities;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getElite() {
        return elite;
    }

    public void setElite(int elite) {
        this.elite = elite;
    }

    public ArrayList<Integer> getUtilities() {
        return utilities;
    }

    public void setUtilities(ArrayList<Integer> utilities) {
        this.utilities = utilities;
    }
}
