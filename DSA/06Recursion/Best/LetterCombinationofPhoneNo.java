import java.util.ArrayList;
import java.util.List;

public class LetterCombinationofPhoneNo {
    public static void main(String[] args) {
        List<String> list = combinatin("", "12");
        System.out.println(list);
    }

    static List<String> combinatin(String p, String up) {
        List<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        List<String> list2 = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            list2 = combinatin(p + ch, up.substring(1));
            list.addAll(list2);
        }
        return list;
    }
}
