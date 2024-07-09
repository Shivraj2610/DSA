import java.util.Stack;

public class StackOperations {

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();

        // Pushing values in stack
        stack1.push(12);
        stack1.push(20);
        stack1.push(25);
        stack1.push(19);

        // Find Topmost element from stack
        System.out.println("The topmost element is: " + stack1.peek());

        // Delete element from stack
        stack1.pop();

        System.out.println("The topmost element is: " + stack1.peek());

        // Search Element from stack
        System.out.println("The 12 is present at position from top is: " + stack1.search(12));

        // Check Stack is Empty or not
        System.out.println("The stack is empty: " + stack1.empty());

    }
}