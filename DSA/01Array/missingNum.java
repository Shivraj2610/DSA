public class missingNum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 5, 6 };
        int n = arr.length;
        int sum = 0;

        // Sum of n+1 Natural Number
        int sumOfNaturalNo = ((n + 1) * (n + 2)) / 2;

        // Sum of numbers in array
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Missing number
        int missingNum = sumOfNaturalNo - sum;
        System.out.println("The missing number is:" + missingNum);
    }
}