
public class Palindrom2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 2, 1 };
        boolean flag = true;

        for (int i = 0; i < 7 / 2; i++) {
            if (arr[i] != arr[7 - i - 1]) {
                System.out.println("NOT a Palindromic Array");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Palindromic Array");
        }
    }
}
