/*
 * Peak element is ==> The Adjecent elements are smaller the this called Peak element
 * [1,2,3,8,4] ==> 8 is Peak element
 * +-+
 */

public class FindPeakElement {
    public static int findPeak(int[] arr, int low, int high, int n) {
        if (high < low) {
            return -1;
        }

        int mid = low + (high - low) / 2;
        if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
            return mid;
        } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
            return findPeak(arr, low, mid - 1, n);
        } else {
            return findPeak(arr, mid + 1, high, n);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4 };
        int n = arr.length;

        int ans = findPeak(arr, 0, n - 1, n);
        System.out.println(arr[ans]);
    }
}