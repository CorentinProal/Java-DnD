import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Game game;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void Message(String message) {
        System.out.println(message);
        System.out.println();
    }

    public int ChoixOption(int nombreOptions) {
        int choix = -1;
        while (choix < 1 || choix > nombreOptions) {
            System.out.print("Veuillez entrer votre choix (1-" + nombreOptions + "): ");
            choix = scanner.nextInt();
        }
        return choix;
    }

    public void MenuDebut() {
        boolean continuer = true;
        while (continuer) {
            Message("Bienvenue dans le jeu !");
            Message("1. Créer un personnage");
            Message("2. Voir les statistiques du personnage");
            Message("3. Démarrer la partie");
            Message("4. Sortir du jeu");
            int choix = ChoixOption(4);

            switch (choix) {
                case 1:
                    CreationPersonnage();
                    break;
                case 2:
                    InfosPersonnage();
                    break;
                case 3:
                    if (game != null) {
                        Jouer();
                    } else {
                        Message("Veuillez créer un personnage avant de commencer la partie.");
                    }
                    break;
                case 4:
                    Message("Merci d'avoir joué !");
                    continuer = false;
                    break;
                default:
                    Message("Option invalide.");
                    break;
            }
        }
    }

    private void CreationPersonnage() {
        System.out.print("Veuillez entrer votre nom: ");
        String playerName = scanner.next();
        Message("Choisissez votre classe :");
        Message("1. Guerrier");
        Message("2. Magicien");
        int choixClasse = ChoixOption(2);
        String playerClass = (choixClasse == 1) ? "Guerrier" : "Magicien";

        game = new Game(playerName, playerClass);
        Message("Personnage créé : " + game.getPersonnage().toString());
    }

    private void InfosPersonnage() {
        if (game != null) {
            Message(game.getPersonnage().toString());
            String equipOffensif = game.getPersonnage().getEquipementOffensif().toString();
            System.out.println("Equipement offensif : " + equipOffensif);
            String equipDefensif = game.getPersonnage().getEquipementDefensif().toString();
            System.out.println("Equipement défensif : " + equipDefensif);
            System.out.println();
        } else {
            Message("Aucun personnage n'a été créé.");
        }
    }

    private void Jouer() {
        Message("La partie commence !");
        scanner.nextLine();

        while (!game.Fin()) {
            System.out.println("\nAppuyez sur [Espace] pour lancer le dé...");

            while (true) {
                String input = scanner.nextLine();
                if (input.equals("") || input.equals(" ")) {
                    break;
                } else {
                    System.out.println("Appuyez sur [Espace] pour lancer le dé...");
                }
            }

            game.Delpacement();

            if (game.Fin()) {
                Message("Félicitations ! Vous avez terminé le jeu !");
                Message("Voulez-vous recommencer ? (1. Oui / 2. Non)");
                int choixRecommencer = ChoixOption(2);
                if (choixRecommencer == 1) {
                    game.setPosition(1);
                } else {
                    Message("Merci d'avoir joué !");
                    break;
                }
            }
        }
    }
}
