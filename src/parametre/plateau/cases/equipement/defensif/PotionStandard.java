package parametre.plateau.cases.equipement.defensif;

import personnage.Personnage;

public class PotionStandard extends Potion {
    public PotionStandard() {
        super("Potion Standard", 2);
    }

    @Override
    public String toString() {
        return "Une potion standard !";
    }

    @Override
    public void interaction(Personnage personnage) {
        int nouveauxHP = personnage.getHP() + this.getEffet();
        personnage.setHP(nouveauxHP);
        System.out.println(personnage.getNom() + " utilise " + this.getNom() + " ! Tes HP sont maintenant de " + personnage.getHP());
    }
}
