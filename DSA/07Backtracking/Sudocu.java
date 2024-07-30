public class Sudocu {
    public static boolean isSafe(int[][] sudocu, int row, int col, int num) {
        // Chech Row-Column Clash
        for (int i = 0; i < 9; i++) {
            if (sudocu[row][i] == num) {
                return false;
            }
            if (sudocu[i][col] == num) {
                return false;
            }
        }

        // Grid Clash
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudocu[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean helper(int[][] sudocu, int row, int col) {
        // Base Case (row goes out of Sudocu Matrix*)
        if (row == sudocu.length) {
            return true;
        }
        int nrow = 0;
        int ncol = 0;

        if (col != sudocu.length - 1) {
            ncol = col + 1;
            nrow = row;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (sudocu[row][col] != 0) {
            if (helper(sudocu, nrow, ncol)) {
                return true;
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(sudocu, row, col, i)) {
                    sudocu[row][col] = i;
                    if (helper(sudocu, nrow, ncol)) {
                        return true;
                    } else {
                        sudocu[row][col] = 0;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] sudocu = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        boolean flag = helper(sudocu, 0, 0);
        System.out.println(flag);
        if (flag) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(sudocu[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("We Can't Solve it");
        }
    }
}