
public class ReverseArray {
    public static char[] reverse(char[] arr) {
        int l = 0;
        int h = arr.length - 1;

        while (l < h) {
            char temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
        return arr;
    }

    public static void main(String[] args) {
        char[] arr = { 'z', 'c', 't', 's', 'a', 'y', 'a' };
        char[] reverse = reverse(arr);
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
    }
}
