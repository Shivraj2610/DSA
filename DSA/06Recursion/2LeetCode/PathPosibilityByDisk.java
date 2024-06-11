
public class PathPosibilityByDisk {
    public static void findPath(int cur, int dest, String ans) {
        // Positive base case
        if (cur == dest) {
            System.out.println(ans);
            return;
        }
        // Negative base case
        else if (cur > dest) {
            return;
        }
        // Recursive function
        else {
            findPath(cur + 1, dest, ans + 1 + " ");
            findPath(cur + 2, dest, ans + 2 + " ");
            findPath(cur + 3, dest, ans + 3 + " ");
            findPath(cur + 4, dest, ans + 4 + " ");
            findPath(cur + 5, dest, ans + 5 + " ");
            findPath(cur + 6, dest, ans + 6 + " ");
        }

    }

    public static void main(String[] args) {
        findPath(0, 6, "");
    }
}
