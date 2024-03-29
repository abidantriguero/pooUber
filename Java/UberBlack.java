package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car {
    Map<String, ArrayList<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account drive,
            Map<String, ArrayList<String,Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial) {
                super(license, driver);
                this.typeCarAccepted = typeCarAccepted;
                this.seatsMaterial = seatsMaterial;
    }
}