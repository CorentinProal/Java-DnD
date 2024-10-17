package parametre.plateau.combat;

import personnage.classe.Personnage;

public abstract class Combat {
    public abstract void degatsInfliges(int degatsInfliges);

    public abstract void attaque(Personnage joueur);

    protected void infligerDegats(Personnage joueur, int degats) {
        joueur.degatsInfliges(degats);
    }
}
