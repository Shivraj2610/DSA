import java.util.HashMap;

public class TwoSum {

    public static int[] findInd(int[] arr, int target) {
        int[] index = new int[2];
        index[0] = -1;
        index[1] = -1;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], i);
        }

        System.out.println(hm);

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(0) && arr[i] == target) {

                index[0] = i;
                index[1] = hm.get(0);
                break;

            } else if (hm.containsKey(target - arr[i])) {
                if (hm.get(target - arr[i]) > i) {
                    index[0] = i;
                    index[1] = hm.get(target - arr[i]);
                    break;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 4, 4, 6 };
        int target = 5;

        int[] res = findInd(arr, target);
        System.out.println(res[0] + " " + res[1]);
    }
}
