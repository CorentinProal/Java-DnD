
package personnage.equipement.offensif;

import parametre.plateau.Case;
import personnage.classe.Personnage;

/**
 * The type Sort.
 */
public class Sort extends EquipementOffensif implements Case {
    /**
     * Instantiates a new Sort.
     *
     * @param nom      the nom
     * @param ATQLevel the atq level
     */
    public Sort(String nom, int ATQLevel) {
        super();
        this.setName(nom);
        this.setType("Sort");
        this.setATQLevel(ATQLevel);
    }

    @Override
    public void interaction(Personnage joueur) {
        if (joueur.getType().equals("Magicien")) {
            System.out.println("Tu trouve un nouveau " + getType());
            if (this.getATQLevel() > joueur.getArme().getATQLevel()) {
                joueur.setArme(this);
            } else if (this.getATQLevel() <= joueur.getArme().getATQLevel()) {
                System.out.println("Ouah tu trouve " + getType() + "Mais elle est trop nul");
            }

        }
        else if (joueur.getType().equals("Guerrier")) {
            System.out.println("c'est pas pour toi");
        }
    }
}
