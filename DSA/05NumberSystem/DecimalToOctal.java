
public class DecimalToOctal {

    public static void toOctal(int num) {
        int[] ans = new int[40];
        int ind = 0;
        while (num > 0) {
            int rem = num % 8;
            ans[ind++] = rem;
            num = num / 8;
        }

        for (int i = ind - 1; i >= 0; i--) {
            System.out.print(ans[i]);
        }
    }

    public static void main(String[] args) {
        toOctal(1082);
    }
}
