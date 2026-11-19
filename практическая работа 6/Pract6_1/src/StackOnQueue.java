import java.util.Queue;
import java.util.LinkedList;

public class StackOnQueue {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int top() {
        return q1.peek();
    }

    public int pop() {
        return q1.poll();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public String toString() {
        return q1.toString();
    }
}
