package Prametre.Plateau.Case.Ennemi;

public class Sorcier extends Ennemi {
    public Sorcier() {
        super("Sorcier", 9, 2); // Nom, points de vie, force
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