package personnage.classe;

import personnage.Personnage;
import personnage.equipement.offensif.EquipementOffensif;
import personnage.equipement.defensif.EquipementDefensif;
import personnage.equipement.defensif.Philtre;
import personnage.equipement.offensif.Sort;

public class Magicien extends Personnage {

    public Magicien(String name) {
        super(name, "Magicien");
        parametreheros();
    }

    @Override
    public void parametreheros() {
        this.recuperationstuff(6, 10);
    }

    @Override
    public void utiliserEquipement(EquipementDefensif defensif) {
        if (defensif instanceof Philtre) {
            this.HP += defensif.getDEFLevel();
            System.out.println("Le magicien utilise un philtre. Ces HP ont augmenté : " + this.HP);
        } else {
            System.out.println("Le magicien ne peut pas utiliser cet équipement défensif !");
        }
    }

    @Override
    public void utiliserEquipement(EquipementOffensif offensif) {
        if (offensif instanceof Sort) {
            System.out.println(this.nom + " utilise " + offensif.getName());
            this.ATQ += offensif.getATQLevel();
            System.out.println("Son ATQ a augmenté à " + this.ATQ);
        } else {
            System.out.println("Le magicien ne peut pas utiliser cette arme !");
        }
    }

}
