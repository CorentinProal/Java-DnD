package parametre.plateau.combat;

import parametre.plateau.Case;
import personnage.classe.Personnage;
import java.util.Scanner;

/**
 * The type Ennemi.
 */
public abstract class Ennemi extends Combat implements Case {
    /**
     * The Nom.
     */
    protected String nom;
    /**
     * The Vie.
     */
    protected int vie;
    /**
     * The Force.
     */
    protected int force;
    private String type;
    /**
     * The Scanner.
     */
    protected Scanner scanner; // Scanner doit être un champ de classe

    /**
     * Instantiates a new Ennemi.
     *
     * @param nom     the nom
     * @param vie     the vie
     * @param force   the force
     * @param scanner the scanner
     */
    public Ennemi(String nom, int vie, int force, Scanner scanner) {
        this.nom = nom;
        this.vie = vie;
        this.force = force;
        this.scanner = scanner; // Initialiser le scanner
    }

    @Override
    public void degatsInfliges(int degatsInfliges){
        vie -= degatsInfliges;
    }

    @Override
    public void attaque(Personnage joueur) {
        System.out.println("Le combat commence contre un " + this.nom + " !!");

        while (this.vie > 0 && joueur.getHP() > 0) {
            this.degatsInfliges(joueur.getATQ());
            System.out.println(this.nom + " reçoit " + joueur.getATQ() + " points de dégâts.");

            if (this.vie <= 0) {
                System.out.println("Tu as vaincu le " + this.nom + " !");
                break;
            }

            infligerDegats(joueur, this.getForce());
            System.out.println(joueur.getNom() + " reçoit " + this.getForce() + " points de dégâts.");

            if (joueur.getHP() <= 0) {
                System.out.println(joueur.getNom() + " est mort ! Viens à moi.\n " +
                        "                  ,____\n" +
                        "                   |---.\\\n" +
                        "           ___     |    `\n" +
                        "          / .-\\  ./=)\n" +
                        "         |  |\"|_/\\/|\n" +
                        "         ;  |-;| /_|\n" +
                        "        / \\_| |/ \\ |\n" +
                        "       /      \\/\\( |\n" +
                        "       |   /  |` ) |\n" +
                        "       /   \\ _/    |\n" +
                        "      /--._/  \\    |\n" +
                        "      `/|)    |    /\n" +
                        "        /     |   |\n" +
                        "      .'      |   |\n" +
                        "     /         \\  |\n" +
                        "    (_.-.__.__./  /\n" );

                System.exit(0); // Terminer le programme
            }

            // Demander au joueur s'il veut continuer à attaquer ou fuir
            System.out.println(" 1 - Continuer  \n 2 - Fuir ");
            int choix = scanner.nextInt();

            if (choix == 2) {
                System.out.println(joueur.getNom() + " a choisi de fuir !");
                break; // Sortir de la boucle de combat
            }
        }
    }

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Gets vie.
     *
     * @return the vie
     */
    public int getVie() {
        return vie;
    }

    public String toString(){
        return nom + " " + vie;
    }

    /**
     * Get force int.
     *
     * @return the int
     */
    public int getForce(){
        return force;
    }

    public abstract String getType();
}
