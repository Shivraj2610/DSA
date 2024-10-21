
public class AchiveDiceTarget {
    public static void main(String[] args) {
        achive("", 4);
    }

    static void achive(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            achive(p + i, target - i);
        }
    }
}
