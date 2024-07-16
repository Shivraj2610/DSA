
public class MergeSort {
    public static void mergeProcedure(int[] arr, int low, int mid, int high) {
        int i, j, k;

        // Size of leftarray and rightarray
        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Declare leftarray and rightarray
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Store the value of leftsubarray and rightsubarray
        for (i = 0; i < n1; i++) {
            leftArr[i] = arr[low + i];
        }

        for (j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = low;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int[] arr, int i, int j) {
        if (i < j) {
            // Divide the Array
            int mid = i + (j - i) / 2;

            // Conquer
            mergeSort(arr, i, mid);// leftSubarray
            mergeSort(arr, mid + 1, j);// rightSubarray

            // Combine both sorted subarray in one array(mergeProcedure)
            mergeProcedure(arr, i, mid, j);
        }
    }

    public static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 6, 1, 3, 8, 2, 9, 10, 7 };
        int n = arr.length;

        print(arr, n);

        mergeSort(arr, 0, n - 1);

        print(arr, n);
    }
}
