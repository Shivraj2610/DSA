
import java.util.*;

public class Palindrom1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = { 1, 2, 3, 2, 1 };
        int[] arr2 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[4 - i];
        }

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("This is Palindrom Array");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}