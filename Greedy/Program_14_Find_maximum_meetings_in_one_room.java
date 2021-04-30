import java.util.*;

public class Program_14_Find_maximum_meetings_in_one_room {

    static void meeting(int s[], int f[]) {
        int i = 1, j = 0;
        System.out.println(s[0] + " " + f[0] + " Meeting no.1");
        while (i < s.length) {
            if (s[i] > f[j]) {
                System.out.println(s[i] + " " + f[i] + " Meeting no." + (i + 1));
                j = i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int s[] = { 1, 3, 0, 5, 8, 5 };
        // int s[] = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924};

        int f[] = { 2, 4, 6, 7, 9, 9 };
        // int f[] = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252 };

        int l = 0, m = 0, t1, t2;
        for (l = 0; l < f.length; l++) {
            for (m = l + 1; m < f.length; m++) {
                if (f[m] < f[l]) {
                    t1 = f[m];
                    f[m] = f[l];
                    f[l] = t1;

                    t2 = s[m];
                    s[m] = s[l];
                    s[l] = t2;
                }
            }
        }

        System.out.println();
        meeting(s, f);
    }
}









// /* Approach in answer */

// class mycomparator implements Comparator<meeting> {
//     @Override
//     public int compare(meeting o1, meeting o2) {
//         if (o1.end < o2.end) {

//             // Return -1 if second object is
//             // bigger then first
//             return -1;
//         } else if (o1.end > o2.end)

//             // Return 1 if second object is
//             // smaller then first
//             return 1;

//         return 0;
//     }
// }

// // Custom class for storing starting time,
// // finishing time and position of meeting.
// class meeting {
//     int start;
//     int end;
//     int pos;

//     meeting(int start, int end, int pos) {
//         this.start = start;
//         this.end = end;
//         this.pos = pos;
//     }
// }

// class Program_14_Find_maximum_meetings_in_one_room {

//     // Function for finding maximum meeting in one room
//     public static void maxMeeting(ArrayList<meeting> al, int s) {

//         // Initialising an arraylist for storing answer
//         ArrayList<Integer> m = new ArrayList<>();

//         int time_limit = 0;

//         mycomparator mc = new mycomparator();

//         // Sorting of meeting according to
//         // their finish time.
//         Collections.sort(al, mc);

//         // Initially select first meeting.
//         m.add(al.get(0).pos);

//         // time_limit to check whether new
//         // meeting can be conducted or not.
//         time_limit = al.get(0).end;

//         // Check for all meeting whether it
//         // can be selected or not.
//         for (int i = 1; i < al.size(); i++) {
//             if (al.get(i).start > time_limit) {

//                 // Add selected meeting to arraylist
//                 m.add(al.get(i).pos);

//                 // Update time limit
//                 time_limit = al.get(i).end;
//             }
//         }

//         // Print final selected meetings.
//         for (int i = 0; i < m.size(); i++)
//             System.out.print(m.get(i) + 1 + " ");
//     }

//     // Driver Code
//     public static void main(String[] args) {

//         // Starting time

//         int s[] = { 1, 3, 0, 5, 8, 5 };
//         // int s[] = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924};
//         // Finish time

//         int f[] = { 2, 4, 6, 7, 9, 9 };
//         // int f[] = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252 };

//         // Defining an arraylist of meet type
//         ArrayList<meeting> meet = new ArrayList<>();
//         for (int i = 0; i < s.length; i++)

//             // Creating object of meeting
//             // and adding in the list
//             meet.add(new meeting(s[i], f[i], i));

//         // Function call
//         maxMeeting(meet, meet.size());
//     }
// }