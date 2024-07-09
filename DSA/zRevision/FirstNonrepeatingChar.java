import java.util.HashMap;

public class FirstNonrepeatingChar {
    public static void main(String[] args) {
        String str = "ShivrSayah";
        str = str.toUpperCase();
        System.out.println(str);

        HashMap<Character, Integer> map = new HashMap<>();

        // Construction of HashTable
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        // Scan HashMap and Find First non-repeating char
        int res = -1;
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println("The first Non-Repeating Char index is: " + i);
                res = 1;
                break;
            }
        }
        if (res == -1) {
            System.out.println("The Non-repeating Char is not availble");
        }
    }
}
