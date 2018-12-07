package com.guildwars2api.model.character;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Characters extends ArrayList<Character> {
    public List<String> characterNames;

    public Characters(int initialCapacity, List<String> characterNames) {
        super(initialCapacity);
        this.characterNames = characterNames;
    }

    public Characters(List<String> characterNames) {
        this.characterNames = characterNames;
    }

    public Characters(Collection<? extends Character> c, List<String> characterNames) {
        super(c);
        this.characterNames = characterNames;
    }

    public Characters() {

    }

    public List<String> getCharacterNames() {
        return characterNames;
    }

    public void setCharacterNames(List<String> characterNames) {
        this.characterNames = characterNames;
    }
}
