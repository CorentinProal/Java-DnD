package Personnage.equipement.offensif;
public abstract class EquipmentOffensif {
    private String name;
    private String type;
    private  int ATQLevel;

    public EquipmentOffensif() {
        this("Massue", "Arme");
    }

    public EquipmentOffensif(String name) {
        this(name, "Arme");
    }

    public EquipmentOffensif(String name, String type) {
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


    public String toString() {
        return "\n Offensif : " + name + "\n Type : " + type + "\n ATQLevel ⚡ : + " + ATQLevel;
    }
}