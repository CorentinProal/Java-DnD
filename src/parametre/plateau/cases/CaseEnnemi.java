//package parametre.plateau.cases;
//
//import parametre.plateau.cases.ennemi.Ennemi;
//import parametre.plateau.cases.ennemi.Dragon;
//import parametre.plateau.cases.ennemi.Goblin;
//import parametre.plateau.cases.ennemi.Sorcier;
//import personnage.Personnage;
//import personnage.classe.Guerrier;
//import personnage.classe.Magicien;
//
//public class CaseEnnemi implements Case {
//    private Ennemi ennemi;
//
//    public CaseEnnemi(){
//        this.ennemi = new Dragon();
//        this.ennemi = new Sorcier();
//        this.ennemi = new Goblin();
//    }
//    public Ennemi getEnnemi() {
//        return ennemi;
//    }
//    @Override
//    public String getType() {
//        return "Ennemi";
//    }
//    @Override
//    public String toString() {
//        return "Vous êtes tombé sur un " + ennemi.getNom() + ennemi.getvieEnnemi() + "PV restatns. ";
//    }
//
//    @Override
//    public void interaction(Personnage joueur) {
//        System.out.println("Vous rencontrez un " + ennemi.getNom() + " ! ");
//        if (joueur instanceof Guerrier) {
//            System.out.println("Vous ête prêt à combattre !");
//        } else if (joueur instanceof Magicien){
//            System.out.println("Vous préparez un sort !");
//        }
//    }
//}