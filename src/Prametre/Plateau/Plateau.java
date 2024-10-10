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
    public static final int TAILLE_PLATEAU = 64;
    private ArrayList<Case> cases;

    public Plateau() {
        cases = new ArrayList<>(Collections.nCopies(TAILLE_PLATEAU, new CaseVide()));

        List<Case> objets = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            objets.add(new CaseEnnemi());
        }
        for (int i = 0; i < 2; i++) {
            objets.add(new Arme());
        }
        for (int i = 0; i < 7; i++) {
            objets.add(new Potion("Potion " + (i + 1), 10));
        }

        int casesVides = TAILLE_PLATEAU - objets.size();
        for (int i = 0; i < casesVides; i++) {
            objets.add(new CaseVide());
        }

        Collections.shuffle(objets);
        for (int i = 0; i < objets.size(); i++) {
            cases.set(i, objets.get(i));
        }
    }

    public Case getCase(int position) {
        return cases.get(position - 1);
    }
}


// Classe Plateau : Représente le plateau de jeu.
// Attributs :
// - static final int TAILLE_PLATEAU : Taille du plateau (64 cases).
// - ArrayList<Case> cases : Liste des cases du plateau.
//
// Constructeur :
// - Plateau() : Initialise le plateau avec des cases vides et ajoute des objets (ennemis, armes, potions) en les mélangeant.
//
// Méthodes :
// - getCase(int position) : Renvoie la case à la position spécifiée.