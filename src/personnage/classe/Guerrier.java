package personnage.classe;

import personnage.Personnage;
import personnage.equipement.defensif.EquipementDefensif;
import personnage.equipement.offensif.EquipementOffensif;

public class Guerrier extends Personnage {

    public Guerrier(String name) {
        super(name, "Guerrier");
        parametreheros();
    }

    @Override
    public void parametreheros() {
        this.recuperationstuff(10, 10);
    }

    @Override
    public void utiliserEquipement(EquipementDefensif defensif) {

    }

    @Override
    public void utiliserEquipement(EquipementOffensif offensif) {

    }
}
