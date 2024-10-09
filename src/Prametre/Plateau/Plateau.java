package Prametre;

import Prametre.Plateau.Case.Case;

import java.util.ArrayList;

public class Plateau {
    private ArrayList<Case> cases;

    public Plateau() {
        cases = new ArrayList<>();
        // Initialiser le plateau avec des cases
        for (int i = 0; i < 64; i++) {
            cases.add(new Prametre.CaseVide()); // Exemple d'initialisation avec des cases vides
        }
        // Vous pouvez ajouter des ennemis ou des bonus à des positions spécifiques
        cases.set(5, new Prametre.CaseEnnemi()); // Exemple d'ajout d'un ennemi à la case 6
        cases.set(10, new Prametre.CaseBonus());  // Exemple d'ajout d'un bonus à la case 11
    }

    public Case getCase(int position) {
        return cases.get(position - 1); // Position 1 à 64
    }

    // Méthodes pour gérer le plateau
}