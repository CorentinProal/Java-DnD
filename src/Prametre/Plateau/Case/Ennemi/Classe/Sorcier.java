package Prametre.Plateau.Case.Ennemi.Classe;

import Prametre.Plateau.Case.Ennemi.Ennemi;

public class Sorcier extends Ennemi {
    public Sorcier() {
        super("Sorcier", 9, 2);
    }

    @Override
    public String attaquer() {
        return nom + " attaque avec une force de " + force + "!";
    }
}