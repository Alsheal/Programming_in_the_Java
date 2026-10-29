import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число от 1 до 12: ");

        // Предотвращаем ввод нецелых чисел (букв, дробей и т.д.)
        if (!in.hasNextInt()) {
            System.out.println("Ошибка: нужно ввести целое число!");
            return; // Завершаем программу, если введено не число
        }

        int number = in.nextInt();

        try {
            // Если number будет 0 или больше 12, возникнет исключение,
            // так как индексы массива от 0 до 11. 
            // (number - 1) сдвигает ввод пользователя (1-12) на индексы (0-11)
            System.out.println("Месяц: " + months[number - 1]);
            System.out.println("Количество дней: " + dom[number - 1]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число");
        }
    }
}