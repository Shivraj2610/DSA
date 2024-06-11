import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();

        /*
         * Construction of HashTable
         */
        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }

        /*
         * Find the First Non-Repeating Char
         */
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i)) == 1) {
                System.out.println("The First Non-Rapeating Char present at index: " + i);

                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("There is not Non-Repeating Char is present");
        }
    }
}

/*
 * Time Complexity --> O(n)
 * Space Complexity ---> O(n)
 */
