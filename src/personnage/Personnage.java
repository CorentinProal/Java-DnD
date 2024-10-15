package personnage;

import parametre.plateau.cases.ennemi.Ennemi;
import personnage.equipement.defensif.EquipementDefensif;
import personnage.equipement.offensif.EquipementOffensif;

public abstract class Personnage {
    protected String nom;
    protected String type;
    protected int HP;
    protected int ATQ;

    public Personnage(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    protected void recuperationstuff(int hp, int atq) {
        this.HP = hp;
        this.ATQ = atq;
    }

    public abstract void parametreheros();

    public void attaquer(Ennemi ennemi) {
        System.out.println(nom + " attaque " + ennemi.getNom());
        ennemi.recevoirDegats(ATQ);
    }

    @Override
    public String toString() {
        return "\n Nom : " + nom + ", Type : " + type + "\n HP 🛡️ : " + HP + "\n ATQ ⚔️ : " + ATQ;
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

    // **Ajoute le getter pour le nom**
    public String getNom() {
        return nom;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }


    public abstract void utiliserEquipement(EquipementDefensif defensif);

    public abstract void utiliserEquipement(EquipementOffensif offensif);
}