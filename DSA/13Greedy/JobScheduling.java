
/*
 * Time Complexity is -> O(n^2)
 * Space Complexity is -> O(n)
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JobScheduling {
    char id;
    int deadline;
    int profit;

    public JobScheduling() {
    };

    public JobScheduling(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    public void scheduleJobs(ArrayList<JobScheduling> arr, int maxDeadline) {
        // Sort the Jobs as Decreasing order according to Profit of the job
        /*
         * Time Complexity O(nlogn)
         */
        Collections.sort(arr, (j1, j2) -> j2.profit - j1.profit);

        // To Store the Job id's
        /*
         * Space Complexity -> O(n)
         */
        char[] jobId = new char[maxDeadline];

        // To track the booked slots
        /*
         * Space Complexity -> O(n)
         */
        boolean[] booked = new boolean[maxDeadline];

        // Store the jobs id's according to given deadline
        /*
         * Time Complexity O(n^2)
         */
        for (int i = 0; i < maxDeadline; i++) {
            for (int j = Math.min(maxDeadline - 1, arr.get(i).deadline - 1); j >= 0; j--) {
                // if slot is avaible - i.e false
                if (!booked[j]) {
                    booked[j] = true;
                    // allocate that slot to the current job id
                    jobId[j] = arr.get(i).id;
                    break;
                }
            }
        }

        for (char id : jobId) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<JobScheduling> arr = new ArrayList<>();
        arr.add(new JobScheduling('1', 5, 55));
        arr.add(new JobScheduling('2', 2, 65));
        arr.add(new JobScheduling('3', 7, 75));
        arr.add(new JobScheduling('4', 3, 60));
        arr.add(new JobScheduling('5', 2, 70));
        arr.add(new JobScheduling('6', 1, 50));
        arr.add(new JobScheduling('7', 4, 85));
        arr.add(new JobScheduling('8', 5, 68));
        arr.add(new JobScheduling('9', 3, 45));

        int maxDeadline = 7;

        JobScheduling j = new JobScheduling();

        System.out.println("The Scheduled jobs are: ");
        j.scheduleJobs(arr, maxDeadline);

    }
}
