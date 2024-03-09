// Q3: Write a program to calculate the maximum element in the array.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 65
// Input 1: arr[] = {4,3,6,7,1}
// Output 1: 7

import java.util.*;

public class ThirdQue {
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
        int max = arr[0];
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        System.out.println("The maximum Element in array is: " + max);
    }
}
