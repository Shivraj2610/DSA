import java.util.*;
import java.math.*;

public class FindLargePow {

    public static BigInteger bigPower(BigInteger a, int b) {
        BigInteger result;
        BigInteger finalres;

        if (b == 1) {
            return a;
        } else {
            result = bigPower(a, b / 2);
            finalres = result.multiply(result);

            if (b % 2 == 0) {
                return finalres;
            } else {
                return a.multiply(finalres);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        BigInteger a = sc.nextBigInteger();

        System.out.println("Enter power:");
        int b = sc.nextInt();

        BigInteger result = bigPower(a, b);

        System.out.println("The result is: " + result);
    }
}
