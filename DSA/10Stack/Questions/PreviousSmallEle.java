//Find the Previous Smaller element in Array

import java.util.Stack;

public class PreviousSmallEle {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 6, 8, 2, 10 };
        int[] preSmaller = new int[arr.length];
        Stack<Integer> s1 = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!s1.isEmpty() && s1.peek() >= arr[i]) {
                s1.pop();
            }

            if (s1.isEmpty()) {
                preSmaller[i] = -1;
            } else {
                preSmaller[i] = s1.peek();
            }

            s1.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(preSmaller[i] + " ");
        }
    }
}
