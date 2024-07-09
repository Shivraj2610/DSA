
public class RemoveDublicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4 };

        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            } else {
                arr[pos] = arr[i];
                pos++;
            }
        }
        System.out.println(pos);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
