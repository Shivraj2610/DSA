public class SearchinSortedRotated {
    public static void main(String[] args) {
        int[] arr = { 5, 12, 13, 14, 1, 2, 3, 4, 5 };
        int ans = search(arr, 4, 0, arr.length - 1);
        System.out.println(ans);
    }

    /*
     * To Searching Target Element
     */
    static int search(int[] arr, int target, int low, int high) {
        int pivoit = findPivot(arr, low, high);

        if (pivoit == -1) {
            return binarySearch(arr, target, low, high);
        } else if (target < arr[low]) {
            return binarySearch(arr, target, pivoit + 1, high);
        } else {
            return binarySearch(arr, target, low, pivoit - 1);
        }
    }

    /*
     * It Find the peak element i.e the pivot element in from the Array
     * 
     */
    static int findPivot(int[] arr, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Here we got Pivot Element if they fullfill below condition
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > low && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            if (arr[low] < arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    /*
     * Perform BinarySearch
     */
    static int binarySearch(int[] arr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
