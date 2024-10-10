
package Prametre.Plateau.Case.Ennemi.Classe;

import Prametre.Plateau.Case.Ennemi.Ennemi;

public class Dragons extends Ennemi {
    public Dragons() {
        super("Dragon", 15, 4); // Nom, points de vie, force
    }

    @Override
    public String attaquer() {
        return nom + " attaque avec une force de " + force + "!";
    }
}