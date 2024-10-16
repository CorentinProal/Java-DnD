package parametre.plateau.combat;

import personnage.classe.Personnage;

public class Dragon extends Ennemi {
    public Dragon() {
        super("Dragon", 15, 4);
    }

    @Override
    public String toString() {
        return "Un " + nom + " avec " + vie + " HP et une force de " + force + ".";
    }
    @Override
    public String getType() {
        return "Monstre";
    }

    @Override
    public void interaction(Personnage joueur) {
        this.attaque(joueur);

    }
}