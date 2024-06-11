/*
 * Q3: Write a program to calculate the maximum element in the array.

    Input 1: arr[] = {34,21,54,65,43}

    Output 1: 65
 */

public class CalculateMaxEleInArray {
    public static void main(String[] args) {
        int[] arr = { 34, 21, 54, 65, 43 };
        int max = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            max = arr[i];
            if (max < arr[i + 1]) {
                max = arr[i + 1];
            }
        }

        System.out.println("The Maximum Element in array is: " + max);
    }
}
