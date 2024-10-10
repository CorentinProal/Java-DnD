package Prametre.Plateau.Case.Equipement.Defensif;

public class GrandePotion extends Potion {
    public GrandePotion(String name, int effect) {
        super(name, effect);
    }

    @Override
    public String toString() {
        return "Une grande potion !";
    }
}
