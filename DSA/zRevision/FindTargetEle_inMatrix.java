import java.util.Scanner;

public class FindTargetEle_inMatrix {

    public static boolean checkTarget(int[][] matrix, int row, int col, int target) {
        int low = 0;
        int high = row * col - 1;
        boolean flag = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid / col][mid % col] == target) {
                flag = true;
                break;
            } else if (matrix[mid / col][mid % col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Matrix");
        System.out.println("Enter row size: ");
        int row = sc.nextInt();
        System.out.println("Enter Column size: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        System.out.println("Enter elements in matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enrer target element: ");
        int target = sc.nextInt();

        boolean ans = checkTarget(matrix, row, col, target);
        System.out.println("The ans is true");

    }
}
