import java.util.*;

public class StairsCount {
    public static int countStairs(int n) {
        int result = 0;

        if (n <= 1) {
            return n;
        } else {
            result = countStairs(n - 1) + countStairs(n - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Stairs:");
        int stairs = sc.nextInt();

        int result = countStairs(stairs + 1);
        System.out.println("There is: " + result + " options to complete:" + stairs + " stairs");
    }
}
