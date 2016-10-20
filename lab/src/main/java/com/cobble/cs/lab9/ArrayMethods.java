//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: ArrayMethods

package com.cobble.cs.lab9;

import java.util.Random;

public class ArrayMethods {

    private static Random rand = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        int[] arr = {
                1 + rand.nextInt(1000),
                1 + rand.nextInt(1000),
                1 + rand.nextInt(1000),
                1 + rand.nextInt(1000),
                1 + rand.nextInt(1000)
        };

        System.out.print("Original array: "); // Prints the original array.
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
        System.out.printf("Max number: %d%n", arrayMax(arr)); // Prints the max number in the array.
        System.out.printf("Min number: %d%n", arrayMin(arr)); // Prints the min number in the array.

        arraySquared(arr); // Squares the array.
        System.out.print("Squared array: "); // Prints the squared array.
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();

        arrayReverse(arr); // Reverses the array
        System.out.print("Reversed array: "); // Prints the reversed array.
        for (int i : arr)
            System.out.print(i + " ");
    }

    /**
     * Finds the max value in an array.
     * @param arr The array so look in.
     * @return The max value in array.
     */
    private static int arrayMax(int[] arr) {
        int max = arr[0];
        for (int i : arr)
            max = Math.max(max, i);
        return max;
    }

    /**
     * Finds the min value in an array.
     * @param arr The array so look in.
     * @return The min value in array.
     */
    private static int arrayMin(int[] arr) {
        int min = arr[0];
        for (int i : arr)
            min = Math.min(min, i);
        return min;
    }

    /**
     * Squares the values in an array.
     * @param arr The array to square of the values of.
     */
    private static void arraySquared(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i] * arr[i];
    }

    /**
     * Reverses the order of an array.
     * @param arr The array to reverse.
     */
    private static void arrayReverse(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < rev.length; i++)
            rev[i] = arr[arr.length - i - 1];
        for (int i = 0; i < arr.length; i++) // Manual array copy | In reality use System.arraycopy
            arr[i] = rev[i];
    }
}