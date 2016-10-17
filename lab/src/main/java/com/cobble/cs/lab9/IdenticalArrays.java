//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: IdenticalArrays

package com.cobble.cs.lab9;

import java.util.Scanner;

public class IdenticalArrays {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            System.out.print("Enter list 1: ");

            /** Stores the first list from the user. */
            int[] list1 = new int[scanner.nextInt()];
            for (int i = 0; i < list1.length; i++) { // Gets the values from the user to put into the first array.
                list1[i] = scanner.nextInt();
            }

            System.out.print("Enter list 2: ");
            /** Stores the first list from the user. */
            int[] list2 = new int[scanner.nextInt()];
            for (int i = 0; i < list2.length; i++) { // Gets the values from the user to put into the first array.
                list2[i] = scanner.nextInt();
            }

            System.out.println("The two arrays are " + (equals(list1, list2)? "": "not ") + "equal."); // Prints if the two arrays are equal.

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);
    }

    /**
     * Determines if two int arrays are equal.
     * @param list1 The fist list to compare against.
     * @param list2 The second list to compare against.
     * @return true if the two arrays are equal, false otherwise.
     */
    private static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;
        for (int i = 0; i < list1.length; i++)
            if (list1[i] != list2[i])
                return false;
        return true;
    }
}