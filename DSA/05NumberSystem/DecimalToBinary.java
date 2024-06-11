import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {
    public static void main(String args[]) {
        int decimal = 10;
        List<Integer> ans = new ArrayList<>();
        int i = 0;

        while (decimal > 0) {
            int rem = decimal % 2;
            ans.add(rem);
            i++;
            decimal = decimal / 2;
        }

        int f = 0;
        int l = ans.size() - 1;

        while (f < l) {
            int temp = ans.get(f);
            ans.set(f, ans.get(l));
            ans.set(l, temp);
            f++;
            l--;
        }

        System.out.println(ans);
    }
}
