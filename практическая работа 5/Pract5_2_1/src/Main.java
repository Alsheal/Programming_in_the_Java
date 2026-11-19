import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack1 = new MyStack();                       // композиция
        MyStackInherited<String> stack2 = new MyStackInherited<>(); // наследование

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            String str = input.nextLine();
            stack1.push(str);
            stack2.push(str);
        }

        System.out.println("\nСтек MyStack (композиция):");
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }

        System.out.println("\nСтек MyStackInherited (наследование):");
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }

        input.close();
    }
}