
import java.util.*;

class OptimizedApproach {

    public static void prefixSum(int[][] arr) {

        /*
         * Row-wise Prefix sum
         */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }

        /*
         * Column-wise Prefix sum
         */
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < arr[0].length; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    public static void showArray(int[][] arr) {
        for (var mat : arr) {
            System.out.println(Arrays.toString(mat));
        }
    }

    public static int showSum(int arr[][], int r1, int c1, int r2, int c2) {
        int sum = arr[r2][c2];
        int up = arr[r1 - 1][c2];
        int left = arr[r2][c1 - 1];
        int comon = arr[r1 - 1][c1 - 1];

        return sum - up - left + comon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers of rows:");
        int row = sc.nextInt();
        System.out.print("Enter number of columns:");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        System.out.println("Enter Elements in an Array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter r1");
        int r1 = sc.nextInt();
        System.out.println("Enter c1");
        int c1 = sc.nextInt();
        System.out.println("Enter r2");
        int r2 = sc.nextInt();
        System.out.println("Enter c2");
        int c2 = sc.nextInt();

        prefixSum(arr);
        showArray(arr);

        int ans = showSum(arr, r1, c1, r2, c2);

        System.out.println("The Answer is:" + ans);
    }
}