import java.util.LinkedList;
import java.util.Queue;

public class ImplementationFunction {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < 10; i++) {
            // Enque Operation by add() function
            q.add(i);
        }

        System.out.println("The Queue lookes like: " + q);

        System.out.println("Topmost element before Dequeue: " + q.peek());
        // Deque Operation by remove() function
        q.remove();

        System.out.println("Topmost element after Dequeue: " + q.peek());

        System.out.println("The Current Size of Queue is: " + q.size());

    }
}
