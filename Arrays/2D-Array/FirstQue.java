// Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0.

import java.util.*;

public class FirstQue {
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

        int positive = 0;
        int negative = 0;
        int zero = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > 0) {
                    positive++;
                } else if (arr[i][j] == 0) {
                    zero++;
                } else {
                    negative++;
                }

                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("The count of Positive numbers is: " + positive);
        System.out.println("The count of negative numbers is: " + negative);
        System.out.println("The count of zero numbers is: " + zero);
        System.out.println("The count of even numbers is: " + even);
        System.out.println("The count of odd numbers is: " + odd);

    }
}
