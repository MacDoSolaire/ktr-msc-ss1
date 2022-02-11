import RPGClass.Character;
import RPGClass.Mage;
import RPGClass.Warrior;

public class Example {
    public static void main(String[] args) {
        //Example 1 :
        System.out.println("Example 1");
        Character perso = new TestCharacter("Jean-Luc");
        System.out.println(perso.getName());
        System.out.println(perso.getLife());
        System.out.println(perso.getAgility());
        System.out.println(perso.getStrength());
        System.out.println(perso.getWit());
        System.out.println(perso.getRPGClass());
        perso.attack("my weapon");

        //Example 2 :
        System.out.println("Example 2");
        Character warrior = new Warrior("Jean-Luc");
        Character mage = new Mage("Robert");

        warrior.attack("hammer");
        mage.attack("magic");

        //Example 3 :
        System.out.println("Example 3");
        Warrior warrior2 = new Warrior("Jean-Luc");
        Mage mage2 = new Mage("Robert");

        warrior2.moveRight();
        warrior2.moveLeft();
        warrior2.moveBack();
        warrior2.moveForward();
        mage2.moveRight();
        mage2.moveLeft();
        mage2.moveBack();
        mage2.moveForward();
    }
}
