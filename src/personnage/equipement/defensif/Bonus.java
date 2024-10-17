package personnage.equipement.defensif;

public abstract class Bonus {
    private String nom;
    private int effet;
    private String type;

    public Bonus() {

    }

    public String getNom() {
        return nom;
    }

    public int getEffet() {
        return effet;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEffet(int effet) {
        this.effet = effet;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String toString() {
        return "Vous avez trouvé un bonus : " + nom + " !" + "\nEffet : + " + type + " DEF";
    }
}
