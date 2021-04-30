import java.util.*;

class DisjointSet {
    int parent[];

    // Constructor
    DisjointSet(int n) {
        parent = new int[n + 1];

        // Every node is a parent of itself
        for (int i = 0; i <= n; i++)
            parent[i] = i;
    }

    // Path Compression
    int find(int s) {
        /*
         * Make the parent of the nodes in the path from u--> parent[u] point to
         * parent[u]
         */
        if (s == parent[s])
            return s;
        return parent[s] = find(parent[s]);
    }

    // Makes u as parent of v.
    void merge(int u, int v) {
        // update the greatest available
        // free slot to u
        parent[v] = u;
    }
}

class Job implements Comparator<Job> {
    // Each job has a unique-id, profit and deadline
    char id;
    int deadline, profit;

    // Constructors
    public Job() {
    }

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    // Returns the maximum deadline from the set of jobs
    public static int findMaxDeadline(ArrayList<Job> arr) {
        int ans = Integer.MIN_VALUE;
        for (Job temp : arr)
            ans = Math.max(temp.deadline, ans);
        return ans;
    }

    // Prints optimal job sequence
    public static void printJobScheduling(ArrayList<Job> arr) {
        // Sort Jobs in descending order on the basis
        // of their profit
        Collections.sort(arr, new Job());

        // Find the maximum deadline among all jobs and
        // create a disjoint set data structure with
        // maxDeadline disjoint sets initially.
        int maxDeadline = findMaxDeadline(arr);
        DisjointSet dsu = new DisjointSet(maxDeadline);

        // Traverse through all the jobs
        for (Job temp : arr) {
            // Find the maximum available free slot for
            // this job (corresponding to its deadline)
            int availableSlot = dsu.find(temp.deadline);

            // If maximum available free slot is greater
            // than 0, then free slot available
            if (availableSlot > 0) {
                // This slot is taken by this job 'i'
                // so we need to update the greatest free
                // slot. Note that, in merge, we make
                // first parameter as parent of second
                // parameter. So future queries for
                // availableSlot will return maximum slot
                // from set of "availableSlot - 1"
                dsu.merge(dsu.find(availableSlot - 1), availableSlot);
                System.out.print(temp.id + " ");
            }
        }
        System.out.println();
    }

    // Used to sort in descending order on the basis
    // of profit for each job
    public int compare(Job j1, Job j2) {
        return j1.profit > j2.profit ? -1 : 1;
    }
}

public class Program_2_Job_Sequencing_Problem {
    public static void main(String args[]) {
        ArrayList<Job> arr = new ArrayList<Job>();
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));
        System.out.println("Following jobs need to be " + "executed for maximum profit");
        Job.printJobScheduling(arr);
    }
}



// class Job {
//     int start, finish, profit;

//     // Constructor
//     Job(int start, int finish, int profit) {
//         this.start = start;
//         this.finish = finish;
//         this.profit = profit;
//     }
// }

// // Used to sort job according to finish times
// class JobComparator implements Comparator<Job> {
//     public int compare(Job a, Job b) {
//         return a.finish < b.finish ? -1 : a.finish == b.finish ? 0 : 1;
//     }
// }

// public class Program_2_Job_Sequencing_Problem {
//     static public int binarySearch(Job jobs[], int index) {
//         // Initialize 'lo' and 'hi' for Binary Search
//         int lo = 0, hi = index - 1;

//         // Perform binary Search iteratively
//         while (lo <= hi) {
//             int mid = (lo + hi) / 2;
//             if (jobs[mid].finish <= jobs[index].start) {
//                 if (jobs[mid + 1].finish <= jobs[index].start)
//                     lo = mid + 1;
//                 else
//                     return mid;
//             } else
//                 hi = mid - 1;
//         }

//         return -1;
//     }

//     // The main function that returns the maximum possible
//     // profit from given array of jobs
//     static public int schedule(Job jobs[]) {
//         // Sort jobs according to finish time
//         Arrays.sort(jobs, new JobComparator());

//         // Create an array to store solutions of subproblems.
//         // table[i] stores the profit for jobs till jobs[i]
//         // (including jobs[i])
//         int n = jobs.length;
//         int table[] = new int[n];
//         table[0] = jobs[0].profit;

//         // Fill entries in M[] using recursive property
//         for (int i = 1; i < n; i++) {
//             // Find profit including the current job
//             int inclProf = jobs[i].profit;
//             int l = binarySearch(jobs, i);
//             if (l != -1)
//                 inclProf += table[l];

//             // Store maximum of including and excluding
//             table[i] = Math.max(inclProf, table[i - 1]);
//         }

//         return table[n - 1];
//     }

//     // Driver method to test above
//     public static void main(String[] args) {
//         Job jobs[] = { new Job(1, 2, 50), new Job(3, 5, 20), new Job(6, 19, 100), new Job(2, 100, 200) };

//         System.out.println("Optimal profit is " + schedule(jobs));
//     }
// }