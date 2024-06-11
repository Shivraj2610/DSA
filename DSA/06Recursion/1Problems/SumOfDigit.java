public class SumOfDigit {
    public static int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        } else {
            int remd = n % 10;
            return remd + sumOfDigit(n / 10);
        }
    }

    public static void main(String[] args) {
        int n = 1234;

        int result = sumOfDigit(n);
        System.out.println("The sum of all digits of " + n + " is" + result);
    }
}
