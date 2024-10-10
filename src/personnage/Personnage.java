package personnage;


public abstract class Personnage { // Classe de base abstraite
    protected String name;
    protected String type;
    protected int HP;
    protected int ATQ;

    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    protected void recuperationstuff(int hp, int atq) {
        this.HP = hp;
        this.ATQ = atq;
    }

    public void parametreheros() {
    }

    public String toString() {
        return "\n Nom : " + name + ", Type : " + type + "\n HP \uD83D\uDEE1\uFE0F : " + HP + "\n ATQ \uD83D\uDDE1\uFE0F: " + ATQ;
    }
    public int getHP() {
        return HP;
    }

    public int getATQ() {
        return ATQ;
    }
}


// Classe Personnage : Classe abstraite représentant un personnage dans le jeu.
// Attributs :
// - String name : Nom du personnage.
// - String type : Type du personnage (Guerrier ou Magicien).
// - int HP : Points de vie du personnage.
// - int ATQ : Points d'attaque du personnage.
//
// Constructeur :
// - Personnage(String name, String type) : Initialise le personnage avec un nom et un type.
//
// Méthodes :
// - recuperationstuff(int hp, int atq) : Met à jour les attributs du personnage.
// - parametreheros() : Méthode vide pour définir les paramètres du héros.
// - getEquipementOffensif() : Renvoie l'équipement offensif du personnage.
// - getEquipementDefensif() : Renvoie l'équipement défensif du personnage.
// - toString() : Renvoie une représentation textuelle des attributs du personnage.