// Find the sum of the values of the array [92, 23, 15, -20, 10].
// ans=120

public class SumofArrayEle {
    public static int findSum(int[] arr, int length) {
        if (length == 0) {
            return arr[0];
        } else {
            return arr[length] + findSum(arr, length - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 92, 23, 15, -20, 10 };

        int result = findSum(arr, arr.length - 1);
        System.out.println(result);
    }
}
