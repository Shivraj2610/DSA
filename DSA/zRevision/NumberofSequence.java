public class NumberofSequence {

    public static int countSequence(int num, int n) {
        int count;
        if (n == 1) {
            return num;
        } else {
            count = num * countSequence(num, n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "123";
        int n = str.length();
        int count = countSequence(2, n);
        System.out.println(count - 1);
    }
}
