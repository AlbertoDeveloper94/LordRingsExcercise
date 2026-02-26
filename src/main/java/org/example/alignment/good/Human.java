package org.example.alignment.good;

import org.example.character.Character;

public class Human extends Character {

    private int versality;
    private boolean deadlyCourage;
    private boolean heroicAmbition;

    public Human(String name, String weapon, String job, int age, int life, float speed, float size, int versality, boolean deadlyCourage, boolean heroicAmbition) {
        super(name, weapon, job, age, life, speed, size);
        this.versality = versality;
        this.deadlyCourage = deadlyCourage;
        this.heroicAmbition = heroicAmbition;
    }

    public int getVersality() {
        return versality;
    }

    public void setVersality(int versality) {
        this.versality = versality;
    }

    public boolean isDeadlyCourage() {
        return deadlyCourage;
    }

    public void setDeadlyCourage(boolean deadlyCourage) {
        this.deadlyCourage = deadlyCourage;
    }

    public boolean isHeroicAmbition() {
        return heroicAmbition;
    }

    public void setHeroicAmbition(boolean heroicAmbition) {
        this.heroicAmbition = heroicAmbition;
    }

    @Override
    public String showInfoCharacter() {
        return super.showInfoCharacter() +
                "Versatilidad: " + versality
                + "Coraje mortal: " + deadlyCourage
                + "Ambición heroica: " + heroicAmbition;
    }
}
