public class SearchinSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 18, 25, 34, 4 };
        int ans = search(arr, 7, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int low, int high) {
        int pivoit = findPivot(arr, low, high);

        return pivoit;
    }

    static int findPivot(int[] arr, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Here we got Pivot Element if they fullfill below condition
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > low && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            if (arr[low] < arr[mid]) {
                return findPivot(arr, mid + 1, high);
            } else {
                return findPivot(arr, low, mid - 1);
            }
        }
        return -1;
    }
}
