package personnage.equipement.offensif;

import parametre.plateau.Case;
import personnage.classe.Personnage;

public class Arme extends EquipementOffensif implements Case {
    public Arme(String nom, int ATQLevel) {
        super();
        this.setName(nom);
        this.setType("Arme");
        this.setATQLevel(ATQLevel);
    }

    @Override
    public void interaction(Personnage joueur) {
        if (joueur.getType().equals("Guerrier")) {
            System.out.println("Tu trouve une nouvelle " + getType());
            if (this.getATQLevel() > joueur.getArme().getATQLevel()) {
                joueur.setArme(this);
            } else if (this.getATQLevel() <= joueur.getArme().getATQLevel()) {
                System.out.println("Ouah tu trouve " + getType() + "Mais elle est trop nul");
            }

        }
        else if (joueur.getType().equals("Magicien")) {
            System.out.println("c'est pas pour toi");
        }
    }
}
