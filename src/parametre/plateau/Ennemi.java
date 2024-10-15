package parametre.plateau;


import personnage.classe.Personnage;

public abstract class Ennemi implements Combat, Case {
    protected String nom;
    protected int vie;
    protected int force;
    private String type;

    public Ennemi(String nom, int vie, int force) {
        this.nom = nom;
        this.vie = vie;
        this.force = force;
    }

    @Override
    public void degatsInfliges(int degatsInfliges){
    vie -= degatsInfliges;
    }

    public void combattre(Personnage joueur) {
        System.out.println("Le combat commence contre un " + this.type + " nommé " + this.nom + " !!");
        joueur.degatsInfliges(joueur.getATQ());
        System.out.println(this.nom + " reçoit " + joueur.getATQ() + " points de dégâts.");

        if (getVie() <= 0) {
            System.out.println("Vous avez vaincu " + this.nom + " le " + this.type + " !");
            return;
        }

        joueur.degatsInfliges(getForce());
        System.out.println("Le joueur reçoit " + getForce() + " points de dégâts.");

        if (joueur.getHP() <= 0) {
            System.out.println("Vous avez été vaincu par " + this.nom + " le " + this.type + "...");
            System.exit(0);
        }


    }

    @Override
    public void attaque(Personnage joueur){
        combattre(joueur);
    }



    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }


    public String toString(){
        return nom + " " + vie;

    };


    public int getForce(){
        return force;
    }

    public abstract String getType();
}