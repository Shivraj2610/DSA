
public class NQueen {
    // to Print the Matrix Board
    public static void printSolution(int[][] board, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    // Checking the Position is Valid or Not
    public static boolean isSafe(int[][] board, int row, int column, int n) {
        int i, j;
        // Check on Left row
        for (i = 0; i < column; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check for Upper Diagonal in left direction
        for (i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check for Lower Diagonal in left direction
        for (i = row, j = column; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // NQueen Problem Algorithem
    public static boolean solveNQueen(int[][] board, int column, int n) {
        // Base Case Condition
        if (column >= n) {
            return true;
        }

        /*
         * Consider this column & try to place all queen in all the rows one by one
         */
        for (int i = 0; i < n; i++) {
            // Check Position is Safe or not
            if (isSafe(board, i, column, n)) {
                // Place Queen on board
                board[i][column] = 1;

                /*
                 * Recursive call to place all Queens
                 */
                if (solveNQueen(board, column + 1, n) == true) {
                    return true;
                }

                // If Placing Queen not lead to solution then backtracking
                board[i][column] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 4;

        int[][] board = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };

        if (solveNQueen(board, 0, n)) {
            printSolution(board, board.length);
        } else {
            System.out.println("The Solution does not exist");
        }
    }
}
