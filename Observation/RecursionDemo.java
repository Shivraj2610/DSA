
public class RecursionDemo {
    public static int factorial(int num) {
        // base condition
        /*
         * Without base case the recrsion goes in infinite loop
         */
        if (num == 1) {
            return 1;
        }

        // Recursive call
        int ans = num * factorial(num - 1);
        return ans;
    }

    public static void main(String[] args) {
        int num = 5;
        int ans = factorial(num);
        System.out.println("The Factorial of " + num + " is " + ans);
    }
}
