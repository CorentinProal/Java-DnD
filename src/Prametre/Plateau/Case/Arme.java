package Prametre.Plateau.Case;

public class Arme implements Case {
    @Override
    public String getType() {
        return "arme";
    }

    @Override
    public String toString() {
        return "Vous avez trouvé une arme !";
    }
}