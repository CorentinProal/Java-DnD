package parametre.plateau;

import personnage.classe.Personnage;

/**
 * The interface Case.
 */
public interface Case {


    /**
     * Gets type.
     *
     * @return the type
     */
    String getType();

    /**
     * Interaction.
     *
     * @param joueur the joueur
     */
    void interaction(Personnage joueur);
}