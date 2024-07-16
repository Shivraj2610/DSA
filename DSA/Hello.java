import java.util.Stack;

class Hello {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(87);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}