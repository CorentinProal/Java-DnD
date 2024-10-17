package personnage.classe;

import personnage.equipement.offensif.Arme;
import personnage.equipement.defensif.Philtre;

public class Magicien extends Personnage {

    public Magicien(String name) {
        super(name, "Magicien");
        this.setHP(6);
        this.setATQ(10);
        this.setArme(new Arme("Mini Feu", 1));
        this.setArmure(new Philtre("Voile Leger",1));
    }

    @Override
    public void attaque(Personnage joueur) {

    }
}
