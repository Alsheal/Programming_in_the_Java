package vehicles;

public class Car extends Vehicle {

    public Car(String model, String license, String color,
               int year, String ownerName, String insuranceNumber,
               String engineType) {
        super(model, license, color, insuranceNumber, year,
                ownerName, engineType);
    }

    public String vehicleType() {
        return "Car";
    }
}
