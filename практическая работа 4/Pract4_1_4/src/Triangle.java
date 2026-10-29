public class Triangle extends GeometricObject {
    private double s1, s2, s3;

    public Triangle(double s1, double s2, double s3, String color, boolean filled) {
        super(color, filled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getArea() {
        double p = (s1 + s2 + s3) / 2;
        return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
    }
}