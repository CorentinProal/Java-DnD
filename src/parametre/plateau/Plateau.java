package parametre.plateau;

//import parametre.plateau.combat.Dragon;
//import parametre.plateau.combat.Ennemi;
//import parametre.plateau.combat.Goblin;
//import parametre.plateau.combat.Sorcier;
import parametre.plateau.combat.Dragon;
import parametre.plateau.combat.Ennemi;
import parametre.plateau.combat.Goblin;
import parametre.plateau.combat.Sorcier;
import personnage.equipement.defensif.Potion;

import personnage.classe.Personnage;
import personnage.equipement.defensif.Bouclier;
import personnage.equipement.defensif.Philtre;
import personnage.equipement.offensif.Arme;
import personnage.equipement.offensif.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Plateau {
    public static final int TAILLE_PLATEAU = 64;
    private List<Case> cases;
    private int dernierLancer;

    public Plateau(Personnage personnage) {
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
            objets.add(new Arme("Massue", 3));
        }
        for (int i = 0; i < 3; i++) {
            objets.add(new Arme("Epee", 7));
        }
        for (int i = 0; i < 8; i++) {
            objets.add(new Bouclier("Bouclier", 10));
        }
        for (int i = 0; i < 20; i++) {
            objets.add(new Philtre("Voile Eternel", 10));
        }
        for (int i = 0; i < 2; i++) {
            objets.add(new Sort("Esprit du Feufollet", 8));
        }
        for (int i = 0; i < 3; i++) {
            objets.add(new Sort("Foudre", 5));
        }
        for (int i = 0; i < 2; i++) {
            objets.add(new Potion("Mini Potion", 1));
        }
        for (int i = 0; i < 2; i++) {
            objets.add(new Potion("Grande Potion", 10));
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

    public boolean jouerUnTour(int position, Personnage joueur) throws horsPlateauException {
        int lancer = lancerDe();
        position += lancer;

        verifierPosition(position);

        if (position >= TAILLE_PLATEAU) {
            System.out.println("Félicitations, vous avez gagné en atteignant la case 64 !");
            return true;
        }

        System.out.println("Vous avez lancé un " + lancer + " ! Vous êtes maintenant sur la case "
                + (position + 1) + ": " + cases.get(position).toString());

        Case caseActuelle = cases.get(position);

        if (caseActuelle instanceof Ennemi) {
            Ennemi ennemi = (Ennemi) caseActuelle;
            ennemi.attaque(joueur);
        } else {
            caseActuelle.interaction(joueur);
        }

        return false;
    }



    private int lancerDe() {
        return dernierLancer = new Random().nextInt(6) + 1;
    }

    private void verifierPosition(int position) throws horsPlateauException {
        if (position > TAILLE_PLATEAU) throw new horsPlateauException("Tu es hors plateau !");
    }

    public int getDernierLancer() {
        return dernierLancer;
    }
}
