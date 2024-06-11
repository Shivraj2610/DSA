public class FindPower {

    public static long powerOfElement(int a, int b) {
        // Base Case Condition
        if (b == 1) {
            return a;
        } else {
            // Recursive Call
            long result = powerOfElement(a, b / 2);
            long finalRes = result * result;

            // Mange result by checking the raise to power is EVEN or ODD
            if (b % 2 == 0) {
                return finalRes;
            } else {
                return finalRes * a;
            }
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 64;

        long result = powerOfElement(a, b);

        System.out.println("The " + a + " raised to " + b + " is:" + result);
    }
}
