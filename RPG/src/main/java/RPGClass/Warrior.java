package RPGClass;

import java.util.Objects;

public class Warrior extends Character{
    public Warrior(String name) {
        super(name);
        RPGClass = "Warrior";
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        System.out.println(getName() + ": My name will go down in history!");
    }

    public void attack(String word){
        if(word.equals("hammer") || word.equals("sword")){
            System.out.println(getName() + ": Rrrrrrrrr....");
            System.out.println(getName() + ": I'll crush you with my " + word + "!");
        }else{
            System.out.println(getName() + ": can't attack");
        }
    }

    //Interface
    @Override
    public void moveBack() {
        System.out.println(getName() + ": moves back like a bad boy.");
    }

    @Override
    public void moveForward() {
        System.out.println(getName() + ": moves forward like a bad boy.");
    }

    @Override
    public void moveLeft() {
        System.out.println(getName() + ": moves left like a bad boy.");
    }

    @Override
    public void moveRight() {
        System.out.println(getName() + ": moves right like a bad boy.");
    }
}
