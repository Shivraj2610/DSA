/*
 * Problem Statement ==>
 * 
 * We given a pattern that consist only 'I' and 'D'
 * 'I'->Increasing order
 * 'D'->Decreasing order
 * 
 * And find create a minumum number by this pattern
 * 
 * Numbers are 0-9 and no repeatation
 * 
 * E.X. 'DDD' -> 4321
 * E.X. 'III' -> 1234
 * E.X. 'DII' -> 2134
 */

import java.util.Stack;

public class CreateMinimumNumberbyGivenPattern {
    public static void main(String[] args) {
        String pattern = "DII";
        Stack<Integer> st = new Stack<>();
        // Observation 1: Length of o/p is 1+length of i/p
        // So we can run loop from 0-input.length
        for (int i = 0; i <= pattern.length(); i++) {
            st.add(i + 1);

            // if current pattern is 'I' then pop out all numbers
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                // pop the numbers from stack
                while (!st.isEmpty()) {
                    System.out.print(st.pop());
                }
            }
        }
    }
}
