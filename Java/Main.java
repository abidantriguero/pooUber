package Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola como estan");
        UberX uberX = new UberX("AMQ123", new Account("Abidan Triguero", "AND12"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH345",  new Account("Abidan Triguero", "AND12"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        // Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        // car2.passenger = 3;
        // car2.printDataCar();
    }
}
