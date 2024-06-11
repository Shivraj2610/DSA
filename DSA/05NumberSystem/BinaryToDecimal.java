
public class BinaryToDecimal {

    public static int convertIntoDecimal(int num) {

        // i is raise to power of 2
        int i = 0;

        int sum = 0;

        while (num > 0) {
            /*
             * remd --> is the last bit in binary number
             */
            int remd = num % 10;

            /*
             * here we get value of 2^i
             */
            int bi = (int) Math.pow(2, i);

            /*
             * here multiply by 2^i to the single bit of binary number
             */
            int part = remd * bi;

            /*
             * taking sum of bit*2^i
             */
            sum += part;

            /*
             * increase raise to power
             */
            i++;

            /*
             * Remove the last bit
             */
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int binary = 100111;

        int decimal = convertIntoDecimal(binary);
        System.out.println("The number " + binary + " in Decimal format is:" + decimal);
    }
}
