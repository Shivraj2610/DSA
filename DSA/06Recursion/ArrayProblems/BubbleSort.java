import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 9, 2, 5, 2, 1, 6 };
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = { 8, 4, 5, 2, 1, 6 };
        bubble2(0, 0, arr2);
        System.out.println(Arrays.toString(arr2));

    }

    static void bubble(int[] arr, int passes, int c) {
        if (passes == 0) {
            return;
        }

        if (passes > c) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, passes, ++c);
        } else {
            bubble(arr, passes - 1, 0);
        }
    }

    static void bubble2(int r, int c, int[] arr) {
        if (r == arr.length - 1) {
            return;
        }

        if (r + c < arr.length - 1) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble2(r, c + 1, arr);
        } else {
            bubble2(r + 1, 0, arr);
        }
    }
}
