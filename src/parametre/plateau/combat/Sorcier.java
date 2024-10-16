package parametre.plateau.combat;

import personnage.classe.Personnage;
import java.util.Scanner;

/**
 * The type Sorcier.
 */
public class Sorcier extends Ennemi {
    /**
     * Instantiates a new Sorcier.
     *
     * @param scanner the scanner
     */
    public Sorcier(Scanner scanner) {
        super("Sorcier", 15, 9, scanner);
    }

    @Override
    public String toString() {
        return "Un " + nom + " avec " + vie + " HP et une force de " + force + ".";
    }

    @Override
    public String getType() {
        return "Monstre";
    }

    @Override
    public void interaction(Personnage joueur) {
        this.attaque(joueur);

    }
}
