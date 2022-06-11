package Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola como estan");
        Car car = new Car("AMQ123", new Account("Abidan Triguero", "AND12"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        car2.passenger = 3;
        car2.printDataCar();
    }
    
}
