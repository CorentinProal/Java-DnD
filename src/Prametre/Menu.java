package Prametre;

import java.util.Scanner;
import Personnage.classe.Guerrier;
import Personnage.classe.Magicien;

public class Menu {
    private Scanner sc;

    public Menu() {
        sc = new Scanner(System.in);
    }

    public void Message(String message) {
        System.out.println(message);
        System.out.println();
    }

    public void CreationPersonnage(Game game) {
        System.out.print("C'est quoi ton petit nom ? : ");
        String playerName = sc.next();
        Message("Tu joues quoi ? :");
        Message("1. Guerrier");
        Message("2. Magicien");
        int choixClasse = game.ChoixOption(2); // Appel à la méthode ChoixOption de Game

        if (choixClasse == 1) {
            game.setPersonnage(new Guerrier(playerName));
        } else {
            game.setPersonnage(new Magicien(playerName));
        }

        Message("Et paf c'est fait !  " + "\n Tu peux maintenant aller voir tes stats !");
    }
}

//Importation et déclaration de classe :
//import java.util.Scanner; : Importation de la classe Scanner pour la lecture des entrées utilisateur.
//public class Prametre.Menu : Déclaration de la classe Prametre.Menu qui gère l'interface utilisateur pour le jeu.


//Attributs de la classe :
//private Scanner sc; : Instance de Scanner pour lire les entrées utilisateur.
//private Prametre.Game game; : Référence à un objet Prametre.Game, représentant la partie en cours.


//Constructeur :
//public Prametre.Menu() : Initialise le scanner pour la lecture des entrées.


//Méthode pour afficher des messages :
//public void Message(String message) : Affiche un message à l'utilisateur suivi d'une ligne vide.


//Méthode principale du menu :
//public void MenuDebut() :
//Affiche le menu principal du jeu et permet à l'utilisateur de choisir parmi plusieurs options (créer un personnage, voir les statistiques, démarrer la partie, quitter).
//Utilise un switch pour traiter le choix de l'utilisateur.


//Méthode de création de personnage :
//private void CreationPersonnage() :
//Demande le nom du joueur et la classe choisie (Guerrier ou Magicien).
//Crée un nouvel objet Prametre.Game avec ces informations et affiche un message de confirmation.


//Méthode pour afficher les informations du personnage :
//private void InfosPersonnage() :
//Affiche les détails du personnage si un personnage a été créé, y compris l'équipement offensif et défensif.
//Affiche un message si aucun personnage n'a été créé.


//Méthode pour jouer :
//private void Jouer() :
//Démarre la partie en affichant un message.
//Permet au joueur de lancer le dé en appuyant sur la barre d'espace.
//Gère le déplacement du personnage sur le plateau et vérifie si le jeu est terminé.
//Propose la possibilité de recommencer la partie ou de quitter à la fin