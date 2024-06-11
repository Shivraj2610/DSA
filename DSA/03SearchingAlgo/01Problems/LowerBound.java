import java.util.*;

public class LowerBound {

    public static int firstOccurence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;

                // To Check firstOccurence is present or not
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an Array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements in Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Target element");
        int x = sc.nextInt();

        int result = firstOccurence(arr, x);

        if (result == -1) {
            System.out.println("This element is not present in array");
        } else {
            System.out.println("This element is present in Array at index: " + result);
        }
    }
}
