public class Game {
    private Personnage personnage;
    private int position;  // Position actuelle du joueur sur le plateau (1 à 64)
    private final int FIN_PLATEAU = 64;  // Fin du plateau

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
        if (position > FIN_PLATEAU) {
            position = FIN_PLATEAU;  // Limite à la fin du plateau
        }
        System.out.println("Vous avancez de " + lancerDe + " cases. Vous êtes maintenant sur la case " + position + "/" + FIN_PLATEAU);
    }

    public boolean Fin() {
        return position >= FIN_PLATEAU;
    }

    @Override
    public String toString() {
        return personnage.toString() + "\n Position actuelle sur le plateau : " + position + "/" + FIN_PLATEAU;
    }
}
