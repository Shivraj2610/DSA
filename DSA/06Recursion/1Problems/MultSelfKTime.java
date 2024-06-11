public class MultSelfKTime {
    public static void multiplyKTime(int n, int k) {
        int mult = 0;
        if (k == 1) {
            System.out.println(n);
            ;
        } else {
            multiplyKTime(n, k - 1);
            mult = n * k;
            System.out.println(mult);
        }

    }

    public static void main(String[] args) {
        int n = 2;
        int k = 4;

        multiplyKTime(n, k);

    }
}
