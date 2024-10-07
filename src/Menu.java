import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Game game;

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
        boolean continuer = true;
        while (continuer) {
            afficherMessage("Bienvenue dans le jeu !");
            afficherMessage("1. Créer un personnage");
            afficherMessage("2. Voir les statistiques du personnage");
            afficherMessage("3. Démarrer la partie");
            afficherMessage("4. Sortir du jeu");
            int choix = obtenirChoix(4);

            switch (choix) {
                case 1:
                    creerPersonnage();
                    break;
                case 2:
                    afficherInfosPersonnage();
                    break; // Corrigé : on a besoin de sortir de switch après avoir appelé afficherInfosPersonnage()
                case 3:
                    if (game != null) {
                        jouerPartie();
                    } else {
                        afficherMessage("Veuillez créer un personnage avant de commencer la partie.");
                    }
                    break;
                case 4:
                    afficherMessage("Merci d'avoir joué !");
                    continuer = false;
                    break;
                default:
                    afficherMessage("Option invalide.");
                    break;
            }
        }
    }

    private void creerPersonnage() {
        System.out.print("Veuillez entrer votre nom: ");
        String playerName = scanner.next();
        afficherMessage("Choisissez votre classe :");
        afficherMessage("1. Guerrier");
        afficherMessage("2. Magicien");
        int choixClasse = obtenirChoix(2);
        String playerClass = (choixClasse == 1) ? "Guerrier" : "Magicien";

        game = new Game(playerName, playerClass);
        afficherMessage("Personnage créé : " + game.getPersonnage().toString());
    }

    private void afficherInfosPersonnage() {
        if (game != null) {
            afficherMessage(game.getPersonnage().toString());
            String equipOffensif = game.getPersonnage().getEquipementOffensif().toString();
            System.out.println("Equipement offensif : " + equipOffensif);
            String equipDefensif = game.getPersonnage().getEquipementDefensif().toString();
            System.out.println("Equipement défensif : " + equipDefensif);
            System.out.println();
        } else {
            afficherMessage("Aucun personnage n'a été créé.");
        }
    }

    private void jouerPartie() {
        afficherMessage("La partie commence !");
        scanner.nextLine();

        while (!game.estFini()) {
            System.out.println("\nAppuyez sur [Espace] pour lancer le dé...");

            while (true) {
                String input = scanner.nextLine();
                if (input.equals("") || input.equals(" ")) {
                    break;
                } else {
                    System.out.println("Appuyez sur [Espace] pour lancer le dé...");
                }
            }

            game.avancerJoueur();

            if (game.estFini()) {
                afficherMessage("Félicitations ! Vous avez terminé le jeu !");
                afficherMessage("Voulez-vous recommencer ? (1. Oui / 2. Non)");
                int choixRecommencer = obtenirChoix(2);
                if (choixRecommencer == 1) {
                    game.setPosition(1);
                } else {
                    afficherMessage("Merci d'avoir joué !");
                    break;
                }
            }
        }
    }
}
