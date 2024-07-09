import java.util.ArrayList;
import java.util.List;

public class PrintAllSequence {

    public static void printSequence(int[] arr, int curInd, ArrayList tempArr,
            List<List<Integer>> list) {
        // Base Case
        if (curInd == arr.length) {
            // print all SubSequence
            if (tempArr.size() > 0) {
                list.add(new ArrayList<>(tempArr));
            }

        } else {
            // Recursive call to Include data
            printSequence(arr, curInd + 1, tempArr, list);
            // add value in tempArr
            tempArr.add(arr[curInd]);

            // Recursive class Don't include data
            printSequence(arr, curInd + 1, tempArr, list);
            // remove last element in tempArr
            tempArr.remove(tempArr.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        List<List<Integer>> list = new ArrayList<>();
        printSequence(arr, 0, new ArrayList<>(), list);
        System.out.println(list);
    }
}
