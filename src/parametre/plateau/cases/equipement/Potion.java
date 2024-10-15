package parametre.plateau.cases.equipement;

import parametre.plateau.cases.Case;
import personnage.Personnage;

public class Potion extends Bonus implements Case {
    public Potion(String nom, int effet) {
        super();
        this.setEffet(effet);
        this.setNom(nom);
        this.setType("Potion");
    }

    @Override
    public void interaction(Personnage joueur) {
        System.out.println("Wouah une new potion");
        int nouveauxHP = joueur.getHP() + this.getEffet();
        joueur.setHP(nouveauxHP);
        System.out.println(joueur.getNom() + " utilise " + this.getNom() + " ! Tes HP sont maintenant de " + joueur.getHP());
    }
}



