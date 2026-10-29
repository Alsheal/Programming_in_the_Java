package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main() {
        Car car = new Car("Mercedes-Benz GLS-Class", "A123BC",
                "Black", 2023, "Ivanov", "ABC-123456");
        ElectricCar eCar = new ElectricCar("Tesla Model 3", "E777AA",
                "White", 2025, "Petrov", "DEF-101112",
                75.0);

        car.setYear(2020);
        car.setOwnerName("Sidorov");
        eCar.setYear(2023);
        eCar.setOwnerName("Kuznetsov");

        car.setInsuranceNumber("INS-999999");
        eCar.setInsuranceNumber("INS-333888");

        System.out.println("Battery: " + eCar.getBatteryCapacity() + " kWh");

        System.out.println(car);
        System.out.println(eCar);
    }
}
