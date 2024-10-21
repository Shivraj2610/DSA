public class MedianOfTwoSortedArr {
    public static double findMedian(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        if (m > n) {
            return findMedian(arr2, arr1);
        }
        int total = m + n;
        int left = (total + 1) / 2;
        int low = 0;
        int high = arr1.length;

        while (low <= high) {
            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;

            r1 = arr1[mid1];
            r2 = arr2[mid2];
            if (mid1 - 1 >= 0) {
                l1 = arr1[mid1 - 1];
            }
            if (mid2 - 1 >= 0) {
                l2 = arr2[mid2 - 1];
            }

            // Main Condition
            if (l1 <= r2 && l2 <= r1) {
                if (total % 2 == 1) {
                    return Math.max(l1, l2);
                } else {
                    return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
                }
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = { 7, 8, 9, 11 };
        int[] arr2 = { 1, 2, 3, 4, 5 };

        double ans = findMedian(arr1, arr2);
        System.out.println(ans);
    }
}