// Q3: write a program to print the elements of both the diagonals in a user inputted square matrix
// in any order.

import java.util.*;

public class ThirdQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of row and column:");
        int m = sc.nextInt();

        int[][] arr = new int[m][m];

        System.out.println("Enter the elements in matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Elements presented at both the diagonals:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == arr.length - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
