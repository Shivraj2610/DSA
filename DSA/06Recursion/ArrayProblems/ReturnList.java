import java.util.*;

public class ReturnList {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 7, 4, 8, 4 };
        int target = 4;
        List<Integer> ans = findIndex(arr, target, 0);
        System.out.println("The Indexes are: " + ans + " Where " + target + " is present");
    }

    static List<Integer> findIndex(int[] arr, int target, int i) {
        List<Integer> list = new ArrayList<>();

        if (i == arr.length) {
            return list;
        }

        if (arr[i] == target) {
            list.add(i);
        }

        List<Integer> bellowList = findIndex(arr, target, i + 1);
        list.addAll(bellowList);
        return list;
    }
}
