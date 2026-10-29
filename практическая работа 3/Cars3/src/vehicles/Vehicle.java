package vehicles;

public abstract class Vehicle {
    String model, license, color, ownerName, insuranceNumber, engineType;
    int year;

    public Vehicle(String model, String license, String color, int year,
                   String ownerName, String insuranceNumber, String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getInsuranceNumber() { return insuranceNumber; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }

    public void setEngineType(String engineType) { this.engineType = engineType; }

    public abstract String vehicleType();

    public String toString() {
        return vehicleType() + ": " + model + ", " + license + ", " + color +
                ", " + year + ", " + ownerName + ", " + insuranceNumber + ", " + engineType;
    }
}