package personnage.classe;
import personnage.Personnage;


public class Magicien extends Personnage {
    public Magicien(String name) {
        super(name, "Magicien");
        parametreheros();
    }

    @Override
    public void parametreheros() {
        this.recuperationstuff(6, 10);
    }
}
