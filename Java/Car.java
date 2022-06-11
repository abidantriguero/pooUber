package Java;

public class Car {
    Integer id;
    String licence;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver){
        this.licence = license;
        this.driver = driver;
    }


    void printDataCar() {
        System.out.println("License: " + licence + " Name Driver: " + driver.name);
    }
}
