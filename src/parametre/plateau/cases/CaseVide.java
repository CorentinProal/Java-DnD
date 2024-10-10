package parametre.plateau.cases;

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