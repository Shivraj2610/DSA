public class Sudocu {
    public static void printGrid(int[][] grid, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] grid, int row, int col, int num, int n) {

        // row Clash --> Check Frequency of number in row
        for (int i = 0; i < n; i++) {
            if (grid[row][i] == num) {
                return false;
            }
        }

        // Column Clash --> Check Frequency of number in column
        for (int i = 0; i < n; i++) {
            if (grid[i][col] == num) {
                return false;
            }
        }

        // SubGrid / Box Clash
        int sqrt = (int) Math.sqrt(n);
        int boxRow = row - row % sqrt;
        int boxCol = col - col % sqrt;

        for (int i = boxRow; i < boxRow + sqrt; i++) {
            for (int j = boxCol; j < boxCol + sqrt; j++) {
                if (grid[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolve(int[][] grid, int n) {
        int row = -1, col = -1;
        boolean isEmpty = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    row = i;
                    col = j;

                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }

        // No Empty Space Left
        if (isEmpty) {
            return true;
        }

        // else for each backtracking
        for (int num = 1; num <= 9; num++) {
            if (isSafe(grid, row, col, num, n) == true) {
                return true;
            } else {
                // Backtrack
                grid[row][col] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        if (sudokuSolve(grid, grid.length)) {
            printGrid(grid, grid.length);
        } else {
            System.out.println("WE do not solve this:");
        }
    }
}
