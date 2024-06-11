import java.lang.reflect.Array;
import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[7];
        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter any number");
        int ele = sc.nextInt();

        int ind = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            System.out.println("The Element is not found");
        } else {
            System.out.println("The element:" + arr[ind] + " is found at index:" + ind);
        }
    }
}
