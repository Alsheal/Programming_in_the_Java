import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTriangle {
    public static void main() {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Введите три стороны треугольника: ");
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            in.nextLine();

            System.out.print("Введите цвет: ");
            String color = in.nextLine();

            System.out.print("Треугольник закрашен (true/false): ");
            boolean filled = in.nextBoolean();

            Triangle t = new Triangle(a, b, c);
            t.setColor(color);
            t.setFilled(filled);

            System.out.println(t);
            System.out.printf("Площадь: %.2f%n", t.getArea());
            System.out.printf("Периметр: %.2f%n", t.getPerimeter());
            System.out.println("Цвет: " + t.getColor());
            System.out.println("Закрашен: " + t.isFilled());

        } catch (InputMismatchException ex) {
            System.out.println("Ошибка: нужно вводить числа, а не буквы.");
        }
    }
}