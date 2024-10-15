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
        System.out.println("Le combat commence contre un " + this.getType() + " nommé " + this.nom + " !!");

        while (this.vie > 0 && joueur.getHP() > 0) {
            // Le joueur attaque en premier
            this.degatsInfliges(joueur.getATQ());
            System.out.println(this.nom + " reçoit " + joueur.getATQ() + " points de dégâts.");

            if (this.vie <= 0) {
                System.out.println("Vous avez vaincu " + this.nom + " le " + this.getType() + " !");
                break;
            }

            // Si l'ennemi est encore en vie, il attaque le joueur
            joueur.degatsInfliges(this.getForce());
            System.out.println(joueur.getNom() + " reçoit " + this.getForce() + " points de dégâts.");

            if (joueur.getHP() <= 0) {
                System.out.println("Vous avez été vaincu par " + this.nom + " le " + this.getType() + "...");
                System.exit(0);
            }
        }
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