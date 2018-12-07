package com.guildwars2api.model.character;

import com.google.gson.annotations.SerializedName;

public class CharacterCrafting {

    @SerializedName("discipline")
    public String discipline;

    @SerializedName("rating")
    public int rating;

    @SerializedName("active")
    public boolean isActive;

    public CharacterCrafting(String discipline, int rating, boolean isActive) {
        this.discipline = discipline;
        this.rating = rating;
        this.isActive = isActive;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
