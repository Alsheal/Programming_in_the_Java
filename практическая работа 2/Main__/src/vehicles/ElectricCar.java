package vehicles;

public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar(String model, String license,
                       String color, int year, String ownerName,
                       String insuranceNumber, int batteryCapacity){
        super(model, license, color, year, ownerName, insuranceNumber,
                "Electric");
        this.batteryCapacity=batteryCapacity;
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity=batteryCapacity;
    }

    public String vehicleType(){
        return "Electric Car";
    }

    public String toString(){
        return super.toString() + ", battery: " + batteryCapacity;
    }
}
