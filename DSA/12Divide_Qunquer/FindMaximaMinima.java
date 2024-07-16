/*
 * Time Complexity: 
 *          Recurence Relation is ==> T(n)=2T(n/2)+c
 */
public class FindMaximaMinima {

    static class MinMax {
        int max;
        int min;
    }

    public static MinMax getMinMax(int[] arr, int low, int high) {
        MinMax minmax = new MinMax();
        MinMax leftMinMax = new MinMax();
        MinMax rightMinMax = new MinMax();
        // Small Problem

        // 1. Having Only one Element
        if (low == high) {
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }
        // 2. Having 2 Elements
        else if (low == high - 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }

        // Divide and Conquer
        int mid = low + (high - low) / 2;
        // Store min and max of left Part in leftMinMax object
        leftMinMax = getMinMax(arr, low, mid);
        // Store min and max of right part in rightMinMax object
        rightMinMax = getMinMax(arr, mid + 1, high);

        if (leftMinMax.max > rightMinMax.max) {
            minmax.max = leftMinMax.max;
        } else {
            minmax.max = rightMinMax.max;
        }

        if (leftMinMax.min < rightMinMax.min) {
            minmax.min = leftMinMax.min;
        } else {
            minmax.min = rightMinMax.min;
        }

        return minmax;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 10, 2, 4, 8, 17, 11, 100 };
        int n = arr.length;

        MinMax ans = getMinMax(arr, 0, n - 1);
        System.out.println(ans.max);
        System.out.println(ans.min);
    }
}
