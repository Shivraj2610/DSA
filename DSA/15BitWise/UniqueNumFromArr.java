public class UniqueNumFromArr {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 5, 2, 1, 5, 11, 1, 2, 2 };
        int ans = findUnique(arr);
        System.out.println(ans);
    }

    public static int findUnique(int[] arr) {
        int[] board = new int[32];
        for (int ele : arr) {
            for (int i = 0; i < 32; i++) {
                if ((ele & (1 << i)) != 0) {
                    board[i]++;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (board[i] % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
