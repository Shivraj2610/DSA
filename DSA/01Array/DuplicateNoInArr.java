
public class DuplicateNoInArr {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 6, 7, 8, 1, 2 };
        int n = arr.length;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The Duplicate elements in array is: " + arr[i]);
                    flag = true;
                    break;
                }
            }
        }
        if (flag == false) {
            System.out.println("No duplicate elements are present in given array");
        }
    }
}
