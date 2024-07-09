public class Permutation {
    public static String swap(String str, int i, int j) {
        // Convert String into CharArray
        char[] charArr = str.toCharArray();

        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;

        // Return swaped String
        return String.valueOf(charArr);
    }

    public static void logic(String str, int s, int e) {
        if (s == e) {
            System.out.println(str);
        } else {
            for (int i = s; i <= e; i++) {
                str = swap(str, s, i);

                logic(str, s + 1, e);
                str = swap(str, s, i);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        logic(str, 0, 2);
    }
}