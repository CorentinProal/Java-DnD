package parametre.plateau;

import personnage.classe.Personnage;

public class Sorcier extends Ennemi {
    public Sorcier() {
        super("Sorcier", 9, 2);
    }

    @Override
    public String toString() {
        return "Un " + nom + " avec " + vie + " HP et une force de " + force + ".";
    }

    @Override
    public String getType() {
        return "Monstre";
    }

    @Override
    public void interaction(Personnage joueur) {

    }
}