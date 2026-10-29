package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main() {
        Car car = new Car();

        car.setOwnerName("Ivan");
        car.setInsuranceNumber("A134BD");
        car.setEngineType("Gazoline");

        System.out.println("Owner:" + car.getOwnerName());
        System.out.println("InsuranceNumber: "+ car.getInsuranceNumber());
        System.out.println("EngineType: " + car.getEngineType());
    };
};
