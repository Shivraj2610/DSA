//Find The Maximum value of SubArray of size k from array of size n
public class MaxSum {
    public static void main(String[] args) {
        int[] arr = { 40, 5, 7, 1, 9, 4, 9, 4, 8 };
        int k = 3;
        int wSum = 0;
        int mSum = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            wSum += arr[i];
        }

        mSum = Math.max(mSum, wSum);
        for (int j = k; j < arr.length; j++) {

            wSum = wSum - arr[j - k] + arr[j];
            mSum = Math.max(mSum, wSum);

        }
        System.out.println("The Max sum is: " + mSum);
    }
}
