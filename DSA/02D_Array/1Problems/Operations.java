import java.util.*;

public class Operations {
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

        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] > 0) {
                    positive++;
                } else if (arr[i][j] < 0) {
                    negative++;
                } else {
                    zero++;
                }
            }
        }
        System.out.println("The positive number in matrix is: " + positive);
        System.out.println("The negative number in matrix is: " + negative);
        System.out.println("The zero's in matrix is: " + zero);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("The even number in matrix is: " + even);
        System.out.println("The odd number in matrix is: " + odd);
    }
}
