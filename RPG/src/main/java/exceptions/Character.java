package exceptions;

public abstract class Character implements Movable {
    //Create class

    //Attributes
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected static String RPGClass = "Character";

    //Constructor
    public Character(String name) {
        this.name = name;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getAgility() {
        return agility;
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public static String getRPGClass() {
        return RPGClass;
    }

    //Method that takes a string as argument, and prints text
    public void attack(String word){
        System.out.println(getName() + ": Rrrrrrrrr....");
    }

    //Interface
    @Override
    public void moveBack() {
        System.out.println(getName() + ": moves back");
    }

    @Override
    public void moveForward() {
        System.out.println(getName() + ": moves forward");
    }

    @Override
    public void moveLeft() {
        System.out.println(getName() + ": moves left");
    }

    @Override
    public void moveRight() {
        System.out.println(getName() + ": moves right");
    }

    @Override
    public void unsheathe() {
        Movable.super.unsheathe();
        System.out.println(getName() + ": unsheathes his weapon.");
    }
}
