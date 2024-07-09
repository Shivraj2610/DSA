import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] buldingHeight = { 4, 2, 1, 5, 6, 3, 2, 4, 2 };
        int[] preSmaller = new int[buldingHeight.length];
        int[] nextSmaller = new int[buldingHeight.length];
        List<Integer> area = new ArrayList<>();

        // Array of Previous Smaller Building
        for (int i = 0; i < buldingHeight.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (buldingHeight[i] > buldingHeight[j]) {
                    preSmaller[i] = j;
                    break;
                }
                if (j == 0) {
                    preSmaller[i] = -1;
                }
            }
        }

        // Array of Next smaller Building
        for (int i = 0; i < buldingHeight.length; i++) {
            for (int j = i + 1; j < buldingHeight.length; j++) {
                if (buldingHeight[i] > buldingHeight[j]) {
                    nextSmaller[i] = i;
                    break;
                }
                if (j == buldingHeight.length - 1) {
                    nextSmaller[i] = buldingHeight.length;
                }
            }
        }

        for (int i = 0; i < buldingHeight.length; i++) {
            area.add((nextSmaller[i] - preSmaller[i] - 1) * buldingHeight[i]);
        }

        int max = Collections.max(area);
        System.out.println("The Largest rectangle area is: " + max);
    }
}
