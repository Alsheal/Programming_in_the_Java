import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GenericStack<String> stack1 = new GenericStack<>();
        StackArrayList<String> stack2 = new StackArrayList<>();

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            String str = input.nextLine();
            stack1.push(str);
            stack2.push(str);
        }

        System.out.println("\nМассивный стек GenericStack:");
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }

        System.out.println("\nСтек-наследник StackArrayList:");
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }

        input.close();
    }
}