public class FindSendLargEle {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 5 };
        secondLarg(arr);
    }

    static void secondLarg(int[] arr) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int ele : arr) {
            if (ele > max) {
                max2 = max;
                max = ele;
            } else if (ele > max2 && ele != max) {
                max2 = ele;
            }
        }
        System.out.println("Max is: " + max);
        System.out.println("Second Max is: " + max2);
        System.out.println(max * max2);
    }
}
