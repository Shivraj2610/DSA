/*
 * You have a String and if you got chat 'i' int string then reverse the char in String which are present before 'i'
 * 
 * EX. string -> rtsng
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseStringBefore_i {

    public static String modifyString(String str) {
        String modify = "";

        Deque<Character> dq = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'i')
                dq.addLast(str.charAt(i));

            if (str.charAt(i) == 'i') {
                while (!dq.isEmpty()) {
                    modify += dq.pollLast();
                }
            } else if (i == str.length() - 1) {
                while (!dq.isEmpty()) {
                    modify += dq.pollFirst();
                }
            }
        }
        return modify;
    }

    public static void main(String[] args) {
        String str = "string";

        String result = modifyString(str);
        System.out.println(result);

    }
}
