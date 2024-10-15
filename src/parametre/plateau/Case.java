package parametre.plateau;

import personnage.classe.Personnage;

public interface Case {


     String getType();

     void interaction(Personnage joueur);
}