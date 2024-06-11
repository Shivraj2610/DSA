import java.util.*;

public class Insertion {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                while (j > 0 && arr[j] < arr[j - 1]) {
                    int sort = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = sort;

                    j--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 7, 6, 3, 2, 1 };

        insertionSort(arr);

        System.out.println("The Sorted Array is:");
        System.out.println(Arrays.toString(arr));
    }
}
