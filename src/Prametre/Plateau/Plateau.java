package Prametre.Plateau;

import Prametre.Plateau.Case.Case;
import Prametre.Plateau.Case.CaseVide;
import Prametre.Plateau.Case.CaseEnnemi;
import Prametre.Plateau.Case.Arme;
import Prametre.Plateau.Case.Potion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Plateau {
    private ArrayList<Case> cases;
    private static final int TAILLE_PLATEAU = 64; // Taille du plateau

    public Plateau() {
        cases = new ArrayList<>(Collections.nCopies(TAILLE_PLATEAU, new CaseVide())); // Initialiser toutes les cases comme vides

        // Créer des listes d'objets à placer
        List<Case> objets = new ArrayList<>();
        for (int i = 0; i < 10; i++) { 
            objets.add(new CaseEnnemi()); // 10 ennemis
        }
        for (int i = 0; i < 10; i++) { 
            objets.add(new Arme()); // 10 armes
        }
        for (int i = 0; i < 10; i++) { 
            objets.add(new Potion("Potion " + (i + 1), 10)); // 10 potions
        }
        
        // Calculer le nombre de cases vides nécessaires
        int casesVides = TAILLE_PLATEAU - objets.size(); // 64 - 30 = 34 cases vides
        for (int i = 0; i < casesVides; i++) {
            objets.add(new CaseVide()); // Ajouter les cases vides restantes
        }

        // Mélanger les objets
        Collections.shuffle(objets);

        // Placer les objets dans les cases
        for (int i = 0; i < objets.size(); i++) {
            cases.set(i, objets.get(i));
        }
    }

    public Case getCase(int position) {
        return cases.get(position - 1);
    }
}