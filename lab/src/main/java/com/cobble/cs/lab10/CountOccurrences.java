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
            /**
             * Stores the values inputted by the user.
             */
            int[] nums = new int[0];

            /**
             * Stores the input from the user for each number as it's read.
             */
            int input = scanner.nextInt();

            /**
             * Stores the maximum number inputted by the user.
             */
            int maxInput = Integer.MIN_VALUE;

            // Reads each input from the user and while the input is not 0 it will add it to the nums array, and then recalculate maxInput.
            while(input != 0) {
                nums = Arrays.copyOf(nums, nums.length + 1);
                nums[nums.length - 1] = input;
                maxInput = Math.max(input, maxInput);
                input = scanner.nextInt();
            }

            /**
             * Stores the count values.
             */
            int[] counts = new int[maxInput + 1];

            for(int num: nums) //Loops over the inputted values and passes them to addCount
                counts[num]++;

            for(int i = 0; i < counts.length; i++) //Loops over the counts and prints them to the console if they're not 0.
                if (counts[i] > 0)
                    System.out.printf("%d occurs %d time%s%n", i, counts[i], (counts[i] > 1) ? "s" : "");


            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);
    }
}