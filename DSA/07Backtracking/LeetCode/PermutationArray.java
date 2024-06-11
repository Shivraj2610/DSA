
import java.util.ArrayList;
import java.util.List;

public class PermutationArray {

    public static void permutation(int[] arr, List<Integer> temp, List<List<Integer>> res) {
        // base case
        if (temp.size() == arr.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (temp.contains(arr[i])) {
                continue;
            } else {
                temp.add(arr[i]);
                // Recursive call
                permutation(arr, temp, res);

                // Backtracking
                temp.remove(temp.size() - 1);
            }
        }

    }

    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();

        permutation(arr, new ArrayList<>(), res);

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        List l = permute(arr);

        System.out.println(l);
    }
}
