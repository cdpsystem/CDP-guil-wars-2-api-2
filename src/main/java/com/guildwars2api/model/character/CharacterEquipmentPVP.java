package com.guildwars2api.model.character;

public class CharacterEquipmentPVP {
    public int amulet,rune;
    public int[] sigils;

    public CharacterEquipmentPVP(int amulet, int rune, int[] sigils) {
        this.amulet = amulet;
        this.rune = rune;
        this.sigils = sigils;
    }

    public int getAmulet() {
        return amulet;
    }

    public void setAmulet(int amulet) {
        this.amulet = amulet;
    }

    public int getRune() {
        return rune;
    }

    public void setRune(int rune) {
        this.rune = rune;
    }

    public int[] getSigils() {
        return sigils;
    }

    public void setSigils(int[] sigils) {
        this.sigils = sigils;
    }
}
