package org.example.alignment.neutral;

import org.example.character.Character;

public class MaiarValar extends Character {

    private int powerCreation;

    public MaiarValar(String name, String weapon, String job, int age, int life, float speed, float size, int powerCreation) {
        super(name, weapon, job, age, life, speed, size);
        this.powerCreation = powerCreation;
    }

    public int getPowerCreation() {
        return powerCreation;
    }

    public void setPowerCreation(int powerCreation) {
        this.powerCreation = powerCreation;
    }

    @Override
    public String showInfoCharacter() {
        return super.showInfoCharacter() +
                "Creación de poder: " + powerCreation;
    }
}
