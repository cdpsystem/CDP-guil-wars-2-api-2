package com.guildwars2api.model.item;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Item {
    @SerializedName("id")
    public int itemID;

    @SerializedName("level")
    public int level;

    @SerializedName("vendor_value")
    public int vendor_value;

    @SerializedName("default_skin")
    public int default_skin;

    @SerializedName("chat_link")
    public String chat_link;

    @SerializedName("name")
    public String name;

    @SerializedName("icon")
    public String icon;

    @SerializedName("description")
    public String description;

    @SerializedName("type")
    public String type;

    @SerializedName("rarity")
    public String rarity;

    @SerializedName("flags")
    public String[] flags;

    @SerializedName("game_types")
    public String[] game_types;

    @SerializedName("restrictions")
    public String[] restrictions;


    public Item(int itemID, String type) {
        this.itemID = itemID;
        this.type = type;
    }
    public Item(int itemID) {
        this.itemID = itemID;
    }
    public Item(int itemID, int level, int vendor_value, int default_skin, String chat_link, String name, String icon, String description, String type, String rarity, String[] flags, String[] game_types, String[] restrictions) {
        this.itemID = itemID;
        this.level = level;
        this.vendor_value = vendor_value;
        this.default_skin = default_skin;
        this.chat_link = chat_link;
        this.name = name;
        this.icon = icon;
        this.description = description;
        this.type = type;
        this.rarity = rarity;
        this.flags = flags;
        this.game_types = game_types;
        this.restrictions = restrictions;
    }

    public int getItemID() {
        return itemID;
    }
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVendor_value() {
        return vendor_value;
    }

    public void setVendor_value(int vendor_value) {
        this.vendor_value = vendor_value;
    }

    public int getDefault_skin() {
        return default_skin;
    }

    public void setDefault_skin(int default_skin) {
        this.default_skin = default_skin;
    }

    public String getChat_link() {
        return chat_link;
    }

    public void setChat_link(String chat_link) {
        this.chat_link = chat_link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String[] getFlags() {
        return flags;
    }

    public void setFlags(String[] flags) {
        this.flags = flags;
    }

    public String[] getGame_types() {
        return game_types;
    }

    public void setGame_types(String[] game_types) {
        this.game_types = game_types;
    }

    public String[] getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String[] restrictions) {
        this.restrictions = restrictions;
    }


    public String[] toCSVString(){
        String[] r = {
                Integer.toString(itemID),
                Integer.toString(level),
                Integer.toString(vendor_value),
                Integer.toString(default_skin),
                chat_link,
                name,
                icon,
                description,
                type,
                rarity,
                flags.toString(),
                game_types.toString(),
                restrictions.toString()
        };
        return r;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemID=" + itemID +
                ", level=" + level +
                ", vendor_value=" + vendor_value +
                ", default_skin=" + default_skin +
                ", chat_link='" + chat_link + '\'' +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", rarity='" + rarity + '\'' +
                ", flags=" + Arrays.toString(flags) +
                ", game_types=" + Arrays.toString(game_types) +
                ", restrictions=" + Arrays.toString(restrictions) +
                '}';
    }
}
