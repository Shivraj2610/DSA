public class FindRightSetBit {
    public static void main(String[] args) {
        int num = 4;
        int ans = rightSetBit(num);
        System.out.println(ans);
    }

    public static int rightSetBit(int num) {
        // Convert The num in -ve
        int negativeNum = ~num + 1;

        return num & negativeNum;
    }
}
