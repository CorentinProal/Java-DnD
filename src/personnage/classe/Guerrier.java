package personnage.classe;

import personnage.Personnage;
public class Guerrier extends Personnage {
    public Guerrier(String name) {
        super(name, "Guerrier");
        parametreheros();
    }

    @Override
    public void parametreheros() {
        this.recuperationstuff(10, 10);
    }
}
