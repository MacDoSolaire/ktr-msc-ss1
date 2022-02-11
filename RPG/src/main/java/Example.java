import RPGClass.Character;
import RPGClass.Mage;
import RPGClass.Warrior;

public class Example {
    public static void main(String[] args) {
        //Example 1 :
        Character perso = new TestCharacter("Jean-Luc");
        System.out.println(perso.getName());
        System.out.println(perso.getLife());
        System.out.println(perso.getAgility());
        System.out.println(perso.getStrength());
        System.out.println(perso.getWit());
        System.out.println(perso.getRPGClass());
        perso.attack("my weapon");

        //Example 2 :
        Character warrior = new Warrior("Jean-Luc");
        Character mage = new Mage("Robert");

        warrior.attack("hammer");
        mage.attack("magic");
    }
}
