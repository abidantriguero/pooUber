package Java;

public class Car {
    private Integer id;
    private String licence;
    private Account driver;
    private Integer passenger;

    public Car(String license, Account driver) {
        this.licence = license;
        this.driver = driver;
    }

    void printDataCar() {
        if(passenger != null){
            System.out.println("License: " + licence + " Name Driver: " + driver.name + " Passenger: " + passenger);
        }
    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        if (passenger == 4) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
    
}