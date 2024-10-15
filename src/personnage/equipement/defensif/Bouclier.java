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
            System.out.println("Tu trouves un nouveau " + getType());
            if (this.getDEFLevel() > joueur.getArmure().getDEFLevel()) {
                joueur.setArmure(this);
                System.out.println("Tu t'équipes du nouveau bouclier : " + this.getName());
            } else {
                System.out.println("L'armure est moins bonne ou équivalente à celle que tu portes déjà.");
            }
        } else if (joueur.getType().equals("Magicien")) {
            System.out.println("Ce bouclier n'est pas pour toi.");
        }
    }
}
