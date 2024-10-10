package parametre.plateau.cases;

import parametre.plateau.cases.ennemi.Ennemi;
import parametre.plateau.cases.ennemi.Dragon;
import parametre.plateau.cases.ennemi.Goblin;
import parametre.plateau.cases.ennemi.Sorcier;

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