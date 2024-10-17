package parametre.plateau.combat;

import personnage.classe.Personnage;
import java.util.Scanner;

public class Dragon extends Ennemi {
    private Scanner scanner;

    public Dragon(Scanner scanner) {
        super("Dragon", 25, 17, scanner);
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