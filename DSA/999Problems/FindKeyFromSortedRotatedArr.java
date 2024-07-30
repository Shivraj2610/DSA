/*
 * Find the Index of Key From Given Sorted Rotated Array
 * {5,6,7,8,9,10,1,2,3}
 *  key=8;
 */
public class FindKeyFromSortedRotatedArr {
    public static int findPivot(int[] arr, int low, int high) {
        // Array is Sorted the return -1;
        if (high < low) {
            return -1;
        }

        // Divide the Array
        int mid = low + (high - low) / 2;

        // arr[mid]>arr[mid+1] Then pivot = mid
        if (mid < high && arr[mid] > arr[mid + 1]) {
            return mid;
            // arr[mid-1]>arr[mid] Then pivot = mid -1
        } else if (mid > low && arr[mid - 1] > arr[mid]) {
            return mid - 1;

            // We Fail the Above two cases then
            // Compair arr[mid] with arr[low]
        } else {
            if (arr[low] < arr[mid]) {
                return findPivot(arr, mid + 1, high);
            } else {
                return findPivot(arr, low, mid - 1);
            }
        }
    }

    // For Searching key element in Sorted Rotated Array
    public static int binarySearh(int[] arr, int low, int high, int key) {
        // key not present
        if (high < low) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            return binarySearh(arr, mid + 1, high, key);
        } else {
            return binarySearh(arr, low, mid - 1, key);
        }
    }

    public static int search(int[] arr, int low, int high, int key) {
        // We get Partion point i.e Pivot
        int pivot = findPivot(arr, low, high);

        // Array is Fully Sorted
        if (pivot == -1) {
            return binarySearh(arr, low, high, key);

            // pivot element is Key
        } else if (arr[pivot] == key) {
            return pivot;

            // key present at low
        }

        // Compare with low element in array
        else if (key < arr[low]) {
            return binarySearh(arr, pivot + 1, high, key);
        } else {
            return binarySearh(arr, low, pivot - 1, key);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 10, 11, 1, 2, 3, 4, 5, 6, 7 };
        int key = 9;

        int ans = search(arr, 0, arr.length - 1, key);
        System.out.println(ans);
    }
}
