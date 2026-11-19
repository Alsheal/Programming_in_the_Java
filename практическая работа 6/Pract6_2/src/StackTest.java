public class StackTest {

    public static void main(String[] args) {

        StackOnQueue stack = new StackOnQueue();

        stack.push(5);
        stack.push(15);

        System.out.println("Верхний элемент: " + stack.top());

        System.out.println("Удаленный элемент: " + stack.pop());

        System.out.println("Проверка на пустоту: " + stack.empty());

        System.out.println("Элементы стека: " + stack);
    }
}
