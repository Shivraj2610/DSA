import java.util.*;

public class HashFunctions {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        /*
         * Put Method in HashMap
         * .put(key , value);
         */
        hm.put(1, "Shiv");
        hm.put(2, "Saya");
        hm.put(17, "Shivraj");
        hm.put(7, "Pranav");

        System.out.println("The Data in HashMap is: " + hm);

        /*
         * get() Method in HashMap
         * .get(key);
         */
        String saya = hm.get(2);
        System.out.println("The value of given key is:" + saya);

        /*
         * containsKey() Method
         * containsKey(key) --> it return boolean value acc to key is present or not in
         * hashmap
         */
        System.out.println("The given key is present in hashmap: " + hm.containsKey(1));

        /*
         * remove() Method
         * .remove(key) -> it remove the entry by using key
         */
        hm.remove(7);
        System.out.println("The updated hm is: " + hm);

        /*
         * Iterating using for Loop
         * .entrySet()--> It store all the HashMap's Entry
         */
        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
