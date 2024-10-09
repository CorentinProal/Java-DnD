
package Prametre.Plateau.Case.Ennemi;

public abstract class Ennemi {
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

    public int getForce() {
        return force;
    }

    public abstract String attaquer();
}