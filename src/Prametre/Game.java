package Prametre;

import Personnage.Personnage;
import java.util.Scanner;
import Prametre.Plateau.Case.Case;
import Prametre.Plateau.Plateau;
import java.util.Random;

public class Game {
    private Personnage personnage;
    private int position;
    private final int LimitePlateau = 64;
    private Scanner sc;
    private Menu menu;
    private Plateau plateau;
    private Random random = new Random();

    public Game() {
        this.sc = new Scanner(System.in);
        this.menu = new Menu();
        this.plateau = new Plateau();
        this.position = 1;
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

        menu.message("\n Bienvenue chez Kayangel !");

        while (continuer) {
            afficherMenu();
            int choix = choixOption(4);

            switch (choix) {
                case 1:
                    menu.creationPersonnage(this);
                    break;
                case 2:
                    infosPersonnage();
                    break;
                case 3:
                    if (personnage != null) {
                        jouerUnTour();
                    } else {
                        menu.message("Il te faut un perso.");
                    }
                    break;
                case 4:
                    menu.message("Merci d'avoir joué !" + "\n T'es un GOAT");
                    continuer = false;
                    break;
                default:
                    menu.message("Option invalide.");
                    break;
            }
        }
    }

    private void afficherMenu() {
        menu.message("1. Créer ton perso ");
        menu.message("2. Voir tes stats ");
        menu.message("3. Ça part ! ");
        menu.message("4. fin du game ");
    }

    int choixOption(int nombreOptions) {
        int choix;
        do {
            System.out.print("Choisissez une option (1-" + nombreOptions + "): ");
            choix = sc.nextInt();
        } while (choix < 1 || choix > nombreOptions);
        return choix;
    }

    public boolean jouerUnTour() throws PersonnageHorsPlateauException {
        int lancerDe = random.nextInt(6) + 1;
        System.out.println("Lancer de dé : " + lancerDe);
        position += lancerDe;
        if (position > LimitePlateau) {
            throw new PersonnageHorsPlateauException("Tu es hors plateau !");
        }
        System.out.println("Vous avancez de " + lancerDe + " cases. Vous êtes maintenant sur la case " + position + "/" + LimitePlateau);
        
        Case currentCase = plateau.getCase(position);
        System.out.println(currentCase.toString());

        return position >= LimitePlateau; // Retourne vrai si le jeu est fini
    }

    public void message(String message) {
        System.out.println(message);
        System.out.println();
    }

    private void infosPersonnage() {
        if (personnage != null) {
            message(personnage.toString());
            String equipOffensif = personnage.getEquipementOffensif().toString();
            System.out.println("Equipement offensif : " + equipOffensif);
            System.out.println("");
            String equipDefensif = personnage.getEquipementDefensif().toString();
            System.out.println("Equipement défensif : " + equipDefensif);
            System.out.println();
        } else {
            message("Aucun personnage n'a été créé.");
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



// Cette méthode simule le déroulement d'un tour de jeu.
//- Elle commence par appeler la méthode Deplacement(), qui gère le mouvement
//   du personnage sur le plateau.
// - Ensuite, elle récupère la case actuelle du plateau sur laquelle se trouve
//   le personnage, en utilisant sa position actuelle.
// - Enfin, elle affiche les informations de la case actuelle à la console
//   en appelant la méthode toString() de l'objet Case.
// @throws PersonnageHorsPlateauException si le personnage sort des limites du plateau