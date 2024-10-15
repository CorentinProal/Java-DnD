package parametre.plateau.cases.equipement.offensif;

import personnage.Personnage;
import personnage.equipement.offensif.Sort;
import parametre.plateau.cases.Case;

public class Eclair extends Sort implements Case {
    public Eclair() {
        super();
        this.setName("Eclair Fulgurant");
        this.setATQLevel(8);
    }

    @Override
    public String toString() {
        return "Un éclair fulgurant !";
    }

    @Override
    public String getType() {
        return "sort";
    }

    @Override
    public void interaction(Personnage personnage) {
        int nouvelleATQ = personnage.getATQ() + this.getATQLevel();
        personnage.setATQ(nouvelleATQ);
        System.out.println(personnage.getNom() + " Ajoute " + this.getName() + "Son ATQ est maintenant de " + personnage.getATQ());
    }
}



