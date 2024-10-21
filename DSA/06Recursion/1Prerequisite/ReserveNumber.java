
public class ReserveNumber {
    public static void main(String[] args) {
        int ans = reverse(12345);
        System.out.println(ans);
    }

    static int sum = 0;

    // Reverse a number
    static int reverse(int n) {
        if (n == 0) {
            return 0;
        }

        sum = sum * 10 + (n % 10);

        // Recurence relation is used to removing last digit from number
        reverse(n / 10);
        return sum;

    }
}
