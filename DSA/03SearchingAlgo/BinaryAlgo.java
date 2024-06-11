import java.util.*;

public class BinaryAlgo {

    static int binary(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an Array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Element in an Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target Element");
        int target = sc.nextInt();

        int result = binary(arr, target);

        if (result == 0) {
            System.out.println("The element is not found in array");
        } else {
            System.out.println("The Element is present at: " + result);
        }
    }
}