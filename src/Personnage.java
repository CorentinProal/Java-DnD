import java.util.Objects;

public class Personnage {
    private String name;
    private String type;
    private int HP;
    private int ATQ;

    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;

        EquipmentOffensif equipOffensif = new EquipmentOffensif();
        EquipementDefensif equipDefensif = new EquipementDefensif();

        if (Objects.equals(type, "Magicien")) {
            this.HP = 6;
            this.ATQ = 15;
            equipOffensif = new EquipmentOffensif("Sceptre Eternel", "Sort");
            equipDefensif = new EquipementDefensif("Sac", "Philtre");
        } else if (Objects.equals(type, "Guerrier")) {
            this.HP = 10;
            this.ATQ = 10;
            equipOffensif = new EquipmentOffensif("Massue", "Arme");
            equipDefensif = new EquipementDefensif("Armure", "Bouclier");
        }

        System.out.println("Équipement Offensif: " + equipOffensif);
        System.out.println();
        System.out.println("Équipement Défensif: " + equipDefensif);
        this.HP += EquipementDefensif.getDEFLevel();
        this.ATQ += EquipmentOffensif.getATQLevel();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHP() {
        return HP;
    }

    public int getATQ() {
        return ATQ;
    }

    public String toString() {
        return "\n Nom : " + name + ", Type : " + type + "\n HP \uD83D\uDEE1\uFE0F : " + HP + "\n ATQ \uD83D\uDDE1\uFE0F: " + ATQ;
    }
}
