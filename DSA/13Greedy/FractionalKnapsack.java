/*
 * Int this problem statement given some Objects and it's Weight and Profit
 * Then there is One Sack of a certain Capacity of Weight
 * We Take the some objects in Sack then we get Maximum profit
 */

// Create a class of Objects it contains weight and profit of objects

import java.util.Arrays;
import java.util.Comparator;

class ItemInformation {
    int weight;
    int profit;

    ItemInformation(int weight, int profit) {
        this.weight = weight;
        this.profit = profit;
    }
}

public class FractionalKnapsack {

    public static double maxValue(ItemInformation[] arr, double capacity) {
        // Use Lambda Function to Sort Items in decreasing order according progit/weight
        Arrays.sort(arr, (item1, item2) -> (item2.profit / item2.weight) - (item1.profit / item1.weight));

        double totalProfit = 0;

        for (ItemInformation i : arr) {
            int curWt = i.weight;
            int curprofit = i.profit;

            if (capacity - curWt >= 0) {
                capacity -= curWt;
                totalProfit += curprofit;
            } else {
                double fraction = capacity / curWt;
                capacity -= curWt * fraction;
                totalProfit += curprofit * fraction;
            }
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        // FractionalKnapsack frk = new FractionalKnapsack();

        /*
         * Create an ItemInformation type Array to store the values of
         * ItemInformation(i.e Weight and
         * Profit)
         */
        ItemInformation[] arr = {
                new ItemInformation(5, 25),
                new ItemInformation(10, 75),
                new ItemInformation(12, 100),
                new ItemInformation(4, 50),
                new ItemInformation(7, 45),
                new ItemInformation(9, 90),
                new ItemInformation(3, 30)
        };

        int capacity = 37;

        double totalProfit = maxValue(arr, capacity);
        System.out.println("The Maximum profit is: " + totalProfit);
    }
}
