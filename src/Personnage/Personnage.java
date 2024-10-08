package Personnage;

import Personnage.equipement.defensif.EquipementDefensif;
import Personnage.equipement.offensif.EquipmentOffensif;

public abstract class Personnage { // Classe de base abstraite
    protected String name;
    protected String type;
    protected int HP;
    protected int ATQ;
    protected EquipmentOffensif equipOffensif;
    protected EquipementDefensif equipDefensif;

    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    protected void recuperationstuff(int hp, int atq, EquipmentOffensif equipOffensif, EquipementDefensif equipDefensif) {
        this.HP = hp + equipDefensif.getDEFLevel();
        this.ATQ = atq + equipOffensif.getATQLevel();
        this.equipOffensif = equipOffensif;
        this.equipDefensif = equipDefensif;
    }

    public void parametreheros() {

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
//public class Personnage.Personnage : Déclaration de la classe Personnage.Personnage, qui représente un personnage dans le jeu.


//Attributs de la classe :
//private String name; : Nom du personnage.
//private String type; : Type du personnage (par exemple, Magicien ou Guerrier).
//private int HP; : Points de vie du personnage.
//private int ATQ; : Points d'attaque du personnage.
//private Personnage.equipement.offensif.EquipmentOffensif equipOffensif; : Équipement offensif du personnage.
//private Personnage.equipement.defensif.EquipementDefensif equipDefensif; : Équipement défensif du personnage.


//Constructeur :
//public Personnage.Personnage(String name, String type) :
//Initialise le personnage avec un nom et un type.
//Détermine les caractéristiques (HP et ATQ) en fonction du type de personnage.
//Pour un Magicien : 6 HP et 15 ATQ avec un sceptre et un sac.
//Pour un Guerrier : 10 HP et 10 ATQ avec une massue et une armure.


//Ajustement des attributs :
//Les points de vie et d'attaque sont augmentés par les niveaux de défense et d'attaque de l'équipement respectif (equipDefensif.getDEFLevel() et equipOffensif.getATQLevel()).


//Méthodes d'accès (Getters) :
//public Personnage.equipement.offensif.EquipmentOffensif getEquipementOffensif() : Renvoie l'équipement offensif du personnage.
//public Personnage.equipement.defensif.EquipementDefensif getEquipementDefensif() : Renvoie l'équipement défensif du personnage.


//Méthode de représentation en chaîne :
//public String toString() :
//Renvoie une représentation textuelle des attributs du personnage, incluant son nom, son type, ses HP et son ATQ. Utilise des emojis pour une meilleure présentation visuelle.