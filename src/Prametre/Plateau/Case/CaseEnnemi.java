package Prametre.Plateau.Case;

import Prametre.Plateau.Case.Ennemi.Ennemi;
import Prametre.Plateau.Case.Ennemi.Dragon;
import Prametre.Plateau.Case.Ennemi.Goblin;
import Prametre.Plateau.Case.Ennemi.Sorcier;

public class CaseEnnemi implements Case {
    private Ennemi ennemi;

    public CaseEnnemi() {
        this.ennemi = new Dragon();
        this.ennemi = new Goblin();
        this.ennemi = new Sorcier();
    }

    public Ennemi getEnnemi() {
        return ennemi;
    }

    @Override
    public String getType() {
        return "ennemi";
    }

    @Override
    public String toString() {
        return "Vous êtes tombé sur un " + ennemi.getNom() + " ! " + ennemi.getPointsDeVie() + " PV restants.";
    }
}