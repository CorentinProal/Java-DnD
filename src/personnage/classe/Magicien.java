package personnage.classe;

import personnage.equipement.offensif.Arme;
import personnage.equipement.defensif.Philtre;

public class Magicien extends Personnage {

    public Magicien(String name) {
        super(name, "Magicien");
        this.setHP(6);
        this.setATQ(10);
        this.setArme(new Arme("Ptite boule de feu", 1));
        this.setArmure(new Philtre("Armure de tapette",1));
    }
}
