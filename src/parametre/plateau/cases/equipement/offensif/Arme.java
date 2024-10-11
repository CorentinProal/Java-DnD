package parametre.plateau.cases.equipement.offensif;

import parametre.plateau.cases.Case;
import personnage.Personnage;

public class Arme implements Case {
    @Override
    public String getType() {
        return "arme";
    }

    @Override
    public void interaction(Personnage personnage) {

    }

    @Override
    public String toString() {
        return "Vous avez trouvé une arme !";
    }
}