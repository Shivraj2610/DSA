
public class MazePathPosibility {
    public static void main(String[] args) {
        int ans = countPath(3, 3);
        System.out.println(ans);
    }

    static int countPath(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = countPath(r - 1, c);
        int right = countPath(r, c - 1);

        return left + right;
    }
}
