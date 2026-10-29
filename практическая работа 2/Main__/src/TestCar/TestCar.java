package TestCar;

import vehicles.Vehicle;
import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {

    public static void main(){
        Vehicle v1 = new Car("Lexus","A-123456",
                "Black", 2005, "Ivan",
                "A535BC", "Gazoline");
        Vehicle v2 = new ElectricCar("Zeekr","B-101112",
                "White", 2024, "Petr",
                "G990FK", 90);

        v1.setColor("Bronze");
        v2.setOwnerName("Alex");

        System.out.println(v1);
        System.out.println(v2);
    }
}

