import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> temp = new ArrayList<>();
        temp = subset(arr, new ArrayList<>(), 0, temp);
        System.out.println(temp);
    }

    static List<List<Integer>> subset(int[] arr, List<Integer> list, int i, List<List<Integer>> temp) {

        if (i == arr.length) {
            temp.add(new ArrayList<>(list));
            return temp;
        }

        list.add(arr[i]);
        subset(arr, list, i + 1, temp);

        list.remove(list.size() - 1);
        subset(arr, list, i + 1, temp);

        return temp;
    }
}
