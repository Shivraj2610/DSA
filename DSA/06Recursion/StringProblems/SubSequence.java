import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        ArrayList<String> ans = subseq("", "abc");
        System.out.println(ans);
    }

    static ArrayList<String> subseq(String ans, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);

        // Adding into ans
        ArrayList<String> left = subseq(ans + ch, str.substring(1));

        // Not Adding
        ArrayList<String> right = subseq(ans, str.substring(1));

        left.addAll(right);
        return left;
    }
}
