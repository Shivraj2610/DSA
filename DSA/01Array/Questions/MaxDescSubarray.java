import java.util.Arrays;

public class MaxDescSubarray {
    public static int[] subArray(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int start = 0;
        int finalStart = 0;
        int maxLength = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                continue;
            } else {
                int currLength = i - start;
                if (currLength > maxLength) {
                    finalStart = start;
                    maxLength = currLength;
                }
                // Starting new Window
                start = i;
            }
        }

        // for Checking last SubArray
        if (arr.length - start > maxLength) {
            finalStart = start;
            maxLength = arr.length - start;
        }

        return Arrays.copyOfRange(arr, finalStart, maxLength + finalStart);
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 10, 6, 5, 4, 7 };

        int[] ans = subArray(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}