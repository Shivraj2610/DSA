// Q5: Write a function which accepts a 2D array of integers and its size as arguments and
// displays the elements of middle row and the elements of middle column. Printing can
// be done in any order.
// [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]

import java.util.*;

public class FifthQue {

    public static void rowColumnEle(int[][] arr, int m) {
        System.out.println("The element in middle of row and column is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == m / 2 || j == m / 2) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int m = sc.nextInt();

        int[][] arr = new int[m][m];

        System.out.println("Enter the elements in matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        rowColumnEle(arr, m);
    }
}