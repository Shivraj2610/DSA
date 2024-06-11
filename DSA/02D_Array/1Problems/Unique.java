import java.util.*;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of column:");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        System.out.println("Enter the elements in an matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Matrix is");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The Elements in middle of row and column:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == row / 2 || j == column / 2) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
