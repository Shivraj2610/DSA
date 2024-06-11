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

    public static List<String> permute(List<String> res, String str, int s, int e) {
        if (s == e) {
            res.add(str);
        } else {
            for (int i = s; i <= e; i++) {
                str = swap(str, s, i);
                // Recursive call
                permute(res, str, s + 1, e);

                // backteracking
                str = swap(str, s, i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abc";
        int size = str.length() - 1;
        List<String> list = new ArrayList<>();
        List<String> l = permute(list, str, 0, size);

        System.out.println(l);
    }
}
