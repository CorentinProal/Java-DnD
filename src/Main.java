import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personnage Hero = new Personnage("Nao","Magicien");
        Personnage Hero2 = new Personnage("Lucas","Guerrier");
        System.out.println(Hero);
        EquipementOffensif EquipementOffensif = new EquipementOffensif("Baton", "Sort");
        System.out.println(EquipementOffensif);
        System.out.println(Hero2);
        EquipementDefensif EquipementDefensif = new EquipementDefensif("Sac","Philtre");
        System.out.println(EquipementDefensif);
    }
}