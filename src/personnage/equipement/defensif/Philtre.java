
package personnage.equipement.defensif;

import parametre.plateau.cases.Case;
import personnage.Personnage;


public class Philtre extends EquipementDefensif implements Case {
    public Philtre(String nom, int DEFLevel) {
        super();
        this.setName(nom);
        this.setType("Philtre");
        this.setDEFLevel(DEFLevel);
    }

    @Override
    public void interaction(Personnage joueur) {
        if (joueur.getType().equals("Magicien")) {
            System.out.println("Tu trouve une nouvelle " + getType());
            if (this.getDEFLevel() > joueur.getArmure().getDEFLevel()) {
                joueur.setArmure(this);
            } else if (this.getDEFLevel() <= joueur.getArmure().getDEFLevel()) {
                System.out.println("L'armure est à chier");
            }
        } else if (joueur.getType().equals("Guerrier")) {
            System.out.println("c'est pas pour toi");
        }
    }
}
