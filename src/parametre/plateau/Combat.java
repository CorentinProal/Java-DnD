package parametre.plateau;

import personnage.classe.Personnage;

public interface Combat {
    void degatsInfliges(int degatsInfliges);
    void attaque(Personnage joueur);

    void combattre(Personnage joueur);
}
