
/*
 * Time Complexity ----> O(logn)
 * 
 * Space Complexity --> best case== O(n) & worst case == O(logn) 
 */

import java.util.*;

public class binaryRec {
    public static int binarySearch(int[] arr, int low, int high, int target) {
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Condition 1st: base Case
            if (arr[mid] == target) {
                return mid;
            }
            // Condition 2nd: go to Right
            else if (arr[mid] < target) {
                return binarySearch(arr, mid + 1, high, target);
            }
            // Condition 3rd: go to left
            else {
                return binarySearch(arr, low, mid - 1, target);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 4, 6, 8, 10, 12 };

        System.out.println("Enter target element:");
        int target = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;

        int result = binarySearch(arr, low, high, target);

        if (result == -1) {
            System.out.println("Element is not present");
        } else {
            System.out.println("The element is present at index: " + result);
        }
    }
}
