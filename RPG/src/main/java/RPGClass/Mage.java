package RPGClass;

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

    public void attack(String word){
        if(word.equals("magic") || word.equals("wand")){
            System.out.println(getName() + ": Rrrrrrrrr....");
            System.out.println(getName() + ": Feel the power of my " + word + "!");
        }else{
            System.out.println(getName() + ": can't attack");
        }
    }
}
