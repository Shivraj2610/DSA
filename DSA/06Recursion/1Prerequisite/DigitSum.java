
public class DigitSum {
    public static void main(String[] args) {
        int ans = digitsum(1234);
        System.out.println(ans);
    }

    /*
     * Calculate the Digit sum
     */
    static int digitsum(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + digitsum(n / 10);
    }
}
