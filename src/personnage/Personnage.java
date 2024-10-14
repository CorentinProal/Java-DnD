package personnage;

import parametre.plateau.cases.ennemi.Ennemi;

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

    public String toString() {
        return "\n Nom : " + nom + ", Type : " + type + "\n HP 🛡️ : " + HP + "\n ATQ ⚔️ : " + ATQ;
    }

    public int getHP() {
        return HP;
    }

    public int getATQ() {
        return ATQ;
    }

    public void attaquer(Ennemi ennemi) {
        System.out.println(nom + " attaque " + ennemi.getNom());
        ennemi.recevoirDegats(ATQ);
    }
}
