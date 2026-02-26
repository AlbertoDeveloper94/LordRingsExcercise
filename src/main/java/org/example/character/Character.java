package org.example.character;

public class Character {

    private String name;
    private String weapon;
    private String job;

    private int age;
    private int life;

    private float speed;
    private float size;

    public Character(String name, String weapon, String job, int age, int life, float speed, float size) {
        this.name = name;
        this.weapon = weapon;
        this.job = job;
        this.age = age;
        this.life = life;
        this.speed = speed;
        this.size = size;
    }
}
