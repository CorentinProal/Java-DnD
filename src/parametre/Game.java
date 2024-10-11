package parametre;

import personnage.Personnage;
import java.util.Scanner;
import parametre.plateau.cases.Case;
import parametre.plateau.Plateau;
import java.util.Random;

public class Game {
    private Personnage personnage;
    private int position;
    private Scanner sc;
    private Menu menu;
    private Plateau plateau;
    private Random random = new Random();

    public Game() {
        this.sc = new Scanner(System.in);
        this.menu = new Menu();
        this.plateau = new Plateau();
        this.position = 0;
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

    public Personnage getPersonnage() {
        return personnage;
    }

    public void start() throws PersonnageHorsPlateauException {
        boolean continuer = true;

        menu.message("\n Bienvenue chez Kayangel !");

        while (continuer) {
            if (personnage == null) {
                menu.message("1. Créer ton perso ");
                menu.message("2. Quitter le jeu ");
                int choix = choixOption(2);

                switch (choix) {
                    case 1:
                        menu.creationPersonnage(this);
                        break;
                    case 2:
                        menu.message("Merci d'avoir joué !" + "\n T'es un GOAT");
                        continuer = false;
                        break;
                    default:
                        menu.message("Option invalide.");
                        break;
                }
            } else {
                menu.afficherMenu();
                int choix = choixOption(4);

                switch (choix) {
                    case 1:
                        menu.afficherInfosPersonnage(personnage);
                        break;
                    case 2:
                        jouerUnTour();
                        break;
                    case 3:
                        menu.message("Merci d'avoir joué !" + "\n T'es un GOAT");
                        continuer = false;
                        break;
                    default:
                        menu.message("Option invalide.");
                        break;
                }
            }
        }
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
        return plateau.jouerUnTour(position);
    }

    private void afficherCaseActuelle() {
        Case currentCase = plateau.getCase(position);
        System.out.println(currentCase.toString());
    }
}

// Classe Game : Gère le déroulement du jeu, y compris la création du personnage, le mouvement sur le plateau et l'affichage des informations.
// Attributs : 
// - Personnage personnage : Représente le personnage du joueur.
// - int position : Indique la position actuelle du joueur sur le plateau (1 à 64).
// - Scanner sc : Pour la saisie utilisateur.
// - Menu menu : Gère l'affichage du menu.
// - Plateau plateau : Représente le plateau de jeu.
// - Random random : Pour générer des nombres aléatoires (lancer de dé).
//
// Constructeur : 
// - Game() : Initialise le jeu, le personnage, la position et le menu.
//
// Méthodes : 
// - setPersonnage(Personnage personnage) : Définit le personnage du joueur.
// - getPersonnage() : Renvoie le personnage du joueur.
// - getPosition() : Renvoie la position actuelle du joueur.
// - setPosition(int position) : Modifie la position du joueur.
// - start() : Démarre le jeu et gère le menu principal.
// - afficherMenu() : Affiche les options du menu.
// - choixOption(int nombreOptions) : Demande à l'utilisateur de choisir une option.
// - jouerUnTour() : Gère le déroulement d'un tour de jeu.
// - lancerDe() : Simule un lancer de dé (1 à 6).
// - verifierPosition() : Vérifie si la position du joueur est valide.
// - afficherCaseActuelle() : Affiche la case actuelle sur le plateau.
// - message(String message) : Affiche un message à l'utilisateur.
// - infosPersonnage() : Affiche les informations du personnage.