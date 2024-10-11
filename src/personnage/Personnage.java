package personnage;

public abstract class Personnage {
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

    public abstract void parametreheros();

    public String toString() {
        return "\n Nom : " + name + ", Type : " + type + "\n HP 🛡️ : " + HP + "\n ATQ ⚔️ : " + ATQ;
    }

    public int getHP() {
        return HP;
    }

    public int getATQ() {
        return ATQ;
    }
}
