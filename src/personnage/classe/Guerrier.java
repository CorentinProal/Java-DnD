package personnage.classe;

import personnage.Personnage;
import personnage.equipement.defensif.EquipementDefensif;
import personnage.equipement.offensif.EquipementOffensif;
import personnage.equipement.offensif.Arme;
import personnage.equipement.defensif.Bouclier;

public class Guerrier extends Personnage {

    public Guerrier(String name) {
        super(name, "Guerrier");
        parametreheros();
    }

    @Override
    public void parametreheros() {
        this.recuperationstuff(10, 6);
    }

    @Override
    public void utiliserEquipement(EquipementDefensif defensif) {
        if (defensif instanceof Bouclier) {
            this.HP += defensif.getDEFLevel();
            System.out.println("Le Guerrier utilise son bouclier. Ses HP ont augmenté : " + this.HP);
        } else {
            System.out.println("Le Guerrier ne peut pas utiliser cet équipement défensif !");
        }
    }

    @Override
    public void utiliserEquipement(EquipementOffensif offensif) {
        if (offensif instanceof Arme) {
            System.out.println(this.nom + " utilise " + offensif.getName());
            this.ATQ += offensif.getATQLevel();
            System.out.println("Son ATQ a augmenté à : " + this.ATQ);
        } else {
            System.out.println("Le Guerrier ne peut pas utiliser ce sort !");
        }
    }

}
