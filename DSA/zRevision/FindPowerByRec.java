
public class FindPowerByRec {

    public static int power(int a, int b) {
        int res;

        if (b == 1) {
            return a;
        } else {
            res = a * power(a, b - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        // BigInteger num = new BigInteger();
        int num = 2;
        int b = 5;
        int res = power(num, b);
        System.out.println("The ans is: " + res);
    }
}
