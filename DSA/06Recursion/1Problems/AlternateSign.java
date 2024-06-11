/*
 * problem Statement -->  alternateSign(5) === 1-2+3-4+5=3
 */

public class AlternateSign {

    public static int alternateSign(int num) {
        if (num == 0) {
            return 0;
        } else {
            // even number having -ve sign
            if (num % 2 == 0) {
                return alternateSign(num - 1) - num;
            } else {
                // odd number having +ve sign
                return alternateSign(num - 1) + num;
            }
        }
    }

    public static void main(String[] args) {
        int num = 6;

        int result = alternateSign(num);

        System.out.println("The result is: " + result);
    }
}
