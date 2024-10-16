
package personnage.equipement.defensif;

import parametre.plateau.Case;
import personnage.classe.Personnage;


/**
 * The type Philtre.
 */
public class Philtre extends EquipementDefensif implements Case {
    /**
     * Instantiates a new Philtre.
     *
     * @param nom      the nom
     * @param DEFLevel the def level
     */
    public Philtre(String nom, int DEFLevel) {
        super();
        this.setName(nom);
        this.setType("Philtre");
        this.setDEFLevel(DEFLevel);
    }

    @Override
    public void interaction(Personnage joueur) {
        if (joueur.getType().equals("Magicien")) {
            System.out.println("Tu trouve un nouveau " + getType());
            if (this.getDEFLevel() > joueur.getArmure().getDEFLevel()) {
                joueur.setArmure(this);
            } else if (this.getDEFLevel() <= joueur.getArmure().getDEFLevel()) {
                System.out.println("Tu as déja un meilleur equipement");
            }
        } else if (joueur.getType().equals("Guerrier")) {
            System.out.println("c'est pas pour toi");
        }
    }
}
