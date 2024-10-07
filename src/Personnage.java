import java.util.*;

public class Personnage {
    private String name;
    private String type;
    private int HP;
    private int ATQ;
    private EquipmentOffensif equipOffensif;
    private EquipementDefensif equipDefensif;

    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;

        if (Objects.equals(type, "Magicien")) {
            this.HP = 6;
            this.ATQ = 15;
            this.equipOffensif = new EquipmentOffensif("Sceptre Eternel", "Sort");
            this.equipDefensif = new EquipementDefensif("Sac", "Philtre");
        } else if (Objects.equals(type, "Guerrier")) {
            this.HP = 10;
            this.ATQ = 10;
            this.equipOffensif = new EquipmentOffensif("Massue", "Arme");
            this.equipDefensif = new EquipementDefensif("Armure", "Bouclier");
        }

        this.HP += equipDefensif.getDEFLevel();
        this.ATQ += equipOffensif.getATQLevel();
    }

    public EquipmentOffensif getEquipementOffensif() {
        return equipOffensif;
    }

    public EquipementDefensif getEquipementDefensif() {
        return equipDefensif;
    }

    @Override
    public String toString() {
        return "\n Nom : " + name + ", Type : " + type + "\n HP \uD83D\uDEE1\uFE0F : " + HP + "\n ATQ \uD83D\uDDE1\uFE0F: " + ATQ;
    }
}
