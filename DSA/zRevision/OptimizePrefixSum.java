
public class OptimizePrefixSum {

    public static void prefixSum(int[][] matrix) {
        // Row wise prefix sum
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        // Column wise prefix sum
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                matrix[j][i] += matrix[j - 1][i];
            }
        }
    }

    public static int showSum(int[][] matrix, int r1, int c1, int r2, int c2) {
        int sum = 0;

        int all = matrix[3][3];
        int up = matrix[r1 - 1][c2];
        int left = matrix[r2][c1 - 1];
        int common = matrix[r1 - 1][c1 - 1];
        sum = all - up - left + common;
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 }
        };

        int r1 = 2;
        int c1 = 2;
        int r2 = 3;
        int c2 = 3;

        prefixSum(matrix);

        int ans = showSum(matrix, r1, c1, r2, c2);
        System.out.println(ans + " is the answer");
    }
}
