//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: StringOutput

package com.cobble.cs.lab6;

import java.util.Scanner;

public class StringOutput {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a String: "); // Prompts the user for a string.

        /** Stores the inputted string. */
        String str = scanner.nextLine();

        System.out.println("Entered String: " + str); // Prints the inputted string

        for (int i = 0; i < str.length(); i++ ) // Loops over the entire string
            System.out.println("Character #" + (i + 1) + ": " + str.charAt(i)); // Prints the char at i
    }
}