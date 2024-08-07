import java.util.ArrayList;
import java.util.List;

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

    public static void permute(String str, int s, int e) {
        if (s == e) {
            // res.add(str);
            System.out.println(str);
        } else {
            for (int i = s; i <= e; i++) {
                str = swap(str, s, i);
                // Recursive call
                permute(str, s + 1, e);

                // backteracking
                str = swap(str, s, i);
            }
        }
        // return res;
    }

    public static void main(String[] args) {
        // String str = "abc";
        // int size = str.length() - 1;
        // List<String> list = new ArrayList<>();
        permute("abc", 0, 2);

        // System.out.println(l);
    }
}
