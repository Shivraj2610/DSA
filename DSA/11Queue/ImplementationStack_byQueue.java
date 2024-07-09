import java.util.LinkedList;
import java.util.Queue;

public class ImplementationStack_byQueue {
    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new LinkedList<>();

    // push operation of stack using add() function of Queue
    public static void push(int value) {

        while (!queue1.isEmpty()) {
            queue2.add(queue1.peek());
            queue1.poll();
        }
        // push new data into queue1
        queue1.add(value);

        // move back queue2 elements into queue1
        while (!queue2.isEmpty()) {
            queue1.add(queue2.peek());
            queue2.poll();
        }
    }

    // Delete element from stack
    public static int delete() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is Empty");
            System.exit(0);
        }
        int ele = queue1.peek();
        queue1.poll();
        return ele;
    }

    public static void main(String[] args) {
        push(12);
        push(70);
        push(45);
        push(89);
        push(10);

        System.out.println("The Deleted element is: " + delete());
        push(100);
        System.out.println("The Deleted element is: " + delete());

    }
}
