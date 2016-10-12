//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: DisplayPattern

package com.cobble.cs.lab8;

import java.util.Scanner;

public class DisplayPattern {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] main) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            System.out.print("Enter the number to use in the patter: "); // Prompt the use to input the number to use.
            displayPattern(scanner.nextInt()); // Prints the pattern with the inputted value from the user.

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);
    }

    /**
     * Displays the pattern outlined in the book.
     *
     * @param n The number to use when displaying the pattern.
     */
    private static void displayPattern(int n) {
        String spacing = "%" + Integer.toString(n).length() + "s ";
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--)
                System.out.printf(spacing, (j <= i) ? j : "");
            System.out.println();
        }
    }
}