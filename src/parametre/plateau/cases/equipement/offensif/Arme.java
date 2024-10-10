package parametre.plateau.cases.equipement.offensif;

import parametre.plateau.cases.Case;

public class Arme implements Case {
    @Override
    public String getType() {
        return "arme";
    }

    @Override
    public String toString() {
        return "Vous avez trouvé une arme !";
    }
}