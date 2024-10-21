
public class SkipString {
    public static void main(String[] args) {
        skip("", "bcaacb");
        String str = skip2("bcaacb");
        System.out.println(str);
        String apple = skipApple("ShivappleSaya");
        System.out.println(apple);
        String app = skipAppNotApple("Notappyesbro");
        System.out.println(app);
    }

    // By using Extra Parameter
    static void skip(String p, String str) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);

        if (ch == 'a') {
            skip(p, str.substring(1));
        } else {

            skip(p + ch, str.substring(1));
        }
    }

    // Without using extra parameter
    static String skip2(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if (ch == 'a') {
            return skip2(str.substring(1));
        } else {
            return ch + skip2(str.substring(1));
        }
    }

    // Skip a String value
    static String skipApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("apple")) {
            return skipApple(str.substring(5));
        } else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    // Skip app not apple
    static String skipAppNotApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        } else {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }
}
