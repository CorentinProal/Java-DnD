package parametre.plateau;

import parametre.horsPlateauException;
import parametre.plateau.cases.Case;
import parametre.plateau.cases.CaseVide;
import parametre.plateau.cases.ennemi.Dragon;
import parametre.plateau.cases.ennemi.Ennemi;
import parametre.plateau.cases.ennemi.Goblin;
import parametre.plateau.cases.ennemi.Sorcier;
import parametre.plateau.cases.equipement.Bonus;
import parametre.plateau.cases.equipement.Potion;

import personnage.Personnage;
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
            objets.add(new Arme("Massue",3));
        }
        for (int i = 0; i < 3; i++) {
            objets.add(new Arme("Epee",7));
        }
        for (int i = 0; i < 4; i++) {
            objets.add(new Bonus("Petite Potion",2));
        }
        for (int i = 0; i < 1; i++) {
            objets.add(new Bonus("Grande Potion", 5));
        }
        for (int i = 0; i < 2; i++) {
            objets.add(new Sort("Boule de feu",8));
        }
        for (int i = 0; i < 3; i++) {
            objets.add(new Sort("Foudre",5));
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

    public boolean jouerUnTour(int position, Personnage personnage1) throws horsPlateauException {
        verifierPosition(position);
        int lancer = lancerDe();
        position += lancer;
        verifierPosition(position);

        System.out.println("Vous avez lancé un " + lancer + " ! Vous êtes maintenant sur la case "
                + (position + 1) + ": " + cases.get(position).toString());


        if (position >= TAILLE_PLATEAU) {
            System.out.println("Félicitations, vous avez gagné en atteignant la case 64 !");
            return true;
        }

        Case caseActuelle = cases.get(position);


        if (caseActuelle instanceof Ennemi) {
            Ennemi ennemi = (Ennemi) caseActuelle;
            personnage1.attaquer(ennemi);


            if (ennemi.getvieEnnemi() <= 0) {
                cases.set(position, new CaseVide());
            }
        }

        else if (caseActuelle instanceof Sort) {
            caseActuelle.interaction(personnage1);
        }

        else if (caseActuelle instanceof Potion) {
            Potion potion = (Potion) caseActuelle;
            potion.interaction(personnage1);
            cases.set(position, new CaseVide());;
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
