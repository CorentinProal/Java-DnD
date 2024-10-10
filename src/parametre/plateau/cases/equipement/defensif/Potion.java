// src/Prametre/Plateau/Case/Potion.java
package parametre.plateau.cases.equipement.defensif;

import parametre.plateau.cases.Case;

public class Potion implements Case {
    private String nom;
    private int effet;

    public Potion(String nom, int effet) {
        this.nom = nom;
        this.effet = effet;
    }

    @Override
    public String getType() {
        return "potion";
    }

    @Override
    public String toString() {
        return "Vous avez trouvé une potion : " + nom + " !" + "\nEffet : + " + effet + " DEF";
    }

    public int utiliser() {
        return effet;
    }
}