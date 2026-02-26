package org.example.alignment.evil;

import org.example.character.Character;

public class Urukhai extends Character {

    private int highSunResistance;
    private int magicResistance;

    public Urukhai(String name, String weapon, String job, int age, int life, float speed, float size, int highSunResistance, int magicResistance) {
        super(name, weapon, job, age, life, speed, size);
        this.highSunResistance = highSunResistance;
        this.magicResistance = magicResistance;
    }

    public int getMagicResistance() {
        return magicResistance;
    }

    public void setMagicResistance(int magicResistance) {
        this.magicResistance = magicResistance;
    }

    public int getHighSunResistance() {
        return highSunResistance;
    }

    public void setHighSunResistance(int highSunResistance) {
        this.highSunResistance = highSunResistance;
    }

    @Override
    public String showInfoCharacter() {
        return super.showInfoCharacter() +
                "Resistencia alta al sol: " + highSunResistance
                + "Resistencia a la magia: " + magicResistance;
    }
}
