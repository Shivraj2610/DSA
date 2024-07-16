import java.util.Arrays;

public class Count_Inversion_Optimized {

    public static int combine(int[] arr, int low, int mid, int high) {
        int swap = 0;
        int[] leftArr = Arrays.copyOfRange(arr, low, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, high + 1);

        int i = 0;
        int j = 0;
        int k = low;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                swap += (mid + 1) - (low + i);
            }
        }

        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }

        return swap;
    }

    public static int countInversion(int[] arr, int low, int high) {
        int count = 0;
        if (low < high) {
            // Divide
            int mid = low + (high - low) / 2;

            // Conquer SubProblems
            count += countInversion(arr, low, mid);
            count += countInversion(arr, mid + 1, high);

            // Combine The Both Sides
            count += combine(arr, low, mid, high);

        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 1, 7, 6, 9, 8, 1 };
        int n = arr.length;

        int ans = countInversion(arr, 0, n - 1);
        System.out.println(ans);
    }
}
