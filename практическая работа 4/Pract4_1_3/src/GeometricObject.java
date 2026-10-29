import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "белый";
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public Date getDateCreated() { return dateCreated; }

    // 1. Абстрактный метод площади (нужен для расчета)
    public abstract double getArea();

    // 2. Реализация интерфейса Comparable
    public int compareTo(GeometricObject obj) {
        return Double.compare(this.getArea(), obj.getArea());
    }

    // 3. Статический метод max
    public static GeometricObject max(GeometricObject a, GeometricObject b) {
        if (a.compareTo(b) >= 0) return a;
        return b;
    }

    public String toString() {
        return "создан: " + dateCreated + "\nцвет: " + color +
                "\nзаливка: " + filled;
    }
}