import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 2, 7, 8, 9, 0 };
        int n = arr.length;
        int target = 8;

        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        // Main Logic
        for (int i = 0; i < n; i++) {
            // Case 1:
            if (arr[i] == target && map.containsKey(0)) {
                result[0] = i;
                result[1] = map.get(0);
                break;
                // Case 2:
            } else if (map.containsKey(target - arr[i]) && map.get(target - arr[i]) > i) {
                result[0] = i;
                result[1] = map.get(target - arr[i]);
            }
        }
        System.out.println("The index is: [" + result[0] + "," + result[1] + "]");
    }
}
