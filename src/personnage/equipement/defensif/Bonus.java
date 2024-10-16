package personnage.equipement.defensif;

/**
 * The type Bonus.
 */
public abstract class Bonus {
    private String nom;
    private int effet;
    private String type;

    /**
     * Instantiates a new Bonus.
     */
    public Bonus() {

    }

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Gets effet.
     *
     * @return the effet
     */
    public int getEffet() {
        return effet;
    }


    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets effet.
     *
     * @param effet the effet
     */
    public void setEffet(int effet) {
        this.effet = effet;
    }

    /**
     * Sets nom.
     *
     * @param nom the nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }


    public String toString() {
        return "Vous avez trouvé un bonus : " + nom + " !" + "\nEffet : + " + type + " DEF";
    }
}
