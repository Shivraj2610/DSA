
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 7, 2, 3, 8 };
        int target = 3;

        int ans = search(arr, target, 0);
        System.out.println("The index of " + target + " is " + ans);
    }

    static int search(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == target) {
            return i;
        }

        return search(arr, target, i + 1);
    }
}
