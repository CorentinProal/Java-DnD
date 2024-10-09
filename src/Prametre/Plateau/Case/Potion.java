package Prametre.Plateau.Case;

public class Potion implements Case {
    @Override
    public String getType() {
        return "potion";
    }

    @Override
    public String toString() {
        return "Vous avez trouvé une potion !";
    }
}