package parametre.plateau.cases.ennemi;

import parametre.plateau.cases.Case;

public abstract class Ennemi implements Case {
    protected String nom;
    protected int vie;
    protected int force;

    public Ennemi(String nom, int vie, int force) {
        this.nom = nom;
        this.vie = vie;
        this.force = force;
    }


    public String getNom() {
        return nom;
    }

    public int getvieEnnemi() {
        return vie;
    }

    @Override
    public abstract String toString();

    public void recevoirDegats(int degatsInfliges) {
        vie -= degatsInfliges;
        System.out.println(nom + " reçoit " + vie + " degats ");
        if (vie <= 0) {
            System.out.println(" a été vaincu ! ");
        }

    }

    public int getForce(){
        return force;
    }
}