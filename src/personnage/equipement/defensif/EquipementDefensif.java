package personnage.equipement.defensif;

/**
 * The type Equipement defensif.
 */
public abstract class EquipementDefensif {
    private String name;
    private String type;
    private int DEFLevel; // Conserve DEFLevel


    /**
     * Instantiates a new Equipement defensif.
     */
    public EquipementDefensif() {

    }

    /**
     * Instantiates a new Equipement defensif.
     *
     * @param name the name
     */
    public EquipementDefensif(String name) {
        this(name, "Bouclier");
    }

    /**
     * Instantiates a new Equipement defensif.
     *
     * @param name the name
     * @param type the type
     */
    public EquipementDefensif(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
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
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
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
     * Gets def level.
     *
     * @return the def level
     */
    public int getDEFLevel() { // Méthode pour obtenir DEFLevel
        return DEFLevel;
    }

    /**
     * Sets def level.
     *
     * @param DEFLevel the def level
     */
    public void setDEFLevel(int DEFLevel) {
        this.DEFLevel = DEFLevel;
    }
    public String toString() {
        return "\n Défensif : " + name + "\n Type : " + type + "\n DEFLevel \uD83D\uDEE1\uFE0F : + " + DEFLevel; // Mise à jour de la chaîne
    }
}