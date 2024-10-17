package parametre;

import java.util.Scanner;
import personnage.classe.Personnage;

public class Menu {
    private Scanner sc;

    public Menu() {
        sc = new Scanner(System.in);
    }

    public void message(String message) {
        System.out.println("");
        System.out.println(message);
        System.out.println();
    }

    public String nomPersonnage() {
        System.out.println("");
        System.out.print("C'est quoi ton petit nom ? : ");
        return sc.next();
    }

    public int classePersonnage() {
        message("Tu joues quoi ? :");
        message("1. Guerrier");
        message("2. Magicien");
        return choixOption(2);
    }

    public void afficherMenu() {
        System.out.println("");
        message("1. Voir tes stats ");
        message("2. Ça part ! ");
        message("3. Quitter le jeu ");
    }

    public void afficherInfosPersonnage(Personnage personnage) {
        if (personnage != null) {
            message(personnage.toString());
        } else {
            message("Aucun personnage n'a été créé.");
        }
    }

    private int choixOption(int nombreOptions) {
        int choix;
        do {
            System.out.print("Choisissez une option (1-" + nombreOptions + "): ");
            choix = sc.nextInt();
        } while (choix < 1 || choix > nombreOptions);
        return choix;
    }
}


// Classe Menu : Gère l'interface utilisateur pour le jeu.
// Attributs :
// - Scanner sc : Pour la saisie utilisateur.
//
// Constructeur :
// - Menu() : Initialise le scanner pour la lecture des entrées.
//
// Méthodes :
// - message(String message) : Affiche un message à l'utilisateur.
// - creationPersonnage(Game game) : Crée un personnage en demandant le nom et la classe (Guerrier ou Magicien).
// - afficherMenu() : Affiche le menu de jeu.
// - afficherInfosPersonnage(Personnage personnage) : Affiche les informations du personnage.
