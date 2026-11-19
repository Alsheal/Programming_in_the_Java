import java.util.Arrays;

public class GenericStack<E> {
    private E[] elements;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[10];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return elements[size - 1];
    }

    public void push(E o) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = o;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        E element = elements[--size];
        elements[size] = null;
        return element;
    }
}