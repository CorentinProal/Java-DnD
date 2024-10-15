package parametre.plateau;

public abstract class Ennemi implements Case {
    protected String nom;
    protected int vie;
    protected int force;

    public Ennemi(String nom, int vie, int force) {
        this.nom = nom;
        this.vie = vie;
        this.force = force;
    }


    public String getNom() {
        return nom;
    }


    public String toString(){
        return nom + " " + vie;

    };

    //    public int getvieEnnemi() {
//        return vie;
//    }

//    public void recevoirDegats(int degatsInfliges) {
//        vie -= degatsInfliges;
//        System.out.println("Vie restante de : " + nom  +  vie );
//        if (vie <= 0) {
//            System.out.println(" a été vaincu ! ");
//        }
//
//    }

    public int getForce(){
        return force;
    }

    public abstract String getType();
}