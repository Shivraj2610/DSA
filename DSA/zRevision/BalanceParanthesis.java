import java.util.Scanner;

public class BalanceParanthesis {

    public static void logic(int n, int oc, int cc, String ans) {
        if (oc == n && cc == n) {
            System.out.println(ans);
        }

        if (oc < n) {
            logic(n, oc + 1, cc, ans + "(");
        }
        if (cc < oc) {
            logic(n, oc, cc + 1, ans + ")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of parenthesis");
        int n = sc.nextInt();

        logic(n, 0, 0, "");
    }
}
