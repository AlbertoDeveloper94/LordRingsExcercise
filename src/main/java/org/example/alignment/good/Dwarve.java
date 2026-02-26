package org.example.alignment.good;

import org.example.character.Character;

public class Dwarve extends Character {

    private int defence;
    private boolean masteryForging;
    private boolean fortress;

    public Dwarve(String name, String weapon, String job, int age, int life, float speed, float size, int defence, boolean masteryForging, boolean fortress) {
        super(name, weapon, job, age, life, speed, size);
        this.defence = defence;
        this.masteryForging = masteryForging;
        this.fortress = fortress;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public boolean isMasteryForging() {
        return masteryForging;
    }

    public void setMasteryForging(boolean masteryForging) {
        this.masteryForging = masteryForging;
    }

    public boolean isFortress() {
        return fortress;
    }

    public void setFortress(boolean fortress) {
        this.fortress = fortress;
    }

    @Override
    public String showInfoCharacter() {
        return super.showInfoCharacter() +
                 "Defensa: " + defence
                + "Maestria Forja: " + masteryForging
                + "Fortaleza: " + fortress;
    }
}
