public class FirstNonRepeatingChar {

    public static int findfirstNonRepratingChar(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
            boolean flag = false;

            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] == arr[j]) {

                    flag = true;
                    break;
                }
            }

            if (!flag) {

                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "ShivrajSayahZivrjy";
        str = str.toUpperCase();

        int index = findfirstNonRepratingChar(str);
        System.out.println("The first Non-Repeatin Char is on index: " + index);
    }
}
