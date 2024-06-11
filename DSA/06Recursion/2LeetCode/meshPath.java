
public class meshPath {
    public static void findPath(int cr, int cc, int dr, int dc, String ans) {
        if (cr == dr && cc == dc) {
            System.out.println(ans);
            return;
        } else if (cr > dr || cc > dc) {
            return;
        } else {
            findPath(cr, cc + 1, dr, dc, ans + "h");
            findPath(cr + 1, cc, dr, dc, ans + "v");
        }
    }

    public static void main(String[] args) {
        findPath(0, 0, 2, 2, "");
    }
}
