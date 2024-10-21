import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static String sorted(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }

    public static List<List<String>> groups(String[] arr) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for (String str : arr) {
            String sort = sorted(str);

            if (hm.containsKey(sort)) {
                hm.get(sort).add(str);
            } else {
                List<String> l = new ArrayList<>();
                l.add(str);
                hm.put(sort, l);
            }
        }
        return new ArrayList<>(hm.values());
    }

    public static void main(String[] args) {
        String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> ans = groups(arr);
        System.out.println(ans);
    }
}
