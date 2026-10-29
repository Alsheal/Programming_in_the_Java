public class ComparableCircle extends Circle {

    public ComparableCircle(double radius) {
        super(radius);
    }

    public int compareTo(GeometricObject obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return Double.compare(this.getRadius(), other.getRadius());
        }
        return super.compareTo(obj);
    }
}