package parametre.plateau.combat;

import personnage.classe.Personnage;

public interface Combat {
    void degatsInfliges(int degatsInfliges);
    void attaque(Personnage joueur);
}
