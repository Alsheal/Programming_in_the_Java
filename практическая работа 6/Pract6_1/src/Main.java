
public class Main {

    public static void main(String[] args) {

        StackOnQueue stack = new StackOnQueue();

        stack.push(10);
        stack.push(20);

        System.out.println("Верхний элемент: " + stack.top());

        System.out.println("Удаленный элемент: " + stack.pop());

        System.out.println("Стек пустой: " + stack.empty());

        System.out.println("Все элементы: " + stack);
    }
}
