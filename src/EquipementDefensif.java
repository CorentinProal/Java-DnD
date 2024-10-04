import java.util.Objects;

public class EquipementDefensif {
    private String name;
    private String type;
    private static int DEFLevel; // Conserve DEFLevel

    public EquipementDefensif() {
        this.name = "Bouclier";
        this.type = "Défensif";
        DEFLevel = 5; // Valeur par défaut pour DEFLevel
    }

    public EquipementDefensif(String name) {
        this(name, "Bouclier");
    }

    public EquipementDefensif(String name, String type) {
        this.name = name;
        this.type = type;

        if (Objects.equals(type, "Bouclier")) {
            DEFLevel = 5;
        } else if (Objects.equals(type, "Philtre")) {
            DEFLevel = 10;
        } else {
            DEFLevel = 0; // Valeur par défaut si le type n'est pas reconnu
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

    public static int getDEFLevel() { // Méthode pour obtenir DEFLevel
        return DEFLevel;
    }

    public String toString() {
        return "\n Défensif : " + name + "\n Type : " + type + "\n DEFLevel \uD83D\uDEE1\uFE0F : + " + DEFLevel; // Mise à jour de la chaîne
    }
}