//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Statistics

package com.cobble.cs.lab10;

import java.util.Scanner;

public class Statistics {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            System.out.print("Enter ten numbers: ");
            double[] nums = {
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble()
            };

            System.out.println("The mean is: " + mean(nums));
            System.out.println("The deviation is: " + deviation(nums));

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);

    }

    /**
     * Calculates the deviation of an array.
     *
     * @param arr The array to find the deviation of.
     *
     * @return The deviation of the passed array.
     */
    private static double deviation(double[] arr) {
        /** Stores the mean of arr. */
        double mean = mean(arr);
        /** Stores the numerator that we'll divide with. */
        double numerator = 0;
        for (double i : arr) // Loops over arr and calculates numerator.
            numerator += Math.pow(i - mean, 2);
        return Math.sqrt(numerator / (arr.length - 1)); // Does final calculation for deviation and returns it.
    }

    /**
     * Calculates the mean of an array.
     *
     * @param arr The array to find the mean of
     *
     * @return The mean of the passed array.
     */
    private static double mean(double[] arr) {
        /**
         * Stores the sum of arr
         */
        double sum = 0;
        for (double i : arr) // Loops over arr and adds to sum
            sum += i;
        return sum / arr.length;
    }
}