package com.guildwars2api.model.character;

import com.google.gson.annotations.SerializedName;

public class CharacterSkills {

    @SerializedName("pve")
    public CharacterSKillsPVE cspve;

    @SerializedName("pvp")

    public CharacterSKillsPVP cspvp;

    @SerializedName("wvw")
    public CharacterSKillsWVW cswvw;

    public CharacterSkills(){}

    public CharacterSkills(CharacterSKillsPVE cspve, CharacterSKillsPVP cspvp, CharacterSKillsWVW cswvw) {
        this.cspve = cspve;
        this.cspvp = cspvp;
        this.cswvw = cswvw;
    }

    public CharacterSKillsPVE getCspve() {
        return cspve;
    }

    public void setCspve(CharacterSKillsPVE cspve) {
        this.cspve = cspve;
    }

    public CharacterSKillsPVP getCspvp() {
        return cspvp;
    }

    public void setCspvp(CharacterSKillsPVP cspvp) {
        this.cspvp = cspvp;
    }

    public CharacterSKillsWVW getCswvw() {
        return cswvw;
    }

    public void setCswvw(CharacterSKillsWVW cswvw) {
        this.cswvw = cswvw;
    }
}
