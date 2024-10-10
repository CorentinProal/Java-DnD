package Prametre.Plateau.Case.Equipement.offensif;

import Prametre.Plateau.Case.Equipement.Defensif.Potion;

public class BouleDeFeu extends Potion {
    public BouleDeFeu(String name, int effect) {
        super(name, effect);
    }

    @Override
    public String toString() {
        return "Une boule de feu explosive !";
    }
}
