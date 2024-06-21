public class MatrixRotatio {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 2, 4, 1 },
                { 8, 9, 6, 7 },
                { 5, 3, 9, 10 }
        };

        // Transpos of matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int le = 0;
            int re = matrix.length - 1;

            while (le < re) {
                int temp = matrix[i][le];
                matrix[i][le] = matrix[i][re];
                matrix[i][re] = temp;
                le++;
                re--;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
