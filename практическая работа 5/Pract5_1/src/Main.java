import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1) Удаление дубликатов через contains()
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println("Список без повторений: " + removeDuplicates(list));

        // 2) Линейный поиск
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Индекс элемента 30: " + linearSearch(array, 30));
        System.out.println("Индекс элемента 60: " + linearSearch(array, 60));

        // 3) НАИБОЛЬШИЙ Circle через compareTo()
        Circle[] circles = {new Circle(5), new Circle(2), new Circle(8)};
        Circle largest = circles[0];
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].compareTo(largest) > 0) {   // > 0 — ищем максимум
                largest = circles[i];
            }
        }
        System.out.println("Наибольший радиус: " + largest.getRadius());

        // 4) НАИБОЛЬШИЙ элемент в двумерном массиве
        Integer[][] numbers = {
                {8, 3, 6},
                {4, 1, 9}
        };
        System.out.println("Наибольший элемент массива: " + max(numbers));
    }

    // 1) Удаление дубликатов с использованием contains()
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer element : list) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    // 2) Линейный поиск
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // 4) Поиск НАИБОЛЬШЕГО элемента в двумерном массиве через compareTo()
    public static <E extends Comparable<E>> E max(E[][] array) {
        E largest = array[0][0];
        for (E[] row : array) {
            for (E element : row) {
                if (element.compareTo(largest) > 0) {   // > 0 — максимум
                    largest = element;
                }
            }
        }
        return largest;
    }
}