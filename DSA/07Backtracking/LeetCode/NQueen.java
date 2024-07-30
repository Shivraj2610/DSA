import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static boolean isSafe(int[][] board, int row, int col, int n) {
        // Chech to Left at Row
        for (int c = 0; c < col; c++) {
            if (board[row][c] == 'Q') {
                return false;
            }
        }

        // Check Upper-Diagonal of Left Side
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check Lower-Diagonal of Left Side
        for (int r = row, c = col; r < n && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void saveBoard(int[][] board, int n, List<List<String>> allBoard) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ans = "";
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'Q') {
                    ans += 'Q';
                } else {
                    ans += '.';
                }
            }
            newBoard.add(ans);
        }
        allBoard.add(newBoard);
    }

    public static void helper(int[][] board, int n, List<List<String>> allBoard, int col) {
        // Base case
        if (col == n) {
            saveBoard(board, n, allBoard);
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(board, row, col, n)) {
                // Place Queen
                board[row][col] = 'Q';
                // Recursivly call
                helper(board, n, allBoard, col + 1);
                // Backtrack
                board[row][col] = '.';
            }
        }
    }

    public static List<List<String>> solution(int[][] board, int n) {
        List<List<String>> allBoard = new ArrayList<>();

        helper(board, n, allBoard, 0);
        return allBoard;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        List<List<String>> list = solution(board, n);
        System.out.println(list);
    }
}
