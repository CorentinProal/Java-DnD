package personnage.classe;

import parametre.plateau.combat.Combat;
import personnage.equipement.defensif.EquipementDefensif;
import personnage.equipement.offensif.EquipementOffensif;

public abstract class Personnage extends Combat {
    protected String nom;
    protected String type;
    protected int HP;
    protected int ATQ;
    protected EquipementOffensif arme;
    protected EquipementDefensif armure;

    public Personnage(){

    }

    public Personnage(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public String toString() {
        return "\n Nom : " + nom + ", Type : " + type + "\n HP 🛡️ : " + HP + "\n ATQ ⚔️ : " + ATQ + "\n" + arme.toString() + "\n" + armure.toString();
    }

    public int getHP() {
        return HP;
    }

    public int getATQ() {
        return ATQ;
    }

    public void setATQ(int ATQ) {
        this.ATQ = ATQ;
    }

    public EquipementDefensif getArmure() {
        return armure;
    }

    public void setArmure(EquipementDefensif armure) {
        this.armure = armure;
    }

    public EquipementOffensif getArme() {
        return arme;
    }

    public String getType() {
        return type;
    }

    public void setArme(EquipementOffensif arme) {
        this.arme = arme;
    }

    public String getNom() {
        return nom;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public void degatsInfliges(int degatsInfliges) {
        int defense = (armure != null) ? getArmure().getDEFLevel() : 0;
        int degatsSubis = degatsInfliges - defense;
        if (degatsSubis < 0) {
            degatsSubis = 0;
        }
        this.HP -= degatsSubis;
        System.out.println(nom + " subit " + degatsSubis + " points de dégâts (Défense: " + defense + ")");
    }




}
