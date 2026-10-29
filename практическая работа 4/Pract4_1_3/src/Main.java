import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ПУНКТЫ 1, 2, 3
        System.out.println("Тест класса Triangle");

        System.out.print("Введите сторону 1: ");
        double a = in.nextDouble();
        System.out.print("Введите сторону 2: ");
        double b = in.nextDouble();
        System.out.print("Введите сторону 3: ");
        double c = in.nextDouble();

        in.nextLine(); // очистка буфера после чисел

        System.out.print("Введите цвет: ");
        String color = in.nextLine();
        System.out.print("Закрашен (true/false): ");
        boolean filled = in.nextBoolean();

        Triangle t = new Triangle(a, b, c, color, filled);
        System.out.println("Площадь: " + t.getArea());
        System.out.println("Периметр: " + t.getPerimeter());
        System.out.println("Цвет: " + t.getColor());
        System.out.println("Закрашен: " + t.isFilled());

        // ПУНКТ 5
        System.out.println("\nТест метода max()");

        System.out.print("Введите радиус 1-го круга: ");
        double r1 = in.nextDouble();
        System.out.print("Введите радиус 2-го круга: ");
        double r2 = in.nextDouble();

        Circle c1 = new Circle(r1);
        Circle c2 = new Circle(r2);
        System.out.println("Макс. площадь круга: " + GeometricObject.max(c1, c2).getArea());

        System.out.print("Введите сторону 1-го треугольника: ");
        double ta1 = in.nextDouble();
        System.out.print("Введите сторону 2-го треугольника: ");
        double tb1 = in.nextDouble();
        System.out.print("Введите сторону 3-го треугольника: ");
        double tc1 = in.nextDouble();

        System.out.print("Введите сторону 1-го второго треугольника: ");
        double ta2 = in.nextDouble();
        System.out.print("Введите сторону 2-го второго треугольника: ");
        double tb2 = in.nextDouble();
        System.out.print("Введите сторону 3-го второго треугольника: ");
        double tc2 = in.nextDouble();

        Triangle t1 = new Triangle(ta1, tb1, tc1, "красный", true);
        Triangle t2 = new Triangle(ta2, tb2, tc2, "синий", false);
        System.out.println("Макс. площадь треугольника: " + GeometricObject.max(t1, t2).getArea());

        // ПУНКТ 6
        System.out.println("\nТест ComparableCircle");

        System.out.print("Введите радиус 1-го ComparableCircle: ");
        double cr1 = in.nextDouble();
        System.out.print("Введите радиус 2-го ComparableCircle: ");
        double cr2 = in.nextDouble();

        ComparableCircle cc1 = new ComparableCircle(cr1);
        ComparableCircle cc2 = new ComparableCircle(cr2);
        System.out.println("Макс. ComparableCircle: " +
                (cc1.compareTo(cc2) >= 0 ? cc1.getArea() : cc2.getArea()));

        System.out.print("Введите радиус обычного круга: ");
        double rad = in.nextDouble();

        System.out.print("Введите сторону 1 треугольника: ");
        double sta = in.nextDouble();
        System.out.print("Введите сторону 2 треугольника: ");
        double stb = in.nextDouble();
        System.out.print("Введите сторону 3 треугольника: ");
        double stc = in.nextDouble();

        Circle circle = new Circle(rad);
        Triangle tri = new Triangle(sta, stb, stc, "зелёный", true);
        System.out.println("Макс. из круга и треугольника: " +
                (circle.compareTo(tri) >= 0 ? circle.getArea() : tri.getArea()));

        in.close();
    }
}