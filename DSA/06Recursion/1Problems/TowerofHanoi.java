
public class TowerofHanoi {
    public static void solution(int n, String src, String help, String dest) {
        if (n == 1) {

            System.out.println(n + " goes from " + src + " to " + dest);
            return;
        }

        // Move first n-1 disk from src to helper using dest tower as helper
        solution(n - 1, src, dest, help);

        System.out.println(n + " goes from " + src + " to " + dest);

        // Move the n-1 disks from helper to destination by using src as helper
        solution(n - 1, help, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;

        solution(n, "src", "help", "dest");
    }
}
