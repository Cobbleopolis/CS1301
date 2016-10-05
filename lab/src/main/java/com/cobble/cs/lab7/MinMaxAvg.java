//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: MinMaxAvg

package com.cobble.cs.lab7;

import java.util.Scanner;

public class MinMaxAvg {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores the first number. */
        int num1 = getNum(1);
        /** Stores the second number. */
        int num2 = getNum(2);
        /** Stores the third number. */
        int num3 = getNum(3);

        System.out.printf("You entered: %d %d %d%n", num1, num2, num3); // Prints the inputted values.
        System.out.printf("Max value: %d%n", max(max(num1, num2), num3)); // Prints the max of the inputted values.
        System.out.printf("Min value: %d%n", min(min(num1, num2), num3)); // Prints the min of the inputted values.
        System.out.printf("Average value: %f%n", average(num1, num2, num3)); // Prints the average of the inputted values.
    }

    /**
     * Gets an int from the user.
     *
     * @param label The label to use when prompting the user for a number.
     * @return The number the user inputted.
     */
    private static int getNum(int label) {
        System.out.print("Enter number #" + label + ": ");
        return scanner.nextInt();
    }

    /**
     * Returns the larger of the two values.
     *
     * @param x The first value in the comparison.
     * @param y The second value in the comparison.
     * @return The larger of the two passed values.
     */
    private static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    /**
     * Returns the smaller of the two values.
     *
     * @param x The first value in the comparison.
     * @param y The second value in the comparison.
     * @return The smaller of the two passed values.
     */
    private static int min(int x, int y) {
        return (x < y) ? x : y;
    }

    /**
     * Calculates the average of three numbers.
     * @param x The first value to take the average of.
     * @param y The second value to take the average of.
     * @param z The third value to take the average of.
     * @return The average of the three values passed.
     */
    private static double average(int x, int y, int z) {
        return (x + y + z) / 3.0;
    }
}