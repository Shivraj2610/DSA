
public class FindUniqueNum {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 9, 3, 7, 9, 4 };
        int ans = unique(arr);
        System.out.println(ans);
    }

    public static int unique(int[] arr) {
        int res = 0;
        for (int ele : arr) {
            res ^= ele;
        }

        return res;
    }
}
