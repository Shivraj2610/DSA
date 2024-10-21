import java.util.Scanner;

public class TicTacTao {
    public static void main(String[] args) {
        // Tic Tac Tao Board
        char[][] board = new char[3][3];

        // Initiali the Tic Tac Tao is Empty
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        // Initialize Player
        char player = 'X';
        boolean gameOver = false;

        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            // Print the board then Player can take move
            printBoard(board);

            System.out.println("Player " + player + " Enter your co-ordinates row and column respectively");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = player;// place element
                gameOver = haveWon(board, player);

                if (gameOver) {
                    System.out.println("Player " + player + " Won........");
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move, Try again: ");
            }
        }
        printBoard(board);
    }

    // Printing Current board Situation
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    // Check Anyone Won or not
    public static boolean haveWon(char[][] board, char player) {
        // Check Row
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check for Column
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Check Diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }
}
