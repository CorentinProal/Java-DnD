package parametre.plateau.cases;

import personnage.Personnage;

public class CaseBonus implements Case {
    @Override
    public String getType() {
        return "bonus";
    }

    @Override
    public void interaction(Personnage personnage) {
        System.out.println("Vous avez trouvé un bonus");
    }
}