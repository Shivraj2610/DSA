// Q2: write a program to print the elements above the secondary diagonal in a user inputted
// square matrix.

import java.util.*;

public class SecondQue {
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
        System.out.println("The Elements above the secondary diagonals are:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < arr.length - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
