//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: CountOccurrences

package com.cobble.cs.lab10;

import java.util.*;

public class CountOccurrences {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {

            /** Stores the input from the user for each number as it's read. */
            int input = scanner.nextInt();

            /** Stores the count values. */
            int[] counts = new int[input + 1];

            /** Stores the maximum number inputted by the user. */
            int maxInput = Integer.MIN_VALUE;

            // Reads each input from the user while input is not 0.
            while(input != 0) {
                maxInput = Math.max(input, maxInput); // Recalculates max input.
                if (counts.length != maxInput + 1) // Checks if counts needs to be resized
                    counts = Arrays.copyOf(counts, Math.max(maxInput + 1, 0)); // Resizes the counts array
                counts[input]++; // Increments the counts array
                input = scanner.nextInt(); // gets the next input from the user.
            }

            for(int i = 0; i < counts.length; i++) //Loops over the counts and prints them to the console if they're not 0.
                if (counts[i] > 0)
                    System.out.printf("%d occurs %d time%s%n", i, counts[i], (counts[i] > 1) ? "s" : "");


            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);
    }
}