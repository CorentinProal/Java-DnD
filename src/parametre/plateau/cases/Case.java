package parametre.plateau.cases;

import personnage.Personnage;

public interface Case {
     String getType();
     void interaction(Personnage personnage);
}