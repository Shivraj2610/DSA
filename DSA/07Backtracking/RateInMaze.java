import java.util.Scanner;

public class RateInMaze {

    public static void printOutput(int[][] output, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }

    // To Check the given Position is valid or not
    public static boolean isSafe(int[][] maze, int i, int j, int n) {
        if (i >= 0 && i < n &&
                j >= 0 && j < n &&
                maze[i][j] == 1) {

            return true;

        } else {
            return false;
        }
    }

    public static boolean solveMaze(int[][] maze, int[][] output, int i, int j, int n) {
        // Base Case
        if (i == n - 1 && j == n - 1 && maze[i][j] == 1) {
            output[i][j] = 1;
            return true;
        } else {
            // Check the current position is valid or not
            if (isSafe(maze, i, j, n)) {
                // Position can be allready checked
                if (output[i][j] == 1) {
                    return false;
                }

                // if valid the change it into 1
                output[i][j] = 1;

                // Recursion

                // for Right/Forword Direction
                if (solveMaze(maze, output, i, j + 1, n)) {
                    return true;
                }

                // At Downword Direction
                if (solveMaze(maze, output, i + 1, j, n)) {
                    return true;
                }

                // At Left Side
                if (solveMaze(maze, output, i, j - 1, n)) {
                    return true;
                }

                // At Up Side
                if (solveMaze(maze, output, i - i, j, n)) {
                    return true;
                }

                // backtracking
                output[i][j] = 0;
                return false;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Maze: ");
        int n = sc.nextInt();
        int[][] maze = new int[n][n];

        System.out.println("Create a Maze: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        // int n = maze.length;

        int[][] output = new int[n][n];

        if (solveMaze(maze, output, 0, 0, n)) {
            printOutput(output, n);
        } else {
            System.out.println("Solution doesn't exist");
        }
    }
}
