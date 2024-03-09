// Q2: Write a program to traverse over the elements of the array using for each loop and print all even elements.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 34 54
// Input 1: arr[] = {4,3,6,7,1}
// Output 1: 4 6

import java.util.*;

public class SecondQue {
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

        for (int ele : arr) {
            if (ele % 2 == 0) {
                System.out.print(ele + " ");
            }
        }
    }
}
