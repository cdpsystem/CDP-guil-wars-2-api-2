package com.guildwars2api.model.character;

import com.google.gson.annotations.SerializedName;
import com.guildwars2api.model.Crafting;


public class Character{

    @SerializedName("name")
    String name;
    @SerializedName("race")
    String race;
    @SerializedName("gender")
    String gender;
    @SerializedName("profession")
    String profession;
    @SerializedName("guildID")
    String guildID;
    @SerializedName("created")
    String created;

    @SerializedName("backstory")
    String[] backstory;
    @SerializedName("flags")
    String[] flags;

    @SerializedName("level")
    int level;
    @SerializedName("age")
    int age;
    @SerializedName("deaths")
    int deaths;
    @SerializedName("title")
    int title;

    @SerializedName("recipes")
    int[] recipes;

    @SerializedName("wvw_abilities")
    CharacterWVWAbilities[] wvwAbilities;

    @SerializedName("crafting")
    CharacterCrafting[] craftings;

    @SerializedName("specilizations")
    CharacterSpecializations specializations;

    @SerializedName("training")
    CharacterTraining[] trainings;

    @SerializedName("bags")
    CharacterBags[] bags;

    @SerializedName("skills")
    CharacterSkills skills;

    public String getName() {
        return name;
    }

    public Character(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getGuildID() {
        return guildID;
    }

    public void setGuildID(String guildID) {
        this.guildID = guildID;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String[] getBackstory() {
        return backstory;
    }

    public void setBackstory(String[] backstory) {
        this.backstory = backstory;
    }

    public String[] getFlags() {
        return flags;
    }

    public void setFlags(String[] flags) {
        this.flags = flags;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int[] getRecipes() {
        return recipes;
    }

    public void setRecipes(int[] recipes) {
        this.recipes = recipes;
    }

    public CharacterWVWAbilities[] getWvwAbilities() {
        return wvwAbilities;
    }

    public void setWvwAbilities(CharacterWVWAbilities[] wvwAbilities) {
        this.wvwAbilities = wvwAbilities;
    }

    public CharacterCrafting[] getCraftings() {
        return craftings;
    }

    public void setCraftings(CharacterCrafting[] craftings) {
        this.craftings = craftings;
    }

    public Character(String name, String race, String gender, String profession, String guildID, String created, String[] backstory, String[] flags, int level, int age, int deaths, int title, int[] recipes, CharacterWVWAbilities[] wvwAbilities, CharacterCrafting[] craftings) {

        this.name = name;
        this.race = race;
        this.gender = gender;
        this.profession = profession;
        this.guildID = guildID;
        this.created = created;
        this.backstory = backstory;
        this.flags = flags;
        this.level = level;
        this.age = age;
        this.deaths = deaths;
        this.title = title;
        this.recipes = recipes;
        this.wvwAbilities = wvwAbilities;
        this.craftings = craftings;
    }
}

