//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: SumDigit

package com.cobble.cs.hw2;

import java.util.Scanner;

public class SumDigit {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an integer: "); // Prompts the user for an integer
        /** A variable used to store the sum of the digits. */
        int sum = 0;

        /**
         * This variable stores the integer inputted by the user and converts it into an array of strings.
         * It takes the inputted integer and converts it to a string then splits that string into an array on every character.
         */
        String[] numString = Integer.toString(scanner.nextInt()).split("");

        // This loops over every character in numString (or every digit)
        for (String digit : numString)
            sum += Integer.parseInt(digit); //Takes every digit in numString, parses it back into an int and adds it to sum
        System.out.println("The sum of the digits is " + sum); //Prints the sum

        //NOTICE this should also work on all parsed ints and not just 0-1000.
    }
}