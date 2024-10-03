import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type de personnage (Guerrier/Magicien) : ");
        String type = scanner.nextLine();
        System.out.print("Nom du personnage : ");
        String name = scanner.nextLine();
        Personnage personnage = new Personnage(name, type);
        personnage.afficher();
        scanner.close();

//        Personnage personnage = new Personnage("Remi", "Guerrier");
//        Personnage personnage1 = new Personnage("Nao","Magicien");
//        personnage.afficher();
//        personnage1.afficher();
    }
}