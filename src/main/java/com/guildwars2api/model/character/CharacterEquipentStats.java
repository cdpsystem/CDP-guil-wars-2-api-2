package com.guildwars2api.model.character;

public class CharacterEquipentStats {
    public int id;
    public int[] attributes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getAttributes() {
        return attributes;
    }

    public void setAttributes(int[] attributes) {
        this.attributes = attributes;
    }

    public CharacterEquipentStats(int id, int[] attributes) {

        this.id = id;
        this.attributes = attributes;
    }
}
