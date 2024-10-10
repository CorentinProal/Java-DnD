package Prametre;

import java.util.Scanner;
import Personnage.classe.Guerrier;
import Personnage.classe.Magicien;
import Personnage.Personnage;

public class Menu {
    private Scanner sc;

    public Menu() {
        sc = new Scanner(System.in);
    }

    public void message(String message) {
        System.out.println(message);
        System.out.println();
    }

    public void creationPersonnage(Game game) {
        System.out.print("C'est quoi ton petit nom ? : ");
        String playerName = sc.next();
        message("Tu joues quoi ? :");
        message("1. Guerrier");
        message("2. Magicien");
        int choixClasse = game.choixOption(2);

        if (choixClasse == 1) {
            game.setPersonnage(new Guerrier(playerName));
        } else {
            game.setPersonnage(new Magicien(playerName));
        }

        message("Et paf c'est fait !  " + "\n Tu peux maintenant aller voir tes stats !");
    }

    public void afficherMenu() {
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
