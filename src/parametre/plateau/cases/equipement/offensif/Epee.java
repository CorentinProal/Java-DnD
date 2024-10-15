package parametre.plateau.cases.equipement.offensif;


import personnage.Personnage;
import personnage.equipement.offensif.Arme;
import parametre.plateau.cases.Case;

public class Epee extends Arme implements Case {
    public Epee() {
        this.setName("Epée");
        this.setATQLevel(10);
    }

    @Override
    public String toString() {
        return "Epée";
    }

    @Override
    public String getType(){
        return "Epee";
    }

    @Override
    public void interaction(Personnage personnage) {
        int nouvelleATQ = personnage.getATQ() + this.getATQLevel();
        personnage.setATQ(nouvelleATQ);
        System.out.println(personnage.getNom() + " Ajoute " + this.getName() + " Son ATQ est maintenant de " + personnage.getATQ());
    }
}
