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


// Classe Personnage : Classe abstraite représentant un personnage dans le jeu.
// Attributs :
// - String name : Nom du personnage.
// - String type : Type du personnage (Guerrier ou Magicien).
// - int HP : Points de vie du personnage.
// - int ATQ : Points d'attaque du personnage.
// - EquipmentOffensif equipOffensif : Équipement offensif du personnage.
// - EquipementDefensif equipDefensif : Équipement défensif du personnage.
//
// Constructeur :
// - Personnage(String name, String type) : Initialise le personnage avec un nom et un type.
//
// Méthodes :
// - recuperationstuff(int hp, int atq, EquipmentOffensif equipOffensif, EquipementDefensif equipDefensif) : Met à jour les attributs du personnage.
// - parametreheros() : Méthode vide pour définir les paramètres du héros.
// - getEquipementOffensif() : Renvoie l'équipement offensif du personnage.
// - getEquipementDefensif() : Renvoie l'équipement défensif du personnage.
// - toString() : Renvoie une représentation textuelle des attributs du personnage.