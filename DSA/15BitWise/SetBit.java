
public class SetBit {
    public static void main(String[] args) {
        int num = 30;
        int k = 3;
        int ans = setBit(num, k);
        String que = decimalToBinary(num);
        System.out.println("The Given Number is: " + que);
        String res = decimalToBinary(ans);
        System.out.println(res);
    }

    public static int setBit(int num, int k) {
        int mask = 1 << k - 1;

        return num | mask;
    }

    public static String decimalToBinary(int ans) {
        String bit = "";
        while (ans != 0) {
            int rem = ans % 2;
            bit += rem;
            ans /= 2;
        }

        int l = 0;
        int h = bit.length() - 1;
        char[] arr = bit.toCharArray();
        while (l < h) {
            char temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }

        return String.valueOf(arr);
    }
}
