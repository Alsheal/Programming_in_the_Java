public class Main {
    public static void main(String[] args) {

        GeometricObject[] objects = new GeometricObject[5];


        objects[0] = new Circle(3);
        objects[1] = new Square(4);
        objects[2] = new Triangle(3, 4, 5, "красный", true);
        objects[3] = new Square(2.5);
        objects[4] = new Circle(5);

                for (int i = 0; i < objects.length; i++) {
            System.out.println("Объект №" + (i + 1) + " (" + objects[i].getClass().getSimpleName() + ")");
            System.out.println("Площадь: " + objects[i].getArea());

            if (objects[i] instanceof Colorable) {

                ((Colorable) objects[i]).howToColor();
            }
        }
    }
}