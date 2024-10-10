package parametre.plateau;
import parametre.plateau.cases.Case;
import parametre.plateau.cases.CaseVide;
import parametre.plateau.cases.ennemi.Dragon;
import parametre.plateau.cases.ennemi.Sorcier;
import parametre.plateau.cases.ennemi.Goblin;
import parametre.plateau.cases.equipement.offensif.Massue;
import parametre.plateau.cases.equipement.offensif.Epee;
import parametre.plateau.cases.equipement.offensif.Eclair;
import parametre.plateau.cases.equipement.offensif.BouleDeFeu;
import parametre.plateau.cases.equipement.defensif.PotionStandard;
import parametre.plateau.cases.equipement.defensif.GrandePotion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Plateau {
    public static final int TAILLE_PLATEAU = 64;
    private ArrayList<Case> cases;

    public Plateau() {
        cases = new ArrayList<>(Collections.nCopies(TAILLE_PLATEAU, new CaseVide()));

        List<Case> objets = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            objets.add(new Dragon());
        }
        for (int i = 0; i < 5; i++) {
            objets.add(new Sorcier());
        }
        for (int i = 0; i < 7; i++) {
            objets.add(new Goblin());
        }
        for (int i = 0; i < 3; i++) {
            objets.add(new Massue());
        }
        for (int i = 0; i < 3; i++) {
            objets.add(new Epee());
        }

        for (int i = 0; i < 4; i++) {
            objets.add(new PotionStandard());
        }
        for (int i = 0; i < 1; i++) {
            objets.add(new GrandePotion());

        }
        for (int i = 0; i < 2; i++) {
            objets.add(new BouleDeFeu());
        }

        for (int i = 0; i < 3; i++) {
            objets.add(new Eclair());
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
// - cases = new ArrayList<>(Collections.nCopies(TAILLE_PLATEAU, new CaseVide())) : 
//   Cette ligne crée une liste de 64 cases, toutes initialisées à des instances de CaseVide, 
//   représentant un plateau vide au début du jeu.
//
// - List<Case> objets = new ArrayList<>(); : 
//   Cette ligne initialise une nouvelle liste pour stocker les objets (ennemis, armes, potions) 
//   qui seront ajoutés au plateau.
//
// - Boucles for : 
//   Ces boucles ajoutent des instances de différents types d'ennemis (Dragon, Sorcier, Goblin) 
//   et d'équipements (Massue, Épée, Éclair, PotionStandard, GrandePotion, BouleDeFeu) 
//   à la liste d'objets, en spécifiant combien de chaque type doit être ajouté.
//
// Méthodes :
// - getCase(int position) : Renvoie la case à la position spécifiée.
//
// Autre :
// - Collections.shuffle(objets) : Cette méthode mélange aléatoirement les éléments de la liste 'objets' 
//   pour s'assurer que les ennemis, armes et potions sont placés de manière aléatoire sur le plateau, 
//   rendant chaque partie unique.