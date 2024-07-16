public class SelectKthSmallest {
    public static int partion(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;

        for (int j = low + 1; j <= high; j++) {
            if (pivot > arr[j]) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

        return i;
    }

    public static int selection(int[] arr, int low, int high, int k) {

        // Divide (Partion)
        int pivot = partion(arr, low, high);

        if (pivot == k - 1) {
            return arr[pivot];
        } else if (pivot < k - 1) {
            return selection(arr, pivot + 1, high, k);
        } else {
            return selection(arr, low, pivot - 1, k);
        }

        // return pivot;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 9, 2, 4, 5, 7 };
        int n = arr.length;
        int k = 6;

        int ans = selection(arr, 0, n - 1, k);
        System.out.println(ans);
    }
}
