
public class FindTargetFromMatrix {

    public static void findTarget(int[][] arr, int target, int row, int col) {
        int low = 0;
        int high = row * col - 1;
        int size = row * col - 1;

        while (high >= low) {
            int mid = low + (high - low) / 2;

            if (arr[mid / col][mid % col] == target) {

                System.out.println(arr[mid / col][mid % col]);
                System.out.println("row: " + mid / col + " column: " + mid % col);
                break;
            } else if (arr[mid / col][mid % col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int row = arr.length;
        int col = arr[0].length;

        int target = 11;

        findTarget(arr, target, row, col);

    }
}
