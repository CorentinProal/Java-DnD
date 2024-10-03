import java.util.Objects;

public class EquipementDefensif {
    private String name;
    private String type;
    private int DEFLevel;

    public EquipementDefensif() {
        this.name = "Bouclier";
        this.type = "Défensif"; // Ajout de type par défaut
        this.DEFLevel = 5; // Niveau de défense par défaut
    }

    public EquipementDefensif(String name) {
        this(name, "Bouclier"); // Appel au constructeur avec type par défaut
    }

    public EquipementDefensif(String name, String type) {
        this.name = name;
        this.type = type;

        if (Objects.equals(type, "Bouclier")) {
            this.DEFLevel = 5;
        } else if (Objects.equals(type, "Philtre")) {
            this.DEFLevel = 10;
        }
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

    public String toString() {
        return "\n Défensif : " + name + "\n Type : " + type + "\n DEFLevel : " + DEFLevel; // Correction de la chaîne
    }
}