import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personnage Hero = new Personnage("Nao","Magicien");
        Personnage Hero2 = new Personnage("Lucas","Guerrier");
        System.out.println(Hero);
        System.out.println(Hero2);
        EquipementOffensif EquipementOffensif = new EquipementOffensif("", "Sort");
        System.out.println(EquipementOffensif);
        EquipementDefensif EquipementDefensif = new EquipementDefensif("","Philtre");
        System.out.println(EquipementDefensif);

    }
}





//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Type de personnage (Guerrier/Magicien) : ");
//        String type = scanner.nextLine();
//        System.out.print("Nom du personnage : ");
//        String name = scanner.nextLine();
//        scanner.close();