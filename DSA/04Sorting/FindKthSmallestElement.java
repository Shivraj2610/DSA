public class FindKthSmallestElement {
    public static void main(String[] args) {
        int[] arr = { 8, 9, 2, 4, 5, 7 };
        int k = 3;
        int i;
        for (i = 0; i < k; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println(arr[i - 1]);
    }
}
