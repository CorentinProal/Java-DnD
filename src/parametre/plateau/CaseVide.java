package parametre.plateau;

import personnage.classe.Personnage;

public class CaseVide implements Case {
//    @Override
//    public String getType() {
//        return "vide";
//    }
//    @Override
//    public String toString() {
//        return "Case vide";
//    }

    @Override
    public void interaction(Personnage joueur) {
        System.out.println("Rien ne se passe.");
    }
}