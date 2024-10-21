import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 9, 2, 3, 1 };
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }

        if (r > c) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            // Swap max with Last
            int temp = arr[r - 1];
            arr[r - 1] = arr[max];
            arr[max] = temp;

            selection(arr, r - 1, 0, 0);
        }
    }
}
