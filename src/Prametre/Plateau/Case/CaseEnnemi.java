package Prametre.Plateau.Case;

import Prametre.Plateau.Case.Ennemi.Classe.Dragons;
import Prametre.Plateau.Case.Ennemi.Classe.Goblin;
import Prametre.Plateau.Case.Ennemi.Ennemi;

public class CaseEnnemi implements Case {
    private Ennemi ennemi;

    public CaseEnnemi() {
        this.ennemi = new Dragons();
        this.ennemi = new Goblin();
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