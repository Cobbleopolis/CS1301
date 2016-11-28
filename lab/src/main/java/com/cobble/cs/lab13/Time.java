//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Time

package com.cobble.cs.lab13;

public class Time {

    /** The hours value of the time. */
    private int hours;

    /** The minutes value of the time. */
    private int minutes;

    /** The second value of the time. */
    private int seconds;

    /**
     * Creates a Time set to midnight January 1, 1970 UTC.
     */
    public Time() {
        this(0L);
    }

    /**
     * Creates a Time with a specified Time.
     * @param elapsedTime The amount of time in milliseconds that has passed since midnight January 1, 1970 UTC.
     */
    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    /**
     * Gets the hours field of Time relative to the UTC timezone.
     * @return The current hours of the Time relative to the UTC timezone.
     */
    public int getHours() {
        return (hours == 0) ? 12 : hours;
    }

    /**
     * Gets the minutes field of Time relative to the UTC timezone.
     * @return The current minutes of the Time relative to the UTC timezone.
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Gets the seconds field of Time relative to the UTC timezone.
     * @return The current seconds of the Time relative to the UTC timezone.
     */
    public int getSeconds() {
        return seconds;
    }
    
    /**
     * Sets the hours, minutes, and seconds fields based on the time provided.
     * @param elapsedTime The amount of time in milliseconds that has passed since midnight January 1, 1970 UTC.
     */
    public void setTime(long elapsedTime) {
        hours   = (int) (elapsedTime / 3600000.0) % 12;
        minutes = (int) (elapsedTime / 60000.0)   % 60;
        seconds = (int) (elapsedTime / 1000.0)    % 60;
    }
}