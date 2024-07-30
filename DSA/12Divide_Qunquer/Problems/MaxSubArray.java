public class MaxSubArray {
    public static int crossSum(int[] arr, int low, int mid, int high) {
        int sum = 0;
        int leftMax = Integer.MIN_VALUE;
        for (int i = mid; i >= 0; i--) {
            sum += arr[i];
            if (leftMax < sum) {
                leftMax = sum;
            }
        }

        sum = 0;
        int rightMax = Integer.MIN_VALUE;
        for (int i = mid; i <= high; i++) {
            sum += arr[i];
            if (rightMax < sum) {
                rightMax = sum;
            }
        }

        return Math.max(leftMax + rightMax - arr[mid], Math.max(leftMax, rightMax));
    }

    public static int maxSubArr(int[] arr, int low, int high) {
        if (low > high) {
            return Integer.MIN_VALUE;
        }
        if (low == high) {
            return arr[low];
        }

        int mid = low + (high - low) / 2;

        return Math.max(Math.max(maxSubArr(arr, low, mid), maxSubArr(arr, mid + 1, high)),
                crossSum(arr, low, mid, high));
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;

        int ans = maxSubArr(arr, 0, n - 1);
        System.out.println(ans);
    }
}
