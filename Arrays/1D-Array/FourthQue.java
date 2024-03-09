// Q4: Write a program to find out the second largest element in a given array.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 54
// Input 1: arr[] = {4,3,6,7,1}
// Output 1: 6

import java.util.*;

public class FourthQue {
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
        Arrays.sort(arr);
        System.out.println("The Second Largest element in array is: " + arr[arr.length - 2]);
    }
}
