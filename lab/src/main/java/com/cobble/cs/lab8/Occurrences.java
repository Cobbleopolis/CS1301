//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Occurrences

package com.cobble.cs.lab8;

import java.util.Scanner;

public class Occurrences {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {

            System.out.print("Enter the string to search: "); // Prompts the user to input a string.

            /** Stores the string inputted by the user. */
            String str = scanner.nextLine();

            System.out.print("Enter the character to look for: "); // Prompts the user to input a character.

            /** Stores the character inputted by the user. */
            char c = scanner.next().charAt(0);

            System.out.printf("%d instances of '%s' were found in \"%s\".%n", count(str, c), c, str); // Prints and calculates the count of the character in the string.

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);
    }

    /**
     * Counts the instances of a character in a string.
     * @param str The string to search in.
     * @param a The Character to search for.
     * @return The amount of instances the passed char in the passed string.
     */
    private static int count(String str, char a) {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
            if (str.charAt(i) == a)
                count++;
        return count;
    }


}