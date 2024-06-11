import java.util.ArrayList;

public class PrintAllSequence {

    public static void printSequence(int[] arr, int curInd, ArrayList tempArr) {
        // Base Case
        if (curInd == arr.length) {
            // print all SubSequence
            if (tempArr.size() > 0) {
                System.out.println(tempArr);
            }
            return;
        } else {
            // Recursive call to Include data
            printSequence(arr, curInd + 1, tempArr);
            // add value in tempArr
            tempArr.add(arr[curInd]);

            // Recursive class Don't include data
            printSequence(arr, curInd + 1, tempArr);
            // remove last element in tempArr
            tempArr.remove(tempArr.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        printSequence(arr, 0, new ArrayList<>());
    }
}
