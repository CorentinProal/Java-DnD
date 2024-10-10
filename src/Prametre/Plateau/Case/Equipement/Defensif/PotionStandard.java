package Prametre.Plateau.Case.Equipement.Defensif;

public class PotionStandard extends Potion {
    public PotionStandard(String name, int effect) {
        super(name, effect);
    }

    @Override
    public String toString() {
        return "Une potion standard !";
    }
}
