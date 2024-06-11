
public class BalancedParanthesis {
    public static void balancedBracket(int n, int oc, int cc, String ans) {
        if (oc == n && cc == n) {
            System.out.print(ans);
            return;
        } else {
            if (oc < n) {
                balancedBracket(n, oc + 1, cc, ans + '(');
            }
            if (cc < oc) {
                balancedBracket(n, oc, cc + 1, ans + ')');
            }
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int openCount = 0;
        int closedCount = 0;
        String str = "";

        balancedBracket(n, openCount, closedCount, str);
    }
}
