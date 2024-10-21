import java.util.Stack;

public class ValidSubArray {
    public static int findValidSubarray(int[] arr) {
        int[] nextSmaller = new int[arr.length];
        int count = 0;

        Stack<Integer> st = new Stack<>();

        // Find the Next Smaller Element's index of current element
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nextSmaller[i] = nextSmaller.length;
            } else {
                nextSmaller[i] = st.peek();
            }

            st.add(i);
        }

        /*
         * Now the Formula for count of valid subarray for a current is
         * count=nextSmaller[i]-i;
         */
        for (int i = 0; i < arr.length; i++) {
            count += nextSmaller[i] - i;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 2, 5, 8 };

        int count = findValidSubarray(arr);
        System.out.println(count);
    }
}
