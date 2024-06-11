import java.util.Arrays;

public class RotationMatrix {

    public static void rotationMatrix(int arr[][]) {

        int m = arr.length;
        int n = arr[0].length;
        /*
         * Step-1: Transpose of Matrix
         */
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        /*
         * Step-2: Swap left and Right side element
         */
        for (int i = 0; i < m; i++) {
            int le = 0;
            int re = n - 1;

            while (le < re) {
                int temp = arr[i][le];
                arr[i][le] = arr[i][re];
                arr[i][re] = temp;

                le++;
                re--;
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

        rotationMatrix(arr);

        for (var mat : arr) {
            System.out.println(Arrays.toString(mat));
        }
    }
}
