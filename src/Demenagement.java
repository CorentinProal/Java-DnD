public class Demenagement {
    public static void main(String[] args) {
        // Variables
        int totalCartons = 34;  // Nombre total de cartons
        int capaciteCamion = 9; // Capacité du camion en nombre de cartons
        int nbVoyages;          // Nombre de voyages nécessaires

        // Calcul du nombre de voyages nécessaires
        nbVoyages = (int) Math.ceil((double) totalCartons / capaciteCamion);

        // Affichage du résultat
        System.out.println("Nombre de cartons à déménager : " + totalCartons);
        System.out.println("Capacité du camion : " + capaciteCamion);
        System.out.println("Nombre de voyages nécessaires : " + nbVoyages);

        // Simulation des voyages
        for (int voyage = 1; voyage <= nbVoyages; voyage++) {
            int cartonsRestants = totalCartons - (voyage - 1) * capaciteCamion;
            int cartonsDansCamion = Math.min(cartonsRestants, capaciteCamion);
            System.out.println("Voyage " + voyage + " : " + cartonsDansCamion + " cartons dans le camion.");
        }
    }
}
