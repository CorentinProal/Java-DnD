package parametre.plateau;

import personnage.classe.Personnage;

public interface Combat {

    public default void combattre(Personnage joueur) {
    }

    public default void degatsInfliges(int degatsInfliges) {

    }

    void attaque(Personnage joueur);
}
