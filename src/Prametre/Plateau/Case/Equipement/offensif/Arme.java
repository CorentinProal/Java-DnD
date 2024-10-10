package Prametre.Plateau.Case.Equipement.offensif;

import Prametre.Plateau.Case.Case;

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