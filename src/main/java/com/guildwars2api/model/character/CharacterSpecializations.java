package com.guildwars2api.model.character;

import com.google.gson.annotations.SerializedName;

public class CharacterSpecializations {
    @SerializedName("ids")
    int id;

    @SerializedName("traits")
    int[] traits;

    public CharacterSpecializations(int id, int[] traits) {
        this.id = id;
        this.traits = traits;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTraits(int[] traits) {
        this.traits = traits;
    }

    public int getId() {
        return id;
    }

    public int[] getTraits() {
        return traits;
    }
}
