public class Permutation {
    public static void main(String[] args) {
        permute("", "abc");
    }

    static void permute(String p, String str) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = str.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permute(first + ch + second, str.substring(1));
        }
    }
}
