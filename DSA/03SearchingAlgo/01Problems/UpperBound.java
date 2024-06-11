
import java.util.*;

public class UpperBound {

    public static int upperEle(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;

                // To checking LastOccurence is Present or not
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an Array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the Elements in Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Target Element");
        int target = sc.nextInt();

        int result = upperEle(arr, target);

        if (result == -1) {
            System.out.println("This Element is not Present in array");
        } else {
            System.out.println("This element is Present at index: " + result);
        }
    }
}
