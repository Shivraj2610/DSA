import java.util.*;

public class SearchElein2D {
    public static boolean searchElement(int[][] arr, int target) {
        int row = arr.length;

        if (row == 0) {// Bec the array is Empty here
            return false;
        }

        int column = arr[0].length;

        int low = 0;
        int high = row * column - 1;
        int midInd, midEle;

        while (low <= high) {
            midInd = low + (high - low) / 2;
            // The IMP Logic to find the row and column index;
            midEle = arr[midInd / column][midInd % column];

            if (midEle == target) {
                return true;

            } else if (midEle < target) {
                low = midInd + 1;
            } else {
                high = midInd - 1;
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

        boolean reslut = searchElement(arr, target);

        System.out.println(reslut);
    }
}
