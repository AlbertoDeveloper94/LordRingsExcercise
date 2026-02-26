package org.example.alignment.evil;

import org.example.character.Character;

public class Orc extends Character {

    private int lowSunResistance;
    private boolean canibalism;

    public Orc(String name, String weapon, String job, int age, int life, float speed, float size, boolean canibalism, int lowSunResistance) {
        super(name, weapon, job, age, life, speed, size);
        this.canibalism = canibalism;
        this.lowSunResistance = lowSunResistance;
    }

    public int getLowSunResistance() {
        return lowSunResistance;
    }

    public void setLowSunResistance(int lowSunResistance) {
        this.lowSunResistance = lowSunResistance;
    }

    public boolean isCanibalism() {
        return canibalism;
    }

    public void setCanibalism(boolean canibalism) {
        this.canibalism = canibalism;
    }

    @Override
    public String showInfoCharacter() {
        return super.showInfoCharacter() +
                "Resistencia baja al sol: " + lowSunResistance
                + "Canibalismo: " + canibalism;
    }
}
