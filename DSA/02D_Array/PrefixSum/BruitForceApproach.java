
import java.util.*;

public class BruitForceApproach {

    public static int getSum(int arr[][], int r1, int c1, int r2, int c2) {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows:");
        int row = sc.nextInt();
        System.out.println("Enter number of Columns:");
        int column = sc.nextInt();

        int arr[][] = new int[row][column];

        System.out.println("Enter The elements in an Array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter r1 coordinator is:");
        int r1 = sc.nextInt();

        System.out.println("Enter c1 Coordinator is:");
        int c1 = sc.nextInt();

        System.out.println("Enter r2 Coordinator is:");
        int r2 = sc.nextInt();

        System.out.println("Enter c2 Coordinator is:");
        int c2 = sc.nextInt();

        System.out.println("The Array is:");
        for (var mat : arr) {
            System.out.println(Arrays.toString(mat));
        }

        System.out.println("The Sum is: " + getSum(arr, r1, c1, r2, c2));

        sc.close();
    }
}
