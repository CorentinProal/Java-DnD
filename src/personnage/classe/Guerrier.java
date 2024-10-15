package personnage.classe;

import personnage.Personnage;
import personnage.equipement.offensif.Arme;
import personnage.equipement.defensif.Bouclier;

public class Guerrier extends Personnage {

    public Guerrier(String name) {
        super(name, "Guerrier");
        this.setATQ(10);
        this.setHP(10);
        this.setArme(new Arme("Bout de bois", 1));
        this.setArmure(new Bouclier("Planche de bois", 1));
    }
}
