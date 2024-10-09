package Prametre;

import Personnage.Personnage;
import java.util.Scanner;
import Prametre.Menu;
import Prametre.Plateau.Case.Case;
import Prametre.Plateau.Plateau;
import java.util.Random; // Import the Random class

public class Game {
    private Personnage personnage;
    private int position;  // Position actuelle du joueur sur le plateau (1 à 64)
    private final int LimitePlateau = 64;  // Fin du plateau
    private Scanner sc;
    private Menu menu;
    private Plateau plateau; // Ajout du plateau
    private Random random = new Random(); // Initialize the Random object

    public Game() {
        this.sc = new Scanner(System.in);
        this.menu = new Menu();
        this.plateau = new Plateau(); // Initialisation du plateau
        this.position = 1; // Position de départ
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

    public Personnage getPersonnage() {
        return personnage;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void start() throws PersonnageHorsPlateauException {
        boolean continuer = true;

        menu.Message("\n Bienvenue chez Kayangel !");

        while (continuer) {
            afficherMenu();
            int choix = ChoixOption(4);

            switch (choix) {
                case 1:
                    menu.CreationPersonnage(this);
                    break;
                case 2:
                    InfosPersonnage();
                    break;
                case 3:
                    if (personnage != null) {
                        jouer_un_tour(); // Appel de la méthode jouer_un_tour()
                    } else {
                        menu.Message("Il te faut un perso.");
                    }
                    break;
                case 4:
                    menu.Message("Merci d'avoir joué !" + "\n T'es un GOAT");
                    continuer = false;
                    break;
                default:
                    menu.Message("Option invalide.");
                    break;
            }
        }
    }

    private void afficherMenu() {
        menu.Message("1. Créer ton perso ");
        menu.Message("2. Voir tes stats ");
        menu.Message("3. Ça part ! ");
        menu.Message("4. Fin du game ");
    }

    int ChoixOption(int nombreOptions) {
        int choix;
        do {
            System.out.print("Choisissez une option (1-" + nombreOptions + "): ");
            choix = sc.nextInt();
        } while (choix < 1 || choix > nombreOptions);
        return choix;
    }

    public void Deplacement() throws PersonnageHorsPlateauException {
        // Générer un nombre aléatoire entre 1 et 6
        int lancerDe = random.nextInt(6) + 1; // nextInt(6) génère un nombre entre 0 et 5, donc on ajoute 1
        System.out.println("Lancer de dé : " + lancerDe); // Afficher la valeur du dé
        position += lancerDe; // Ajouter le résultat du dé à la position actuelle
        if (position > LimitePlateau) {
            throw new PersonnageHorsPlateauException("Tu es hors plateau !");
        }
        System.out.println("Vous avancez de " + lancerDe + " cases. Vous êtes maintenant sur la case " + position + "/" + LimitePlateau);
    }

    public boolean Fin() {
        return position >= LimitePlateau;
    }

    public void Message(String message) {
        System.out.println(message);
        System.out.println();
    }

    public void jouer_un_tour() throws PersonnageHorsPlateauException {
        Deplacement(); // Lancer le dé et déplacer le joueur
        Case currentCase = plateau.getCase(position); // Obtenir la case actuelle

        // Logique d'interaction avec la case
        System.out.println(currentCase.toString()); // Afficher le message de la case
    }

    private void InfosPersonnage() {
        if (personnage != null) {
            Message(personnage.toString());
            String equipOffensif = personnage.getEquipementOffensif().toString();
            System.out.println("Equipement offensif : " + equipOffensif);
            System.out.println("");
            String equipDefensif = personnage.getEquipementDefensif().toString();
            System.out.println("Equipement défensif : " + equipDefensif);
            System.out.println();
        } else {
            Message("Aucun personnage n'a été créé.");
        }
    }
}

//Attributs de la classe :
//private Personnage.Personnage personnage; : Représente le personnage du joueur.
//private int position; : Indique la position actuelle du joueur sur le plateau de jeu, qui varie de 1 à 64.
//private final int LimitePlateau = 64; : Constante qui définit la limite supérieure du plateau de jeu.


//Constructeur :
//public Prametre.Game(String nom, String type) : Crée une nouvelle instance de Prametre.Game en initialisant le personnage avec un nom et un type, et en plaçant le joueur à la position de départ (1).


//Accesseurs (Getters) :
//public Personnage.Personnage getPersonnage() : Renvoie le personnage du joueur.
//public int getPosition() : Renvoie la position actuelle du joueur sur le plateau.


//Mutateur (Setter) :
//public void setPosition(int position) : Permet de modifier la position du joueur.


//Méthode de déplacement :
//public void Delpacement() :
//Génère un nombre aléatoire entre 1 et 6, simulant un lancer de dé.
//Ajoute ce nombre à la position actuelle du joueur.
//Si la nouvelle position dépasse la limite du plateau, elle est ajustée à la limite (64).
//Affiche un message indiquant le nombre de cases avancées et la nouvelle position du joueur.


//Méthode de vérification de fin de jeu :
//public boolean Fin() : Vérifie si le joueur a atteint ou dépassé la position 64, indiquant la fin du jeu.


//Méthode de représentation en chaîne :
//public String toString() : Renvoie une représentation textuelle de l'état actuel du jeu, incluant les détails du personnage et sa position sur le plateau.