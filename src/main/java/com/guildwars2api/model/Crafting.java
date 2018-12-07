package com.guildwars2api.model;

public class Crafting {
    String discipline;
    int rating;
    boolean active;

    public Crafting(String discipline, int rating, boolean active) {
        this.discipline = discipline;
        this.rating = rating;
        this.active = active;
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
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
