package parametre.plateau.combat;

import personnage.classe.Personnage;

/**
 * The type Combat.
 */
public abstract class Combat {
    /**
     * Degats infliges.
     *
     * @param degatsInfliges the degats infliges
     */
    public abstract void degatsInfliges(int degatsInfliges);

    /**
     * Attaque.
     *
     * @param joueur the joueur
     */
    public abstract void attaque(Personnage joueur);

    /**
     * Infliger degats.
     *
     * @param joueur the joueur
     * @param degats the degats
     */
    protected void infligerDegats(Personnage joueur, int degats) {
        joueur.degatsInfliges(degats);
    }
}
