import java.util.Stack;

public class ImplementationQueue_byStack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void enQueue(int value) {
        if (stack2.empty()) {
            stack1.push(value);
        } else if (stack1.empty() && !stack2.empty()) {
            while (!stack2.empty()) {
                int ele = stack2.pop();
                stack1.push(ele);
            }
            stack1.push(value);
        }
    }

    public static int deQueue() {
        if (stack1.empty() && stack2.empty()) {
            System.out.println("The Queue is Empty...");
            System.exit(0);
        } else if (!stack1.empty()) {

            while (!stack1.empty()) {

                int ele = stack1.pop();
                stack2.push(ele);
            }

        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        enQueue(1);
        enQueue(3);
        enQueue(5);

        System.out.println(deQueue());

        enQueue(6);
        System.out.println(deQueue());

    }
}
