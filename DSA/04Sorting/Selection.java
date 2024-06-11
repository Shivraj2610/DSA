import java.util.Arrays;

public class Selection {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            /**
             * @Param: minInd --> used to store minimum number's Index
             */
            int minInd = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
            }

            if (i != minInd) {
                int swap = arr[i];
                arr[i] = arr[minInd];
                arr[minInd] = swap;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 1, 3, 5 };

        selectionSort(arr);
        System.out.println("The Sorted Array is:");
        System.out.println(Arrays.toString(arr));
    }
}
