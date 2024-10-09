// src/Prametre/Plateau/Case/Potion.java
package Prametre.Plateau.Case;

public class Potion implements Case {
    private String nom; // Nom de la potion
    private int effet;  // Effet de la potion (par exemple, points de défense ou de vie)

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