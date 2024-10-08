public class Demenagement {
    public static void main (String[] args) {
        int totalCartons = 34;
        int capaciteCamion = 9;

        int nombreDeVoyages = totalCartons / capaciteCamion;
        if (totalCartons % capaciteCamion > 0) {
            nombreDeVoyages++;
        }
        System.out.println("Nombre de Voyages nécessaires : " + nombreDeVoyages);
            }
}
