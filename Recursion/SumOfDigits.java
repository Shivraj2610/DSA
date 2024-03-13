// Q1 : Given an integer, find out the sum of its digits using recursion.
// Input: n= 1234
// Output: 10
// Explanation: 1+2+3+4=10

import java.util.*;

public class SumOfDigits {
    public static int totalSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + totalSum(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numger");
        int num = sc.nextInt();

        int result = totalSum(num);
        System.out.println("The sum of all digits is: " + result);
    }
}
