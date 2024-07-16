public class CountInversion_BruteForce {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 1, 7, 6, 9, 8, 1 };
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        System.out.println("The Count of number of inversion is: " + count);
    }
}
