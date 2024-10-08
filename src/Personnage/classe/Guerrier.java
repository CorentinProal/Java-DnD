package Personnage.classe;

import Personnage.Personnage;
import Personnage.equipement.defensif.Bouclier;
import Personnage.equipement.offensif.Arme;

public class Guerrier extends Personnage {
    public Guerrier(String name) {
        super(name, "Guerrier");
        parametreheros();
    }

    @Override
    public void parametreheros() {
        this.recuperationstuff(10, 10, new Arme("Massue", "Arme"), new Bouclier("Armure", "Bouclier"));
    }
}
