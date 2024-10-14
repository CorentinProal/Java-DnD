package parametre.plateau.cases.ennemi;

import parametre.plateau.cases.Case;

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

    public int getvieEnnemi() {
        return pointsDeVie;
    }

    @Override
    public abstract String toString();

    public void recevoirDegats(int degatsInfliges) {
        pointsDeVie -= degatsInfliges;
        System.out.println(nom + "reçoit " + pointsDeVie + " degats");
        if (pointsDeVie <= 0) {
            System.out.println(" a été vaincu ! ");
        }

    }

    public int getForce(){
        return force;
    }
}