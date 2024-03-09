// Q4: Write a program to find the largest element of a given 2D array of integers.

import java.util.*;

public class FourthQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of row:");
        int m = sc.nextInt();

        System.out.println("Enter the size of column:");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Enter the elements in matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        /*
         * Main Logic
         */
        int max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The maximum element in matrix is: " + max);
    }
}
