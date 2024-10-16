package parametre.plateau;


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
import java.util.Scanner;

public class Plateau {
    public static final int TAILLE_PLATEAU = 64;
    private List<Case> cases;
    private int dernierLancer;
    private Scanner scanner;

    public Plateau(Personnage personnage) {
        this.scanner = new Scanner(System.in);

        this.cases = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            cases.add(new Dragon(scanner));
        }
        for (int i = 0; i < 5; i++) {
            cases.add(new Sorcier(scanner));
        }
        for (int i = 0; i < 7; i++) {
            cases.add(new Goblin(scanner));
        }

        for (int i = 0; i < 3; i++) {
            cases.add(new Arme("Massue", 3));
        }
        for (int i = 0; i < 3; i++) {
            cases.add(new Arme("Epee", 7));
        }
        for (int i = 0; i < 8; i++) {
            cases.add(new Bouclier("Bouclier", 10));
        }
        for (int i = 0; i < 20; i++) {
            cases.add(new Philtre("Voile Eternel", 10));
        }
        for (int i = 0; i < 2; i++) {
            cases.add(new Sort("Esprit du Feufollet", 8));
        }
        for (int i = 0; i < 3; i++) {
            cases.add(new Sort("Foudre", 5));
        }
        for (int i = 0; i < 2; i++) {
            cases.add(new Potion("Mini Potion", 1));
        }
        for (int i = 0; i < 2; i++) {
            cases.add(new Potion("Grande Potion", 10));
        }
        int casesVides = TAILLE_PLATEAU - cases.size();
        for (int i = 0; i < casesVides; i++) {
            cases.add(new CaseVide());
        }

        Collections.shuffle(cases);
    }

    public boolean jouerUnTour(int position, Personnage joueur) throws horsPlateauException {
        int lancer = lancerDe();
        position += lancer;

        verifierPosition(position);

        if (position >= TAILLE_PLATEAU) {
            System.out.println(" Bien joué, Tu es sorti de chez Kayangel en vie !\" ");
            return true;
        }

        System.out.println("Tu a lancé un " + lancer + " ! Tu es maintenant sur la case "
                + (position + 1) + ": " + cases.get(position).toString());

        Case caseActuelle = cases.get(position);

        if (caseActuelle instanceof Ennemi) {
            Ennemi ennemi = (Ennemi) caseActuelle;
            ennemi.attaque(joueur);
            // Vérifier si l'ennemi a été vaincu
            if (ennemi.getVie() <= 0) {
                System.out.println("Tu peut avancer ! ");
            }
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
