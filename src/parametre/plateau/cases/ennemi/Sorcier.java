package parametre.plateau.cases.ennemi;

public class Sorcier extends Ennemi {
    public Sorcier() {
        super("Sorcier", 9, 2);
    }

    @Override
    public String toString() {
        return "Un " + nom + " avec " + pointsDeVie + " points de vie et une force de " + force + ".";
    }

    @Override
    public String getType() {
        return "Monstre";
    }
}