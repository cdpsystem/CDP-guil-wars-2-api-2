package com.guildwars2api.model.character;

public class CharacterBags {
    public int id,size;
    public CharacterBagsInventory[] cbi;

    public CharacterBags(int id, int size, CharacterBagsInventory[] cbi) {
        this.id = id;
        this.size = size;
        this.cbi = cbi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public CharacterBagsInventory[] getCbi() {
        return cbi;
    }

    public void setCbi(CharacterBagsInventory[] cbi) {
        this.cbi = cbi;
    }
}
