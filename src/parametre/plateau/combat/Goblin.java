package parametre.plateau.combat;

import personnage.classe.Personnage;
import java.util.Scanner;

/**
 * The type Goblin.
 */
public class Goblin extends Ennemi {
    /**
     * Instantiates a new Goblin.
     *
     * @param scanner the scanner
     */
    public Goblin(Scanner scanner) {
        super("Goblin", 6, 5, scanner);
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
