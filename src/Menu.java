import java.util.Scanner;
public class Menu {
    private Scanner scanner;
    private String playerName;
    private String playerClass;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void afficherMessage(String message) {
        System.out.println(message);
        System.out.println();
    }

    public int obtenirChoix(int nombreOptions) {
        int choix = -1;
        while (choix < 1 || choix > nombreOptions) {
            System.out.print("Veuillez entrer votre choix (1-" + nombreOptions + "): ");
            choix = scanner.nextInt();
        }
        return choix;
    }

    public void demarrerJeu() {
        while (true) {
            afficherMessage("Bienvenue dans le jeu !");
            afficherMessage("1. Créer un personnage");
            afficherMessage("2. Sortir du jeu");
            int choix = obtenirChoix(2);

            if (choix == 1) {
                choisirNom();
                choisirClasse();
                afficherStats();
            } else if (choix == 2) {
                afficherMessage("Merci d'avoir joué !");
                break;
            }
        }
    }

    private void choisirNom() {
        System.out.print("Veuillez entrer votre nom: ");
        playerName = scanner.next();
        afficherMessage("Bienvenue, " + playerName + " !");
    }

    private void choisirClasse() {
        afficherMessage("Choisissez votre classe :");
        afficherMessage("1. Guerrier");
        afficherMessage("2. Magicien");
        int choixClasse = obtenirChoix(2);
        playerClass = (choixClasse == 1) ? "Guerrier" : "Magicien";
        afficherMessage("Vous avez choisi la classe : " + playerClass);
    }

    private void afficherStats() {
        Personnage personnage = new Personnage(playerName, playerClass);
        afficherMessage(personnage.toString());
    }
}