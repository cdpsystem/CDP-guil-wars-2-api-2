package com.guildwars2api.model.character;

public class CharacterTraining {
    public int id,spent;
    public boolean isDone;

    public CharacterTraining(int id, int spent, boolean isDone) {
        this.id = id;
        this.spent = spent;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpent() {
        return spent;
    }

    public void setSpent(int spent) {
        this.spent = spent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
