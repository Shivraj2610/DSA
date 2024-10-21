
public class SortedorNot {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 8 };

        boolean ans = isSorted(arr);
        System.out.println(ans);
    }

    static boolean isSorted(int[] arr) {
        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }

        return arr[i] < arr[i + 1] && helper(arr, i + 1);
    }
}
