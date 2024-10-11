package parametre.plateau.cases.equipement.offensif;

import personnage.Personnage;
import personnage.equipement.offensif.Sort;
import parametre.plateau.cases.Case;

public class BouleDeFeu extends Sort implements Case {
    public BouleDeFeu() {
        super("Boule De Feu", 8);
    }

    @Override
    public String toString() {
        return "Une boule de feu explosive !";
    }

    @Override
    public String getType() {
        return "sort"; // ou un autre type approprié
    }

    @Override
    public void interaction(Personnage personnage) {

    }
}
