import java.util.TreeMap;

public class SortedOrderBasedOnKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(4, "Danny");
        tm.put(2, "Sid");
        tm.put(1, "Shivba");
        tm.put(17, "Shivraj");

        System.out.println(tm);
    }
}
