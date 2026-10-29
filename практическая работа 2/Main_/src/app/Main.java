package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main() {
        Car car = new Car();
        car.setOwnerName("Ivan");
        car.setInsuranceNumber("ABC-123456");
        car.setEngineType("Gazoline");

        System.out.println("Owner: " + car.getOwnerName());
        System.out.println("InsuranceNumber: " + car.getInsuranceNumber());
        System.out.println("engineType: " + car.getEngineType());

        System.out.println();

        ElectricCar xiaomi = new ElectricCar("Petr",
                "XYZ-101112", 90);
        System.out.println("Owner: " + xiaomi.getOwnerName());
        System.out.println("InsuranceNumber: " + xiaomi.getInsuranceNumber());
        System.out.println("engineType: " + xiaomi.getEngineType());
        System.out.println("Battery: " + xiaomi.getBatteryCapacity());
    }
}