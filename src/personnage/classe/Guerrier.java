package personnage.classe;

import personnage.equipement.offensif.Arme;
import personnage.equipement.defensif.Bouclier;

public class Guerrier extends Personnage {

    public Guerrier(String name) {
        super(name, "Guerrier");
        this.setATQ(10);
        this.setHP(10);
        this.setArme(new Arme("Baton fragile", 1));
        this.setArmure(new Bouclier("Couvercle", 1));
    }

    @Override
    public void attaque(Personnage joueur) {

    }
}
