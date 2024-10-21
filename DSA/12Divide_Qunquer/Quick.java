public class Quick {
    public static int partition(int[] arr, int low, int high) {
        int i = low;
        int pivot = arr[low];

        for (int j = low + 1; j <= high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;

        // Return the final position of pivot
        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // 1.Divide Array into SubArray
            int pivotInd = partition(arr, low, high);

            // 2. Conquer SubArray
            quickSort(arr, low, pivotInd - 1);
            quickSort(arr, pivotInd + 1, high);

            // 3.No Need Combine

        }
    }

    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 23, 10, 7, 13, 27, 9, 15, 1 };
        int n = arr.length;
        System.out.println(n);

        printArr(arr, n);

        quickSort(arr, 0, n - 1);

        printArr(arr, n);
    }
}
