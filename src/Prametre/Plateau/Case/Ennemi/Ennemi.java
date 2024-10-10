package Prametre.Plateau.Case.Ennemi;

import Prametre.Plateau.Case.Case;

public abstract class Ennemi implements Case {
    protected String nom;
    protected int pointsDeVie;
    protected int force;

    public Ennemi(String nom, int pointsDeVie, int force) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    @Override
    public abstract String toString();
}