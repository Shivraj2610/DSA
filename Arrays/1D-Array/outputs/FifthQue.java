// Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than
// its just left and just right neighbor.
// Input 1: arr[] = {1,3,2,6,5}
// Output 1: 3
// Input 2: arr[] = {1 4,7,3,2,6,5}
// Output 1: 7

import java.util.*;

public class FifthQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter an Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // The main Logic
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("The first Peak element in array is:" + arr[i]);
                break;
            }
        }
    }
}
