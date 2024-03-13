// Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
// That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
// Constraints : 0<=n<=1e6
// Input1 : n = 10
// Output 1 : -5
// Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
// Input 2 : n = 5
// Output 2 : 3

import java.util.*;

public class AlternateSign {

    public static int altSign(int n) {
        if (n == 0) {
            return 0;
        } else {
            if (n % 2 == 0) {
                return altSign(n - 1) - n;
            } else {
                return altSign(n - 1) + n;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int result = altSign(num);
        System.out.println("The ans is: " + result);

    }
}
