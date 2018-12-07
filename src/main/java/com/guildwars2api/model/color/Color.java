package com.guildwars2api.model.color;

import com.google.gson.annotations.SerializedName;

public class Color {

    @SerializedName("id")
    int color;
    @SerializedName("item")
    int item;

    @SerializedName("base_rgb")
    int[] baseRGB;

    @SerializedName("name")
    String name;

    @SerializedName("categories")
    String[] categories;

    @SerializedName("cloth")
    ColorCloth cloth;

    @SerializedName("leather")
    ColorLeather leather;

    @SerializedName("metal")
    ColorMetal metal;

    @SerializedName("fur")
    ColorFur fur;

    public Color(){}

    public Color(int color, int item, int[] baseRGB, String name, String[] categories, ColorCloth cloth, ColorLeather leather, ColorMetal metal, ColorFur fur) {
        this.color = color;
        this.item = item;
        this.baseRGB = baseRGB;
        this.name = name;
        this.categories = categories;
        this.cloth = cloth;
        this.leather = leather;
        this.metal = metal;
        this.fur = fur;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int[] getBaseRGB() {
        return baseRGB;
    }

    public void setBaseRGB(int[] baseRGB) {
        this.baseRGB = baseRGB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public ColorCloth getCloth() {
        return cloth;
    }

    public void setCloth(ColorCloth cloth) {
        this.cloth = cloth;
    }

    public ColorLeather getLeather() {
        return leather;
    }

    public void setLeather(ColorLeather leather) {
        this.leather = leather;
    }

    public ColorMetal getMetal() {
        return metal;
    }

    public void setMetal(ColorMetal metal) {
        this.metal = metal;
    }

    public ColorFur getFur() {
        return fur;
    }

    public void setFur(ColorFur fur) {
        this.fur = fur;
    }
}
