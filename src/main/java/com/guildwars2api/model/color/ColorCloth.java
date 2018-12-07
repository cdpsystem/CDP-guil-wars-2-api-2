package com.guildwars2api.model.color;

import com.google.gson.annotations.SerializedName;

public class ColorCloth {

    @SerializedName("brightness")
    int brightness;
    @SerializedName("hue")
    int hue;

    @SerializedName("rgb")
    int[] rgb;

    @SerializedName("contrast")
    float contrast;
    @SerializedName("saturation")
    float saturation;
    @SerializedName("lightness")
    float lightness;

    public ColorCloth(){}
    public ColorCloth(int brightness, int hue, int[] rgb, float contrast, float saturation, float lightness) {
        this.brightness = brightness;
        this.hue = hue;
        this.rgb = rgb;
        this.contrast = contrast;
        this.saturation = saturation;
        this.lightness = lightness;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getHue() {
        return hue;
    }

    public void setHue(int hue) {
        this.hue = hue;
    }

    public int[] getRgb() {
        return rgb;
    }

    public void setRgb(int[] rgb) {
        this.rgb = rgb;
    }

    public float getContrast() {
        return contrast;
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
    }

    public float getSaturation() {
        return saturation;
    }

    public void setSaturation(float saturation) {
        this.saturation = saturation;
    }

    public float getLightness() {
        return lightness;
    }

    public void setLightness(float lightness) {
        this.lightness = lightness;
    }
}
