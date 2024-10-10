package parametre.plateau.cases.equipement.offensif;
import personnage.equipement.offensif.Sort;

public class BouleDeFeu extends Sort {
    public BouleDeFeu(){
        super("Boule De Feu !",8);
    }

    @Override
    public String toString() {
        return "Une boule de feu explosive !";
    }
}
