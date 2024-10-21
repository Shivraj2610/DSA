import java.util.ArrayList;
import java.util.List;

public class MazeWithObstacle {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };

        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        List<String> list = solveMaze("", maze, 0, 0);
        System.out.println(list);

        allDirection("", board, 0, 0);

    }

    static List<String> solveMaze(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze.length - 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> down = new ArrayList<>();
        List<String> right = new ArrayList<>();

        if (!maze[r][c]) {
            return down;
        }

        if (r < maze.length - 1) {
            down = solveMaze(p + "V", maze, r + 1, c);
        }
        if (c < maze.length - 1) {
            right = solveMaze(p + "H", maze, r, c + 1);
        }
        down.addAll(right);
        return down;
    }

    static void allDirection(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // Mark the visited cell as false;
        maze[r][c] = false;

        // Down
        if (r < maze.length - 1) {
            allDirection(p + "D", maze, r + 1, c);
        }

        // Right
        if (c < maze.length - 1) {
            allDirection(p + "R", maze, r, c + 1);
        }

        // Up
        if (r > 0) {
            allDirection(p + "U", maze, r - 1, c);
        }

        // Left
        if (c > 0) {
            allDirection(p + "L", maze, r, c - 1);
        }

        // Remove the changes that we are made in a function calls
        // i.e Backtracking
        maze[r][c] = true;
    }
}
