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
}

