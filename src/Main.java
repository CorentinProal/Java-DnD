import Personnage.Personnage;
import Prametre.Game;
import Prametre.Menu;
import Prametre.PersonnageHorsPlateauException;

public class Main {
    public static void main(String[] args) throws PersonnageHorsPlateauException {
        Game game = new Game();
        game.start();
    }
}
