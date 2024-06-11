public class DecimalToHexaDecimal {

    public static void toHexaDecimal(int num) {
        String ans = "";
        int ind = 0;

        while (num > 0) {
            int rem = num % 16;
            if (rem == 10) {
                ans += 'A';
            } else if (rem == 11) {
                ans += 'B';
            } else if (rem == 12) {
                ans += 'C';
            } else if (rem == 13) {
                ans += 'D';
            } else if (rem == 14) {
                ans += 'E';
            } else if (rem == 15) {
                ans += 'F';
            } else {

                ans += rem;
            }
            num = num / 16;
        }

        char[] ch = ans.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }

    }

    public static void main(String[] args) {
        toHexaDecimal(700);
    }
}
