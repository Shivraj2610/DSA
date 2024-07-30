import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        // 1.Sort the intervals in increasing order on basis of Start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // 2.Iteratet all intervals and checking for Overlapping
        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval : intervals) {
            // Not Overlapping
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Overlapping
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };

        int[][] ans = merge(intervals);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
        }

    }
}
