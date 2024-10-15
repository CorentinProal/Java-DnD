package parametre;

import personnage.Personnage;
import personnage.classe.Guerrier;
import personnage.classe.Magicien;
import java.util.Scanner;
import parametre.plateau.Plateau;

public class Game {
    private Personnage personnage;
    private int position;
    private Scanner sc;
    private Menu menu;
    private Plateau plateau;

    public Game() {
        this.sc = new Scanner(System.in);
        this.menu = new Menu();
        this.position = 0;
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
        this.plateau = new Plateau(personnage);
    }

    public Personnage getPersonnage() {
        return personnage;
    }

    public void start() throws horsPlateauException {
        boolean continuer = true;

        menu.message("\n Bienvenue chez Kayangel !");

        while (continuer) {
            if (personnage == null) {
                menu.message("1. Créer ton perso ");
                menu.message("2. Quitter le jeu ");
                int choix = choixOption(2);

                switch (choix) {
                    case 1:
                        personnage = creerPersonnage();
                        setPersonnage(personnage);
                        menu.message("Et paf c'est fait !  " + "\n Tu peux maintenant aller voir tes stats !");
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
                int choix = choixOption(3);

                switch (choix) {
                    case 1:
                        menu.afficherInfosPersonnage(personnage);
                        break;
                    case 2:
                        continuer = !plateau.jouerUnTour(position, personnage);
                        position += plateau.getDernierLancer();
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

    private Personnage creerPersonnage() {
        String nomJoueur = menu.nomPersonnage();
        int choixClasse = menu.classePersonnage();

        if (choixClasse == 1) {
            return new Guerrier(nomJoueur);
        } else {
            return new Magicien(nomJoueur);
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
