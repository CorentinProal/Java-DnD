import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private Game game;

    public Menu() {
        sc = new Scanner(System.in);
    }

    public void Message(String message) {
        System.out.println(message);
        System.out.println();
    }

    public int ChoixOption(int nombreOptions) {
        int choix = -1;
        while (choix < 1 || choix > nombreOptions) {
            System.out.print("Veuillez entrer votre choix (1-" + nombreOptions + "): ");
            choix = sc.nextInt();
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
        String playerName = sc.next();
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
        sc.nextLine();

        while (!game.Fin()) {
            System.out.println("\nAppuyez sur [Espace] pour lancer le dé...");

            while (true) {
                String input = sc.nextLine();
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

//Importation et déclaration de classe :
//import java.util.Scanner; : Importation de la classe Scanner pour la lecture des entrées utilisateur.
//public class Menu : Déclaration de la classe Menu qui gère l'interface utilisateur pour le jeu.


//Attributs de la classe :
//private Scanner sc; : Instance de Scanner pour lire les entrées utilisateur.
//private Game game; : Référence à un objet Game, représentant la partie en cours.


//Constructeur :
//public Menu() : Initialise le scanner pour la lecture des entrées.


//Méthode pour afficher des messages :
//public void Message(String message) : Affiche un message à l'utilisateur suivi d'une ligne vide.


//Méthode pour gérer le choix d'options :
//public int ChoixOption(int nombreOptions) :
//Demande à l'utilisateur de choisir une option entre 1 et nombreOptions.
//Continue de demander jusqu'à ce que l'utilisateur entre un choix valide.


//Méthode principale du menu :
//public void MenuDebut() :
//Affiche le menu principal du jeu et permet à l'utilisateur de choisir parmi plusieurs options (créer un personnage, voir les statistiques, démarrer la partie, quitter).
//Utilise un switch pour traiter le choix de l'utilisateur.


//Méthode de création de personnage :
//private void CreationPersonnage() :
//Demande le nom du joueur et la classe choisie (Guerrier ou Magicien).
//Crée un nouvel objet Game avec ces informations et affiche un message de confirmation.


//Méthode pour afficher les informations du personnage :
//private void InfosPersonnage() :
//Affiche les détails du personnage si un personnage a été créé, y compris l'équipement offensif et défensif.
//Affiche un message si aucun personnage n'a été créé.


//Méthode pour jouer :
//private void Jouer() :
//Démarre la partie en affichant un message.
//Permet au joueur de lancer le dé en appuyant sur la barre d'espace.
//Gère le déplacement du personnage sur le plateau et vérifie si le jeu est terminé.
//Propose la possibilité de recommencer la partie ou de quitter à la fin.