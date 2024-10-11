package parametre.plateau.cases.equipement.offensif;

import personnage.Personnage;
import personnage.equipement.offensif.Sort;
import parametre.plateau.cases.Case;

public class Eclair extends Sort implements Case {
    public Eclair() {
        super("Eclair Fulgurant", 4);
    }

    @Override
    public String toString() {
        return "Un éclair fulgurant !";
    }

    @Override
    public String getType() {
        return "sort"; // ou un autre type approprié
    }

    @Override
    public void interaction(Personnage personnage) {
        
    }
}



