package parametre.plateau.cases.equipement.offensif;

import personnage.Personnage;
import personnage.equipement.offensif.Sort;
import parametre.plateau.cases.Case;

public class BouleDeFeu extends Sort implements Case {
    public BouleDeFeu() {
        super();
        this.setName("Boule De Feu");
        this.setATQLevel(8);
        this.setType("Sort");
    }

    @Override
    public String toString() {
        return "Une boule de feu explosive !";
    }

    @Override
    public String getType() {
        return "sort";
    }

    @Override
    public void interaction(Personnage personnage) {

        int nouvelleATQ = personnage.getATQ() + this.getATQLevel();
        personnage.setATQ(nouvelleATQ);
        System.out.println(personnage.getNom() + " utilise " + this.getName() + " ! Son ATQ est maintenant de " + personnage.getATQ());
    }
}
