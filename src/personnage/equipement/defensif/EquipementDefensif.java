package personnage.equipement.defensif;

public abstract class EquipementDefensif {
    private String name;
    private String type;
    private int DEFLevel; // Conserve DEFLevel


    public EquipementDefensif() {

    }

    public EquipementDefensif(String name) {
        this(name, "Bouclier");
    }

    public EquipementDefensif(String name, String type) {
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

    public int getDEFLevel() { // Méthode pour obtenir DEFLevel
        return DEFLevel;
    }

    public void setDEFLevel(int DEFLevel) {
        this.DEFLevel = DEFLevel;
    }
    public String toString() {
        return "\n Défensif : " + name + "\n Type : " + type + "\n DEFLevel \uD83D\uDEE1\uFE0F : + " + DEFLevel; // Mise à jour de la chaîne
    }
}