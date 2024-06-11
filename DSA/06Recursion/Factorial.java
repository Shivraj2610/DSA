import java.util.*;

public class Factorial {
    public static int factorial(int num) {
        int result = 0;

        if (num == 0 || num == 1) {
            return 1;
        } else {
            result = num * factorial(num - 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        int num = sc.nextInt();

        int ans = factorial(num);
        System.out.println("The Factorail of " + num + " is:" + ans);
    }
}
