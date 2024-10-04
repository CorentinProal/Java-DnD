import java.util.Objects;

public class EquipmentOffensif {
    private String name;
    private String type;
    private static int ATQLevel;

    public EquipmentOffensif() {
        this.name = "Massue";
        this.type = "Arme";
        ATQLevel = 5;
    }

    public EquipmentOffensif(String name) {
        this(name, "Arme");
    }

    public EquipmentOffensif(String name, String type) {
        this.name = name;
        this.type = type;

        if(Objects.equals(type, "Arme")){
            ATQLevel = 5;
        } else if(Objects.equals(type, "Sort")){
            ATQLevel = 7;
        } else {
            ATQLevel = 0;
        }
    }

    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public static int getATQLevel() {
        return ATQLevel;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }
    public String toString(){
        return "\n Offensif : " + name + "\n Type : " + type + "\n ATQLevel  ⚡\uFE0F : + " + ATQLevel; // Correction de la chaîne
    }
}