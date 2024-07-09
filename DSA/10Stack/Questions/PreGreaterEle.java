import java.util.Stack;

public class PreGreaterEle {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 6, 2, 9 };
        int[] preGreater = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                preGreater[i] = -1;
            } else {
                preGreater[i] = s.peek();
            }

            s.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(preGreater[i] + " ");
        }
    }
}
