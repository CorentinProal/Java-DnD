package Personnage.equipement.offensif;
import java.util.Objects;

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

        // Définition du niveau d'attaque en fonction du type
        if(Objects.equals(type, "Arme")){
            ATQLevel = 5;
        } else if(Objects.equals(type, "Sort")){
            ATQLevel = 17;
        } else {
            ATQLevel = 0;
        }
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getATQLevel() {
        return ATQLevel;
    }
    public int setATQLevel(int ATQLevel) {
        this.ATQLevel = ATQLevel;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "\n Offensif : " + name + "\n Type : " + type + "\n ATQLevel ⚡ : + " + ATQLevel;
    }
}