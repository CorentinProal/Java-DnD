package personnage.classe;

import parametre.plateau.combat.Combat;
import personnage.equipement.defensif.EquipementDefensif;
import personnage.equipement.offensif.EquipementOffensif;

/**
 * The type Personnage.
 */
public abstract class Personnage extends Combat {
    /**
     * The Nom.
     */
    protected String nom;
    /**
     * The Type.
     */
    protected String type;
    /**
     * The Hp.
     */
    protected int HP;
    /**
     * The Atq.
     */
    protected int ATQ;
    /**
     * The Arme.
     */
    protected EquipementOffensif arme;
    /**
     * The Armure.
     */
    protected EquipementDefensif armure;

    /**
     * Instantiates a new Personnage.
     */
    public Personnage(){

    }

    /**
     * Instantiates a new Personnage.
     *
     * @param nom  the nom
     * @param type the type
     */
    public Personnage(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public String toString() {
        return "\n Nom : " + nom + ", Type : " + type + "\n HP 🛡️ : " + HP + "\n ATQ ⚔️ : " + ATQ + "\n" + arme.toString() + "\n" + armure.toString();
    }

    /**
     * Gets hp.
     *
     * @return the hp
     */
    public int getHP() {
        return HP;
    }

    /**
     * Gets atq.
     *
     * @return the atq
     */
    public int getATQ() {
        return ATQ;
    }

    /**
     * Sets atq.
     *
     * @param ATQ the atq
     */
    public void setATQ(int ATQ) {
        this.ATQ = ATQ;
    }

    /**
     * Gets armure.
     *
     * @return the armure
     */
    public EquipementDefensif getArmure() {
        return armure;
    }

    /**
     * Sets armure.
     *
     * @param armure the armure
     */
    public void setArmure(EquipementDefensif armure) {
        this.armure = armure;
    }

    /**
     * Gets arme.
     *
     * @return the arme
     */
    public EquipementOffensif getArme() {
        return arme;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets arme.
     *
     * @param arme the arme
     */
    public void setArme(EquipementOffensif arme) {
        this.arme = arme;
    }

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets hp.
     *
     * @param HP the hp
     */
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
