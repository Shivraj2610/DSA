
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void combinationSum(List<List<Integer>> res, List<Integer> temp, int[] candidates, int target,
            int start) {

        if (target < 0) {
            return;
        } else if (target == 0) {
            res.add(new ArrayList<>(temp));
        }

        for (int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);
            combinationSum(res, temp, candidates, target - candidates[i], i);

            temp.remove(temp.size() - 1);
        }
    }

    public static List<List<Integer>> combnation(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combinationSum(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 6, 7 };

        List l = combnation(arr, 7);
        System.out.println(l);
    }
}
