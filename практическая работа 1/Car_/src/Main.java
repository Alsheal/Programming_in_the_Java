public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "A123BC", "Black", 2018);
        Car car2 = new Car();
        Car car3 = new Car("Audi", 2015);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        car2.setModel("Nissan");
        System.out.println(car2.getModel());

        System.out.println(car1.getCarAge());
    }
}