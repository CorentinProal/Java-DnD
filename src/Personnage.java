import java.util.Scanner;

public class Personnage {
    String name;
    String type;

    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void afficher() {
        System.out.println("Nom: " + name + ", Type: " + type);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type de personnage (Guerrier/Magicien) : ");
        String type = scanner.nextLine();
        System.out.print("Nom du personnage : ");
        String name = scanner.nextLine();
        Personnage personnage = new Personnage(name, type);
        personnage.afficher();
        scanner.close();
    }
}


