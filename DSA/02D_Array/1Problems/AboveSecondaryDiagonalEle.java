import java.util.*;

public class AboveSecondaryDiagonalEle {
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

        System.out.println("The Elements above Secondary Diagonal");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i + j < arr.length - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();

        System.out.println("The Elements above Primary Diagonal");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j > i) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();

        System.out.println("The Elements on the both Diagonal");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i + j == arr.length - 1 || i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}