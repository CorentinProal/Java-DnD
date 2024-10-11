package parametre.plateau.cases.ennemi;

import personnage.Personnage;

public class Goblin extends Ennemi {
    public Goblin() {
        super("Goblin", 6, 1);

    }

    @Override
    public String toString() {
        return "Un " + nom + " avec " + pointsDeVie + " points de vie et une force de " + force + ".";
    }

    @Override
    public String getType() {
        return "Monstre";
    }

    @Override
    public void interaction(Personnage personnage) {

    }
}