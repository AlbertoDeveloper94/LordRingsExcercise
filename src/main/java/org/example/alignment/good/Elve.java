package org.example.alignment.good;

import org.example.character.Character;

public class Elve extends Character {

    private int inmortality;
    private boolean natureConnection;
    private boolean ancestralMemory;

    public Elve(String name, String weapon, String job, int age, int life, float speed, float size, int inmortality, boolean natureConnection, boolean ancestralMemory) {
        super(name, weapon, job, age, life, speed, size);
        this.inmortality = inmortality;
        this.natureConnection = natureConnection;
        this.ancestralMemory = ancestralMemory;
    }

    public int getInmortality() {
        return inmortality;
    }

    public void setInmortality(int inmortality) {
        this.inmortality = inmortality;
    }

    public boolean isNatureConnection() {
        return natureConnection;
    }

    public void setNatureConnection(boolean natureConnection) {
        this.natureConnection = natureConnection;
    }

    public boolean isAncestralMemory() {
        return ancestralMemory;
    }

    public void setAncestralMemory(boolean ancestralMemory) {
        this.ancestralMemory = ancestralMemory;
    }

    @Override
    public String showInfoCharacter() {
        return super.showInfoCharacter() +
                "Inmortalidad: " + inmortality
                + "Conexión con la naturaleza: " + natureConnection
                + "Memoria ancestral: " + ancestralMemory;
    }
}
