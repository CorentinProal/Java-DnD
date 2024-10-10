package Prametre.Plateau.Case.Ennemi;

public class Goblin extends Ennemi {
    public Goblin() {
        super("Goblin", 6, 1); // Nom, points de vie, force
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