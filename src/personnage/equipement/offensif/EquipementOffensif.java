package personnage.equipement.offensif;

/**
 * The type Equipement offensif.
 */
public abstract class EquipementOffensif {
    private String name;
    private String type;
    private int ATQLevel;

    /**
     * Instantiates a new Equipement offensif.
     */
    public EquipementOffensif(){

    }

//    public EquipementOffensif() {
//        this.name = "Massue";
//        this.type = "Arme";
//        this.ATQLevel = 5;
//    }

    /**
     * Instantiates a new Equipement offensif.
     *
     * @param name the name
     */
    public EquipementOffensif(String name) {
        this(name, "Arme");
    }

    /**
     * Instantiates a new Equipement offensif.
     *
     * @param name the name
     * @param type the type
     */
    public EquipementOffensif(String name, String type) {
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
     * Gets atq level.
     *
     * @return the atq level
     */
    public int getATQLevel() {
        return ATQLevel;
    }

    /**
     * Sets atq level.
     *
     * @param ATQLevel the atq level
     */
    public void setATQLevel(int ATQLevel) {
        this.ATQLevel = ATQLevel;
    }

    @Override
    public String toString() {
        return "\n Offensif : " + name + "\n Type : " + type + "\n ATQLevel ⚡ : + " + ATQLevel;
    }
}
