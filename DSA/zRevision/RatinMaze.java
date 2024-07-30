import java.util.Scanner;

public class RatinMaze {

    public static void printMaze(int[][] output, int n) {
        System.out.println("The Solved Maze is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void solveMaze(int row, int col, int[][] maze, int n, String ans, int[][] output) {
        if (row == n - 1 && col == n - 1 && maze[row][col] != 0) {
            System.out.println(ans);
            return;
            // printMaze(output, n);
        }

        if (row >= 0 && row < n && col >= 0 && col < n) {
            // System.out.println("hello");
            if (output[row][col] == 1 || maze[row][col] == 0) {
                return;
            }

            output[row][col] = 1;

            // Down
            solveMaze(row + 1, col, maze, n, ans + "D", output);
            // To Left
            solveMaze(row, col - 1, maze, n, ans + "L", output);
            // To Right
            solveMaze(row, col + 1, maze, n, ans + "R", output);
            // To Up
            solveMaze(row - 1, col, maze, n, ans + "U", output);

            output[row][col] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Maze: ");
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        int[][] output = new int[n][n];

        System.out.println("Create a Maze: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        solveMaze(0, 0, maze, n, "", output);
    }
}
