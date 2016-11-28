//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: TimeTest

package com.cobble.cs.lab13;

public class TimeTest {

    public static void main(String[] args) {
        Time currentTime = new Time(System.currentTimeMillis());
        displayTime("Current Time", currentTime);
        Time testTime = new Time(555550000L);
        displayTime("Test Time", testTime);
        Time noTime = new Time();
        displayTime("No Time Has Passed", noTime);
    }

    /**
     * Displays a time.
     * @param label The label to use when displaying the time.
     * @param time The time to display.
     */
    public static void displayTime(String label, Time time) {
        System.out.printf("%s: %d hours, %d minutes, %d seconds%n",
                label,
                time.getHours(),
                time.getMinutes(),
                time.getSeconds()
        );
    }
}