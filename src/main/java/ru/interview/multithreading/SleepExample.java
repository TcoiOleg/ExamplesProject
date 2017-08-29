package ru.interview.multithreading;

import java.time.LocalTime;

/**
 * o.tsoy
 * 24.08.2017
 */
public class SleepExample {

    public static void main(String[] args) {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (String anImportantInfo : importantInfo) {
            //Pause for 4 seconds
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Print a message
            System.out.println(anImportantInfo + " " + LocalTime.now());
        }
    }

}
