/*
 * The Array contains only 0's ans 1's Count the continous 1's in an Array
 * 
 * Ex. {1,1,0,1,1,1}
 */

import java.util.*;

public class CountContinous1 {

    public static int countContinousOne(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
            int count = 0;
            if (i == arr.length - 1 || arr[i] == 0) {
                // Pop all the elements in Stack and count
                while (!st.empty()) {
                    count++;
                    st.pop();
                }

                if (count > res) {
                    res = count;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements in an Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = countContinousOne(arr);
        System.out.println(ans);
    }
}
