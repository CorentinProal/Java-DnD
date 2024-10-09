package Prametre.Plateau.Case.Ennemi.Classe;

import Prametre.Plateau.Case.Ennemi.Ennemi;

public class Goblin extends Ennemi {
    public Goblin() {
        super("Goblin", 7, 9); // Nom, points de vie, force
    }

    @Override
    public String attaquer() {
        return nom + " attaque avec une force de " + force + "!";
    }
}