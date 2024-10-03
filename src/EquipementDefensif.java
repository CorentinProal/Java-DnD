import java.util.Objects;

public class EquipementDefensif {
    private String name;
    private String type;
    private int DEFLevel;

    public EquipementDefensif() {
        this.name = "Bouclier";
        this.type = "Défensif";
        this.DEFLevel = 5;
    }

    public EquipementDefensif(String name) {
        this(name, "Bouclier");
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
        return "\n Défensif : " + name + "\n Type : " + type + "\n DEFLevel \uD83D\uDEE1\uFE0F : " + DEFLevel; // Correction de la chaîne
    }
}