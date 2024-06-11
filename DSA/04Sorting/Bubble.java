import java.util.*;

public class Bubble {

    public static void bubbleSort(int[] arr) {
        boolean swapped = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 7, 3, 2, 8, 6 };

        bubbleSort(arr);
        System.out.println("The Sorted Array is:");
        System.out.println(Arrays.toString(arr));

    }
}
