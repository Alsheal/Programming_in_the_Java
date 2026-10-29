// Задача 1

import java.util.Scanner;  // импорт класса Scanner ( инструмент для чтения данных, ввод с клавиатуры)

public class Main {
    public static void main() {  // точка входа в программу
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;

        Scanner scanner = new Scanner(System.in);  // через scanner можно читать то, что вводит пользователь

        System.out.print("Введите сумму в юанях: ");
        yuan = scanner.nextInt();   // ввод целого числа

        roubles = Math.ceil(ROUBLES_PER_YUAN * yuan);  // округление в большую сторону ( в сторону покупателя )

        System.out.println("Сумма в рублях: " + roubles);
    }
}

