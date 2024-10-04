import java.util.Objects;

public class EquipementOffensif{
    private String name;
    private String type;
    private static int ATQLevel;

    public EquipementOffensif() {
        this.name = "Massue";
        this.type = "Arme";
        this.ATQLevel = 5;
    }

    public EquipementOffensif(String name) {
        this(name, "Arme"); // Correction pour utiliser "Arme" par défaut
    }

    public EquipementOffensif(String name, String type) {
        this.name = name;
        this.type = type;

        if(Objects.equals(type, "Arme")){
            ATQLevel = 5;
        } else if(Objects.equals(type, "Sort")){
            ATQLevel = 7;
        } else {
            ATQLevel = 0; // Valeur par défaut si le type n'est pas reconnu
        }
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public static int getATQLevel() {
        return ATQLevel; // Ajout d'une méthode pour obtenir le niveau d'attaque
    }

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String toString(){
        return "\n Offensif : " + name + "\n Type : " + type + "\n ATQLevel  \uD83D\uDDE1\uFE0F : + " + ATQLevel; // Correction de la chaîne
    }
}