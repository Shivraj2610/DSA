
import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
    public static void main(String[] args) {
        List<String> list = solveMaze("", 3, 3);
        System.out.println(list);

        List<String> diagonal = diagonaly("", 3, 3);
        System.out.println(diagonal);

    }

    /*
     * Only Right and Down path are available
     */
    static List<String> solveMaze(String p, int r, int c) {
        if (r == 1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> down = new ArrayList<>();
        List<String> right = new ArrayList<>();

        if (r > 1) {
            down = solveMaze(p + "D", r - 1, c);
        }

        if (c > 1) {
            right = solveMaze(p + "R", r, c - 1);
        }
        down.addAll(right);
        return down;
    }

    /*
     * Right, Down and Digonaly path are availabe
     */
    static List<String> diagonaly(String p, int r, int c) {
        if (r == 1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> down = new ArrayList<>();
        List<String> right = new ArrayList<>();
        List<String> diagonal = new ArrayList<>();

        if (r > 1) {
            down = diagonaly(p + "V", r - 1, c);
        }
        if (c > 1) {
            right = diagonaly(p + "H", r, c - 1);
        }
        if (r > 1 && c > 1) {
            diagonal = diagonaly(p + "D", r - 1, c - 1);
        }

        down.addAll(right);
        down.addAll(diagonal);
        return down;
    }
}
