import java.util.ArrayList;

public class PrintAllSequence {
    public static void printAll(int[] arr, ArrayList<Integer> temp, int index) {
        if (index == arr.length) {
            if (temp.size() > 0) {

                System.out.println(temp);
            }
            return;
        } else {
            temp.add(arr[index]);
            printAll(arr, temp, index + 1);

            temp.remove(temp.size() - 1);
            printAll(arr, temp, index + 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };

        printAll(arr, new ArrayList<>(), 0);
    }
}
