import java.util.ArrayList;
import java.util.List;

public class SubSetDublicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        List<List<Integer>> ans = dublicates(arr);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> dublicates(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = outer.size() - 1;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
