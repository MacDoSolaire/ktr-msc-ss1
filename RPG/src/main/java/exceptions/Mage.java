package exceptions;

public class Mage extends Character{
    public Mage(String name) {
        super(name);
        RPGClass = "Mage";
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(getName() + ": May the gods be with me.");
    }

    public void attack(String word) throws WeaponException {
        if (word.isEmpty()){
            throw new WeaponException(getName() + ": I refuse to fight with my bare hands.");
        }
        if(word.equals("magic") || word.equals("wand")){
            System.out.println(getName() + ": Rrrrrrrrr....");
            System.out.println(getName() + ": Feel the power of my " + word + "!");
        }else{
            System.out.println(getName() + ": I don't need this stupid " + word + "! Don't misjudge my powers!");
        }
    }

    public void tryToAttack(String word){
        try {
            attack(word);
        } catch (WeaponException e) {
            e.printStackTrace();
        }
    }

    //Interface
    @Override
    public void moveBack() {
        System.out.println(getName() + ": moves back furtively.");
    }

    @Override
    public void moveForward() {
        System.out.println(getName() + ": moves forward furtively.");
    }

    @Override
    public void moveLeft() {
        System.out.println(getName() + ": moves left furtively.");
    }

    @Override
    public void moveRight() {
        System.out.println(getName() + ": moves right furtively.");
    }
}
