package com.guildwars2api.model.account;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Account {

    @SerializedName("id")
    public String id;
    @SerializedName("name")
    public String name;

    @SerializedName("guilds")
    public String[] guilds;
    @SerializedName("guild_leader")
    public String[] guild_leader;
    @SerializedName("access")
    public String[] access;

    @SerializedName("world")
    public int world;
    @SerializedName("fractal_level")
    public int fractal_level;
    @SerializedName("daily_ap")
    public int dailyAP;
    @SerializedName("monthly_ap")
    public int monthlyAp;
    @SerializedName("wvw_rank")
    public int wvwRank;

    @SerializedName("age")
    public double age;

    @SerializedName("commander")
    public boolean commander;

    @SerializedName("created")
    public Date created;

    public Account(){}

    public Account(String id, String name, String[] guilds, String[] guild_leader, String[] access, int world, int fractal_level, int dailyAP, int monthlyAp, int wvwRank, double age, boolean commander, Date created) {
        this.id = id;
        this.name = name;
        this.guilds = guilds;
        this.guild_leader = guild_leader;
        this.access = access;
        this.world = world;
        this.fractal_level = fractal_level;
        this.dailyAP = dailyAP;
        this.monthlyAp = monthlyAp;
        this.wvwRank = wvwRank;
        this.age = age;
        this.commander = commander;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getGuilds() {
        return guilds;
    }

    public void setGuilds(String[] guilds) {
        this.guilds = guilds;
    }

    public String[] getGuild_leader() {
        return guild_leader;
    }

    public void setGuild_leader(String[] guild_leader) {
        this.guild_leader = guild_leader;
    }

    public String[] getAccess() {
        return access;
    }

    public void setAccess(String[] access) {
        this.access = access;
    }

    public int getWorld() {
        return world;
    }

    public void setWorld(int world) {
        this.world = world;
    }

    public int getFractal_level() {
        return fractal_level;
    }

    public void setFractal_level(int fractal_level) {
        this.fractal_level = fractal_level;
    }

    public int getDailyAP() {
        return dailyAP;
    }

    public void setDailyAP(int dailyAP) {
        this.dailyAP = dailyAP;
    }

    public int getMonthlyAp() {
        return monthlyAp;
    }

    public void setMonthlyAp(int monthlyAp) {
        this.monthlyAp = monthlyAp;
    }

    public int getWvwRank() {
        return wvwRank;
    }

    public void setWvwRank(int wvwRank) {
        this.wvwRank = wvwRank;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public boolean isCommander() {
        return commander;
    }

    public void setCommander(boolean commander) {
        this.commander = commander;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
