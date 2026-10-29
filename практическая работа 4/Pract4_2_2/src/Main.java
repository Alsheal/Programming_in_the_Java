import java.util.Scanner;

public class Main {
    // Метод для проверки, является ли год високосным
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число от 1 до 12: ");

        // Предотвращаем ввод нецелых чисел
        if (!in.hasNextInt()) {
            System.out.println("Ошибка: нужно ввести целое число!");
            return;
        }

        int number = in.nextInt();

        try {
            System.out.println("Месяц: " + months[number - 1]);

            // Если выбран февраль (индекс 1, ввод 2)
            if (number == 2) {
                System.out.print("Введите год: ");

                if (!in.hasNextInt()) {
                    System.out.println("Ошибка: год должен быть целым числом!");
                    return;
                }

                int year = in.nextInt();
                int days = isLeapYear(year) ? 29 : 28;
                System.out.println("Количество дней: " + days);
            } else {
                // Для остальных месяцев выводим как обычно
                System.out.println("Количество дней: " + dom[number - 1]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число");
        }
    }
}