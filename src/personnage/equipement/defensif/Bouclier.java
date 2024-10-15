package personnage.equipement.defensif;

import parametre.plateau.cases.Case;
import personnage.Personnage;


public class Bouclier extends EquipementDefensif implements Case {
    public Bouclier(String nom, int DEFLevel) {
        super();
        this.setName(nom);
        this.setType("Bouclier");
        this.setDEFLevel(DEFLevel);
    }

    @Override
    public void interaction(Personnage joueur) {
        if (joueur.getType().equals("Guerrier")) {
            System.out.println("Tu trouve une nouvelle " + getType());
            if (this.getDEFLevel() > joueur.getArmure().getDEFLevel()) {
                joueur.setArmure(joueur.getArmure());
            } else if (this.getDEFLevel() <= joueur.getArmure().getDEFLevel()) {
                System.out.println("L'armure est à chier");
            }
        }
        else if (joueur.getType().equals("Magicien")) {
            System.out.println("c'est pas pour toi");
        }
    }
}
