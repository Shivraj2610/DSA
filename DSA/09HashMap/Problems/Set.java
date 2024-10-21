/*
 * PROBLEM STATEMENT ==>
 * 
 * There is 3 Set Union set 'U', Set 'A' and Set 'B' and it's size is L, M, N respectively
 * 
 * Now Find the Ans.
 * 1. A intersection B' in increasing order
 * 2. A union B in increasing order
 * 
 * EX.
 * 
 * L=10;
 * M=6;
 * N=5;
 * U={1,2,3,4,5,6,7,8,9,10};
 * A={5,1,2,3,7,8};
 * B={9,3,4,10,1}
 * 
 * O/P -> 2 5 7 8
 *        1 2 3 4 5 7 8 9 10
 */

import java.util.*;

class Solution {
    public int[][] solve(int[] U, int[] A, int[] B, int L, int M, int N) {
        HashMap<Integer, Integer> hm_A = new HashMap<>();
        HashMap<Integer, Integer> hm_B = new HashMap<>();
        HashMap<Integer, Integer> hm_Bcom = new HashMap<>();

        // Create a Hash Map of Set A,B and B'
        for (int i = 0; i < M; i++) {
            hm_A.put(A[i], i);// Set A
        }
        for (int j = 0; j < N; j++) {
            hm_B.put(B[j], j);// Set B
        }
        for (int i = 0; i < L; i++) {
            if (!hm_B.containsKey(U[i])) {
                hm_Bcom.put(U[i], i);// Set B'
            }
        }

        List<Integer> AintersectB = new ArrayList<>();
        List<Integer> AunionB = new ArrayList<>();

        // Find the A intersection B'
        for (int i = 0; i < M; i++) {
            if (hm_Bcom.containsKey(A[i])) {
                AintersectB.add(A[i]);
            }
        }

        // Find the A Unino B
        for (int i = 0; i < L; i++) {
            if (hm_A.containsKey(U[i]) || hm_B.containsKey(U[i])) {
                AunionB.add(U[i]);
            }
        }

        Collections.sort(AintersectB);
        Collections.sort(AunionB);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(AintersectB);
        ans.add(AunionB);
        /*
         * ***CONVERTING LIST INTO 2D ARRAY****
         */
        int row = ans.size();
        int[][] res = new int[row][];
        for (int i = 0; i < ans.size(); i++) {
            int col = ans.get(i).size();
            res[i] = new int[col];// initialize each row of 2D Array
            for (int j = 0; j < col; j++) {
                res[i][j] = ans.get(i).get(j);
            }
        }

        return res;
    }
}

public class Set {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] U = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] A = { 5, 1, 2, 3, 7, 8 };
        int[] B = { 9, 3, 4, 10, 1 };

        int[][] res = s.solve(U, A, B, U.length, A.length, B.length);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
