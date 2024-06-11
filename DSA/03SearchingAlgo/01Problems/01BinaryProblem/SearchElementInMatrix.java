
import java.util.*;

public class SearchElementInMatrix {

    public static boolean searchElement(int[][] arr, int target, int row, int column) {

        for (int i = 0; i < row; i++) {
            int low = 0;
            int high = arr[i].length - 1;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (arr[i][mid] == target) {
                    return true;
                } else if (arr[i][mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of row:");
        int row = sc.nextInt();

        System.out.println("Enter size of column:");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        System.out.println("Enter elements in matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter a element for search in matrix");
        int target = sc.nextInt();

        boolean reslut = searchElement(arr, target, row, column);

        System.out.println(reslut);
    }
}
