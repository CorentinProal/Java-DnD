package Prametre;
import Personnage.Personnage;

public class Game {
    private Personnage personnage;
    private int position;  // Position actuelle du joueur sur le plateau (1 à 64)
    private final int LimitePlateau= 64;  // Fin du plateau

    public Game(String nom, String type) {
        personnage = new Personnage(nom, type);
        position = 1;  // Le joueur commence à la position 1
    }

    public Personnage getPersonnage() {
        return personnage;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    // Le joueur avance de plusieurs cases en fonction du dé virtuel (entre 1 et 6)
    public void Delpacement() {
        int lancerDe = (int)(Math.random() * 6) + 1;
        position += lancerDe;
        if (position > LimitePlateau) {
            position = LimitePlateau;  // Limite à la fin du plateau
        }
        System.out.println("Vous avancez de " + lancerDe + " cases. Vous êtes maintenant sur la case " + position + "/" + LimitePlateau);
    }

    public boolean Fin() {
        return position >= LimitePlateau;
    }

    public String toString() {
        return personnage.toString() + "\n Position actuelle sur le plateau : " + position + "/" + LimitePlateau;
    }
}



//Attributs de la classe :
//private Personnage.Personnage personnage; : Représente le personnage du joueur.
//private int position; : Indique la position actuelle du joueur sur le plateau de jeu, qui varie de 1 à 64.
//private final int LimitePlateau = 64; : Constante qui définit la limite supérieure du plateau de jeu.


//Constructeur :
//public Prametre.Game(String nom, String type) : Crée une nouvelle instance de Prametre.Game en initialisant le personnage avec un nom et un type, et en plaçant le joueur à la position de départ (1).


//Accesseurs (Getters) :
//public Personnage.Personnage getPersonnage() : Renvoie le personnage du joueur.
//public int getPosition() : Renvoie la position actuelle du joueur sur le plateau.


//Mutateur (Setter) :
//public void setPosition(int position) : Permet de modifier la position du joueur.


//Méthode de déplacement :
//public void Delpacement() :
//Génère un nombre aléatoire entre 1 et 6, simulant un lancer de dé.
//Ajoute ce nombre à la position actuelle du joueur.
//Si la nouvelle position dépasse la limite du plateau, elle est ajustée à la limite (64).
//Affiche un message indiquant le nombre de cases avancées et la nouvelle position du joueur.


//Méthode de vérification de fin de jeu :
//public boolean Fin() : Vérifie si le joueur a atteint ou dépassé la position 64, indiquant la fin du jeu.


//Méthode de représentation en chaîne :
//public String toString() : Renvoie une représentation textuelle de l'état actuel du jeu, incluant les détails du personnage et sa position sur le plateau.
