package parametre.plateau;

import parametre.PersonnageHorsPlateauException;
import parametre.plateau.cases.Case;
import parametre.plateau.cases.CaseVide;
import parametre.plateau.cases.ennemi.Dragon;
import parametre.plateau.cases.ennemi.Ennemi;
import parametre.plateau.cases.ennemi.Sorcier;
import parametre.plateau.cases.ennemi.Goblin;
import parametre.plateau.cases.equipement.offensif.Massue;
import parametre.plateau.cases.equipement.offensif.Epee;
import parametre.plateau.cases.equipement.offensif.Eclair;
import parametre.plateau.cases.equipement.offensif.BouleDeFeu;
import parametre.plateau.cases.equipement.defensif.PotionStandard;
import parametre.plateau.cases.equipement.defensif.GrandePotion;
import personnage.Personnage;
import personnage.classe.Guerrier;
import personnage.classe.Magicien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Plateau {
    public static final int TAILLE_PLATEAU = 64;
    private ArrayList<Case> cases;
    private int dernierLancer;

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

    public boolean jouerUnTour(int position) throws PersonnageHorsPlateauException {
        position += lancerDe();
        verifierPosition(position);

        System.out.println("Vous avancez de " + dernierLancer + " cases. Vous êtes maintenant sur la case " + position + "/" + TAILLE_PLATEAU);
        afficherCaseActuelle(position);

        if (position >= TAILLE_PLATEAU) {
            System.out.println("Merci d'avoir joué ! \n T'es un GOAT");
            return true;
        }
        return false;
    }

    private int lancerDe() {
        return dernierLancer = new Random().nextInt(6) + 1;
    }

    private void verifierPosition(int position) throws PersonnageHorsPlateauException {
        if (position > TAILLE_PLATEAU) throw new PersonnageHorsPlateauException("Tu es hors plateau !");
    }

    private void afficherCaseActuelle(int position) {
        Case currentCase = getCase(position);
        System.out.println(currentCase.toString());
    }

    public int getDernierLancer() {
        return dernierLancer;
    }
}




