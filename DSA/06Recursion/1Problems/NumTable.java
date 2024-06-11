public class NumTable {

    public static void multiplyKTime(int n, int k) {

        if (k == 1) {
            System.out.println(n);

        } else {

            multiplyKTime(n, k - 1);
            System.out.println(n * k);
        }

    }

    public static void main(String[] args) {
        int n = 12;
        int k = 5;

        multiplyKTime(n, k);

    }
}
