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

    public String toString() {
        return "\n Nom : " + name + ", Type : " + type + "\n HP \uD83D\uDEE1\uFE0F : " + HP + "\n ATQ \uD83D\uDDE1\uFE0F: " + ATQ;
    }
}


//Importation :
// import java.util.*; : Importation de la bibliothèque Java Util pour utiliser la classe Objects.


//Déclaration de la classe :
//public class Personnage : Déclaration de la classe Personnage, qui représente un personnage dans le jeu.


//Attributs de la classe :
//private String name; : Nom du personnage.
//private String type; : Type du personnage (par exemple, Magicien ou Guerrier).
//private int HP; : Points de vie du personnage.
//private int ATQ; : Points d'attaque du personnage.
//private EquipmentOffensif equipOffensif; : Équipement offensif du personnage.
//private EquipementDefensif equipDefensif; : Équipement défensif du personnage.


//Constructeur :
//public Personnage(String name, String type) :
//Initialise le personnage avec un nom et un type.
//Détermine les caractéristiques (HP et ATQ) en fonction du type de personnage.
//Pour un Magicien : 6 HP et 15 ATQ avec un sceptre et un sac.
//Pour un Guerrier : 10 HP et 10 ATQ avec une massue et une armure.


//Ajustement des attributs :
//Les points de vie et d'attaque sont augmentés par les niveaux de défense et d'attaque de l'équipement respectif (equipDefensif.getDEFLevel() et equipOffensif.getATQLevel()).


//Méthodes d'accès (Getters) :
//public EquipmentOffensif getEquipementOffensif() : Renvoie l'équipement offensif du personnage.
//public EquipementDefensif getEquipementDefensif() : Renvoie l'équipement défensif du personnage.


//Méthode de représentation en chaîne :
//public String toString() :
//Renvoie une représentation textuelle des attributs du personnage, incluant son nom, son type, ses HP et son ATQ. Utilise des emojis pour une meilleure présentation visuelle.