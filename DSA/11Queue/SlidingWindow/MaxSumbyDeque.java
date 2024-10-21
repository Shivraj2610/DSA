import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MaxSumbyDeque {
    public static List<Integer> findAllSum(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
            dq.add(i);
        }
        list.add(sum);

        for (int j = k; j < arr.length; j++) {
            while (!dq.isEmpty() && dq.peek() <= j - k) {
                int x = dq.pollFirst();
                sum -= arr[x];
            }
            sum += arr[j];
            dq.add(j);
            list.add(sum);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 6, 2, 7, 10 };
        int k = 3;

        List<Integer> ans = findAllSum(arr, k);
        System.out.println(ans);
    }
}
