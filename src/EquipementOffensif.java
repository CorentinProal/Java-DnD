import java.util.Objects;

public class EquipementOffensif{
    private String name;
    private String type;
    private int ATQLevel;

    public EquipementOffensif() {
        this.name = "Massue";
        this.type = "Arme";
        this.ATQLevel = 5;
    }

    public EquipementOffensif(String name) {
        this(name, "Massue");
    }

    public EquipementOffensif(String name, String type) {
        this.name = name;
        this.type = type;

        if(Objects.equals(type, "Arme")){
            this.ATQLevel = 5;
        }else if(Objects.equals(type, "Sort")){
            this.ATQLevel = 2;

        }
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String toString(){
        return "\n Offensif : " + name + "\n Type : " + type + "\n ATQLevel \uD83D\uDDE1\uFE0F : " + ATQLevel; // Correction de la chaîne
    }
}