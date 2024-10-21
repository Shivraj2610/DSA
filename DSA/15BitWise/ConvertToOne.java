
public class ConvertToOne {
    public static void main(String[] args) {
        int num = 0;

        int ans = num & 1;
        if (num % 2 == 0) {
            System.out.println(ans + 1);
        } else {
            System.out.println(ans);
        }
    }
}
