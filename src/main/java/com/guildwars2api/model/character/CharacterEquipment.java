package com.guildwars2api.model.character;

public class CharacterEquipment {
    public int id,skin;
    public int[] upgrades;
    public String slot,binding,boundTo;
    public CharacterEquipentStats stats;

    public CharacterEquipment(int id, int skin, int[] upgrades, String slot, String binding, String boundTo, CharacterEquipentStats stats) {
        this.id = id;
        this.skin = skin;
        this.upgrades = upgrades;
        this.slot = slot;
        this.binding = binding;
        this.boundTo = boundTo;
        this.stats = stats;
    }

    public CharacterEquipment(int id, String slot, String binding, String boundTo) {
        this.id = id;
        this.slot = slot;
        this.binding = binding;
        this.boundTo = boundTo;
    }

    public CharacterEquipment(int id, String slot, String binding) {
        this.id = id;
        this.slot = slot;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSkin() {
        return skin;
    }

    public void setSkin(int skin) {
        this.skin = skin;
    }

    public int[] getUpgrades() {
        return upgrades;
    }

    public void setUpgrades(int[] upgrades) {
        this.upgrades = upgrades;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getBoundTo() {
        return boundTo;
    }

    public void setBoundTo(String boundTo) {
        this.boundTo = boundTo;
    }

    public CharacterEquipentStats getStats() {
        return stats;
    }

    public void setStats(CharacterEquipentStats stats) {
        this.stats = stats;
    }
}
