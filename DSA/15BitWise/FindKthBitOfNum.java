
public class FindKthBitOfNum {
    public static void main(String[] args) {
        int num = 20;
        int k = 3;
        int ans = kthBit(num, k);
        System.out.println(ans);
    }

    public static int kthBit(int num, int k) {
        int mask = (1 << k - 1);

        return (num & mask) == 0 ? 0 : 1;
    }
}
