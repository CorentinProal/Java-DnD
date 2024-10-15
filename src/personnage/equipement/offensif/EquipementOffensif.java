package personnage.equipement.offensif;

public abstract class EquipementOffensif {
    private String name;
    private String type;
    private int ATQLevel;

    public EquipementOffensif() {
        this.name = "Massue";
        this.type = "Arme";
        this.ATQLevel = 5;
    }

    public EquipementOffensif(String name) {
        this(name, "Arme");
    }

    public EquipementOffensif(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getATQLevel() {
        return ATQLevel;
    }

    public void setATQLevel(int ATQLevel) {
        this.ATQLevel = ATQLevel;
    }

    @Override
    public String toString() {
        return "\n Offensif : " + name + "\n Type : " + type + "\n ATQLevel ⚡ : + " + ATQLevel;
    }
}
