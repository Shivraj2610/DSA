
public class PrintNubers {
    /*
     * Print 1 - 100 numbers
     */
    public static void printNumbers(int n) {
        if (n == 100) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumbers(n + 1);
    }

    public static void main(String[] args) {
        printNumbers(1);
    }
}
