// Q2: Write a program to traverse over the elements of the array using for each loop and print all even
// elements.

// Input 1: arr[] = {34,21,54,65,43}

// Output 1: 34 54

public class PrintEvenNumbersInArray {
    public static void main(String[] args) {
        int[] arr = { 34, 21, 54, 65, 43 };

        System.out.println("The Even Numbers in an Array is: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
