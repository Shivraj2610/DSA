import java.util.*;

public class FindSqRt {

    public static int toFindSqrt(int num) {
        int low = 0;
        int high = num;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = mid * mid;

            if (val == num) {
                return mid;
            } else if (val < num) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A number to find it's Square Root");
        int num = sc.nextInt();

        int result = toFindSqrt(num);
        System.out.println("The Square Root of " + num + " is: " + result);
    }
}
