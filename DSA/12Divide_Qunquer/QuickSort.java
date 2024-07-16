public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int i = low;
        // pivot element is 1st element in array
        int pivot = arr[low];

        for (int j = low + 1; j <= high; j++) {
            // j is Greater element than pivot
            // i is Smaller than pivot
            if (arr[j] <= pivot) {
                // increment i
                i++;
                // swap(arr[i],arr[j])
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap(pivot,arr[i])
        int temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // 1.Divide Array into SubArray
            int m = partition(arr, low, high);

            // 2. Conquer SubArray
            quickSort(arr, low, m - 1);
            quickSort(arr, m + 1, high);

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
