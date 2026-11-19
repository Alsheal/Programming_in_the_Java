import java.util.ArrayList;

public class StackArrayList<E> extends ArrayList<E> {

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return get(getSize() - 1);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return remove(getSize() - 1);
    }

    public void push(E o) {
        add(o);
    }
}