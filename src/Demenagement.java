public class Demenagement {
    public static void main(String[] args) {
        // Variables
        int totalDesCartons = 34;
        int placeDansCamion = 9;
        int nombreDeVoyages;

        nombreDeVoyages = (int) Math.ceil((double) totalDesCartons / placeDansCamion);

        System.out.println("Cartons à déménager : " + totalDesCartons);
        System.out.println("Place dans le camion : " + placeDansCamion);
        System.out.println("Nombre de voyages nécessaires : " + nombreDeVoyages);

        for (int voyage = 1; voyage <= nombreDeVoyages; voyage++) {
            int cartonsRestants = totalDesCartons - (voyage - 1) * placeDansCamion;
            int cartonsDansCamion = Math.min(cartonsRestants, placeDansCamion);
            System.out.println("Voyage " + voyage + " : " + cartonsDansCamion + " cartons dans le camion.");
        }
    }
}
