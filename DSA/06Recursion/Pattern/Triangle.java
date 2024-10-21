
public class Triangle {
    public static void main(String[] args) {
        System.out.println("This is Pattern_1");
        pattern1(4, 0);
        System.out.println();
        System.out.println();
        System.out.println("This is Pattenr_2");
        pattern2(4, 0);
        System.out.println();
        System.out.println("This is Pattern_3");
        pattern3(0, 0);
        System.out.println();
        System.out.println("This is Pattern_4");
        pattern4(0, 0);
    }

    static void pattern1(int r, int c) {
        if (r == 1 && c == 1) {
            return;
        }

        if (r > c) {
            pattern1(r, c + 1);
            System.out.print("*");// It print at the time function call coming back
        } else {
            pattern1(r - 1, 0);
            System.out.println();// It also print at time of function call coming back
        }
    }

    static void pattern2(int r, int c) {
        if (r == 0) {
            return;
        }

        if (r > c) {
            System.out.print("*");
            pattern2(r, c + 1);
        } else {
            System.out.println();
            pattern2(r - 1, 0);
        }
    }

    static void pattern3(int r, int c) {
        if (r == 4) {
            return;
        }

        if (r == c) {
            System.out.print("*");
            pattern3(r, c + 1);
        } else if (c > r) {
            System.out.println();
            pattern3(r + 1, 0);
        } else {
            System.out.print(" ");
            pattern3(r, c + 1);
        }

    }

    public static void pattern4(int r, int c) {
        if (r == 4) {
            return;
        }

        if (c < 4) {
            System.out.print("*");
            pattern4(r, c + 1);
        } else {
            System.out.println();
            pattern4(r + 1, 0);
        }
    }
}
