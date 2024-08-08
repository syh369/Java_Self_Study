package hw3;

import java.util.ArrayList;
import java.util.Arrays;

class Marathon {
    public static int findFastest(Integer[] times) {
        if (times.length == 0) {
            System.out.println("Error: No time records shown");
            return -1;
        }

        int index = 0;
        int curMinutes = 0;

        for (int i = 0; i < times.length; i++) {
            curMinutes = Math.max(curMinutes, times[i]);
        }

        for (int j = 0; j < times.length; j++) {
            if (times[j] == curMinutes) {
                index = j;
            }
        }

        return index;
    }

    public static void findTheSecondFastest(int[] times, String[] names, int fastestInd) {
        int fastestTime = times[fastestInd];
        String fastestName = names[fastestInd];

        ArrayList<Integer> timesWithoutFastest = new ArrayList<Integer>();
        ArrayList<String> namesWithoutFastest = new ArrayList<String>();

        for (Integer time : times) {
            if (time == fastestTime) {
                continue;
            }
            timesWithoutFastest.add(time);
        }

        for (String name : names) {
            if (name == fastestName) {
                continue;
            }
            namesWithoutFastest.add(name);
        }

        Integer[] tempTimes = new Integer[timesWithoutFastest.size()];
        String[] tempNames = new String[namesWithoutFastest.size()];

        tempTimes = timesWithoutFastest.toArray(tempTimes);
        tempNames = namesWithoutFastest.toArray(tempNames);
        int secondFastestInd = findFastest(tempTimes);

        int secondFastestRecord = tempTimes[secondFastestInd];
        String secondFastestName = tempNames[secondFastestInd];

        System.out.println("The second fastest person with the record:");
        System.out.println("Name: " + secondFastestName + "\tTime: " + secondFastestRecord);
    }

    public static void main(String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        // Find the fastest person
        System.out.println("The fastest person with the record:");
        Integer[] newTimes = Arrays.stream(times).boxed().toArray(Integer[]::new);
        int fastestInd = findFastest(newTimes);
        String fastestPerson = names[fastestInd];
        int fastestTime = times[fastestInd];
        System.out.println("Name: " + fastestPerson + "\tTime: " + fastestTime);

        // Find the second fastest person
        findTheSecondFastest(times, names, fastestInd);
    }
}