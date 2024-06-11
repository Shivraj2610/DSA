
public class TilingProblem {
    public static int getWays(int n) {
        if (n <= 3) {// Series is ---> 1 2 3 5 8 13.......n;
            return n;
        } else {
            return getWays(n - 1) + getWays(n - 2);
        }
    }

    public static void main(String[] args) {
        int result = getWays(5);
        System.out.println(result);
    }
}
