public class NQueenAnotherMethod {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        solve(board, 0, 0);
    }

    static void solve(boolean[][] board, int r, int c) {
        // After Travling complate board
        if (r == board.length) {
            display(board);
            return;
        }

        if (c == board.length) {
            return;
        }

        // Try placing the queen at (r, c) if it's safe
        if (isSafe(board, r, c)) {
            board[r][c] = true; // Place the queen
            solve(board, r + 1, 0); // Move to the next row after placing
            board[r][c] = false; // Backtrack
        }

        // Continue to the next column without placing a queen
        solve(board, r, c + 1);
    }

    // Check if it's safe to place a queen at board[row][col]
    static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertically
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        // Check right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }

    // Display the board
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
