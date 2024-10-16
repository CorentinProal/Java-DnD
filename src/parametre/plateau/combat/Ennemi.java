package parametre.plateau.combat;

import parametre.plateau.Case;
import personnage.classe.Personnage;
import java.util.Scanner;

public abstract class Ennemi extends Combat implements Case {
    protected String nom;
    protected int vie;
    protected int force;
    private String type;
    protected Scanner scanner; // Scanner doit être un champ de classe

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

    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }

    public String toString(){
        return nom + " " + vie;
    }

    public int getForce(){
        return force;
    }

    public abstract String getType();
}
