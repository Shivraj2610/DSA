import java.util.*;

public class TypeMap {
    public static void main(String[] args) {
        /*
         * HashMap is *****Unorderd*****
         */
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(2, "Saya");
        hm.put(1, "Shiv");
        hm.put(26, "Shivraj");
        hm.put(17, "Sanket");

        System.out.println(hm);

        /*
         * LinkedHashMap Preserved order of Insertion
         */
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(10, "Ten");
        lhm.put(1, "one");
        lhm.put(2, "two");
        System.out.println(lhm);

        /*
         * It Return Sorted Data in term of Keys
         */
        TreeMap<Integer, String> tm = new TreeMap();
        tm.put(5, "five");
        tm.put(1, "one");
        tm.put(10, "ten");
        tm.put(3, "Three");
        System.out.println(tm);
    }
}
