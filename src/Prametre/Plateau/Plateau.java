package Prametre.Plateau;

import Prametre.Plateau.Case.Case;
import Prametre.Plateau.Case.CaseVide;
import Prametre.Plateau.Case.CaseEnnemi;
import Prametre.Plateau.Case.Arme;
import Prametre.Plateau.Case.Potion;

import java.util.ArrayList;

public class Plateau {
    private ArrayList<Case> cases;

    public Plateau() {
        cases = new ArrayList<>();
        // Initialiser le plateau avec 4 cases
        cases.add(new CaseVide()); // Case 1 : vide
        cases.add(new CaseEnnemi()); // Case 2 : ennemi
        cases.add(new Arme()); // Case 3 : arme
        cases.add(new Potion()); // Case 4 : potion
    }

    public Case getCase(int position) {
        return cases.get(position - 1); // Position 1 à 4
    }

    // Méthodes pour gérer le plateau
}