package org.example.alignment.good;

import org.example.character.Character;

public class Hobbit extends Character {

    private int stealth;
    private boolean discretion;
    private boolean luck;

    public Hobbit(String name, String weapon, String job, int age, int life, float speed, float size, int stealth, boolean discretion, boolean luck) {
        super(name, weapon, job, age, life, speed, size);
        this.stealth = stealth;
        this.discretion = discretion;
        this.luck = luck;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public boolean isDiscretion() {
        return discretion;
    }

    public void setDiscretion(boolean discretion) {
        this.discretion = discretion;
    }

    public boolean isLuck() {
        return luck;
    }

    public void setLuck(boolean luck) {
        this.luck = luck;
    }

    @Override
    public String showInfoCharacter() {
        return super.showInfoCharacter() +
                "Sigilo: " + stealth
                + "Discreción: " + discretion
                + "Suerte: " + luck;
    }
}
