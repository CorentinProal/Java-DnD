package Personnage.classe;
import Personnage.Personnage;
import Personnage.equipement.defensif.Philtre;
import Personnage.equipement.offensif.Sort;

public class Magicien extends Personnage {
    public Magicien(String name) {
        super(name, "Magicien");
        parametreheros();
    }

    @Override
    public void parametreheros() {
        this.recuperationstuff(6, 15, new Sort("Sceptre Eternel", "Sort"), new Philtre("Sac", "Philtre"));
    }
}
