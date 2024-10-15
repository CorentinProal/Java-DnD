package parametre.plateau.cases.equipement.defensif;

import parametre.plateau.cases.Case;
import personnage.Personnage;

public class Potion implements Case {
    private String nom;
    private int effet;

    public Potion(String nom, int effet) {
        this.nom = nom;
        this.effet = effet;
    }

    public String getNom() {
        return nom;
    }

    public int getEffet() {
        return effet;
    }

    @Override
    public String getType() {
        return "potion";
    }

    @Override
    public void interaction(Personnage personnage) {
        int nouveauxHP = personnage.getHP() + this.effet;
        personnage.setHP(nouveauxHP);
        System.out.println(personnage.getNom() + " utilise " + this.nom + " ! Tes HP sont maintenant de " + personnage.getHP());
    }


    @Override
    public String toString() {
        return "Vous avez trouvé une potion : " + nom + " !" + "\nEffet : + " + effet + " DEF";
    }
}
