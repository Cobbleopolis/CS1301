//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: EliminateDuplicates

package com.cobble.cs.lab9;

import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicates {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter ten integers: ");
        /** Stores the numbers inputted by the user. */
        int[] nums = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        System.out.print("The unique numbers are: ");
        for (int i : eliminateDuplicates(nums)) // Loops over every int in what is returned by `eliminateDuplicates` and prints it.
            System.out.print(i + " ");

    }

    /**
     * Removes duplicate ints from an array.
     * @param list The array to remove duplicates from.
     * @return AN array with only the unique values from the passed array.
     */
    private static int[] eliminateDuplicates(int[] list) {
        /** Stores the array of ints to return. */
        int[] out = {};
        for (int i : list) { // Loops over the array passed.
            /** Stores weather or not to put the current i into out. */
            boolean add = true;
            for (int j : out) // Loops over the current out array.
                if (j == i) { // If i is found in the out array don't add i to the out array.
                    add = false;
                    break;
                }
            if (add) { // If add is true add i to the out array by making a copy of out with an extra index.
                out = Arrays.copyOf(out, out.length + 1);
                out[out.length - 1] = i;
            }
        }
        return out;
    }
}