package Prametre.Plateau.Case;

public class CaseVide implements Case {
    @Override
    public String getType() {
        return "vide";
    }

    @Override
    public String toString() {
        return "Case vide";
    }
}