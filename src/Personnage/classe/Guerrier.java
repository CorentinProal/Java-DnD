package Personnage.classe;

import Personnage.Personnage;
import Personnage.equipement.EquipementDefensif;
import Personnage.equipement.EquipmentOffensif;

public class Guerrier extends Personnage {
    public Guerrier(String name) {
        super(name, "Guerrier");
        parametreheros();
    }

    public void parametreheros() {
        this.recuperationstuff(10, 10, new EquipmentOffensif("Massue", "Arme"), new EquipementDefensif("Armure", "Bouclier"));
    }
}