import java.util.Arrays;

public class Hello {
    public static String sortString(String str) {
        char[] sort = str.toCharArray();
        Arrays.sort(sort);
        return new String(sort);
    }

    public static void main(String[] args) {
        String[] arr = { "bat", "mat", "cat" };

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortString(arr[i]);
            System.out.println(arr[i]);
        }

    }
}