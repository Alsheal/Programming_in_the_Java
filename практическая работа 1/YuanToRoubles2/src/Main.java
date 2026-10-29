import java.util.Scanner;

public class Main {
    public static void main() {
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;
        int digit;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в юанях: ");
        yuan = scanner.nextInt();

        roubles = Math.ceil(ROUBLES_PER_YUAN * yuan);

        digit = yuan % 10;
        String currencyName;

        switch (digit) {
            case 1:
                if (yuan % 100 == 11) {
                    currencyName = "китайских юаней";
                } else {
                    currencyName = "китайский юань";
                }
                break;
            case 2:     // если 2,3 или 4 - используется "китайского юаня"
            case 3:
            case 4:
                // Исключения для 12, 13, 14
                if (yuan % 100 >= 12 && yuan % 100 <= 14) {
                    currencyName = "китайских юаней";
                } else {
                    currencyName = "китайских юаня";
                }
                break;
            default:

                currencyName = "китайских юаней";
                break;
        }

        System.out.println(yuan + " " + currencyName + " = " + roubles + " рублей");

        scanner.close();
    }
}