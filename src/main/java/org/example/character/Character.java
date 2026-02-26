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

    public void showInfoCharacter(){
        System.out.println("Nombre del personaje: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Vida: " + life);
        System.out.println("Profesión: " + job);
        System.out.println("Arma equipada: " + weapon);
        System.out.println("Velocidad: " + speed);
        System.out.println("Altura: " + size);
    };

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
}
