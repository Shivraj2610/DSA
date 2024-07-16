//Return a array which have the Maximum number of Subarray of size k

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MaxNumber_Deque {
    public static List<Integer> findMaxNumber(int arr[], int n, int k) {
        List<Integer> list = new ArrayList<>();

        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }

            dq.add(i);
        }

        list.add(arr[dq.peek()]);

        for (int j = k; j < n; j++) {
            while (!dq.isEmpty() && dq.peek() <= j - k) {
                dq.pop();
            }

            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[j]) {
                dq.removeLast();
            }
            dq.add(j);

            list.add(arr[dq.peek()]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 7, 8, 12, 13, 7, 9 };
        int k = 3;

        List<Integer> list = findMaxNumber(arr, arr.length - 1, k);
        System.out.println(list);
    }
}
