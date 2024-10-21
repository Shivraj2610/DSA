public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];

        int count = queens(board, 0);
        System.out.println(count);
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }

        int count = 0;

        // Place the Queens on Board
        for (int col = 0; col < board.length; col++) {
            // Check Place is safe or not
            if (isSafe(board, row, col)) {
                // Place the Queen
                board[row][col] = true;

                // Recursive call
                count = count + queens(board, row + 1);

                // Backtracking
                board[row][col] = false;
            }
        }
        return count;
    }

    // For Checking the Position is safe or not
    static boolean isSafe(boolean[][] board, int row, int col) {
        // Check Verticaly
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Checking in Left-Diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        // Checking in Right-Diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean ele : arr) {
                if (ele) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
