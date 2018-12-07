package com.guildwars2api.model.character;

import com.google.gson.annotations.SerializedName;

public class CharacterWVWAbilities {
    @SerializedName("id")
    public int id;
    @SerializedName("rank")
    public int rank;

    public CharacterWVWAbilities(){}

    public CharacterWVWAbilities(int id, int rank) {
        this.id = id;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
