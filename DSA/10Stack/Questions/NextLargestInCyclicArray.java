import java.util.Arrays;
import java.util.Stack;

public class NextLargestInCyclicArray {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        int[] res = nextLarge(arr, arr.length);
        System.out.println(Arrays.toString(res));
    }

    static int[] nextLarge(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }

        for (int i = 0; i < 2 * n; i++) {
            int ind = i % n;

            while (!st.isEmpty() && arr[st.peek()] < arr[ind]) {
                res[st.pop()] = arr[ind];
            }

            if (ind < n) {
                st.push(ind);
            }
        }

        return res;
    }
}
