public class Car {
    String model;
    String license;
    String color;
    int year;

    // 2. Конструктор, который включает в себя все поля класса
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    // 3. Конструктор по умолчанию (без параметров)
    public Car() {
    }

    // 4. Конструктор, который включает поля по выбору студента
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String toString() {
        return model + ", " + license + ", " + color + ", " + year;
    }

    // Геттеры и сеттеры
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getLicense() { return license; }
    public void setLicense(String license) { this.license = license; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    // Метод для вычисления возраста автомобиля
    public int getCarAge() {
        int currentYear = 2026; // Текущий год
        return currentYear - this.year;
    }
}
