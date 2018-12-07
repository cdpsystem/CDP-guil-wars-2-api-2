package com.guildwars2api.model.character;

public class CharacterBagsInventory {
    public int id,count;
    public String binding,boundTo;

    public CharacterBagsInventory(int id, int count) {
        this.id = id;
        this.count = count;
    }

    public CharacterBagsInventory(int id, int count, String binding) {
        this.id = id;
        this.count = count;
        this.binding = binding;
    }

    public CharacterBagsInventory(int id, int count, String binding, String boundTo) {
        this.id = id;
        this.count = count;
        this.binding = binding;
        this.boundTo = boundTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
}
