
public class EvenOdd {
    public static void main(String[] args) {
        int num = 88;
        checkEvenOdd(num);
    }

    public static void checkEvenOdd(int num) {
        if ((num & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
