import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    // Конструктор копирования — для глубокой копии
    public MyStack(MyStack other) {
        this.list = new ArrayList<>();
        for (Object element : other.list) {
            this.list.add(copyElement(element));
        }
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return list.get(list.size() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return list.remove(list.size() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    // Глубокая копия поля list
    public MyStack deepCopy() {
        return new MyStack(this);
    }

    // Копирование отдельного элемента
    private static Object copyElement(Object element) {
        if (element instanceof String)  return new String((String) element);
        if (element instanceof Integer) return Integer.valueOf((Integer) element);
        if (element instanceof Double)  return Double.valueOf((Double) element);
        if (element instanceof Boolean) return Boolean.valueOf((Boolean) element);
        // для immutable-объектов ссылка безопасна
        return element;
    }

    @Override
    public String toString() {
        return "MyStack" + list;
    }
}