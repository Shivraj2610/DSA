/*
 * Only rs.5, rs.10 and rs.20 are available
 * The Price of Lamonade is rs.5
 * Currently the seller do not have any money
 * If The Seller can able to give the change the only return true else false
 */
public class LamonadeChange {
    public static boolean change(int[] arr) {
        int n = arr.length;
        // Currently there is No any money
        int five = 0, ten = 0, twenty = 0;

        // Start the Selling Lamonade
        for (int money : arr) {
            if (money == 5) {
                five++;
            } else if (money == 10) {
                // No change
                if (five == 0) {
                    return false;
                    // After giving change
                } else {
                    five--;
                    ten++;
                }
            } else {
                // After giving change of rs.10 and rs.5
                if (ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                    twenty++;
                    // After giving change of 3 rs.5 coins
                } else if (five >= 3) {
                    five -= 3;
                    // No change
                } else {
                    return false;
                }
            }
        }
        // Successfuly provinding change to customers
        return true;
    }

    public static void main(String[] args) {
        // Custumer with rs. coin
        int arr[] = { 5, 5, 10, 10, 5, 20, 5, 10, 5, 20 };

        boolean ans = change(arr);
        System.out.println(ans);
    }
}
