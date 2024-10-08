package Personnage;

import Personnage.equipement.EquipementDefensif;
import Personnage.equipement.EquipmentOffensif;

public class Magicien extends Personnage {
    public Magicien(String name) {
        super(name, "Magicien");
        parametreheros();
    }

    @Override
    public void parametreheros() {
        this.recuperationstuff(6, 15, new EquipmentOffensif("Sceptre Eternel", "Sort"), new EquipementDefensif("Sac", "Philtre"));
    }
}