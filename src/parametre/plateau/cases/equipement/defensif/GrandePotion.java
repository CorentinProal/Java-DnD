package parametre.plateau.cases.equipement.defensif;

import personnage.Personnage;

public class GrandePotion extends Potion {
    public GrandePotion() {
        super("Grande Potion", 7);
    }

    @Override
    public String toString() {
        return "Une grande potion !";
    }

    @Override
    public void interaction(Personnage personnage) {
        int nouveauxHP = personnage.getHP() + this.getEffet();
        personnage.setHP(nouveauxHP);
        System.out.println(personnage.getNom() + " utilise " + this.getNom() + " ! Tes HP sont maintenant de " + personnage.getHP());
    }
}
