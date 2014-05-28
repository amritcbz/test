public class Birthdays { 

    public static void main(String[] args) { 
        int D = Integer.parseInt(args[0]);     // number of days
        int T = Integer.parseInt(args[1]);     // number of trials
        int people = 0;                        // total number of people over all T trials

        // repeat T times
        for (int t = 0; t < T; t++) {

            //  days[d] = true if someone born on day d; false otherwise
            boolean[] days = new boolean[D];

            while (true) {
                people++;                             // one more person enters the room
                int d = (int) (D * Math.random());    // integer between 0 and D-1
                if (days[d]) break;                   // two people with the same birthday, so break out of loop
                days[d] = true;                       // update days[d]
            }
        }

        double average = (double) people / T;
        System.out.println("Average = " + average);
    }
}
