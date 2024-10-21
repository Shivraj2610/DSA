import java.util.*;

public class List_toArray {
    // Convert List into Array
    public static int[] convertintoArray(List<Integer> l) {
        int[] arr = new int[l.size()];

        for (int i = 0; i < l.size(); i++) {
            arr[i] = l.get(i);
        }
        return arr;
    }

    // Convert doubly List into 2D-Array
    public static int[][] doubleyListinto2DArray(List<List<Integer>> list) {
        int[][] arr = new int[list.size()][];// Rows are not initialize yet

        for (int i = 0; i < list.size(); i++) {
            arr[i] = new int[list.get(i).size()];// Initialize each row with correct size
            for (int j = 0; j < list.get(i).size(); j++) {
                arr[i][j] = list.get(i).get(j);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(9);
        l.add(2);
        l.add(17);

        List<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(9);
        l1.add(4);

        List<Integer> l2 = new ArrayList<>();
        l2.add(18);
        l2.add(34);
        l2.add(89);
        l2.add(55);

        List<List<Integer>> list = new ArrayList<>();
        list.add(l);
        list.add(l1);
        list.add(l2);

        int[] arr = convertintoArray(l);
        int[][] res = doubleyListinto2DArray(list);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("The 2D Array is: ");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
