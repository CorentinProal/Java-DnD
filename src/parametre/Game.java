package parametre;

import parametre.plateau.horsPlateauException;
import personnage.classe.Personnage;
import personnage.classe.Guerrier;
import personnage.classe.Magicien;
import java.util.Scanner;
import parametre.plateau.Plateau;

/**
 * The type Game.
 */
public class Game {
    private Personnage personnage;
    private int position;
    private Scanner sc;
    private Menu menu;
    private Plateau plateau;

    /**
     * Instantiates a new Game.
     */
    public Game() {
        this.sc = new Scanner(System.in);
        this.menu = new Menu();
        this.position = 0;
    }

    /**
     * Sets personnage.
     *
     * @param personnage the personnage
     */
    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
        this.plateau = new Plateau(personnage);
    }

    /**
     * Gets personnage.
     *
     * @return the personnage
     */
    public Personnage getPersonnage() {
        return personnage;
    }

    /**
     * Start.
     *
     * @throws horsPlateauException the hors plateau exception
     */
    public void start() throws horsPlateauException {
        boolean continuer = true;

        menu.message("\n Bienvenue chez Kayangel ! \n              v\n" +
                "        (__)v | v\n" +
                "        /\\/\\\\_|_/\n" +
                "       _\\__/  |\n" +
                "      /  \\/`\\<`)\n" +
                "      \\ (  |\\_/\n" +
                "      /)))-(  |\n" +
                "     / /^ ^ \\ |\n" +
                "    /  )^/\\^( |\n" +
                "    )_//`__>> |\n");

        while (continuer) {
            if (personnage == null) {
                menu.message("1. Créer ton perso ");
                menu.message("2. Quitter le jeu ");
                int choix = choixOption(2);

                switch (choix) {
                    case 1:
                        personnage = creerPersonnage();
                        setPersonnage(personnage);
                        System.out.println("");
                        menu.message("Et paf c'est fait !  " + "\n Tu peux maintenant aller voir tes stats !");
                        break;
                    case 2:
                        System.out.println("");
                        menu.message("Merci d'avoir joué !" + "\n  _/|       |\\_\n" +
                                " /  |       |  \\\n" +
                                "|    \\     /    |\n" +
                                "|  \\ /     \\ /  |\n" +
                                "| \\  |     |  / |\n" +
                                "| \\ _\\_/^\\_/_ / |\n" +
                                "|    --\\//--    |\n" +
                                " \\_  \\     /  _/\n" +
                                "   \\__  |  __/\n" +
                                "      \\ _ /\n" +
                                "     _/   \\_ \n" +
                                "    / _/|\\_ \\\n" +
                                "     /  |  \\ \n" +
                                "      / v \\");
                        continuer = false;
                        break;
                    default:
                        System.out.println("");
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
                        System.out.println("");
                        menu.message("Merci d'avoir joué !" + "\n T'es un GOAT");
                        continuer = false;
                        break;
                    default:
                        System.out.println("");
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
            System.out.println("");
            System.out.print("Choisissez une option (1-" + nombreOptions + "): ");
            choix = sc.nextInt();
        } while (choix < 1 || choix > nombreOptions);
        return choix;
    }
}
