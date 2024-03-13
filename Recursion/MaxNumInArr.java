// Q3: Print the max value of the array [ 13, 1, -3, 22, 5].

public class MaxNumInArr {

    public static int maxNum(int[] arr, int indx) {
        if (indx == 0) {
            return arr[0];
        } else {
            return Math.max(arr[indx], maxNum(arr, indx - 1));
        }
    }

    public static void main(String[] args) {

        int[] arr = { 13, 1, -3, 22, 5 };
        int result = maxNum(arr, arr.length - 1);
        System.out.println(result);
    }
}
