package parametre.plateau.cases.equipement.offensif;

import personnage.Personnage;
import personnage.equipement.offensif.Arme;
import parametre.plateau.cases.Case;

public class Massue extends Arme implements Case {
    public Massue(){
        this.setName("Massue");
        this.setATQLevel(10);
    }

    @Override
    public String toString() {
        return "Massue";
    }

    @Override
    public String getType(){
        return "Arme";
    }

    @Override
    public void interaction(Personnage personnage) {
        int nouvelleATQ = personnage.getATQ() + this.getATQLevel();
        personnage.setATQ(nouvelleATQ);
        System.out.println(personnage.getNom() + " Ajoute " + this.getName() + " Son ATQ est maintenant de " + personnage.getATQ());
    }
}
