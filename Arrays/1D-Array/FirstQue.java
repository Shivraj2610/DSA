// Q1: Write a program to print the sum of all the elements present on even indices in the given array.
// Input 1: arr[] = {3,20,4,6,9}
// Output 1: 16
// Input 1: arr[] = {4,3,6,7,1}
// Output 1: 11

import java.util.*;

public class FirstQue {
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
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("The sum of Elements which present at even index is:" + sum);
    }
}
