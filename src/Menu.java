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
            System.out.print("Tu choisis ouuu ? (1-" + nombreOptions + "): ");
            choix = sc.nextInt();
        }
        return choix;
    }

    public void MenuDebut() {
        boolean continuer = true;

        Message("\n Bienvenue chez Kayangel ! ");

        while (continuer) {

            Message("1. Créer ton perso ");
            Message("2. Voir tes stats ");
            Message("3. Ça part ! ");
            Message("4. Fin du game ");
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
                        Message("Il te faut un perso.");
                    }
                    break;
                case 4:
                    Message("Merci d'avoir joué !"+ "\n T'es un GOAT");
                    continuer = false;
                    break;
                default:
                    Message("Option invalide.");
                    break;
            }
        }
    }

    private void CreationPersonnage() {
        System.out.print("C'est quoi ton petit nom ? : ");
        String playerName = sc.next();
        Message("Tu joue quoi ? :");
        Message("1. Guerrier");
        Message("2. Magicien");
        int choixClasse = ChoixOption(2);
        String playerClass = (choixClasse == 1) ? "Guerrier" : "Magicien";

        game = new Game(playerName, playerClass);
        Message("Et paf c'est fait !  : " + game.getPersonnage().toString());
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
            System.out.println("\nAppuyez sur [Entrée] pour lancer le dé...");

            while (true) {
                String input = sc.nextLine();
                if (input.equals("") || input.equals(" ")) {
                    break;
                } else {
                    System.out.println("Appuyez sur [Entrée] pour lancer le dé...");
                }
            }

            game.Delpacement();

            if (game.Fin()) {
                Message("T'es trop fort le S t'as fini ! ");
                Message("Tu rejoue ouuuu ? (1. Oui / 2. Nope)");
                int choixRecommencer = ChoixOption(2);
                if (choixRecommencer == 1) {
                    game.setPosition(1);
                } else {
                    Message("Merci d'avoir joué !" +
                            "\n T'es un GOAT");
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